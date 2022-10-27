package com.example.projectawal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainItem : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_item)

        //Deklarasi Variabel untuk menampilkan Gambar dan Text Pada RecyleView di MainItem
        val brgbarkasList= listOf<brgbarkas>(
            brgbarkas(
                R.drawable.kompor,
                "Kompor 1 Tungku Bekas",
                "Masih Bagus, Minus Pemakaian, Lokasi Sleman Dekat SCH"
            ),brgbarkas(
                R.drawable.kasur,
                "Kasur Bekas Masih Empuk",
                "Langsung Pantau Area Jombor"
            ),brgbarkas(
                R.drawable.kontak,
                "Stop Kontak 4 Lubang",
                "Di Jual aja dari pada makan tempat, Lokasi Jakal KM.5"
            ),brgbarkas(
                R.drawable.dispenser,
                "Dispenser Bekas",
                "Minus Gak bisa panas hanya sebagai dudukan galon aja"
            ),brgbarkas(
                R.drawable.lemari,
                "Lemari Plastik Bekas 4 Susun",
                "Masih Bagus Lokasi CondongCatur"
            ),brgbarkas(
                R.drawable.meja,
                "Meja Lesehan",
                "Masih Bagus Lokasi Maguwo"
            ),brgbarkas(
                R.drawable.rak,
                "Rak Dinding Bekas",
                "Kokoh alasan dijual gak cocok, minat sekitaran Gejayan"
            ),brgbarkas(
                R.drawable.sprei,
                "Sprei Baru",
                "Masih Bagus karena salah ukuran, Lokasi sekitaran UGM"
            )
        )

        //Deklarasi Variabel untuk menampilkan data yang telah di inputkan ke dalam Layout
        //RecyleView yang telah dibuat dari id layout tersebut.
        val recyclerView = findViewById<RecyclerView>(R.id.rv_barkas)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=brgbarkasAdapter(this,brgbarkasList){
            val intent=Intent(this, DetailBrg::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}