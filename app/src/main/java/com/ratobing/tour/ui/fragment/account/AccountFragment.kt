package com.ratobing.tour.ui.fragment.account

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.ratobing.tour.R
import com.ratobing.tour.databinding.FragmentAccountBinding


class AccountFragment : Fragment() {

    private var _binding : FragmentAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = FragmentAccountBinding.inflate(inflater, container, false)

        binding.apply {
            ivNavigationGithub.setOnClickListener {
                val intentLinkedIn = Intent(Intent.ACTION_SENDTO)

            }
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide.with(view.context)
            .load("https://avatars.githubusercontent.com/u/43465830?s=400&u=4eb23a7e3eb88e3f4a26802bca5048d0bc3899f9&v=4")
            .placeholder(R.drawable.placeholder_image)
            .into(binding.ivUser)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}