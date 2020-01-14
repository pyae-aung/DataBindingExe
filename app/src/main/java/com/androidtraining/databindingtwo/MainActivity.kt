package com.androidtraining.databindingtwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.androidtraining.databindingtwo.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var person: Person = Person("a", "b")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.submitButton.setOnClickListener {
            person = Person(binding.nameEditTxt.text.toString(), binding.occupationEditTxt.text.toString())
            binding.person = person
//            THIS is for null exception, you need to put ? to accept nullable Unit
//            person.name = binding.nameEditTxt.text.toString()
//            person.occupation = binding.occupationEditTxt.text.toString()
//            binding.person?.name = person.name

        }
    }
}
