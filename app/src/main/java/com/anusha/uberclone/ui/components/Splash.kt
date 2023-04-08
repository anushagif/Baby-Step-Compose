import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.anusha.uberclone.R
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavController) {
    
    LaunchedEffect(key1 = true){
        delay(5000L)
        navController.navigate("registration_screen")
    }
   Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
       Image(
           painter = painterResource(R.drawable.spalsh_screen),
           contentDescription = "splash screen"
       )
   }


}