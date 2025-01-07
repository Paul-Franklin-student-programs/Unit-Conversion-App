package com.example.unitconverter
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Celsius to Fahrenheit
        val celsiusField = findViewById<EditText>(R.id.et_celsius)
        val cToFButton = findViewById<Button>(R.id.btn_c_to_f)
        val cToFResult = findViewById<TextView>(R.id.tv_c_to_f_result)

        cToFButton.setOnClickListener {
            val celsius = celsiusField.text.toString().toDoubleOrNull()
            if (celsius != null) {
                val fahrenheit = celsiusToFahrenheit(celsius)
                cToFResult.text = "Result: %.2f °F".format(fahrenheit)
            } else {
                cToFResult.text = "Please enter a valid number."
            }
        }

        // Fahrenheit to Celsius
        val fahrenheitField = findViewById<EditText>(R.id.et_fahrenheit)
        val fToCButton = findViewById<Button>(R.id.btn_f_to_c)
        val fToCResult = findViewById<TextView>(R.id.tv_f_to_c_result)

        fToCButton.setOnClickListener {
            val fahrenheit = fahrenheitField.text.toString().toDoubleOrNull()
            if (fahrenheit != null) {
                val celsius = fahrenheitToCelsius(fahrenheit)
                fToCResult.text = "Result: %.2f °C".format(celsius)
            } else {
                fToCResult.text = "Please enter a valid number."
            }
        }

        // Pounds to Kilograms
        val poundsField = findViewById<EditText>(R.id.et_pounds)
        val pToKgButton = findViewById<Button>(R.id.btn_p_to_kg)
        val pToKgResult = findViewById<TextView>(R.id.tv_p_to_kg_result)

        pToKgButton.setOnClickListener {
            val pounds = poundsField.text.toString().toDoubleOrNull()
            if (pounds != null) {
                val kilograms = poundsToKilograms(pounds)
                pToKgResult.text = "Result: %.2f kg".format(kilograms)
            } else {
                pToKgResult.text = "Please enter a valid number."
            }
        }

        // Kilograms to Pounds
        val kilogramsField = findViewById<EditText>(R.id.et_kilograms)
        val kgToPButton = findViewById<Button>(R.id.btn_kg_to_p)
        val kgToPResult = findViewById<TextView>(R.id.tv_kg_to_p_result)

        kgToPButton.setOnClickListener {
            val kilograms = kilogramsField.text.toString().toDoubleOrNull()
            if (kilograms != null) {
                val pounds = kilogramsToPounds(kilograms)
                kgToPResult.text = "Result: %.2f lbs".format(pounds)
            } else {
                kgToPResult.text = "Please enter a valid number."
            }
        }

        // Meters to Feet
        val metersField = findViewById<EditText>(R.id.et_meters)
        val mToFButton = findViewById<Button>(R.id.btn_m_to_f)
        val mToFResult = findViewById<TextView>(R.id.tv_m_to_f_result)

        mToFButton.setOnClickListener {
            val meters = metersField.text.toString().toDoubleOrNull()
            if (meters != null) {
                val feet = metersToFeet(meters)
                mToFResult.text = "Result: %.2f ft".format(feet)
            } else {
                mToFResult.text = "Please enter a valid number."
            }
        }

        // Feet to Meters
        val feetField = findViewById<EditText>(R.id.et_feet)
        val fToMButton = findViewById<Button>(R.id.btn_f_to_m)
        val fToMResult = findViewById<TextView>(R.id.tv_f_to_m_result)

        fToMButton.setOnClickListener {
            val feet = feetField.text.toString().toDoubleOrNull()
            if (feet != null) {
                val meters = feetToMeters(feet)
                fToMResult.text = "Result: %.2f m".format(meters)
            } else {
                fToMResult.text = "Please enter a valid number."
            }
        }


    }
}