package com.anusha.uberclone.ui.activity

import Registration
import Splash
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.NavController
import com.anusha.uberclone.navigation.NavScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


                NavScreen()
                


        }
    }
}


