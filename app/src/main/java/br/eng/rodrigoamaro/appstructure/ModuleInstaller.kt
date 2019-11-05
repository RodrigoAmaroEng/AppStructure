package br.eng.rodrigoamaro.appstructure

interface ModuleInstaller {
    fun install(vararg module: FeatureModule)
}