package com.anusha.uberclone.navigation

sealed class BottomBarScreen(val route: String, val title: String){

    object HomeScreen: BottomBarScreen(route = "home", title = "home")
    object SettingScreen: BottomBarScreen(route = "setting", title = "setting")
}
