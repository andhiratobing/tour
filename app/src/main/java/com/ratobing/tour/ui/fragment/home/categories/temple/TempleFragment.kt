package com.ratobing.tour.ui.fragment.home.categories.temple

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ratobing.tour.databinding.FragmentTempleBinding
import com.ratobing.tour.models.TourData
import com.ratobing.tour.util.DataSources

class TempleFragment : Fragment() {

    private var _binding : FragmentTempleBinding? = null
    private val binding get() = _binding!!
    private lateinit var templeAdapter : TempleAdapter
    private val dataTempleList = ArrayList<TourData>()

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

    private fun sendData(data: TourData) {
        //Send data with parcelable
        val intent = Intent(requireContext(), DetailTempleActivity::class.java)
        intent.putExtra(DetailTempleActivity.EXTRA_TOUR_DATA_TEMPLE,data)
        startActivity(intent)
    }

    private fun showRecyclerView() {
        binding.apply {
            rvTempleFragment.layoutManager = LinearLayoutManager(requireActivity())
            templeAdapter = TempleAdapter(dataTempleList)
            rvTempleFragment.adapter = templeAdapter
            rvTempleFragment.setHasFixedSize(true)
            templeAdapter.notifyDataSetChanged()

            //Click Item
            templeAdapter.setOnItemClickCallBack(object : TempleAdapter.OnItemClickCallBack{
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