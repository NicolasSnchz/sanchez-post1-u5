package com.lab.retrofitlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lab.retrofitlab.presentation.ui.PostsScreen
import com.lab.retrofitlab.ui.theme.RetrofitLabTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RetrofitLabTheme {
                PostsScreen()
            }
        }
    }
}