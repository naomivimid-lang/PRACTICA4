package com.example.practica4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica4.ui.theme.PRACTICA4Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            PRACTICA4Theme {
                App()
            }
        }
    }
}


@Preview
@Composable
fun App() {

    var counter by rememberSaveable { mutableStateOf(0)
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        item {

            Image(
                modifier = Modifier.fillMaxWidth().height(400.dp),painter = painterResource(id = R.drawable.imi),
                contentDescription = "Fondo"
            )

            Row(
                modifier = Modifier
                    .padding(top = 8.dp)
            ) {

                Image(
                    painter = painterResource(
                        id = R.drawable.ic_favi_foreground
                    ),
                    contentDescription = "like",
                    modifier = Modifier
                        .clickable {
                            counter++
                        }
                )

                Text(
                    text = counter.toString(),
                    color = Color.Red,
                    modifier = Modifier
                        .padding(start = 4.dp)
                )
            }

            Text(
                text = "Naomi",
                fontSize = 32.sp,
                color = Color.Red,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )

            Text(
                text = "Suscríbete",
                color = Color.Red
            )

            Text(
                text = "Ándale",
                color = Color.Red
            )

            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                item {
                    Text(text = "Soy", color = Color.Red)
                    Text(text = "Juan Paco", color = Color.Red)
                    Text(text = "de la mar", color = Color.Red)
                    Text(text = "es mi nombre así", color = Color.Red)
                    Text(text = "y cuando yo me voy", color = Color.Red)
                    Text(text = "me dicen al pasar", color = Color.Red)
                    Text(text = "Juan Paco", color = Color.Red)
                    Text(text = "Pedro de", color = Color.Red)
                    Text(text = "la mar", color = Color.Red)
                    Text(text = "lalalalallalalal", color = Color.Red)
                    Text(text = "lalalalallalalal", color = Color.Red)
                    Text(text = "lalalalallalalal", color = Color.Red)
                    Text(text = "lalalalallalalal", color = Color.Red)
                    Text(text = "lalalalallalalal", color = Color.Red)
                    Text(text = "lalalalallalalal", color = Color.Red)
                    Text(text = "lalalalallalalal", color = Color.Red)
                    Text(text = "lalalalallalalal", color = Color.Red)
                    Text(text = "lalalalallalalal", color = Color.Red)
                }
            }
        }
    }
}
