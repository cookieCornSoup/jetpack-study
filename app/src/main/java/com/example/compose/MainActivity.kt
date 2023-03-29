package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                JetpackApp()
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun TopBanner() {
    Box(modifier = Modifier
        .padding(5.dp)
        .fillMaxWidth()
        .border(width = 4.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp)),
        contentAlignment = Alignment.Center
        ) {
        Text(
            text = "jetpack 스터디",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )
    }
}


@Composable
fun MainCategory(categoryName: String){
    Box(modifier = Modifier
        .padding(5.dp)
        .fillMaxWidth()
        ,

    ) {
        Text(
            text = "test",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )
    }
}
