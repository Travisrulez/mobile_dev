package com.example.lesson_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lesson_4.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


interface ActivityFunctions{
    fun showLikeClickEvent(name: String)
    fun showFormClickEvent(name: String)
}

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PersonsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        adapter = PersonsAdapter(object : ActivityFunctions{
            override fun showLikeClickEvent(name: String){
                Snackbar.make(binding.root, "Нажат лайк: $name", 1500).show()
            }
            override fun showFormClickEvent(name: String){
                Snackbar.make(binding.root, "Нажата карточка: $name", 1500).show()
            }
        })
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val layoutManager = LinearLayoutManager(this)
        binding.recycleview.layoutManager = layoutManager
        binding.recycleview.adapter = adapter
    }

}