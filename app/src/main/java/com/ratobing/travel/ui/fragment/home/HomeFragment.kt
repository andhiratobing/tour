package com.ratobing.travel.ui.fragment.home

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.tabs.TabLayoutMediator
import com.ratobing.travel.R
import com.ratobing.travel.databinding.FragmentHomeBinding
import com.ratobing.travel.models.TravelData
import com.ratobing.travel.ui.activity.NotificationActivity


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewPagerAdapter: SectionPageCategoriesAdapter
    private val dataTopTripsList = ArrayList<TravelData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Register menu in fragment to Activity
        setHasOptionsMenu(true)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.apply {
            btnExplore.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_exploreFragment)
            }
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            //set menu on toolbar
            binding.toolbarFragmentHome.inflateMenu(R.menu.home_menu)

            //Text TabLayout
            val tabLayoutCategoriesTitle = intArrayOf(
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


//        getListTopTrips()

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.home_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

//    private fun getListTopTrips(): ArrayList<TravelData> {
//        val nameTopTrips = resources.getStringArray(R.array.data_location_top_trips)
//        val categoryNameTopTrips = resources.getStringArray(R.array.data_category_top_trips)
//
//        val listDataTopTrips = ArrayList<TravelData>()
//        for (position in nameTopTrips.indices) {
//            val data = TravelData(
//                nameTopTrips[position],
//                categoryNameTopTrips[position],
//                "",
//                "",
//                2,
//                "",
//                ""
//            )
//            listDataTopTrips.add(data)
//        }
//        showRecyclerList() /*Show RecyclerView*/
//        return listDataTopTrips
//    }

//    private fun showRecyclerList() {
//        binding.rvTopTrips.layoutManager = LinearLayoutManager(activity)
//        val dataAdapter = TopTripAdapter(dataTopTripsList)
//        binding.rvTopTrips.adapter = dataAdapter
//        binding.rvTopTrips.setHasFixedSize(true)
//        dataAdapter.notifyDataSetChanged()
//
//    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_notification -> {
                val intent = Intent(activity, NotificationActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
                intent.flags = Intent.FLAG_ACTIVITY_NO_HISTORY
                activity?.startActivity(intent)
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