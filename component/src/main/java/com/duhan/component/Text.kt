package com.duhan.component

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun Text(
    params: TextParams,
    modifier: Modifier = Modifier,
) {
    androidx.compose.material3.Text(
        text =
            AnnotatedString(
                stringResource(params.text),
            ),
        fontFamily = CAMPTON_FONT_FAMILY,
        fontSize = params.fontSize,
        fontWeight = params.fontWeight,
        textAlign = params.textAlign,
        modifier = modifier,
        color = params.color ?: Color.Black,
    )
}

@Composable
@Preview
private fun TextPreview() {
    Text(
        dummyTextParams(),
    )
}

data class TextParams(
    @StringRes val text: Int = R.string.app_name,
    val fontSize: TextUnit = 16.sp,
    val fontWeight: FontWeight = FontWeight.Normal,
    val textAlign: TextAlign = TextAlign.Center,
    val color: Color? = Color.Black,
)

fun dummyTextParams() =
    TextParams(
        text = R.string.app_name,
    )
