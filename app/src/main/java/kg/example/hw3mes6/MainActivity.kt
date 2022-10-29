package kg.example.hw3mes6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.example.hw3mes6.Adapters.ViewPagerAdapter
import kg.example.hw3mes6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViewPager()

    }
    private fun setupViewPager() {
        val viewPager = binding.viewPager
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)

    }

}