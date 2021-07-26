package com.ratobing.tour.ui.fragment.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.ratobing.tour.R
import com.ratobing.tour.databinding.FragmentAccountBinding
import com.ratobing.tour.models.User


class AccountFragment : Fragment() {

    private var _binding : FragmentAccountBinding? = null
    private val binding get() = _binding!!
    private val dataUser = User()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = FragmentAccountBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvName.text = dataUser.name
            tvEmail.text = dataUser.email
            tvGithub.text = dataUser.socialGithub
            tvLinkedIn.text = dataUser.socialLinkedIn

            Glide.with(view.context)
                .load(dataUser.imageUser)
                .placeholder(R.drawable.placeholder_image)
                .into(binding.ivUser)
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}