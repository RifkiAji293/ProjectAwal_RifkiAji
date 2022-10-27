package com.example.projectawal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    //Deklarasi variabel untuk waktu splash screen tampil
    private val SPLASH_TIME_OUT:Long = 3000
    //Splash screen akan tampil selama 3 Detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Kode untuk menjalankan Main Activity setelah timer splash screen habis
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)

    }
}