package com.Jonathan.gamermvvmapp.Presentation.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.Jonathan.gamermvvmapp.Presentation.login.screens.SingIn.LoginScreen
import com.Jonathan.gamermvvmapp.Presentation.login.screens.SingUp.SingUpScreen


@Composable
fun AppNavigation (navController: NavHostController){

   NavHost(navController = navController,
       startDestination = AppScreen.Login.route ){

       composable(route = AppScreen.Login.route){
           LoginScreen(navController)
       }

       composable(route = AppScreen.Singup.route )
       {
           SingUpScreen()
       }
   }
}