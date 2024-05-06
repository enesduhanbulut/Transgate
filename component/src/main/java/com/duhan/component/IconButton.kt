package com.duhan.component

import androidx.compose.runtime.Composable

@Composable
fun IconButton(
    params: IconButtonParams
) {
    androidx.compose.material3.IconButton(
        onClick = params.onClick
    ) {
        Icon(
            params.iconParams
        )
    }
}
data class IconButtonParams(
    val onClick: () -> Unit = {},
    val iconParams: IconParams = IconParams()
)
