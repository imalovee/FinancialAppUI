package com.example.bankappui.components

import androidx.compose.ui.graphics.Brush

data class CardData(
    val cardType : String,
    val cardName: String,
    val cardNumber : String,
    val balance : Double,
    val color : Brush
)
