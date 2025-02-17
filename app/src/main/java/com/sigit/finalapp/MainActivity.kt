package com.sigit.finalapp

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row_merk.*
import java.io.ByteArrayOutputStream
import java.util.ArrayList
import android.graphics.drawable.BitmapDrawable



class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvMerk: RecyclerView
    private var title = "Mode List"
    private val list = ArrayList<Merk>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvMerk = findViewById(R.id.rv_heroes)
        rvMerk.setHasFixedSize(true)

        list.addAll(MerkData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvMerk.layoutManager = LinearLayoutManager(this)
        val listMerkAdapter = ListMerkAdapter(list)
        rvMerk.adapter = listMerkAdapter

        listMerkAdapter.setOnItemClickCallback(object : ListMerkAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Merk) {
                val iniMerk = tv_item_merk.text.toString()
                val inidetailMerk = tv_item_detail.text.toString()

                val b = (img_item_merk.drawable as BitmapDrawable).bitmap;
                val stream = ByteArrayOutputStream()
                b.compress(Bitmap.CompressFormat.PNG, 0, stream)
                val iniGambar = stream.toByteArray()


                val moveIntent = Intent(this@MainActivity, DetailMerk::class.java)
                moveIntent.putExtra("EXTRA_NAME", iniMerk)
                moveIntent.putExtra("EXTRA_DESC", inidetailMerk)
                moveIntent.putExtra("EXTRA_IMG", iniGambar)
                startActivity(moveIntent)
            }
        })

    }



    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnProfile -> {
                val moveIntent = Intent(this@MainActivity, ProfileSaya::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
