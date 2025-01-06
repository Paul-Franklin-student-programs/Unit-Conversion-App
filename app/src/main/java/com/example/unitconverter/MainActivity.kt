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

    private fun kilogramsToPounds(kilograms: Double): Double{
        val pounds: Double = kilograms * 2.20462
        return pounds
    }

    private fun poundsToKilograms(pounds: Double): Double{
        val kilograms: Double = pounds * 0.45359237
        return kilograms
    }

    private fun metersToFeet(meters: Double): Double{
        val feet: Double = meters * 3.280839895
        return feet
    }

    private fun feetToMeters(feet: Double): Double{
        val meters: Double = feet * 0.304
        return meters
    }





}
