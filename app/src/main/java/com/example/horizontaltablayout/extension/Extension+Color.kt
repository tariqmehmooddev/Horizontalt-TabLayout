package com.example.horizontaltablayout.extension

import androidx.compose.ui.graphics.Color
import com.example.horizontaltablayout.enums.Weekdays

fun Color.displayWeekColor(today: Weekdays): Color {

    when (today) {
        Weekdays.MONDAY -> return Color(0xFF268ED9)
        Weekdays.TUESDAY -> return Color(0xFFD7C20A)
        Weekdays.WEDNESDAY -> return Color(0xFFC74375)
        Weekdays.THURSDAY -> return Color(0xFF939597)
        Weekdays.FRIDAY -> return Color(0xFFF48A1D)
        Weekdays.SATURDAY -> return Color(0xFFCDDC39)
        Weekdays.SUNDAY -> return  Color(0xFF916FDD)
    }
}