package com.duhan.transgate.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MultilineTextAreaWithTitleAndIcon(
    params: MultilineTextAreaWithTitleAndIconParams
) {
    // use TitleWithIcon and Text composable to display the title and icon in rounded corner shape
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        TitleWithIcon(params.titleAndIconParams)
        TextArea(params.contentText)
    }

}

@Preview(showBackground = true)
@Composable
fun MultilineTextAreaWithTitleAndIconPreview() {
    MultilineTextAreaWithTitleAndIcon(
        MultilineTextAreaWithTitleAndIconParams(
            contentText = TextAreaParams(
                value = "Hello",
                onValueChange = {},
                backgroundColor = Color.White,
                modifier = Modifier
            ), titleAndIconParams = TitleWithIconParams(
                iconParams = IconParams(
                    contentDescription = "Cancel", tint = Color.Black, modifier = Modifier
                ), titleParams = TextParams(
                    text = "Title",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                ), iconPosition = IconPosition.End, modifier = Modifier, horizontalArrangement = Arrangement.SpaceBetween
            )
        )
    )
}

data class MultilineTextAreaWithTitleAndIconParams(
    val contentText: TextAreaParams, val titleAndIconParams: TitleWithIconParams
)