package com.exner.tools.reproduce389733583.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.exner.tools.reproduce389733583.ui.theme.Reproduce389733583Theme
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootGraph
import com.ramcosta.composedestinations.generated.destinations.ProtectedScreenDestination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination<RootGraph>(start = true)
@Composable
fun MainScreen(
    navigator: DestinationsNavigator,
    modifier: Modifier = Modifier
) {
    Column {
        Greeting(
            name = "Android",
            modifier = modifier
        )
        Button(
            onClick = {
                navigator.navigate(ProtectedScreenDestination)
            },
            modifier = modifier
        ) {
            Text(text = "Go look at the protected screen!")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Reproduce389733583Theme {
        Greeting("Android")
    }
}
