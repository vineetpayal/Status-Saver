package com.vineet.statussave.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.vineet.statussave.R
import com.vineet.statussave.data.Story

class storyAdapter(val stories : ArrayList<Story>) : RecyclerView.Adapter<storyAdapter.storyViewHolder>(){
    class storyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val storyImageView = itemView.findViewById<ImageView>(R.id.story_iv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): storyAdapter.storyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_story,parent,false)
        return storyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: storyAdapter.storyViewHolder, position: Int) {

        try {
            Picasso.get().load(stories[position].path).placeholder(R.drawable.ic_launcher_foreground).into(holder.storyImageView)
        }catch (e : Exception){
            Toast.makeText(holder.itemView.context,e.message, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return stories.size
    }
}
