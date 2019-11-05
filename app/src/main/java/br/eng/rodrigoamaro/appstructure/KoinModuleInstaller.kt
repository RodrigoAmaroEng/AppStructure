package br.eng.rodrigoamaro.appstructure

import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module

class KoinModuleInstaller : ModuleInstaller {
    override fun install(vararg module: FeatureModule) {
        loadKoinModules(module.map { it as Module })
    }
}