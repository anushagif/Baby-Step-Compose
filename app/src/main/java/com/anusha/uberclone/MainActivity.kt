package com.anusha.uberclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.anusha.uberclone.ui.theme.UberCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UberCloneTheme {
              Column(Modifier.fillMaxSize()) {

                  ColorBox(
                      Modifier
                          .fillMaxSize()
                          .background(Color.Magenta))

              }
            }
        }
    }
}

@Composable
fun ColorBox(modifier: Modifier = Modifier) {
val color = remember {
    mutableStateOf(Color.Gray)
}

    Box(modifier = modifier
        .background(color.value)
        .clickable {
          color.value = Color.Cyan
        })


}

