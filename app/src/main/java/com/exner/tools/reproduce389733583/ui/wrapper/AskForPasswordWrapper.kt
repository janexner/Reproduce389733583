package com.exner.tools.reproduce389733583.ui.wrapper

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.wrapper.DestinationWrapper

object AskForPasswordWrapper : DestinationWrapper {
    @Composable
    override fun <T> @Composable DestinationScope<T>.Wrap(
        screenContent: @Composable (() -> Unit)
    ) {
        val isAllowedToSeeProtectedContent = remember { mutableStateOf(false) }

        if (isAllowedToSeeProtectedContent.value) {
            screenContent()
        } else {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Is it really you?")
                Row(modifier = Modifier.fillMaxWidth()) {
                    Button(onClick = {
                        isAllowedToSeeProtectedContent.value = true
                    }) {
                        Text(text = "Sure!")
                    }
                    Spacer(modifier = Modifier.weight(0.5f))
                    Button(onClick = {
                        isAllowedToSeeProtectedContent.value = false
                    }) {
                        Text(text = "Sorry, no")
                    }
                }
            }
        }
    }
}