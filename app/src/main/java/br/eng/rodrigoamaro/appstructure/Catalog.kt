package br.eng.rodrigoamaro.appstructure

import android.os.Bundle

abstract class Catalog(private val mapping: FeatureMapping) {
    private val availableFeatures: MutableList<Feature> = mutableListOf()

    val features: List<Feature>
        get() = availableFeatures

    val installedFeatures: List<FeatureStarter>
        get() = features.filter { isInstalled(it) }.map { mapping.instance(it) }

    abstract fun install(feature: Feature)

    abstract fun remove(feature: Feature)

    abstract fun isInstalled(feature: Feature): Boolean

    abstract fun update()

    abstract fun start(feature: Feature, args: Bundle)
}