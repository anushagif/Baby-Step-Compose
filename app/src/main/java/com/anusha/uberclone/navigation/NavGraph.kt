package com.anusha.uberclone.navigation


import Home
import Login
import Registration
import Splash
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NavScreen() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavScreen.SplashScreen.route) {
        composable(route = NavScreen.SplashScreen.route) {
            Splash(navController = navController)
        }
        composable(route = NavScreen.RegistrationScreen.route) {
            Registration(navController = navController)
        }
        composable(route = NavScreen.LoginScreen.route) {

            Login(navController = navController)

        }
        composable(route = NavScreen.HomeScreenn.route){
            Home()
        }







        }
    }


