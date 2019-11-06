package com.sigit.finalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detail_merk.*
import kotlinx.android.synthetic.main.activity_main.*

class DetailMerk : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_merk)

        val tvNamaMerk = findViewById<TextView>(R.id.tvNamaMerk)
        val tvDetailMerk = findViewById<TextView>(R.id.tvDetailMerk)

        val intent = intent
        val name = intent.getStringExtra("EXTRA_NAME")
        val desc = intent.getStringExtra("EXTRA_DESC")

        tvNamaMerk.text = name
        tvDetailMerk.text = desc

    }


    override fun onClick(v: View) {
        val moveIntent = Intent(this@DetailMerk, MainActivity::class.java)
        startActivity(moveIntent)
    }
}
