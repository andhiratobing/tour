package com.ratobing.tour.ui.fragment.home.categories.montains

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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
    private lateinit var extra: Object

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

    private fun showSelectedData(data: TourData) {
        //Show message click
        Toast.makeText(requireContext(), data.name, Toast.LENGTH_SHORT).show()
        //Send data with different activity or fragment
        val intent = Intent(requireContext(), DetailMountainsActivity::class.java)
        intent.putExtra(DetailMountainsActivity.EXTRA_NAME,data.name)
        intent.putExtra(DetailMountainsActivity.EXTRA_LOCATION_IMAGE,data.locationImage)
        intent.putExtra(DetailMountainsActivity.EXTRA_PRICE,data.price)

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
                    showSelectedData(data)
                }

            })
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}