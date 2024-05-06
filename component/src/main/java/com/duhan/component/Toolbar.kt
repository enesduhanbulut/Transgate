package com.duhan.component

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar(topAppBarParams: ToolbarParams) {
    TopAppBar(title = {
        Text(
            topAppBarParams.titleParams
        )
    }, navigationIcon = {
        IconButton(topAppBarParams.navigationIconButtonParams)
    }, actions = {
        IconButton(topAppBarParams.actionIconButtonParams)
    })
}

@Preview(showBackground = true)
@Composable
fun ToolbarPreview() {
    Toolbar(
        ToolbarParams(
            titleParams = TextParams(
                text = "Title"
            ), navigationIconButtonParams = IconButtonParams(
                iconParams = IconParams(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_back),
                    contentDescription = "Back",
                    tint = Color.Black
                )
            ), actionIconButtonParams = IconButtonParams(
                iconParams = IconParams(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_menu),
                    contentDescription = "Menu",
                    tint = Color.Black
                )
            )
        )
    )
}

data class ToolbarParams(
    val titleParams: TextParams = TextParams(),
    val navigationIconButtonParams: IconButtonParams = IconButtonParams(),
    val actionIconButtonParams: IconButtonParams = IconButtonParams()
)
