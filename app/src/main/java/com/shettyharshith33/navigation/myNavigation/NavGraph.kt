package com.shettyharshith33.navigation.myNavigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute


@Composable
fun NavSetUp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = FirstScreen) {
        composable<FirstScreen>() {
            //First Screen
            FirstScreen{
                navController.navigate(
                    SecondScreen(
                        name = "Shetty",
                        age = 25
                    )
                )
            }
        }
        composable<SecondScreen>() {
            //Second Screen
            val args = it.toRoute<SecondScreen>()
            LaunchedEffect(key1 = Unit) {
                Log.d("Tag", "${args.name} ${args.age}")
            }
            SecondScreen{
                navController.navigate(FirstScreen)
            }

        }
    }
}