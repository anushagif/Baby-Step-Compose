import android.icu.lang.UCharacter.VerticalOrientation
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.anusha.uberclone.R

@Composable
fun Registration(navController: NavController) {

    Surface(border = BorderStroke(4.dp,Color.Black), color = Color.LightGray, modifier = Modifier
        .fillMaxSize()
        .padding(4.dp)) {

        Column {
            Image(painter = painterResource(id = R.drawable.spalsh_screen), contentDescription = "splash screen", modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .border(2.dp, Color.Green)
                .padding(8.dp) )


            Column(verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.padding(8.dp)) {
                var name by remember { mutableStateOf(TextFieldValue("")) }
                val nameErrorState = remember { mutableStateOf(false) }


                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    isError = nameErrorState.value,
                    placeholder = { Text("Enter your name") }
                )
                Button(onClick = {
                    navController.navigate("login_screen")
                },) {
                    Text(text = "Click for registration")
                }

            }


        }




    }


}


