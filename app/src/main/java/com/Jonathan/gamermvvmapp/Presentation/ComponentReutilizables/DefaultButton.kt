package com.Jonathan.gamermvvmapp.Presentation.ComponentReutilizables

import android.graphics.drawable.Icon
import android.text.AutoText
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.Jonathan.gamermvvmapp.Presentation.theme.Red500

@Composable
fun DefaultButton(
    //PARAMETROS
         text: String,
    //EVENTO , FUNCION LAMDA
         onClick : () -> Unit,
         color: Color ,
         icon: ImageVector = Icons.Default.ArrowForward

  )
{
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, bottom = 15.dp, start = 5.dp, end = 5.dp),
        onClick = { onClick()},
        

        )
    {
        Icon(
            imageVector = icon,
            contentDescription = ""
        )

        Text(text = text,
             color = Color.White)

    }
}
