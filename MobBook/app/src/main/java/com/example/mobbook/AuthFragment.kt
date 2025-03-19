package com.example.mobbook

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class AuthFragment: Fragment(R.layout.fragment_auth) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.other_methods_button).setOnClickListener {
            activity?.supportFragmentManager?.commit {
                replace(R.id.fragmentContainerView, OtherMethodsFragment())
            }
        }
    }
}