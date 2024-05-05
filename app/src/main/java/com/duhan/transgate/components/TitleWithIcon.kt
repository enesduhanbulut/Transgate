package com.duhan.transgate.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.duhan.transgate.R

@Composable
fun TitleWithIcon(
    params: TitleWithIconParams
) {
    Row(
        modifier = params.modifier.fillMaxWidth(), horizontalArrangement = params.horizontalArrangement
        , verticalAlignment = Alignment.CenterVertically
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
        params.iconParams
    )
}

@Composable
private fun DrawTitle(params: TitleWithIconParams) {
    Text(
        params.titleParams
    )
}

@Composable
private fun DrawSpacer() {
    Spacer(modifier = Modifier.width(8.dp))
}

@Composable
@Preview(showBackground = true)
fun TitleWithIconPreview() {
    TitleWithIcon(
        TitleWithIconParams(
            titleParams = TextParams(
                text = "Hello World",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                modifier = Modifier
            ), iconParams = IconParams(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_cancel),
                contentDescription = "Cancel",
                tint = Color.Black,
                modifier = Modifier
            ), iconPosition = IconPosition.Start, modifier = Modifier
        )
    )
}

data class TitleWithIconParams(
    val titleParams: TextParams = TextParams(),
    val iconParams: IconParams = IconParams(),
    val horizontalArrangement: Arrangement.Horizontal = Arrangement.SpaceBetween,
    val iconPosition: IconPosition = IconPosition.Start,
    val modifier: Modifier = Modifier
)

enum class IconPosition {
    Start, End
}