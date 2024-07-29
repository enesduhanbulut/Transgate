package com.duhan.transgate

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.duhan.component.ButtonWithSubButton
import com.duhan.component.ButtonWithSubButtonParams
import com.duhan.component.MultilineTextAreaWithTitleAndIcon
import com.duhan.component.MultilineTextAreaWithTitleAndIconParams
import com.duhan.component.Toolbar
import com.duhan.component.ToolbarParams
import com.duhan.component.dummyButtonWithSubButtonParams
import com.duhan.component.dummyMultilineTextAreaWithTitleAndIconParams
import com.duhan.component.dummyToolbarParams

@Suppress("ktlint:compose:modifier-missing-check", "ktlint:standard:function-naming")
@Composable
fun MainScreen(mainViewModel: MainViewModel? = null) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 64.dp)
                    .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            DrawToolbar(mainViewModel?.uiState?.value?.toolbarParams ?: dummyToolbarParams())
            DrawSourceLanguage(
                mainViewModel?.uiState?.value?.sourceLanguageParams
                    ?: dummyMultilineTextAreaWithTitleAndIconParams(),
            )
            DrawTargetLanguage(
                mainViewModel?.uiState?.value?.targetLanguageParams
                    ?: dummyMultilineTextAreaWithTitleAndIconParams(),
            )
        }
        Column(
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
        ) {
            DrawTranslateButton(
                mainViewModel?.uiState?.value?.translateButtonParams
                    ?: dummyButtonWithSubButtonParams(),
            )
        }
    }
}

@Suppress("ktlint:standard:function-naming")
@Composable
fun DrawToolbar(toolbarParams: ToolbarParams) {
    Toolbar(
        toolbarParams,
    )
}

@Composable
fun DrawSourceLanguage(multilineTextAreaWithTitleAndIconParams: MultilineTextAreaWithTitleAndIconParams) {
    MultilineTextAreaWithTitleAndIcon(
        multilineTextAreaWithTitleAndIconParams,
    )
}

@Composable
fun DrawTargetLanguage(multilineTextAreaWithTitleAndIconParams: MultilineTextAreaWithTitleAndIconParams) {
    MultilineTextAreaWithTitleAndIcon(
        multilineTextAreaWithTitleAndIconParams,
    )
}

@Composable
fun DrawTranslateButton(buttonWithSubButtonParams: ButtonWithSubButtonParams) {
    ButtonWithSubButton(
        params = buttonWithSubButtonParams,
        modifier =
            Modifier
                .padding(horizontal = 64.dp)
            .wrapContentSize()
    )
}

@Suppress("ktlint:standard:function-naming")
@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen(MainViewModel())
}
