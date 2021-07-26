package com.ratobing.tour.ui.fragment.home.categories.beaches

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ratobing.tour.databinding.FragmentBeachesBinding
import com.ratobing.tour.models.TourData
import com.ratobing.tour.util.DataSources


class BeachesFragment : Fragment() {

    private var _binding : FragmentBeachesBinding? = null
    private val binding get() = _binding!!
    private lateinit var beachesAdapter: BeachesAdapter
    private val dataBeachesList = ArrayList<TourData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
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

    private fun sendData(data: TourData) {
        //Send data with parcelable
        val intent = Intent(requireContext(), DetailBeachesActivity::class.java)
        intent.putExtra(DetailBeachesActivity.EXTRA_TOUR_DATA_BEACHES,data)
        startActivity(intent)
    }

    private fun showRecyclerView() {
        binding.apply {
            rvBeachesFragment.layoutManager = LinearLayoutManager(requireActivity())
            beachesAdapter = BeachesAdapter(dataBeachesList)
            rvBeachesFragment.adapter = beachesAdapter
            rvBeachesFragment.setHasFixedSize(true)
            beachesAdapter.notifyDataSetChanged()

            //Click Item
            beachesAdapter.setOnItemClickCallBack(object : BeachesAdapter.OnItemClickCallBack{
                override fun onItemClicked(data: TourData) {
                    sendData(data)
                }

            })
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}