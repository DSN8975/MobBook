package com.example.mobbook

import android.app.Activity
import android.app.ComponentCaller
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var userIsLoggedIn: Boolean = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if (!this.userIsLoggedIn()) {
            //открываем приветствие
            val helloIntent = Intent(this, LoginActivity::class.java)
            startActivityForResult(helloIntent, helloActivity)
        }
    }

    private fun userIsLoggedIn(): Boolean {
        return false;
    }

    private val helloActivity: Int = 1

    override fun onActivityResult(requestCode: Int, resultCode: Int, intentData: Intent?, caller: ComponentCaller) {
        super.onActivityResult(requestCode, resultCode, intentData, caller)

        if (requestCode == helloActivity && resultCode == Activity.RESULT_OK) {
            intentData?.let { data ->
                this.userIsLoggedIn = data.getBooleanExtra(USER_LOGGED_IN, false)
            }
        }
    }

    companion object {
        const val USER_LOGGED_IN = "user_logged_in"
    }
}