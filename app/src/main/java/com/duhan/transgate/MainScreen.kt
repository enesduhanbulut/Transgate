package com.duhan.transgate

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.duhan.component.Toolbar
import com.duhan.component.ToolbarParams
import com.duhan.component.dummyToolbarParams

@Suppress("ktlint:compose:modifier-missing-check", "ktlint:standard:function-naming")
@Composable
fun MainScreen(mainViewModel: MainViewModel? = null) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        DrawToolbar(mainViewModel?.uiState?.value?.toolbarParams)
    }
}

@Suppress("ktlint:standard:function-naming")
@Composable
fun DrawToolbar(toolbarParams: ToolbarParams? = dummyToolbarParams()) {
    toolbarParams?.let {
        Toolbar(
            it,
        )
    }
}

@Suppress("ktlint:standard:function-naming")
@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}
