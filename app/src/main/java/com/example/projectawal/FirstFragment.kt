package com.example.projectawal

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projectawal.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Pada Fragment 2, jika BtnNext2 di klik maka akan menuju ke Activity MainItem menggunakan Intent
        val bind = FragmentFirstBinding.inflate(layoutInflater)
        bind.btnnext2.setOnClickListener {
            val intent = Intent(this@FirstFragment.requireContext(), MainItem::class.java)
            startActivity(intent)
        }
        return bind.root
    }
}