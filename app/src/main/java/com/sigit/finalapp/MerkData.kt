package com.sigit.finalapp

import java.util.ArrayList

object MerkData {
    private val merkNames = arrayOf(
        "Honda",
        "Toyota",
        "Mitsubishi",
        "Nissan",
        "Ford",
        "Suzuki",
        "Chevrolet",
        "Jaguar",
        "BMW",
        "Mercedes"
    )

    private val merkDetails = arrayOf(
        "Detail Honda",
        "Detail Toyota",
        "Detail Mitsubishi",
        "Detail Nissan",
        "Detail Ford",
        "Detail Suzuki",
        "Detail Chevrolet",
        "Detail Jaguar",
        "Detail BMW",
        "Detail Mercedes"
    )

    private val merkesImages = intArrayOf(
        R.drawable.honda,
        R.drawable.toyota,
        R.drawable.mitsubishi,
        R.drawable.nissan,
        R.drawable.ford,
        R.drawable.suzuki,
        R.drawable.chevrolet,
        R.drawable.jaguar,
        R.drawable.bmw,
        R.drawable.mercedesbenz
    )

    val listData: ArrayList<Merk>
        get() {
            val list = arrayListOf<Merk>()
            for (position in merkNames.indices) {
                val merk = Merk()
                merk.name = merkNames[position]
                merk.detail = merkDetails[position]
                merk.photo = merkesImages[position]
                list.add(merk)
            }
            return list
        }
}