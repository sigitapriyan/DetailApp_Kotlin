package com.sigit.finalapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Merk(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0
) : Parcelable