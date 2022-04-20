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
import com.example.toko_keramik_online.adapter.AdapterKategori
import com.example.toko_keramik_online.adapter.AdapterProduk
import com.example.toko_keramik_online.adapter.AdapterSlider
import com.example.toko_keramik_online.model.Kategori
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
    lateinit var rvKategori: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        vvSlider = view.findViewById(R.id.v_slider)
        rvProduk = view.findViewById(R.id.rv_produk)
        rvKategori = view.findViewById(R.id.rv_kategori)


        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.dapur_1)
        arrSlider.add(R.drawable.dapur_2)
        arrSlider.add(R.drawable.dapur_3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vvSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rvKategori.adapter = AdapterKategori(arrKategori)
        rvKategori.layoutManager = layoutManager



        GridLayoutManager(view.context,2,RecyclerView.VERTICAL,false).apply {
            rvProduk.layoutManager=this
        }
        rvProduk.adapter=AdapterProduk(arrPrduk)





        return view
    }

    val arrPrduk : ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1= Produk()
        p1.nama = "Keramik Asia 40x40 Istanbul Cream kw C"
        p1.harga = "Rp.0"
        p1.ukuran = "40 x 40 cm"
        p1.gambar = R.drawable.keramik_asia

        val p2= Produk()
        p2.nama = "keramik Dindin Uno Amore Brown 25 x 40"
        p2.harga = "Rp.0"
        p2.ukuran = "20 x 30 cm"
        p2.gambar = R.drawable.uno_amore

        val p3= Produk()
        p3.nama = "Keramik Dinding 25x40 Platinum Bulgary Grey Embossed kw C"
        p3.harga = "Rp.0"
        p3.ukuran = "20 x 30 cm"
        p3.gambar = R.drawable.bulgary

        val p4= Produk()
        p4.nama = "Keramik Lantai Asia Alpha Brown 25x25 kw C"
        p4.harga = "Rp.0"
        p4.ukuran = "20 x 30 cm"
        p4.gambar = R.drawable.asia_brown

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)
        arr.add(p4)

        return arr

    }

    val arrKategori : ArrayList<Kategori>get(){
        val arr2 = ArrayList<Kategori>()
        val p1= Kategori()
        p1.kategori_m = "keramik dinding"

        val p2= Kategori()
        p2.kategori_m = "keramik dinding"

        arr2.add(p1)
        arr2.add(p2)

        return  arr2
    }






}