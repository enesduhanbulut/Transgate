package com.duhan.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MultilineTextAreaWithTitleAndIcon(params: MultilineTextAreaWithTitleAndIconParams) {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        TitleWithIcon(params.titleAndIconParams)
        TextArea(params.contentText)
    }
}

@Preview(showBackground = true)
@Composable
private fun MultilineTextAreaWithTitleAndIconPreview() {
    MultilineTextAreaWithTitleAndIcon(
        dummyMultilineTextAreaWithTitleAndIconParams(),
    )
}

data class MultilineTextAreaWithTitleAndIconParams(
    val contentText: TextAreaParams = TextAreaParams(),
    val titleAndIconParams: TitleWithIconParams = TitleWithIconParams(),
)

@Composable
fun dummyMultilineTextAreaWithTitleAndIconParams() =
    MultilineTextAreaWithTitleAndIconParams(
        contentText = dummyTextAreaParams(),
        titleAndIconParams = dummyTitleWithIconParams(),
    )
