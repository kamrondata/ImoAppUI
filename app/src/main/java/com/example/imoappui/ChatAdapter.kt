package com.example.imoappui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var context: Context, var items: ArrayList<Chat>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = items[position]

        if (holder is ViewHolder) {

            holder.apply {
                iv_profile.setImageResource(chat.profile)
                tv_fullName.text = chat.fullName
                tv_messageCount.text = chat.count.toString()

                if (chat.count > 0) {
                    tv_messageCount.visibility = View.VISIBLE
                } else {
                    tv_messageCount.visibility = View.GONE
                }
            }
        }
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val iv_profile: ShapeableImageView = view.findViewById(R.id.iv_profile)
        val tv_fullName: TextView = view.findViewById(R.id.tv_fullname)
        val tv_massage: TextView = view.findViewById(R.id.tv_message)
        val tv_messageCount: TextView = view.findViewById(R.id.tv_massage_count)
    }
}