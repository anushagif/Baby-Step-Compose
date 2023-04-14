package com.anusha.uberclone.navigation

enum class BottomBarItems(val route: String, val title: String) {
    HomeItems(route = NavScreen.HomeScreen.route, title = "home"),
    SettingItems(route = NavScreen.SettingScreen.route, title = "setting")
}
