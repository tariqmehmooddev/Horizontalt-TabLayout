package com.example.horizontaltablayout.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.horizontaltablayout.extension.customRippleClickable


@Composable
fun ListITemView(dayName: String,color:Color, isSelected: Boolean, onItemClicked: () -> Unit) {
    Box(
        modifier = Modifier
            .padding(vertical = 5.dp).padding(start = 10.dp, end = 5.dp)
            .background(
                if (isSelected) Color(0xFFE7EEFC) else Color.White,
                shape = RoundedCornerShape(8.dp)
            )
            .border(BorderStroke(1.dp, if (isSelected) Color.White else Color.Gray),
                RoundedCornerShape(8.dp)
            ),

    ) {
        Row(
            Modifier
                .height(50.dp)
                .customRippleClickable(null){
                    onItemClicked()
                },
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = dayName, // Access the enum name
                modifier = Modifier
                    .padding(horizontal = 7.dp)
                    .align(Alignment.CenterVertically),
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 18.4.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF223142),
                )
            )

            Box(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(vertical = 5.dp)
                    .padding(horizontal = 7.dp)
                    .background(
                        color,
                        shape = CircleShape
                    ),
            ) {
                Text(
                    text = "10",
                    modifier = Modifier
                        .padding(vertical = 5.dp)
                        .padding(horizontal = if ("5".length == 1) 8.5.dp else 5.dp),
                )
            }
        }
    }
}
