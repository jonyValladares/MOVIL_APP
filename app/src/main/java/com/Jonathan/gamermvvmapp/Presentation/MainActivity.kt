@file:OptIn(ExperimentalMaterial3Api::class)

package com.Jonathan.gamermvvmapp.Presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.Jonathan.gamermvvmapp.Presentation.login.screens.LoginScreen
import com.Jonathan.gamermvvmapp.Presentation.theme.GamerMVVMAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GamerMVVMAppTheme (darkTheme = true) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {

                    LoginScreen()

                }
            }
        }
    }
}


    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        GamerMVVMAppTheme {

        }
    }

