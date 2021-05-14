package com.example.androidlearning.fragments.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidlearning.R

class RecycleViewAdapter(
    private val dataSet: List<Pair<String, String>>
) : RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var divider: View? = null
        var addressTextView: TextView? = null
        var emailTextView: TextView? = null

        init {
            emailTextView = view.findViewById(R.id.email_textview)
            addressTextView = view.findViewById(R.id.address_textview)
            divider = view.findViewById(R.id.rv_divider)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.rv_recycleview_simple_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.emailTextView?.text = dataSet[position].first
        viewHolder.addressTextView?.text = dataSet[position].second

        configureDividerVisibility(position, viewHolder)
    }

    private fun configureDividerVisibility(position: Int, viewHolder: ViewHolder) {
        if (position == itemCount - 1) viewHolder.divider?.visibility = View.GONE
        else viewHolder.divider?.visibility = View.VISIBLE
    }

    override fun getItemCount() = dataSet.size
}
