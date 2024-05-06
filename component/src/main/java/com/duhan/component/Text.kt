package com.duhan.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun Text(
    params: TextParams
) {
    androidx.compose.material3.Text(
        text = AnnotatedString(params.text),
        fontFamily = CAMPTON_FONT_FAMILY,
        fontSize = params.fontSize,
        fontWeight = params.fontWeight,
        textAlign = params.textAlign,
        modifier = params.modifier
    )
}

data class TextParams(
    val text: String = "",
    val fontSize: TextUnit = 16.sp,
    val fontWeight: FontWeight = FontWeight.Normal,
    val textAlign: TextAlign = TextAlign.Center,
    val modifier: Modifier = Modifier
)
