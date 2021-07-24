package com.ratobing.tour.ui.fragment.home.explore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ratobing.tour.R
import com.ratobing.tour.databinding.FragmentExploreBinding

class ExploreFragment : Fragment() {

    private var _binding : FragmentExploreBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = FragmentExploreBinding.inflate(inflater, container, false)

        //Add Toolbar navigation back
        supportActionBar()

        //Back
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
//                requireActivity().finish()
                findNavController().navigate(R.id.action_exploreFragment_to_homeFragment)
            }
        })

        return binding.root
    }

    private fun supportActionBar(){
        (activity as AppCompatActivity?)!!.setSupportActionBar(binding.toolbarExplore)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}