package com.ratobing.travel.ui.fragment.home.categories.museum

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.ratobing.travel.MuseumAdapter
import com.ratobing.travel.R
import com.ratobing.travel.databinding.FragmentMuseumBinding
import com.ratobing.travel.models.TravelData
import com.ratobing.travel.util.DataSources


class MuseumFragment : Fragment() {

    private var _binding : FragmentMuseumBinding? = null
    private val binding get() = _binding!!
    private lateinit var museumAdapter: MuseumAdapter
    private var dataMuseumList = ArrayList<TravelData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMuseumBinding.inflate(inflater, container, false)

        getMuseumList()
        showRecyclerView()

        return binding.root
    }

    private fun getMuseumList() {
        val data = DataSources.setMuseum()
        dataMuseumList.addAll(data)
    }

    fun showRecyclerView(){
        binding.apply {
            rvMuseumFragment.layoutManager = GridLayoutManager(requireContext(), 2)
            museumAdapter = MuseumAdapter(dataMuseumList)
            rvMuseumFragment.adapter = museumAdapter
            rvMuseumFragment.setHasFixedSize(true)
            museumAdapter.notifyDataSetChanged()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}