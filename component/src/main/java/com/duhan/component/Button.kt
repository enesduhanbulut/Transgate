package com.duhan.component

import android.util.Log
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Button(
    buttonParams: ButtonParams
) {
    androidx.compose.material3.Button(
        modifier = buttonParams.modifier,
        onClick = buttonParams.onClick,
        shape = androidx.compose.foundation.shape.RoundedCornerShape(buttonParams.cornerRadius),
        colors = androidx.compose.material3.ButtonDefaults.buttonColors(
            containerColor = buttonParams.backgroundColor,
        )
    ) {
        Text(
            params = buttonParams.textParams,
        )
    }
}

data class ButtonParams(
    val cornerRadius: Dp = 10.dp,
    val backgroundColor: Color = Color.White,
    val modifier: Modifier = Modifier,
    val onClick: () -> Unit = {},
    val textParams: TextParams = TextParams(),
)

@Composable
@Preview(showBackground = true)
fun ButtonPreview() {
    Button(
        ButtonParams(
            backgroundColor = Primary,
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            onClick = {
                Log.d("Button", "Hello World")
            },
            textParams = TextParams(
                text = "Hello World",
            ),
        )
    )
}