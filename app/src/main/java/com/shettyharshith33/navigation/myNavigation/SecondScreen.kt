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
import androidx.compose.ui.graphics.Color


@Composable
fun SecondScreen(
    onNavScreen1:()->Unit
) {
    Box(modifier = Modifier.fillMaxSize()
        .statusBarsPadding()
        .background(Color.Green),
        contentAlignment = Alignment.Center){
        Button(onClick = {
            onNavScreen1()
        }) {
            Text("Go to 2nd Screen")
        }
    }

}