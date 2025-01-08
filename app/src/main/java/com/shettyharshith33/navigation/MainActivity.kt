package com.shettyharshith33.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.toArgb
import com.shettyharshith33.navigation.myNavigation.NavSetUp
import com.shettyharshith33.navigation.ui.theme.NavigationTheme
import com.shettyharshith33.navigation.ui.theme.NetflixRed

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                NetflixRed.toArgb()
            ),
            navigationBarStyle = SystemBarStyle.dark(
                NetflixRed.toArgb()
            )
        )
        setContent {
            NavigationTheme {
                NavSetUp()
            }
        }
    }
}