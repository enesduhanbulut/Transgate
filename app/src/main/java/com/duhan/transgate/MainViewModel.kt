package com.duhan.transgate

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.duhan.component.ButtonParams
import com.duhan.component.ButtonWithSubButtonParams
import com.duhan.component.IconButtonParams
import com.duhan.component.MultilineTextAreaWithTitleAndIconParams
import com.duhan.component.TextAreaParams
import com.duhan.component.TextParams
import com.duhan.component.ToolbarParams

class MainViewModel : ViewModel() {
    private val mUIState = mutableStateOf(MainViewState())
    val uiState: State<MainViewState> = mUIState

    init {
        val toolBarParams =
            ToolbarParams(
                titleParams =
                    TextParams(
                        text = R.string.app_name,
                        fontSize = 20.sp,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    ),
            )
        val sourceLanguageParams =
            MultilineTextAreaWithTitleAndIconParams(
                contentText = TextAreaParams(),
            )
        mUIState.update {
            it.copy(toolbarParams = toolBarParams)
        }
    }
}

fun <T> MutableState<T>.update(block: (T) -> T) {
    this.value = block(this.value)
}

data class MainViewState(
    val toolbarParams: ToolbarParams = ToolbarParams(),
    val sourceLanguageParams: MultilineTextAreaWithTitleAndIconParams = MultilineTextAreaWithTitleAndIconParams(),
    val targetLanguageParams: MultilineTextAreaWithTitleAndIconParams = MultilineTextAreaWithTitleAndIconParams(),
    val translateButtonParams: ButtonWithSubButtonParams =
        ButtonWithSubButtonParams(
            buttonParams =
                ButtonParams(
                    textParams =
                        TextParams(
                            text = R.string.translate,
                            fontSize = 16.sp,
                            color = androidx.compose.ui.graphics.Color.Black,
                        ),
                    backgroundColor = androidx.compose.ui.graphics.Color.Red,
                ),
            subButtonParams =
                IconButtonParams(
                    iconParams =
                        com.duhan.component.IconParams(
                            imageVector = com.duhan.component.R.drawable.ic_cancel,
                            tint = androidx.compose.ui.graphics.Color.Black,
                        ),
                    backgroundColor = androidx.compose.ui.graphics.Color.Red,
                ),
        ),
)

@Preview(showBackground = true)
@Composable
private fun MainViewModelPreview() {
    MainScreen(MainViewModel())
}
