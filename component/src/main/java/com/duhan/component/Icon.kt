package com.duhan.component

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Icon(
    params: IconParams,
    modifier: Modifier = Modifier,
) {
    androidx.compose.material3.Icon(
        imageVector = ImageVector.vectorResource(id = params.imageVector ?: R.drawable.ic_cancel),
        contentDescription = params.contentDescription,
        tint = params.tint,
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
private fun IconPreview() {
    Icon(
        dummyIconParams(),
    )
}

data class IconParams(
    @DrawableRes val imageVector: Int? = null,
    val contentDescription: String? = null,
    val tint: Color = Color.White,
)

fun dummyIconParams() =
    IconParams(
        imageVector = R.drawable.ic_cancel,
        contentDescription = "Cancel",
        tint = Color.Black,
    )
