package com.openclassrooms.realestatemanager.view.searchProperty

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.openclassrooms.realestatemanager.R
import com.openclassrooms.realestatemanager.data.entity.Agent

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */
class ListAgentSearchAdapter(
        var agents: List<Agent>, private val glide: RequestManager, private val callback: ListenerCheckBox
) :
        RecyclerView.Adapter<ListAgentsSearchViewHolder>(){

    private val holders = mutableListOf<ListAgentsSearchViewHolder>()

    interface ListenerCheckBox{
        fun onClickCheckBox(id: String, isChecked: Boolean)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAgentsSearchViewHolder {
        val context = parent.context
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.card_search_agent_view_item, parent, false)

        return ListAgentsSearchViewHolder(view)
    }

    override fun getItemCount(): Int {
        return agents.size
    }

    override fun onBindViewHolder(holder: ListAgentsSearchViewHolder, position: Int) {
        holder.updateWithAgent(agents[position], glide, callback)
        holders.add(holder)
    }

    fun selectAllAgents(){
        holders.forEach { it.selectOnSelectAll() }

    }

}