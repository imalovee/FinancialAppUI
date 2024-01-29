package com.example.bankappui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankappui.R
import com.example.bankappui.ui.theme.BlueEnd
import com.example.bankappui.ui.theme.BlueStart
import com.example.bankappui.ui.theme.GreenEnd
import com.example.bankappui.ui.theme.GreenStart
import com.example.bankappui.ui.theme.OrangeEnd
import com.example.bankappui.ui.theme.OrangeStart
import com.example.bankappui.ui.theme.PurpleEnd
import com.example.bankappui.ui.theme.PurpleStart

val cards = listOf(
   CardData(
       cardType = "Visa",
       cardNumber = "3664 7865 3786 3976",
       cardName = "Business",
       balance = 44.87,
       color = getGradient(PurpleStart, PurpleEnd)

   ),
    CardData(
        cardType = "MASTERCARD",
    cardNumber = "3567 7865 3786 3976",
    cardName = "Savings",
    balance = 198.67,
    color = getGradient(BlueStart, BlueEnd)),

    CardData(
        cardType = "VISA",
        cardNumber = "0078 3467 3446 7899",
        cardName = "Student Card",
        balance = 5000.87,
        color = getGradient(OrangeStart, OrangeEnd)),

    CardData(
        cardType = "MASTERCARD",
        cardNumber = "234 7583 7899 2223",
        cardName = "Trips",
        balance = 44.87,
        color = getGradient(GreenStart, GreenEnd)

    )
)

fun getGradient(
    startColor : Color,
    endColor : Color
):Brush{
    return Brush.horizontalGradient(colors = listOf(startColor,endColor))
}

@Composable
fun CardSection(){
    LazyRow{
        items(cards.size){
            index->
            (CardItem(index))
        }
    }
}

@Composable
fun CardItem(index : Int){
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp
    if (index== cards.size-1){
        lastItemPaddingEnd = 8.dp
    }

    var image = painterResource(R.drawable.ic_visa)
    if (card.cardType == "MASTERCARD"){
        image = painterResource(R.drawable.ic_mastercard)
    }

    Box(modifier = Modifier.padding( )
    ) {
        Column(modifier = Modifier
            .padding(vertical = 5.dp, horizontal =16.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(card.color)
            .height(160.dp)
            .width(250.dp)
            .clickable { },
            verticalArrangement = Arrangement.SpaceAround,

        ) {
            Image(painter = image,
                contentDescription = card.cardName,
                modifier = Modifier.width(90.dp)
                    .padding( 16.dp)
            )
            //Spacer(modifier = Modifier.height(10.dp))

            Text(text = card.cardName,
                fontSize = 17.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp, )
            )

            Text(text = "$ ${card.balance}",
                fontSize = 17.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp, )
            )

            Text(text = card.cardNumber,
                fontSize = 17.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp, )
            )



        }
    }
}