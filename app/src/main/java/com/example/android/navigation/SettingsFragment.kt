package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.FragmentGameWonBinding
import com.example.android.navigation.databinding.SecretSettingsBinding

class SettingsFragment : Fragment() {

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
            val binding: SecretSettingsBinding = DataBindingUtil.inflate(
                inflater, R.layout.secret_settings, container, false
            )
        binding.setImage.startAnimation(AnimationUtils.loadAnimation(context,R.anim.rotate))
        binding.switch1.setOnClickListener{ Toast.makeText(context,"hi",Toast.LENGTH_SHORT).show()}

        return binding.root

    }}

