package com.example.bankappui

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankappui.components.BottomNavBar
import com.example.bankappui.components.CardSection
import com.example.bankappui.components.CurrenciesSection
import com.example.bankappui.components.FinanceSection
import com.example.bankappui.components.WalletSection
import com.example.bankappui.ui.theme.BankAppUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BankAppUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}
//
//@Composable
// private fun SetBarColor(color : Color) {
//    val systemUiController = rememberSystemUiController()
//}
//

@Preview()
 @Composable
fun HomeScreen(){
    Scaffold(
        bottomBar = { BottomNavBar()}
    ) { paddingValues->
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)){
             WalletSection()
            CardSection()
//            Spacer(modifier = Modifier.height(5.dp))
             FinanceSection()
            CurrenciesSection()

        }

    }
}