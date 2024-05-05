package com.duhan.transgate.components

import android.util.Log
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.duhan.transgate.ui.theme.Primary

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
            text = AnnotatedString(buttonParams.text),
            fontFamily = CAMPTON_FONT_FAMILY,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center
        )
    }
}

data class ButtonParams(
    val text: String,
    val cornerRadius: Dp = 10.dp,
    val backgroundColor: Color = Primary,
    val modifier: Modifier = Modifier,
    val onClick: () -> Unit
)

@Composable
@Preview(showBackground = true)
fun ButtonPreview() {
    Button(
        ButtonParams("Hello World",
            backgroundColor = Primary,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            onClick = {
                Log.d("Button", "Hello World")
            })
    )
}