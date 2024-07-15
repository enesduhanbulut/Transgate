package com.duhan.component

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonWithSubButton(params: ButtonWithSubButtonParams) {
    Row {
        Button(
            params.buttonParams.copy(
                radiusPerCorners =
                    RadiusCorners(
                        topEnd = 0.dp,
                        bottomEnd = 0.dp,
                    ),
            ),
        )
        IconButton(
            params.subButtonParams,
        )
    }
}

@Composable
@Preview
private fun ButtonWithSubButtonPreview() {
    ButtonWithSubButton(
        dummyButtonWithSubButtonParams(),
    )
}

@Composable
fun dummyButtonWithSubButtonParams() =
    ButtonWithSubButtonParams(
        buttonParams = dummyButtonParams(),
        subButtonParams = dummyIconButtonParams(),
    )

data class ButtonWithSubButtonParams(
    val buttonSizeRadio: Float = 0.5f,
    val buttonParams: ButtonParams = ButtonParams(),
    val subButtonParams: IconButtonParams = IconButtonParams(),
)
