package com.duhan.transgate.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextArea(
    params: TextAreaParams
) {
    TextField(
        value = params.value,
        onValueChange = params.onValueChange,
        modifier = params.modifier,
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.Black,
            focusedContainerColor = params.backgroundColor,
            unfocusedContainerColor = params.backgroundColor,
            disabledContainerColor = params.backgroundColor,
            cursorColor = Color.Black,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        )
    )
}

data class TextAreaParams(
    val value: String = "",
    val onValueChange: (String) -> Unit = {},
    val backgroundColor: Color = Color.White,
    val modifier: Modifier = Modifier
)

@Preview(showBackground = true)
@Composable
fun TextAreaPreview() {
    TextArea(
        TextAreaParams(
            value = "Hello World",
            onValueChange = {},
            backgroundColor = Color.White,
            modifier = Modifier
        )
    )
}