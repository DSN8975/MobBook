package com.example.mobbook

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class Register2Fragment: Fragment(R.layout.fragment_register2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.continue_button2).setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra(MainActivity.USER_LOGGED_IN, true)
            activity?.setResult(Activity.RESULT_OK, resultIntent)
            activity?.finish()
        }
    }

}