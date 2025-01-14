package com.exner.tools.reproduce389733583.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootGraph
import com.ramcosta.composedestinations.generated.destinations.MainScreenDestination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination<RootGraph>
@Composable
fun ProtectedScreen(
    navigator: DestinationsNavigator
) {
    Column {
        Text(text = "There is actually no protected stuff here.")
        Button(
            onClick = {
                navigator.navigate(MainScreenDestination)
            }
        ) {
            Text(text = "Head back to Main Screen")
        }
    }
}