package com.example.bankappui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BottomNavBar(modifier: Modifier = Modifier){
    NavigationBar( modifier = Modifier
        .background(color = MaterialTheme.colorScheme.inverseOnSurface)
    ) {
            NavigationBarItem(
                selected = false,
                onClick = {  },
                label = { Text(text = "Home")},
                icon = { Icon(imageVector = Icons.Rounded.Home,
                    contentDescription = "Home",
                    tint = MaterialTheme.colorScheme.onBackground) }
            )

            NavigationBarItem(
                selected = false,
                onClick = {  },
                label = { Text(text = "Wallet")},
                icon = { Icon(imageVector = Icons.Rounded.Wallet,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onBackground) }
            )


            NavigationBarItem(
                selected = false,
                onClick = {  },
                label = { Text(text = "Notifications")},
                icon = { Icon(imageVector = Icons.Rounded.Notifications,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onBackground) }
            )

        NavigationBarItem(
            selected = false,
            onClick = {  },
            label = { Text(text = "Profile")},
            icon = { Icon(imageVector = Icons.Rounded.AccountCircle,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onBackground) }
        )
        }

    }


@Preview(showBackground = true)
@Composable
fun NavbarPreview(){
    BottomNavBar()
}