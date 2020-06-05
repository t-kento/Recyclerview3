package com.example.recyclerview3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateDummyList(500)

        recycler_view.adapter = ExampleAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this).apply{
            orientation = RecyclerView.VERTICAL
            reverseLayout =true
        }
        recycler_view.setHasFixedSize(true)
    }


    private fun generateDummyList(size:Int):List<ExampleItem>{

        val list = ArrayList<ExampleItem>()

        for (i in 0 until size){
            val drawable = when (i %3 ){
                0 -> R.drawable.ic_android
                1 -> R.drawable.ic_call_end
                else -> R.drawable.ic_camera
            }

            val item = ExampleItem(drawable, "Item $i","Lin 2")
            list += item
        }
        return  list
    }
}
