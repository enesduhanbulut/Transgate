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

@Composable
fun MainScreen(
    mainViewModel: MainViewModel = MainViewModel()
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {}
}

@Composable
fun DrawToolbar(
    toolbarParams: ToolbarParams
) {
    Toolbar(
        toolbarParams
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}