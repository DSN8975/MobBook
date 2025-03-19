package com.example.mobbook

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class CodFragment: Fragment(R.layout.fragment_code) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.continue_button2).setOnClickListener {
            activity?.supportFragmentManager?.commit {
                replace(R.id.fragmentContainerView, Register2Fragment())
            }
        }
    }
}