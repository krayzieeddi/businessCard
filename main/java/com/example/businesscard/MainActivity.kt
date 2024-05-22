package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
   Column(modifier = modifier
       .padding(50.dp)
       .fillMaxSize(),
       horizontalAlignment = Alignment.CenterHorizontally
   )
   {
       Card(modifier = Modifier
           .fillMaxWidth()
           .padding(8.dp),
           elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
           shape = RoundedCornerShape(8.dp)
       )
       {
           Column(modifier = modifier
               .padding(50.dp),
               horizontalAlignment = Alignment.CenterHorizontally
           )
           {
               Image(
                   painter = painterResource(id = R.drawable.logo1), // Image source
                   contentDescription = "Description of the image", // For accessibility
                   modifier = Modifier.fillMaxWidth() // Adjust size/position
               )
                Text(
                    text = "Edwin Ho",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.headlineLarge,
                    modifier = modifier
                )
                Text(
                    text = "I'm some guy",
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(bottom = 20.dp)
                )
           }
       }
       Text(
            text = "(000) 123-1234",
            fontSize = 12.sp,
           textAlign = TextAlign.Center,
            modifier = modifier
                .border(width = 1.dp, color = Color.Black)
                .width(150.dp)
                .padding(top = 2.dp, bottom = 2.dp)
        )
        Text(
            text = "@social media link",
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            modifier = modifier
                .border(width = 1.dp, color = Color.Black)
                .width(150.dp)
                .padding(top = 2.dp, bottom = 2.dp)
        )
       Text(
           text = "email@example.com",
           fontSize = 12.sp,
           textAlign = TextAlign.Center,
           modifier = modifier
               .border(width = 1.dp, color = Color.Black)
               .width(150.dp)
               .padding(top = 2.dp, bottom = 2.dp)
       )

   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Greeting("Android")
    }

}