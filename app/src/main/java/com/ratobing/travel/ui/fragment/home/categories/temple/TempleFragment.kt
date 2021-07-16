package com.ratobing.travel.ui.fragment.home.categories.temple

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ratobing.travel.adapter.TempleAdapter
import com.ratobing.travel.databinding.FragmentTempleBinding
import com.ratobing.travel.models.TravelData
import com.ratobing.travel.util.DataSources

class TempleFragment : Fragment() {

    private var _binding : FragmentTempleBinding? = null
    private val binding get() = _binding!!
    private lateinit var templeAdapter : TempleAdapter
    private val dataTempleList = ArrayList<TravelData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = FragmentTempleBinding.inflate(inflater, container, false)

        getTempleList()
        showRecyclerView()

        return binding.root
    }


    private fun getTempleList() {
        val data = DataSources.setTemple()
        dataTempleList.addAll(data)
    }

    private fun showRecyclerView() {
        binding.apply {
            rvTempleFragment.layoutManager = GridLayoutManager(requireActivity(),2)
            templeAdapter = TempleAdapter(dataTempleList)
            rvTempleFragment.adapter = templeAdapter
            rvTempleFragment.setHasFixedSize(true)
            templeAdapter.notifyDataSetChanged()
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}