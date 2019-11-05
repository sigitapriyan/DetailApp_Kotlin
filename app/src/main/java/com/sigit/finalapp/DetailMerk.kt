package com.sigit.finalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detail_merk.*
import kotlinx.android.synthetic.main.activity_main.*

class DetailMerk : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_merk)


    }

    override fun onClick(v: View) {
        val moveIntent = Intent(this@DetailMerk, MainActivity::class.java)
        startActivity(moveIntent)
    }
}
