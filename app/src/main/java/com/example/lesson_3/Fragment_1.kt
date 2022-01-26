package com.example.lesson_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson_3.databinding.Fragment1Binding


class Fragment_1 : Fragment() {

    lateinit var binding: Fragment1Binding

    private var uuid = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment1Binding.inflate(inflater, container, false)
        nextButtonClick()
        return binding.root
    }

    private fun nextButtonClick(){
        binding.nextButton.setOnClickListener {
            val activityFunctions = requireActivity() as ActivityFunctions
            try {
                Calculate.first_field = binding.firstTextView.text.toString().toInt()
            }
            catch (e: Exception){
                Calculate.first_field = null
            }
            activityFunctions.showNextFragment(uuid)
        }
    }


}