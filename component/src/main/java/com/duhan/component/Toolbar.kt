package com.duhan.component

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar(topAppBarParams: ToolbarParams) {
    TopAppBar(title = {
        Text(
            topAppBarParams.titleParams,
        )
    }, navigationIcon = {
        IconButton(topAppBarParams.navigationIconButtonParams)
    }, actions = {
        IconButton(topAppBarParams.actionIconButtonParams)
    })
}

@Suppress("ktlint:standard:function-naming")
@Preview(showBackground = true)
@Composable
private fun ToolbarPreview() {
    Toolbar(dummyToolbarParams())
}

data class ToolbarParams(
    val titleParams: TextParams = TextParams(),
    val navigationIconButtonParams: IconButtonParams = IconButtonParams(),
    val actionIconButtonParams: IconButtonParams = IconButtonParams(),
)

@Composable
fun dummyToolbarParams() =
    ToolbarParams(
        titleParams = dummyTextParams(),
        navigationIconButtonParams = dummyIconButtonParams(),
        actionIconButtonParams = dummyIconButtonParams(),
    )
