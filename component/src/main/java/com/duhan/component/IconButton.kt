package com.duhan.component

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun IconButton(
    params: IconButtonParams,
    modifier: Modifier = Modifier,
) {
    androidx.compose.material3.FilledIconButton(
        onClick = params.onClick,
        shape =
            RoundedCornerShape(
                topStart = params.radiusPerCorners.topStart ?: params.allCornerRadius,
                topEnd = params.radiusPerCorners.topEnd ?: params.allCornerRadius,
                bottomStart = params.radiusPerCorners.bottomStart ?: params.allCornerRadius,
                bottomEnd = params.radiusPerCorners.bottomEnd ?: params.allCornerRadius,
            ),
        colors =
            androidx.compose.material3.IconButtonDefaults.filledIconButtonColors(
                containerColor = params.backgroundColor,
            ),
    ) {
        Icon(
            params.iconParams,
        )
    }
}

@Composable
@Preview
private fun IconButtonPreview() {
    IconButton(
        dummyIconButtonParams(),
    )
}

data class IconButtonParams(
    val backgroundColor: Color = Color.Red,
    val onClick: () -> Unit = {},
    val allCornerRadius: Dp = 10.dp,
    val radiusPerCorners: RadiusCorners = RadiusCorners(),
    val iconParams: IconParams = IconParams(),
)

fun dummyIconButtonParams() =
    IconButtonParams(
        onClick = {},
        iconParams = dummyIconParams(),
    )
