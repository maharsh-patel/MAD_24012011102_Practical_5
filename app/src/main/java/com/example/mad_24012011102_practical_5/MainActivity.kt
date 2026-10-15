package com.example.mad_24012011102_practical_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.mad_24012011102_practical_5.ui.theme.MAD_24012011102_Practical_5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MAD_24012011102_Practical_5Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AppNavigation(
                        context = this,
                        modifier = Modifier.safeDrawingPadding()
                    )
                }
            }
        }
    }
}
