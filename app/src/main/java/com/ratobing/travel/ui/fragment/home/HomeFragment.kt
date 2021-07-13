package com.ratobing.travel.ui.fragment.home

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayoutMediator
import com.ratobing.travel.R
import com.ratobing.travel.adapter.TopTripAdapter
import com.ratobing.travel.databinding.FragmentHomeBinding
import com.ratobing.travel.models.TravelData
import com.ratobing.travel.ui.activity.NotificationActivity
import com.ratobing.travel.util.DataSources


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var topTripAdapter: TopTripAdapter
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

        getListTopTrips()
        showRecyclerList()

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
        val data = DataSources.setTemple()
        dataTopTripsList.addAll(data)
    }

    private fun showRecyclerList() {
        binding.apply {
            rvTopTrips.layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL,false)
            topTripAdapter = TopTripAdapter(dataTopTripsList)
            rvTopTrips.adapter = topTripAdapter
            rvTopTrips.setHasFixedSize(true)
            topTripAdapter.notifyDataSetChanged()
        }
    }


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