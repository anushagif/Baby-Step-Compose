package com.anusha.uberclone.ui.registration

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.anusha.uberclone.R

@Composable
fun Registration(onClick: () -> Unit) {

    Surface(
        border = BorderStroke(4.dp, Color.Black), color = Color.LightGray, modifier = Modifier
            .fillMaxSize()
            .padding(4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(bottom = 16.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.spalsh_screen),
                contentDescription = "splash screen",
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .border(2.dp, Color.Green)
                    .padding(8.dp)
            )

            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.padding(8.dp)
            ) {
                var name by remember { mutableStateOf(TextFieldValue("")) }
                val nameErrorState = remember { mutableStateOf(false) }

                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    isError = nameErrorState.value,
                    placeholder = { Text("Enter your name") }
                )
                Button(onClick = onClick) {
                    Text(text = "Click for registration")
                }
            }
        }
    }
}


