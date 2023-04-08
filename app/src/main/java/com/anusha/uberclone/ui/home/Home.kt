

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.anusha.uberclone.R
import com.anusha.uberclone.navigation.BottomBarScreen
import com.anusha.uberclone.navigation.BottomNavGraph


@Composable
fun Home() {
var navController = rememberNavController()
    
    Column(modifier = Modifier.fillMaxSize()) {
        
        Text(text = "homeeee")
        
    }
Scaffold(
    bottomBar = {BottomBar(navController = navController) },
    
) {
    Column(modifier = Modifier.padding(it)) {
        BottomNavGraph(navController = navController)
    }

}
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.HomeScreen,
        BottomBarScreen.SettingScreen
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentdestination = navBackStackEntry?.destination
    
    BottomNavigation{
        screens.forEach{ screen->
          AddItem(screen = screen, currentDestination = currentdestination , navController = navController )

        }
        
    }
    
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
      label = {
          Text(text = screen.title)
      },
        selected = currentDestination?.hierarchy?.any{
            it.route == screen.route
        }== true,
        icon = {
            Image(
                painter = painterResource(R.drawable.spalsh_screen),
                contentDescription = "splash screen"
            )
        },

        onClick = {
            navController.navigate(screen.route){
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }

    )
}


