package com.example.mobbook

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class HelloFragment: Fragment(R.layout.fragment_hello) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.login_button).setOnClickListener {
            activity?.supportFragmentManager?.commit {
                replace(R.id.fragmentContainerView, AuthFragment())
            }
        }

        view.findViewById<Button>(R.id.later_button).setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra(MainActivity.USER_LOGGED_IN, false)
            activity?.setResult(Activity.RESULT_OK, resultIntent)
            activity?.finish()
        }
    }
}