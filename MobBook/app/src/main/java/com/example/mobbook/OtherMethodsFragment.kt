package com.example.mobbook

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class OtherMethodsFragment: Fragment(R.layout.fragment_other_methods) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.create_account_button).setOnFocusChangeListener { _, _ ->
            activity?.supportFragmentManager?.commit {
                replace(R.id.fragmentContainerView, Register1Fragment())
            }
        }
    }
}