package com.example.listviewicon.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewicon.R
import com.example.listviewicon.model.kodeicon

class ListIconA ( private val codelist: ArrayList<kodeicon>) : RecyclerView.Adapter<ListIconA.codeViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): codeViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.listkode, parent, false)
        return codeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return codelist.size
    }

    override fun onBindViewHolder(holder: codeViewHolder, position: Int) {
        val kod = codelist[position]
        holder.tvNama.text = kod.nama
        holder.tvDetail.text = kod.detail
        Glide.with(holder.itemView.context)
            .load(kod.logo)
            .into(holder.gambarlogo)
    }

    inner class codeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var gambarlogo: ImageView = itemView.findViewById(R.id.gambarlogo)
    }
}