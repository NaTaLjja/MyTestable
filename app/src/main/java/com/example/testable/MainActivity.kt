package com.example.testable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val title:TextView = findViewById(R.id.helloWorldItem)
        val button:Button = findViewById(R.id.button)
        button.setOnClickListener {
            GlobalScope.launch (Dispatchers.Main){
                delay(2000)
                title.text = "Hello User!"
            }
        }
    }
}

data class WeatherResponse (val current_weather:CurrentWeather?)

data class CurrentWeather(val temperature:String)
