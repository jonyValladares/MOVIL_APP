package com.Jonathan.gamermvvmapp.Presentation.login.screens.SingUp

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun  SingUpScreen (){
    Scaffold (

        topBar = {},
        content = { Text(text = "SingupScreen")},
        bottomBar = {}
    )
}