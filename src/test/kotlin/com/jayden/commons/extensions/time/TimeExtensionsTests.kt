package com.jayden.commons.extensions.time

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month

internal class TimeExtensionsTests {

    @Test
    internal fun `convert LocalDateTime to epochMilli`() {
        val expectedValue = 1585989138000L

        val dateTime = LocalDateTime.of(2020, Month.APRIL, 4, 17, 32, 18)
        val epochMilli = dateTime.toEpochMilli()

        Assertions.assertEquals(expectedValue, epochMilli)
    }

    @Test
    internal fun `convert LocalDate to epochMilli`() {
        val expectedValue = 1585926000000L

        val date = LocalDate.of(2020, Month.APRIL, 4)
        val epochMilli = date.toEpochMilli()

        Assertions.assertEquals(expectedValue, epochMilli)
    }
}