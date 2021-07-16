package com.ratobing.travel.ui.fragment.home.categories.montains

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ratobing.travel.adapter.MountainsAdapter
import com.ratobing.travel.databinding.FragmentMountainsBinding
import com.ratobing.travel.models.TravelData
import com.ratobing.travel.util.DataSources

class MountainsFragment : Fragment() {

    private var _binding: FragmentMountainsBinding? = null
    private val binding get() = _binding!!
    private lateinit var mountainsAdapter: MountainsAdapter
    private val dataMountainsList = ArrayList<TravelData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = FragmentMountainsBinding.inflate(inflater, container, false)

        getMountainsList()
        showRecyclerView()

        return binding.root
    }

    private fun getMountainsList() {
        val data = DataSources.setMountains()
        dataMountainsList.addAll(data)
    }

    private fun showRecyclerView() {
        binding.apply {
            rvMountainsFragment.layoutManager = GridLayoutManager(requireActivity(), 2)
            mountainsAdapter = MountainsAdapter(dataMountainsList)
            rvMountainsFragment.adapter = mountainsAdapter
            rvMountainsFragment.setHasFixedSize(true)
            mountainsAdapter.notifyDataSetChanged()
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}