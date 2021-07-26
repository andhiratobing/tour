package com.ratobing.tour.ui.fragment.home.categories.montains

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ratobing.tour.databinding.FragmentMountainsBinding
import com.ratobing.tour.models.TourData
import com.ratobing.tour.util.DataSources

class MountainsFragment : Fragment() {

    private var _binding: FragmentMountainsBinding? = null
    private val binding get() = _binding!!
    private lateinit var mountainsAdapter: MountainsAdapter
    private val dataMountainsList = ArrayList<TourData>()


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

    private fun sendData(data: TourData) {
        //Send data with parcelable
        val intent = Intent(requireContext(), DetailMountainsActivity::class.java)
        intent.putExtra(DetailMountainsActivity.EXTRA_TOUR_DATA_MOUNTAINS,data)
        startActivity(intent)
    }



    private fun showRecyclerView() {
        binding.apply {
            rvMountainsFragment.layoutManager = LinearLayoutManager(requireActivity())
            mountainsAdapter = MountainsAdapter(dataMountainsList)
            rvMountainsFragment.adapter = mountainsAdapter
            rvMountainsFragment.setHasFixedSize(true)
            mountainsAdapter.notifyDataSetChanged()

            //Click Item
            mountainsAdapter.setOnItemClickCallBack(object : MountainsAdapter.OnItemClickCallBack{
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