package com.sigit.finalapp

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detail_merk.*
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class DetailMerk : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_merk)

        val tvNamaMerk = findViewById<TextView>(R.id.tvNamaMerk)
        val tvDetailMerk = findViewById<TextView>(R.id.tvDetailMerk)
        val imgMerk = findViewById<ImageView>(R.id.imgMerk)

        val namebrand = intent.getParcelableExtra<Merk>(EXTRA_ITEM)

        tvNamaMerk.text = namebrand.name
        tvDetailMerk.text = namebrand.detail
        imgMerk.setImageResource(namebrand.photo)
    }


    override fun onClick(v: View) {
        val moveIntent = Intent(this@DetailMerk, MainActivity::class.java)
        startActivity(moveIntent)
    }

    companion object {
        const val EXTRA_ITEM = "extra_item"
    }
}
