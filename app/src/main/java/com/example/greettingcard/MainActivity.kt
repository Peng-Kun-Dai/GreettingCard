package com.example.greettingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greettingcard.ui.theme.GreettingCardTheme
import com.example.greettingcard.ui.theme.Pink80

class MainActivity : ComponentActivity() {

    /**
     * onCreate = kotlin.main()
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //通过可组合函数定义布局
        setContent {
            GreettingCardTheme {

//                Surface(
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting(name = "Android", modifier = Modifier.fillMaxSize())
//                }

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Greeting(
                        name = "Android", modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/**
 * 任何标有 @Composable 注解的函数都可通过 setContent() 函数或其他可组合函数进行调用。
 * 该注解可告知 Kotlin 编译器 Jetpack Compose 使用的这个函数会生成 UI。
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan) {
        Text(
            text = "Hi, my name is $name!", modifier = modifier.padding(24.dp)
        )
    }
}


//无需构建整个应用就能查看可组合函数的外观。
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreettingCardTheme {
        Greeting("Maga")
    }
}