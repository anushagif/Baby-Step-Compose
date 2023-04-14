package com.anusha.uberclone.ui.about

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.anusha.uberclone.ui.theme.Shapes

@Composable
fun About() {
    Column(Modifier.verticalScroll(rememberScrollState())) {
        var data by remember {
            mutableStateOf("")
        }
        TextField(value = data, onValueChange ={
            data = it
        },Modifier.fillMaxWidth().border(BorderStroke(10.dp, Color.Blue), Shapes.medium))
    }

}