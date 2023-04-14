package com.anusha.uberclone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.anusha.uberclone.R
import kotlinx.coroutines.delay

@Composable
fun Splash(delayDone: () -> Unit) {

    LaunchedEffect(key1 = true) {
        delay(5000L)
        delayDone()
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(R.drawable.spalsh_screen),
            contentDescription = "splash screen"
        )
    }
}