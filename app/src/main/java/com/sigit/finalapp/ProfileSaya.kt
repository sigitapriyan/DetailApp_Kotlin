package com.sigit.finalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfileSaya : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_saya)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnHome -> {
                val moveIntent = Intent(this@ProfileSaya, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
