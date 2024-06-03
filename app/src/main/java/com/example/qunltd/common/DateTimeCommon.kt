package com.example.qunltd.common

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.TimeZone

object DateTimeCommon {

    private const val formatDdMMyyyy = "dd/MM/yyyy"

    fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat(formatDdMMyyyy, Locale.US)
        dateFormat.timeZone = TimeZone.getTimeZone("GMT")
        return dateFormat.format(Date())
    }

    fun getCurrentDateTimeInMillis(): Long {
        val currentTime = Calendar.getInstance()
        currentTime.time = Calendar.getInstance().time
        return currentTime.timeInMillis
    }

    fun formatDateToString(
        date: Date?,
        format: String,
        locale: Locale = Locale.getDefault()
    ): String {
        val formatDateTime = SimpleDateFormat(format, locale)
        try {
            return formatDateTime.format(date)
        } catch (e: Exception) {
        }

        return ""
    }

    fun formatStringToString(
        text: String,
        format: String = formatDdMMyyyy,
        locale: Locale = Locale.getDefault()
    ): String {
        val dateFormatJson = SimpleDateFormat(format, locale)
        dateFormatJson.timeZone = TimeZone.getTimeZone("UTC")
        return try {
            if (text.isNotEmpty()) {
                formatDateToString(dateFormatJson.parse(text), format, locale)
            } else {
                ""
            }
        } catch (e: ParseException) {
            ""
        }
    }


}