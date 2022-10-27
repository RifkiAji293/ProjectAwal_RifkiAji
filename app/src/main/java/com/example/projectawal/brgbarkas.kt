package com.example.projectawal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize

//Inisialisasi variabel untuk gambar, judul, dan deskripsi data
data class brgbarkas(
    val imgbarkas: Int,
    val jdlbarkas: String,
    val descbarkas: String
) : Parcelable

