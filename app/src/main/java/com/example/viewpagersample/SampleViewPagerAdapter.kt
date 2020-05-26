package com.example.viewpagersample

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SampleViewPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    /**
     * 表示する画面の合計を返す。
     * 今回は画面２つを作るので２を返す。
     */
    override fun getItemCount(): Int = 2

    /**
     * 画面のポジションと対応させてフラグメントを返す。
     * 今回は画面が２つなので、position は 0 か 1 となる。
     * もしそれ以外の引数が渡された場合は例外を投げる。
     */
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PageOneFragment()
            1 -> PageTwoFragment()
            else -> throw IllegalArgumentException()
        }
    }

}
