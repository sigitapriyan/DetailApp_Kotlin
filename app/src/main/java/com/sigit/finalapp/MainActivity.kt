package com.sigit.finalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

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
                showSelectedMerk(data)
            }
        })

    }

    private fun showSelectedMerk(merk: Merk) {
        val moveIntent = Intent(this@MainActivity, DetailMerk::class.java)
        startActivity(moveIntent)

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
