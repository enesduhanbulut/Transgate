package com.duhan.component

import androidx.annotation.StringRes
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextArea(
    params: TextAreaParams,
    modifier: Modifier = Modifier,
) {
    TextField(
        value = stringResource(params.value),
        onValueChange = params.onValueChange,
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        colors =
            TextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                focusedContainerColor = params.backgroundColor,
                unfocusedContainerColor = params.backgroundColor,
                disabledContainerColor = params.backgroundColor,
                cursorColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
    )
}

data class TextAreaParams(
    @StringRes val value: Int = R.string.app_name,
    val onValueChange: (String) -> Unit = {},
    val backgroundColor: Color = Color.White,
)

@Preview(showBackground = true)
@Composable
private fun TextAreaPreview() {
    TextArea(
        dummyTextAreaParams(),
    )
}

fun dummyTextAreaParams() =
    TextAreaParams(
        value = R.string.app_name,
        onValueChange = {},
        backgroundColor = Color.White,
    )
