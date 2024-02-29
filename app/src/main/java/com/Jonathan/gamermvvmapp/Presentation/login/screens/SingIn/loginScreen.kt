package com.Jonathan.gamermvvmapp.Presentation.login.screens.SingIn

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.Jonathan.gamermvvmapp.R
import com.Jonathan.gamermvvmapp.Presentation.login.components.LoginBottomBar
import com.Jonathan.gamermvvmapp.Presentation.login.components.LoginContent
import com.Jonathan.gamermvvmapp.Presentation.login.components.LoginTopbar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun LoginScreen (navController: NavHostController){
     //ESQUELETO DE LA APLICACION SIEMPRE SE UTULIZA AL PONER UNA PANTALLA
    Scaffold(
        topBar = { LoginTopbar()},

        content = {LoginContent()},

        bottomBar = {LoginBottomBar()}
    )


    Box(modifier = Modifier.fillMaxWidth()){
        LoginTopbar()
        LoginContent()
    }
        }












