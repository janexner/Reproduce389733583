package com.exner.tools.reproduce389733583

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.exner.tools.reproduce389733583.ui.theme.Reproduce389733583Theme
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.generated.NavGraphs
import com.ramcosta.composedestinations.rememberNavHostEngine

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Reproduce389733583Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val newPadding = PaddingValues.Absolute(
                        innerPadding.calculateLeftPadding(LayoutDirection.Ltr),
                        innerPadding.calculateTopPadding(),
                        innerPadding.calculateRightPadding(LayoutDirection.Ltr),
                        0.dp
                    )
                    val engine = rememberNavHostEngine()
                    val navController = engine.rememberNavController()
                    DestinationsNavHost(
                        navController = navController,
                        navGraph = NavGraphs.root,
                        modifier = Modifier.padding(newPadding)
                    ) {
                    }
                }
            }
        }
    }
}
