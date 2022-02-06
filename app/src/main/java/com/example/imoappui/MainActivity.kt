package com.example.imoappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.rv_chats)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {

        val adapter = ChatAdapter(this, chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {

        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.drawable.im_sample1, "Qobilov Kamron", 1))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", 3))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", 4))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", 0))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", 2))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", 5))
        chats.add(Chat(R.drawable.im_sample1, "Qobilov Kamron", 1))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", 3))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", 4))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", 0))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", 2))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", 5))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", 4))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", 0))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", 2))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", 5))
        chats.add(Chat(R.drawable.im_sample1, "Qobilov Kamron", 1))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", 3))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", 4))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", 0))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", 4))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", 0))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", 2))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", 5))
        chats.add(Chat(R.drawable.im_sample1, "Qobilov Kamron", 1))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", 3))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", 4))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", 0))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", 2))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", 5))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", 4))
        chats.add(Chat(R.drawable.im_sample4, "Mirzayev Mansur", 0))
        chats.add(Chat(R.drawable.im_sample5, "Buriyev Begzod", 2))
        chats.add(Chat(R.drawable.im_sample6, "Tojimurodov Diyor", 5))
        chats.add(Chat(R.drawable.im_sample1, "Qobilov Kamron", 1))
        chats.add(Chat(R.drawable.im_sample2, "Xushvaqtov Azizbek", 3))
        chats.add(Chat(R.drawable.im_sample3, "Matyaqubov Bogibek", 4))

        return chats
    }
}