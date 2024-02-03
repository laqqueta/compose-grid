package com.pbi.grid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringRes: Int,
    val total: Int,
    @DrawableRes val imageRes: Int
)
