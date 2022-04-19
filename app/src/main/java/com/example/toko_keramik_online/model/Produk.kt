package com.example.toko_keramik_online.model

import java.io.Serializable

class Produk : Serializable {
    lateinit var nama:String
    lateinit var harga:String
    lateinit var ukuran:String
    var gambar:Int = 0
}