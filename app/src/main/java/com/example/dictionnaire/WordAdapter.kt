package com.example.dictionnaire

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*
import kotlinx.android.synthetic.main.words_item.view.*

class WordAdapter(private val words:List<Word>) : RecyclerView.Adapter<WordAdapter.WordViewHolder>() {




        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder
        {
            return WordViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.words_item,parent,false)
            )
        }

        override fun onBindViewHolder(holder: WordViewHolder, position: Int)
        {
            holder.view.wordMeaning.text = words[position].wordText

            holder.view.setOnClickListener {
                val action = HomeFragmentDirections.actionDetailWordFragment()
                action.word = words[position]
                Navigation.findNavController(it).navigate(action)
            }
        }


        override fun getItemCount() = words.size





        class WordViewHolder(val view: View): RecyclerView.ViewHolder(view)
    {

    }
}