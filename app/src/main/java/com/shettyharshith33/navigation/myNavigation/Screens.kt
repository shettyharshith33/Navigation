package com.shettyharshith33.navigation.myNavigation

import kotlinx.serialization.Serializable

@Serializable
object FirstScreen

@Serializable
data class SecondScreen(
    val name : String,
    val age : Int
)