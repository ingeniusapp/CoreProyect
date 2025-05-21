package com.ingeniusapp.myvisualscomponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun VCTextField(vcTextFieldModel: VCTextFieldModel) {
    var text by remember { mutableStateOf(vcTextFieldModel.text) }
    TextField(value = text, onValueChange = { it -> text = it })
}

data class VCTextFieldModel(val text: String)

@Preview(showSystemUi = true, showBackground = true, device = Devices.PIXEL_4)
@Composable
fun VCTextFieldPreview() {
    Box(modifier = Modifier.fillMaxSize()) {
        VCTextField()
    }
}