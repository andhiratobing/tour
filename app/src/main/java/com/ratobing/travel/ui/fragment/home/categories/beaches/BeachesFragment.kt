package com.ratobing.travel.ui.fragment.home.categories.beaches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ratobing.travel.adapter.BeachesAdapter
import com.ratobing.travel.databinding.FragmentBeachesBinding
import com.ratobing.travel.models.TravelData
import com.ratobing.travel.util.DataSources


class BeachesFragment : Fragment() {

    private var _binding : FragmentBeachesBinding? = null
    private val binding get() = _binding!!
    private lateinit var beachesAdapter: BeachesAdapter
    private val dataBeachesList = ArrayList<TravelData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBeachesBinding.inflate(inflater, container, false)

        getBeachesList()
        showRecyclerView()


        return binding.root
    }


    private fun getBeachesList() {
        val data = DataSources.setBeaches()
        dataBeachesList.addAll(data)
    }

    private fun showRecyclerView() {
        binding.apply {
            rvBeachesFragment.layoutManager = GridLayoutManager(requireActivity(),2)
            beachesAdapter = BeachesAdapter(dataBeachesList)
            rvBeachesFragment.adapter = beachesAdapter
            rvBeachesFragment.setHasFixedSize(true)
            beachesAdapter.notifyDataSetChanged()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}