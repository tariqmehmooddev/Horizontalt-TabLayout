package com.example.horizontaltablayout.appModule

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.horizontaltablayout.components.ListITemView
import com.example.horizontaltablayout.enums.Weekdays
import com.example.horizontaltablayout.extension.displayWeekColor
import com.example.horizontaltablayout.ui.theme.HorizontalTabLayoutTheme

@SuppressLint("UnrememberedMutableState")
@Composable
fun HomeView() {
    val selectedItem = rememberSaveable { mutableStateOf(Weekdays.MONDAY) }

    Column(
       modifier =  Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        LazyRow {
            items(Weekdays.values()) { item ->
                ListITemView(
                    dayName = item.dayString,
                    color = Color.Gray.displayWeekColor(item),
                    isSelected = selectedItem.value == item,
                    onItemClicked = {
                        selectedItem.value = item
                    }
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HorizontalTabLayoutTheme {
        HomeView()
    }
}