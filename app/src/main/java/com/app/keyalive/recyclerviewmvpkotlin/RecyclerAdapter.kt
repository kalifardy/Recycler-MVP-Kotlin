package com.app.keyalive.recyclerviewmvpkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.keyalive.recyclerviewmvpkotlin.model.Users
import kotlinx.android.synthetic.main.recyclerview_item.view.*

/**
 * Created by keyalive on 17/02/2018.
 */
class RecyclerAdapter(data:ArrayList<Users>) : RecyclerView.Adapter<RecyclerAdapter.MyHolder>() {

    lateinit var ambildata:ArrayList<Users>
    init {
        ambildata=data
    }
    override fun onBindViewHolder(holder: MyHolder?, position: Int) {
        holder?.bind(ambildata.get(position))
    }

    override fun getItemCount(): Int {
        return ambildata.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {
        var view=LayoutInflater.from(parent?.context).inflate(R.layout.recyclerview_item,parent,false)
        return MyHolder(view)
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(ambildata: Users) {
            itemView.txtnama.text= ambildata.nama
            itemView.txtalamat.text= ambildata.alamat
        }

    }
}