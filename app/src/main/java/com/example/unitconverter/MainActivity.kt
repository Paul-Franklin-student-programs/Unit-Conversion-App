package com.example.unitconverter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun celsiusToFahrenheit(celsius: Double): Double{
        val tempF: Double = (celsius * (9.0 / 5.0)) + 32
        return tempF
    }

    private fun fahrenheitToCelsius(fahrenheit: Double): Double{
        val tempC: Double = (fahrenheit - 32) * 5.0 / 9.0
        return tempC
    }






}
