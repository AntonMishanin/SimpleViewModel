package com.paint.simpleviewmodel

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModelFactory = SimpleDependencyFactory().provideViewModelFactory()
        val viewModel: SimpleViewModel by viewModels { viewModelFactory }

        //Observe viewModel.
        viewModel.content.observe(this) { onContentChanged(it) }
        viewModel.showTextEvent.observe(this, ::onTextChanged)

        //Init view.
        val title = findViewById<TextView>(R.id.title)
        title.setOnClickListener { viewModel.showText() }
    }

    private fun onContentChanged(content: List<ContentUi>) {
        //Set to adapter.
    }

    private fun onTextChanged(text: String) =
        Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
}