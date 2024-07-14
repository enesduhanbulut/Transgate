package com.duhan.transgate

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.duhan.component.ToolbarParams

class MainViewModel : ViewModel() {
    private val mUIState = mutableStateOf(MainViewState())
    val uiState: State<MainViewState> = mUIState
}

data class MainViewState(
    val toolbarParams: ToolbarParams = ToolbarParams(),
)
