package com.anusha.uberclone.navigation

sealed class NavScreen(val route: String) {

  object RegistrationScreen: NavScreen("registration_screen")
  object SplashScreen: NavScreen("splash_screen")
  object LoginScreen : NavScreen("login_screen")
  object HomeScreen : NavScreen("home_screen")
  object SettingScreen : NavScreen("setting_screen")
  object AboutScreen : NavScreen("about_screen")

}