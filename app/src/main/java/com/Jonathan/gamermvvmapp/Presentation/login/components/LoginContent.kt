package com.Jonathan.gamermvvmapp.Presentation.login.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Build

import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock

import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Jonathan.gamermvvmapp.Presentation.ComponentReutilizables.DefaultButton
import com.Jonathan.gamermvvmapp.Presentation.ComponentReutilizables.DefaultTextfield
import com.Jonathan.gamermvvmapp.R

import com.Jonathan.gamermvvmapp.Presentation.theme.Red500

private val Color.Companion.darkGrey700: Any
    get() {
        TODO("Not yet implemented")
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginContent() {


    Box(modifier = Modifier
        .fillMaxWidth()) {
        //SE CREAN FUNCIONES APARTE Y SE METEN DENTRO DEL BOX
        CardForm()
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardForm() {

    // VARIABLES DONDE SE ALMACENA LO QUE EL USUARIO ESCRIBE
    var email by remember {
        mutableStateOf( value = "")
    }

    var password by remember {
        mutableStateOf( value = "")
    }

    //Se utiliza para crear un marco de fondo para los componentes que esten dentro de el
    Card(
        modifier = Modifier
            .padding(
                start = 20.dp, end = 20.dp, top = 180
                    .dp
            )
            .height(350.dp)
    ) {
        Column(modifier = Modifier.padding(horizontal = 20.dp)) {

            Text(
                modifier = Modifier.padding(
                    top = 20.dp,
                    start = 0.dp,
                    end = 0.dp,
                    bottom = 15.dp
                ),
                text = "LOGIN",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                modifier = Modifier.padding(top = 10.dp, bottom = 1.dp),
                text = "Por favor inicia sesion para continuar",
                fontSize = 14.sp,
                color = Color.Gray
            )

            DefaultTextfield(modifier = Modifier.padding(top = 40.dp),
                             value = email,
                             onValueChange ={email = it} ,
                             label ="Email" ,
                             icon = Icons.Default.Email,
                             keyboardType = KeyboardType.Email)


            DefaultTextfield(modifier = Modifier.padding(top = 50.dp),
                             value = password,
                             onValueChange ={password = it} ,
                             label = "password",
                             icon = Icons.Default.Lock,
                              hideText = true
                             )



           DefaultButton(text = "INICIAR SESION",
                         onClick = { /*TODO*/ },
                         color = Color.Blue,
                          icon = Icons.Default.ArrowForward)

        }
    }
}











