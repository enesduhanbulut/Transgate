package com.duhan.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Button(buttonParams: ButtonParams) {
    androidx.compose.material3.Button(
        modifier = buttonParams.modifier,
        onClick = buttonParams.onClick,
        shape =
            androidx.compose.foundation.shape.RoundedCornerShape(
                topStart = buttonParams.radiusPerCorners.topStart ?: buttonParams.allCornerRadius,
                topEnd = buttonParams.radiusPerCorners.topEnd ?: buttonParams.allCornerRadius,
                bottomStart = buttonParams.radiusPerCorners.bottomStart ?: buttonParams.allCornerRadius,
                bottomEnd = buttonParams.radiusPerCorners.bottomEnd ?: buttonParams.allCornerRadius,
            ),
        colors =
            androidx.compose.material3.ButtonDefaults.buttonColors(
                containerColor = buttonParams.backgroundColor,
            ),
    ) {
        Text(
            params = buttonParams.textParams,
        )
    }
}

data class ButtonParams(
    val allCornerRadius: Dp = 10.dp,
    val radiusPerCorners: RadiusCorners = RadiusCorners(),
    val backgroundColor: Color = Color.White,
    val modifier: Modifier = Modifier,
    val onClick: () -> Unit = {},
    val textParams: TextParams = TextParams(),
)

@Composable
@Preview(showBackground = true)
private fun ButtonPreview() {
    Button(
        dummyButtonParams(),
    )
}

fun dummyButtonParams() =
    ButtonParams(
        allCornerRadius = 10.dp,
        backgroundColor = Color.Black,
        modifier = Modifier,
        onClick = {},
        textParams = dummyTextParams(),
    )

data class RadiusCorners(
    val topStart: Dp? = null,
    var topEnd: Dp? = null,
    val bottomStart: Dp? = null,
    var bottomEnd: Dp? = null,
)
