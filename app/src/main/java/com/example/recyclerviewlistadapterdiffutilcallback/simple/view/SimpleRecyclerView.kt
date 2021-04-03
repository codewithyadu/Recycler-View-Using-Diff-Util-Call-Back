package com.example.recyclerviewlistadapterdiffutilcallback.simple.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewlistadapterdiffutilcallback.R
import com.example.recyclerviewlistadapterdiffutilcallback.databinding.ActivitySimpleRecyclerViewBinding
import com.example.recyclerviewlistadapterdiffutilcallback.simple.itemstate.*
import com.example.recyclerviewlistadapterdiffutilcallback.simple.view.adapter.UserAdapter

class SimpleRecyclerView : AppCompatActivity() {
    
    lateinit var binding: ActivitySimpleRecyclerViewBinding
    lateinit var adapter: UserAdapter
    lateinit var list: ArrayList<BaseItemState>
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_recycler_view)
        with(binding) {
            lifecycleOwner = this@SimpleRecyclerView
        }

        setRecyclerView()

        binding.button.setOnClickListener {
            /**
             * For Add
             */
//            val newList = adapter.currentList.toMutableList()
//            val newUser = UserItemState("NewUser")
//            newList.add(newUser)
//            adapter.submitList(newList.toList())
            /**
             * For Update
             */
//            val newList = adapter.currentList.toMutableList()
//            val oldUser = newList[0] as UserItemState
//            val user = UserItemState("${oldUser.userName} updated")
//            newList.removeAt(0)
//            newList.add(0, user)
//            adapter.submitList(newList.toList())
            /**
             * For Delete
             */
//            val newList = adapter.currentList.toMutableList()
//            newList.removeAt(0)
//            adapter.submitList(newList.toList())
            /**
             * For Delete All
             */
//            val newList = adapter.currentList.toMutableList()
//            newList.clear()
//            adapter.submitList(newList.toList())
        }
    }

    private fun setRecyclerView() {
        setList()
        val layoutManager = LinearLayoutManager(this)
        adapter = UserAdapter(this)
        with(binding) {
            simpleRecyclerView.layoutManager = layoutManager
            simpleRecyclerView.adapter = adapter
        }
        adapter.submitList(list)
    }

    private fun setList() {
        list = ArrayList<BaseItemState>()
        val horizontalList = ArrayList<HorizontalUserItemState>()
        for (i in 1..5) {
            val user = UserItemState("Yadu $i")
            list.add(user)
        }
        for (i in 1..5) {
            val user = HorizontalUserItemState("Yadu $i")
            horizontalList.add(user)
        }
        val horizontal = HorizontalItemState(horizontalList)
        list.add(horizontal)
        for (i in 6..10) {
            val user = UserItemState("Yadu $i")
            list.add(user)
        }
    }
}