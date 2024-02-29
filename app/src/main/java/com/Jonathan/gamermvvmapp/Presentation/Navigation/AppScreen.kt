package com.Jonathan.gamermvvmapp.Presentation.Navigation

sealed class AppScreen(val route: String)
{
    object Login: AppScreen( route = "login")
    object Singup: AppScreen(route = "singup")

}
