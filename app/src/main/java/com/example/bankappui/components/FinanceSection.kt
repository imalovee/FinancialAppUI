package com.example.bankappui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MonetizationOn
import androidx.compose.material.icons.filled.StarHalf
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankappui.ui.theme.BlueStart
import com.example.bankappui.ui.theme.GreenStart
import com.example.bankappui.ui.theme.OrangeStart
import com.example.bankappui.ui.theme.PurpleStart

val financeList = listOf(
    FinanceData(
        icon = Icons.Default.StarHalf,
        name = "My\nBusiness",
        iconBg = OrangeStart
    ),

    FinanceData(
        icon = Icons.Default.Wallet,
        name = "My\nWallet",
        iconBg = BlueStart
    ),

    FinanceData(
        icon = Icons.Default.MonetizationOn,
        name = "Trust\nFund",
        iconBg = OrangeStart
    ),
    FinanceData(
        icon = Icons.Default.StarHalf,
        name = "Finance\nAnalytics",
        iconBg = PurpleStart
    ),
    FinanceData(
        icon = Icons.Default.MonetizationOn,
        name = "My\nTransaction",
        iconBg = GreenStart
    ),


)

@Composable
fun FinanceSection(){
 Column {
     Text(
         text = "Finance",
         fontSize = 22.sp,
         fontWeight = FontWeight.Bold,
         color = MaterialTheme.colorScheme.onBackground,
         modifier = Modifier.padding(start = 16.dp, top = 6.dp, bottom = 6.dp)
     )

     LazyRow {
         items(financeList.size){
             index ->
             FinanceItem(index)
         }
     }
 }
}

@Composable
fun FinanceItem(index : Int){
    val finance= financeList[index]
    var lastItemPadding = 0.dp
    if (index== financeList.size - 1){
        lastItemPadding = 8.dp
    }

    Box (modifier = Modifier.padding(start =16.dp, end= lastItemPadding)
        .background(
            color = MaterialTheme.colorScheme.secondaryContainer,
            shape = RoundedCornerShape(25.dp)
        ) ){


        Column(modifier = Modifier

            .size(110.dp)
            .clickable { }
            .padding(7.dp)
            .background(MaterialTheme.colorScheme.secondaryContainer),
            verticalArrangement = Arrangement.SpaceBetween,

        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(finance.iconBg)
                    .padding( 6.dp)
            ) {
                Icon(
                    imageVector = finance.icon,
                    contentDescription = null,
                    tint = Color.White,

                )

            }

            Text(
                text = finance.name,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                modifier = Modifier.padding(start = 8.dp)
            )

        }
    }
}







