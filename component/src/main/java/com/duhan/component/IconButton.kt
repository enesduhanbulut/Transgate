package com.duhan.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

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

@Composable
@Preview
private fun IconButtonPreview() {
    IconButton(
        dummyIconButtonParams(),
    )
}

data class IconButtonParams(
    val onClick: () -> Unit = {},
    val iconParams: IconParams = IconParams(),
)

@Composable
fun dummyIconButtonParams() =
    IconButtonParams(
        onClick = {},
        iconParams =
            dummyIconParams(),
    )
