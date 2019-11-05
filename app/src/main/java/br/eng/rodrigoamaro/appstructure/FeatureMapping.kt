package br.eng.rodrigoamaro.appstructure

interface FeatureMapping {
    fun instance(feature: Feature): FeatureStarter
}