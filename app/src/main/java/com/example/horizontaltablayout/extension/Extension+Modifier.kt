package com.example.horizontaltablayout.extension

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color

inline fun Modifier.customRippleClickable(
    rippleColor: Color?,
    crossinline onClick: () -> Unit
): Modifier = composed {
    clickable(
        indication = if (rippleColor == null) null else rememberRipple(color = rippleColor),
        interactionSource = remember { MutableInteractionSource() }) {
        onClick()
    }
}



