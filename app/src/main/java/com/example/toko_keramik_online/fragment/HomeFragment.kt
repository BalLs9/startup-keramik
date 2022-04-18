package com.example.toko_keramik_online.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.toko_keramik_online.R
import com.example.toko_keramik_online.adapter.AdapterSlider

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    lateinit var vvSlider: ViewPager





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        vvSlider = view.findViewById(R.id.v_slider)


        var arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.dapur_1)
        arrSlider.add(R.drawable.dapur_2)
        arrSlider.add(R.drawable.dapur_3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vvSlider.adapter = adapterSlider

        return view
    }


}