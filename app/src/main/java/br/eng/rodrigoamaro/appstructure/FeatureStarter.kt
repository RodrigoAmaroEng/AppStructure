package br.eng.rodrigoamaro.appstructure

import android.content.Context
import android.os.Bundle

abstract class FeatureStarter(val feature: Feature) {
    abstract fun start(context: Context, args: Bundle)

    val injectionModules: List<FeatureModule> = listOf()

    val plugins: List<AppPlugin> = listOf()
}