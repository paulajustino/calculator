package com.paulajustino.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.paulajustino.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(20.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                CalculatorButton(
                    symbol = "C",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.LightGray,
                    textButtonColor = Color.Black
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "±",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.LightGray,
                    textButtonColor = Color.Black
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "%",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.LightGray,
                    textButtonColor = Color.Black
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = colorResource(id = R.color.background_button_dark_brown),
                    textButtonColor = Color.White
                ) {
                    {}
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.DarkGray,
                    textButtonColor = Color.White
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.DarkGray,
                    textButtonColor = Color.White
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.DarkGray,
                    textButtonColor = Color.White
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "*",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = colorResource(id = R.color.background_button_dark_brown),
                    textButtonColor = Color.White
                ) {
                    {}
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.DarkGray,
                    textButtonColor = Color.White
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.DarkGray,
                    textButtonColor = Color.White
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.DarkGray,
                    textButtonColor = Color.White
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = colorResource(id = R.color.background_button_dark_brown),
                    textButtonColor = Color.White
                ) {
                    {}
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.DarkGray,
                    textButtonColor = Color.White
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.DarkGray,
                    textButtonColor = Color.White
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.DarkGray,
                    textButtonColor = Color.White
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = colorResource(id = R.color.background_button_dark_brown),
                    textButtonColor = Color.White
                ) {
                    {}
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    backgroundButtonColor = Color.DarkGray,
                    textButtonColor = Color.White
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = ",",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = Color.DarkGray,
                    textButtonColor = Color.White
                ) {
                    {}
                }
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundButtonColor = colorResource(id = R.color.background_button_dark_brown),
                    textButtonColor = Color.White
                ) {
                    {}
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalculatorTheme {
        Greeting()
    }
}

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    backgroundButtonColor: Color,
    textButtonColor: Color,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundButtonColor)
    ) {
        Text(
            text = symbol,
            style = TextStyle(
                color = textButtonColor,
                fontSize = 36.sp,
                textAlign = TextAlign.Center
            )
        )
    }
}