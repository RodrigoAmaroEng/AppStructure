package br.eng.rodrigoamaro.appstructure

import androidx.annotation.DrawableRes

data class Feature(
    val title: String,
    val icon: String?,
    val enabled: Boolean,
    val identifier: String,
    val removable: Boolean,
    val order: Int,
    val location: Int
)