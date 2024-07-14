package com.duhan.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource

@Composable
fun IconButton(params: IconButtonParams) {
    androidx.compose.material3.IconButton(
        onClick = params.onClick,
    ) {
        Icon(
            params.iconParams,
        )
    }
}

data class IconButtonParams(
    val onClick: () -> Unit = {},
    val iconParams: IconParams = IconParams(),
)

@Composable
fun dummyIconButtonParams() =
    IconButtonParams(
        iconParams =
            IconParams(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_back),
                contentDescription = "Back",
                tint = Color.Black,
            ),
    )
