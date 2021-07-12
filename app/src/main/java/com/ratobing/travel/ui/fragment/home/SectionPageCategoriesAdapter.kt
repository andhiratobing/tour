package com.ratobing.travel.ui.fragment.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ratobing.travel.ui.fragment.home.categories.beaches.BeachesFragment
import com.ratobing.travel.ui.fragment.home.categories.montains.MountainsFragment
import com.ratobing.travel.ui.fragment.home.categories.museum.MuseumFragment
import com.ratobing.travel.ui.fragment.home.categories.temple.TempleFragment

class SectionPageCategoriesAdapter(fragment: Fragment):
        FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
        when(position){
            0 -> fragment = MountainsFragment()
            1 -> fragment = BeachesFragment()
            2 -> fragment = MuseumFragment()
            3 -> fragment = TempleFragment()
        }
        return fragment
    }

}