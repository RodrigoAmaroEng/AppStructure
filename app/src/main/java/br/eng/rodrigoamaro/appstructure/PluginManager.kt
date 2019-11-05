package br.eng.rodrigoamaro.appstructure

class PluginManager {

    private val plugins = mutableListOf<AppPlugin>()

    fun register(vararg plugin: AppPlugin) {
        plugins.addAll(plugin)
    }

    fun dispatch(event: AppEvent) = plugins.forEach { it.onEvent(event) }
}