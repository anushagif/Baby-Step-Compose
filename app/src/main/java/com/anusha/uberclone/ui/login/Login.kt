package com.anusha.uberclone.ui.login

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Login(loginClicked: () -> Unit) {
    Column() {
        Button(onClick = loginClicked) {
            Text(text = "Click for login")
        }
    }
}