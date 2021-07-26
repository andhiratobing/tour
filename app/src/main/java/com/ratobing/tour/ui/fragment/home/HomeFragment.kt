package com.ratobing.tour.ui.fragment.home

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayoutMediator
import com.ratobing.tour.R
import com.ratobing.tour.databinding.FragmentHomeBinding
import com.ratobing.tour.models.TourData
import com.ratobing.tour.models.User
import com.ratobing.tour.ui.fragment.SectionPageCategoriesAdapter
import com.ratobing.tour.ui.fragment.home.toptrip.DetailTopTripActivity
import com.ratobing.tour.ui.fragment.home.toptrip.TopTripAdapter
import com.ratobing.tour.util.DataSources


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var topTripAdapter: TopTripAdapter
    private lateinit var viewPagerAdapter: SectionPageCategoriesAdapter
    private val dataTopTripsList = ArrayList<TourData>()
    private var dataUser = User()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Register menu in fragment to Activity
        setHasOptionsMenu(true)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        getListTopTrips()
        showRecyclerView()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnExplore.setOnClickListener {
            Toast.makeText(activity,"Tunggu fitur selanjutnya ya", Toast.LENGTH_SHORT).show()
        }

        binding.apply {
            //set menu on toolbar
            binding.toolbarFragmentHome.inflateMenu(R.menu.home_menu)

            //Retrive Image
            Glide.with(view.context)
                .load(dataUser.imageUser)
                .placeholder(R.drawable.placeholder_image)
                .into(binding.imgUser)

            //Text TabLayout
            val tabLayoutCategoriesTitle = listOf(
                R.string.tabLayoutMountains,
                R.string.tabLayoutBeaches,
                R.string.tabLayoutMuseum,
                R.string.tabLayoutTemple
            )

            // Integrating TabLayout with ViewPager2
            viewPagerAdapter = SectionPageCategoriesAdapter(this@HomeFragment)
            viewPager.adapter = viewPagerAdapter
            //set TabLayout Mediator
            TabLayoutMediator(tabLayoutCategories, viewPager) { tab, position ->
                tab.text = context?.resources?.getString(tabLayoutCategoriesTitle[position])
            }.attach()

        }
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.home_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    private fun getListTopTrips() {
        val data = DataSources.setTopTrips()
        dataTopTripsList.addAll(data)
    }


    private fun sendData(data: TourData) {
        //Send data with parcelable
        val intent = Intent(requireContext(), DetailTopTripActivity::class.java)
        intent.putExtra(DetailTopTripActivity.EXTRA_TOUR_DATA_TOP_TRIP, data)
        startActivity(intent)
    }

    private fun showRecyclerView() {
        binding.apply {
            rvTopTrips.layoutManager =
                LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
            topTripAdapter = TopTripAdapter(dataTopTripsList)
            rvTopTrips.adapter = topTripAdapter
            rvTopTrips.setHasFixedSize(true)
            topTripAdapter.notifyDataSetChanged()

            //Click Item
            topTripAdapter.setOnItemClickCallBack(object : TopTripAdapter.OnItemClickCallBack {
                override fun onItemClicked(data: TourData) {
                    sendData(data)
                }

            })
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_notification -> {
                Toast.makeText(activity, "Tunggu fitur selanjutnya ya", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}