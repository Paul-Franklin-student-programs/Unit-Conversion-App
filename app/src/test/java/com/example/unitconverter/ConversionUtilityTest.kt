package com.example.unitconverter

import org.junit.Assert.assertEquals
import org.junit.Test

class ConversionUtilityTest {

    @Test
    fun testCelsiusToFahrenheit() {
        val result = celsiusToFahrenheit(0.0)
        assertEquals(32.0, result, 0.001)
    }

    @Test
    fun testFahrenheitToCelsius() {
        val result = fahrenheitToCelsius(32.0)
        assertEquals(0.0, result, 0.001)
    }

    @Test
    fun testKilogramsToPounds() {
        val result = kilogramsToPounds(1.0)
        assertEquals(2.205, result, 0.001)
    }

    @Test
    fun testPoundsToKilograms() {
        val result = poundsToKilograms(2.205)
        assertEquals(1.0, result, 0.001)
    }

    @Test
    fun testMetersToFeet() {
        val result = metersToFeet(1.0)
        assertEquals(3.28, result, 0.001)
    }

    @Test
    fun testFeetToMeters() {
        val result = feetToMeters(3.28)
        assertEquals(1.0, result, 0.001)
    }
}
