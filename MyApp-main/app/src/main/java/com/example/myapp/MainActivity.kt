package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import com.example.myapp.R
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        title = stringResource(R.string.app),
                        name = stringResource(R.string.android),
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    MyAppTheme {
        GreetingImage(
            title = stringResource(R.string.app),
            name = stringResource(R.string.android)
        )
    }
}

@Composable
fun GreetingText(title: String, name: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 50.sp,
            lineHeight = 75.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = name,
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun GreetingImage(title: String, name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.fundo_verde)
    val image2 = painterResource(R.drawable.android_logo)
    val image3 = painterResource(R.drawable.escuro)
    val image8 = painterResource(R.drawable.envelope3_0_)
    val img = painterResource(R.drawable.telefone__2)
    val img9 = painterResource(R.drawable.compartilhar_)

    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 4f,

        )
        Image(
            painter = image3,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 4f,
            modifier = Modifier.padding(
                top = 160.dp,
                start = 90.dp
            )
        )
        Image(
            painter = image2,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 4f,
            modifier = Modifier.padding(
                top = 177.dp,
                start = 110.dp
            )
        )

        Image(
            painter = image8,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 4f,
            modifier = Modifier.padding(
                top = 800.dp,
                start = 60.dp
            )
        )
        Image(
            painter = img9,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 4f,
            modifier = Modifier.padding(
                top = 750.dp,
                start = 60.dp
            )
        )
        Image(
            painter = img,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 4f,
            modifier = Modifier.padding(
                top = 700.dp,
                start = 60.dp
            )
        )
        GreetingText(
            title = title,
            name = name,
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    8.dp)

        )
    }
}
