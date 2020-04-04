package com.jayden.commons.extensions.time

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId

fun LocalDateTime.toEpochMilli(zone: ZoneId = ZoneId.systemDefault()) = atZone(zone).toInstant().toEpochMilli()

fun LocalDate.toEpochMilli(zone: ZoneId = ZoneId.systemDefault()) = atStartOfDay(zone).toInstant().toEpochMilli()
