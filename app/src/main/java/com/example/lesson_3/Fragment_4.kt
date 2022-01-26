package com.example.lesson_3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson_3.databinding.Fragment1Binding
import com.example.lesson_3.databinding.Fragment4Binding


class Fragment_4 : Fragment() {

    lateinit var binding: Fragment4Binding

    private var uuid = 3

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment4Binding.inflate(inflater, container, false)

        binding.result.text = Calculate.first_field.
        toString() + " " + Calculate.operation + " " + Calculate.second_field.toString() + " = " + Calculate.calculate().toString()

        prevButtonClick()

        return binding.root
    }

    private fun prevButtonClick(){
        binding.prev.setOnClickListener {
            val activityFunctions = requireActivity() as ActivityFunctions
            activityFunctions.showPreviousFragment(uuid)
        }
    }

}