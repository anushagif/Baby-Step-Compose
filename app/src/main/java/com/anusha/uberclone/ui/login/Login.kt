import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Login(navController: NavController) {
    Column() {
        Button(onClick = { navController.navigate("home_screen") }) {
            Text(text = "Click for login")

        }

    }

}