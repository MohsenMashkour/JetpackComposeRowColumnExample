package com.mkrdeveloper.jetpackcomposerowcolumnexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mkrdeveloper.jetpackcomposerowcolumnexample.ui.theme.JetpackComposeRowColumnExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}


@Composable
fun MyApp() {

    Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement =  Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Subscribe", fontSize = 28.sp)
        Text(text = "Please", fontSize = 28.sp)
        Text(text = "Mohsen", fontSize = 28.sp)
    }
    /*Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "Subscribe", fontSize = 28.sp)
        Text(text = "Please", fontSize = 28.sp)
        Text(text = "Mohsen", fontSize = 28.sp)
    }*/

}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    MyApp()
}