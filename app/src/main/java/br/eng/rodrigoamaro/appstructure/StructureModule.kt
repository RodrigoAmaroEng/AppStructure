package br.eng.rodrigoamaro.appstructure

import org.koin.dsl.module

object StructureModule {
    val INSTANCE = module {
        single { PluginManager() }
        single<Catalog> { CatalogImpl(get()) }
        single<ModuleInstaller> { KoinModuleInstaller() }
        single<ApplicationSetup> { ApplicationSetupImpl(get(), get(), get()) }
    }
}