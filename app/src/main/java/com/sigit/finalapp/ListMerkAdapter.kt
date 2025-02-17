package com.sigit.finalapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.ArrayList

class ListMerkAdapter(private val listMerk: ArrayList<Merk>) :
    RecyclerView.Adapter<ListMerkAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_merk, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val merk = listMerk[position]

        Glide.with(holder.itemView.context)
            .load(merk.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = merk.name
        holder.tvDetail.text = merk.detail

        holder.itemView.setOnClickListener {
            val detailMerk = Intent(it.context, DetailMerk::class.java)
            detailMerk.putExtra(DetailMerk.EXTRA_ITEM, listMerk[holder.adapterPosition])
            it.context.startActivity(detailMerk)
        }
    }


    override fun getItemCount(): Int {
        return listMerk.size
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_merk)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_merk)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Merk)
    }

}