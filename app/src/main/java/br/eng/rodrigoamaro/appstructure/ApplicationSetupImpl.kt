package br.eng.rodrigoamaro.appstructure

class ApplicationSetupImpl(
    private val catalog: Catalog,
    private val moduleInstaller: ModuleInstaller,
    private val pluginManager: PluginManager
) : ApplicationSetup {
    override fun run() {
        catalog
            .installedFeatures
            .onEach { pluginManager.register(*it.plugins.toTypedArray()) }
            .onEach { moduleInstaller.install(*it.injectionModules.toTypedArray()) }
    }
}