package com.example.toko_keramik_online.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.toko_keramik_online.R
import com.example.toko_keramik_online.adapter.AdapterProduk
import com.example.toko_keramik_online.adapter.AdapterSlider
import com.example.toko_keramik_online.model.Produk

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
    lateinit var rvProduk:RecyclerView





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        vvSlider = view.findViewById(R.id.v_slider)
        rvProduk = view.findViewById(R.id.rv_produk)


        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.dapur_1)
        arrSlider.add(R.drawable.dapur_2)
        arrSlider.add(R.drawable.dapur_3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vvSlider.adapter = adapterSlider



        GridLayoutManager(view.context,2,RecyclerView.VERTICAL,false).apply {
            rvProduk.layoutManager=this
        }
        rvProduk.adapter=AdapterProduk(arrPrduk)



        return view
    }

    val arrPrduk : ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1= Produk()
        p1.nama = "keramik dinding"
        p1.harga = "Rp.0"
        p1.ukuran = "20 x 30 cm"
        p1.gambar = R.drawable.produk

        val p2= Produk()
        p2.nama = "keramik dinding"
        p2.harga = "Rp.0"
        p2.ukuran = "20 x 30 cm"
        p2.gambar = R.drawable.produk

        val p3= Produk()
        p3.nama = "keramik dinding"
        p3.harga = "Rp.0"
        p3.ukuran = "20 x 30 cm"
        p3.gambar = R.drawable.produk

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr

    }





}