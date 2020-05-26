package com.example.viewpagersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // viewPager にページャーアダプターをセット。
        val viewPager: ViewPager2 = findViewById(R.id.pager)
        val adapter = SampleViewPagerAdapter(this)
        viewPager.adapter = adapter

        // ViewPager と TabLayout を連携させる。
        val tabLayout: TabLayout = findViewById(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            // タブのタイトルを設定。
            tab.text = "PAGE${position + 1}"
        }.attach()
    }
}
