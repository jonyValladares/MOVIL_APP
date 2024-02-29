package com.Jonathan.gamermvvmapp.Presentation.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.Jonathan.gamermvvmapp.Presentation.theme.Red500
import com.Jonathan.gamermvvmapp.R

@Composable
 fun LoginTopbar (){
    Box(modifier = Modifier
        .height(230.dp)
        .background(Red500)
        .fillMaxWidth()
    )
    {

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier.height(120.dp),
                painter = painterResource(id = R.drawable.control),
                contentDescription = "Control de xbox 360"
            )


            Text(
                text = " FIREBASE MVVM"
            )
        }


    }

}