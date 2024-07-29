package com.duhan.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TitleWithIcon(
    params: TitleWithIconParams,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = params.horizontalArrangement,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (params.iconPosition == IconPosition.Start) {
            DrawIcon(params)
            DrawTitle(params)
        } else {
            DrawTitle(params)
            DrawIcon(params)
        }
    }
}

@Composable
private fun DrawIcon(params: TitleWithIconParams) {
    Icon(
        params.iconParams,
    )
}

@Composable
private fun DrawTitle(params: TitleWithIconParams) {
    Text(
        params.titleParams,
    )
}

@Composable
private fun DrawSpacer() {
    Spacer(modifier = Modifier.width(8.dp))
}

@Composable
@Preview(showBackground = true)
private fun TitleWithIconPreview() {
    TitleWithIcon(
        dummyTitleWithIconParams(),
    )
}

data class TitleWithIconParams(
    val titleParams: TextParams = TextParams(),
    val iconParams: IconParams = IconParams(),
    val horizontalArrangement: Arrangement.Horizontal = Arrangement.SpaceBetween,
    val iconPosition: IconPosition = IconPosition.Start,
)

enum class IconPosition {
    Start,
    End,
}

fun dummyTitleWithIconParams() =
    TitleWithIconParams(
        titleParams = dummyTextParams(),
        iconParams = dummyIconParams(),
        iconPosition = IconPosition.Start,
    )
