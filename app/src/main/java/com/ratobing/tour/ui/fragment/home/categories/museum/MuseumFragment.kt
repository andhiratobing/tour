package com.ratobing.tour.ui.fragment.home.categories.museum

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ratobing.tour.databinding.FragmentMuseumBinding
import com.ratobing.tour.models.TourData
import com.ratobing.tour.util.DataSources


class MuseumFragment : Fragment() {

    private var _binding : FragmentMuseumBinding? = null
    private val binding get() = _binding!!
    private lateinit var museumAdapter: MuseumAdapter
    private var dataMuseumList = ArrayList<TourData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
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

    private fun sendData(data: TourData) {
        //Send data with parcelable
        val intent = Intent(requireContext(), DetailMuseumActivity::class.java)
        intent.putExtra(DetailMuseumActivity.EXTRA_TOUR_DATA_MUSEUM,data)
        startActivity(intent)
    }

    private fun showRecyclerView(){
        binding.apply {
            rvMuseumFragment.layoutManager = LinearLayoutManager(requireActivity())
            museumAdapter = MuseumAdapter(dataMuseumList)
            rvMuseumFragment.adapter = museumAdapter
            rvMuseumFragment.setHasFixedSize(true)
            museumAdapter.notifyDataSetChanged()

            //Click Item
            museumAdapter.setOnItemClickCallBack(object : MuseumAdapter.OnItemClickCallBack{
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