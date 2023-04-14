package com.anusha.uberclone.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.anusha.uberclone.navigation.BottomBarItems
import com.anusha.uberclone.navigation.DrawerItems

@Composable
fun DrawerContent(navController: NavHostController) {
    Column(Modifier.fillMaxSize().background(Color.Blue)) {
        DrawerHeader()
        DrawerBody(navController = navController)



    }
}


@Composable
fun DrawerHeader() {
Column(Modifier.border(50.dp, Color.Black)) {

    Text(text = "I am header")

}


}


@Composable
fun DrawerBody(navController: NavHostController) {
    Column(Modifier.fillMaxHeight()) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentdestination = navBackStackEntry?.destination
        if (navBackStackEntry?.destination?.route in DrawerItems.values().map { it.route }) {
                DrawerItems.values().forEach { item ->
                    Text(
                        text = item.title,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .clickable {
                                navController.navigate(item.route) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }
                            }
                            .background(
                                if (currentdestination?.route == item.route) {
                                    MaterialTheme.colors.primary.copy(alpha = 0.12f)
                                } else {
                                    Color.Transparent
                                }
                            )
                            .padding(horizontal = 16.dp),
                        style = MaterialTheme.typography.body1
                    )


                }
            }




    }


}