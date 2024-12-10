package com.example.pract9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pract9.ui.theme.Pract9Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pract9Theme {
                MyCInterface()
            }
        }
    }
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}



 */

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pract9Theme {
        MyCInterface()
    }
}

@Composable
fun MyCInterface() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .padding(16.dp)
                .size(300.dp)
                .border(2.dp, Color.Black)
                .clip(RoundedCornerShape(10.dp)),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Prodolnova Zhanna Sergeevna, IKBO-11-22",
                color = Color.DarkGray,
                fontSize = 24.sp,
                style = TextStyle(
                    textDecoration = TextDecoration.Underline
                ),

                )
        }
    }
}