package com.duhan.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Icon(params: IconParams) {
    androidx.compose.material3.Icon(
        imageVector = params.imageVector ?: ImageVector.vectorResource(id = R.drawable.ic_cancel),
        contentDescription = params.contentDescription,
        tint = params.tint,
        modifier = params.modifier,
    )
}

@Preview(showBackground = true)
@Composable
private fun IconPreview() {
    Icon(
        IconParams(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_cancel),
            contentDescription = "Cancel",
            tint = Color.Black,
            modifier = Modifier,
        ),
    )
}

data class IconParams(
    val imageVector: ImageVector? = null,
    val contentDescription: String? = null,
    val tint: Color = Color.White,
    val modifier: Modifier = Modifier,
)
