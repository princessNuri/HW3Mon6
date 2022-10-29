package kg.example.hw3mes6.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kg.example.hw3mes6.Fragments.FirstFragment
import kg.example.hw3mes6.Fragments.SecondFragment
import kg.example.hw3mes6.Fragments.ThirdFragment

class ViewPagerAdapter (fm: FragmentManager): FragmentPagerAdapter(fm){
    private val COUNT = 3

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> FirstFragment()
        }
    }

    override fun getCount(): Int {
        return COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Tab " + (position + 1)
    }

}