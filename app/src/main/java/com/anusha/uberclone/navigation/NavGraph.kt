package com.anusha.uberclone.navigation

import Setting
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.anusha.uberclone.ui.about.About
import com.anusha.uberclone.ui.components.DrawerContent
import com.anusha.uberclone.ui.components.Splash
import com.anusha.uberclone.ui.home.HomeScreen
import com.anusha.uberclone.ui.login.Login
import com.anusha.uberclone.ui.registration.Registration
import kotlinx.coroutines.launch

@Composable
fun NavScreen() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        bottomBar = {
        BottomBar(navController = navController)
    }, topBar = {
        TopBar(navController = navController) {
            scope.launch {
                scaffoldState.drawerState.open()
            }

        }

        },
    drawerContent = { DrawerContent(navController = navController) }) { paddingValues ->
        NavHost(
            navController = navController,
            modifier = Modifier.padding(paddingValues),
            startDestination = NavScreen.SplashScreen.route
        ) {
            composable(route = NavScreen.SplashScreen.route) {
                Splash { navController.navigate(NavScreen.RegistrationScreen.route) }
            }
            composable(route = NavScreen.RegistrationScreen.route) {
                Registration { navController.navigate(NavScreen.LoginScreen.route) }
            }
            composable(route = NavScreen.LoginScreen.route) {
                Login { navController.navigate(NavScreen.HomeScreen.route) }
            }
            composable(route = NavScreen.HomeScreen.route) {
                HomeScreen()
            }
            composable(route = NavScreen.SettingScreen.route) {
                Setting()
            }
            composable(route = NavScreen.AboutScreen.route ){
                About()
            }

        }
    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentdestination = navBackStackEntry?.destination

    if (navBackStackEntry?.destination?.route in BottomBarItems.values().map { it.route }) {
        BottomNavigation {
            BottomBarItems.values().forEach { item ->
                BottomNavigationItem(
                    selected = currentdestination?.hierarchy?.any { it.route == item.route }
                        ?: false,
                    onClick = {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.findStartDestination().id)
                            launchSingleTop = true
                        }
                    },
                    label = { Text(item.title) },
                    icon = {})
            }
        }
    }
}

@Composable
fun TopBar(navController: NavHostController, onNavigationIconClick: () -> Unit){
    val navBackStackEntry by navController.currentBackStackEntryAsState()


    if (navBackStackEntry?.destination?.route in BottomBarItems.values().map { it.route }) {

        TopAppBar(title = {
            Text(text = "Ride For Food")
        }, navigationIcon = {
            IconButton(onClick = onNavigationIconClick ){

                Icon(imageVector = Icons.Default.Menu, contentDescription = "toggle")

            }

        })
    }

    
}