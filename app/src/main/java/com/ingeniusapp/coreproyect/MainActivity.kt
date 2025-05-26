package com.ingeniusapp.coreproyect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.ingeniusapp.coreproyect.ui.theme.CoreProyectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoreProyectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Image(imageVector = ImageVector.vectorResource(R.drawable.atm), contentDescription = "")
    CoreProyectTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreviewV2() {
    Image(imageVector = ImageVector.vectorResource(R.drawable.drone), contentDescription = "")

    CoreProyectTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreviewV3() {
    CoreProyectTheme {
        Greeting("Android")
    }

    Image(imageVector = ImageVector.vectorResource(R.drawable.car_speed_limiter), contentDescription = "")

}