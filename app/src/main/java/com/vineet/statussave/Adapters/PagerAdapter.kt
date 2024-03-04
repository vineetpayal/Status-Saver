package com.vineet.statussave.Adapters

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.vineet.statussave.SavedFragment
import com.vineet.statussave.StoryFragment

class PagerAdapter(var context : Context,val totalTabs : Int,fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> StoryFragment()
            1 -> SavedFragment()
            else -> getItem(position)
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Stories"
            1 -> "Saved"
            else -> getPageTitle(position)
        }
    }

}