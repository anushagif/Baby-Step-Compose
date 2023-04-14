package com.anusha.uberclone.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DrawerContent() {
    (Column(Modifier.fillMaxWidth()) {
        DrawerHeader()


    })
}


@Composable
fun DrawerHeader() {
Column(Modifier.border(50.dp, Color.Black)) {

    Text(text = "I am header")

}


}