package com.example.projectawal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Jika BtnNext1 di klik maka akan pindah ke fragment selanjutnya
        val BtnNext1 : Button = findViewById(R.id.btnnext)
        BtnNext1.setOnClickListener {
            val fragmentsatu = FirstFragment()
            val fragment : Fragment? =
                supportFragmentManager.findFragmentByTag(FirstFragment::class.java.simpleName)

            if (fragment !is FirstFragment){
                supportFragmentManager.beginTransaction()
                    .add(R.id.container, fragmentsatu, FirstFragment::class.java.simpleName)
                    .commit()
            }

            BtnNext1.visibility = View.GONE
        }


    }
}