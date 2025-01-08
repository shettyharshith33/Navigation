package com.shettyharshith33.navigation.myNavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.shettyharshith33.navigation.ui.theme.NetflixRed

@Composable
fun FirstScreen(
    onNavScreen2:()->Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .background(NetflixRed),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = {
            onNavScreen2()
        }) {
            Text("Go to 1st Screen")
        }
    }

}