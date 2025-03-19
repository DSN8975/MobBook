package com.example.mobbook

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class Register1Fragment: Fragment(R.layout.fragment_register1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.continue_button2).setOnClickListener {
            activity?.supportFragmentManager?.commit {
                replace(R.id.fragmentContainerView, CodFragment())
            }
        }
    }

}