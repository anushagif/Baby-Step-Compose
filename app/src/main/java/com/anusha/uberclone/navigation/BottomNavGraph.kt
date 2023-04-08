package com.anusha.uberclone.navigation

import Home
import Setting
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.HomeScreen.route ){

        composable(route = BottomBarScreen.HomeScreen.route ){
            Home()
        }
        composable(route = BottomBarScreen.SettingScreen.route ){
            Setting()
        }
    }
}