package com.practicum.daggerexample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.practicum.daggerexample.di.DaggerAppComponent
import com.practicum.daggerexample.featureA.presentation.AlphaViewModel
import com.practicum.daggerexample.featureB.presentation.BravoViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var alphaViewModel: AlphaViewModel
    @Inject lateinit var bravoViewModel: BravoViewModel

    private val textView by lazy { findViewById<TextView>(R.id.some_text_view) }
    private var lastText = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerAppComponent.create().inject(this)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        alphaViewModel.doSomething()
        bravoViewModel.doSomething()

        alphaViewModel.getLiveData().observe(this) { someText ->
            lastText += "$someText\n"
            textView.text = lastText
        }
    }
}