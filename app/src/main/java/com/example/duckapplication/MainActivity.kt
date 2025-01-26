package com.example.duckapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.duckapplication.duck.DecoyDuck
import com.example.duckapplication.duck.MallardDuck
import com.example.duckapplication.duck.RedHeadDuck
import com.example.duckapplication.duck.RubberDuck
import com.example.duckapplication.ui.theme.DuckApplicationTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var decoyDuck: DecoyDuck

    @Inject
    lateinit var mallardDuck: MallardDuck

    @Inject
    lateinit var redHeadDuck: RedHeadDuck

    @Inject
    lateinit var rubberDuck: RubberDuck

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DuckApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {


                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 16.dp)
                                .align(
                                    Alignment.CenterHorizontally

                                ),
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            val list = mutableListOf(
                                ("Decoy Duck" to decoyDuck),
                                ("Mallard Duck" to  mallardDuck),
                                ("Red Head Duck" to redHeadDuck),
                                ("rubber Duck" to  rubberDuck))

                            list.forEach { (key ,subclass) ->
                                ButtonItem("${key}") {
                                    Toast.makeText(
                                        this@MainActivity,
                                        "${subclass.display()}",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }
                        }
                    }
                }

            }
        }
    }
}

@Composable
fun ButtonItem(name: String, onClick: () -> Unit) {
    Button(onClick, modifier = Modifier) {
        Text(text = name,textAlign = TextAlign.Center)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DuckApplicationTheme {
//        Greeting()
    }
}