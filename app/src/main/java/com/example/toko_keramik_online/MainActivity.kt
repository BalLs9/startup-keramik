package com.example.toko_keramik_online

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.toko_keramik_online.fragment.Cartragment
import com.example.toko_keramik_online.fragment.HomeFragment
import com.example.toko_keramik_online.fragment.TransaksiFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
   private val fragment_home: Fragment = HomeFragment()
    private  val fragment_cart: Fragment = Cartragment()
    private  val fragment_transaksi: Fragment = TransaksiFragment()
    private val fm: FragmentManager = supportFragmentManager
    private var active: Fragment = fragment_home

    private lateinit var menu: Menu
    private lateinit var menuItem: MenuItem
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setButtomNav()

    }
    fun setButtomNav(){
        fm.beginTransaction().add(R.id.host, fragment_home).show(fragment_home).commit()
        fm.beginTransaction().add(R.id.host, fragment_cart).hide(fragment_cart).commit()
        fm.beginTransaction().add(R.id.host, fragment_transaksi).hide(fragment_transaksi).commit()

        bottomNavigationView = findViewById(R.id.nav_view)
        menu = bottomNavigationView.menu
        menuItem = menu.getItem(0)
        menuItem.isChecked = true

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.home-> {
                    callFragment(0, fragment_home)
                }

                R.id.cart-> {
                    callFragment(1, fragment_cart)
                }
                R.id.transaksi-> {
                    callFragment(2, fragment_transaksi)
                }
            }
            false
        }
    }
    //memangil fungsi fragmen
    fun callFragment(int: Int, fragment: Fragment){
        menuItem = menu.getItem(int)
        menuItem.isChecked = true
        fm.beginTransaction().hide(active).show(fragment).commit()
        active = fragment

    }

}