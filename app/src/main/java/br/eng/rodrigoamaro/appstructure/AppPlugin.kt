package br.eng.rodrigoamaro.appstructure

interface AppPlugin {
    fun onEvent(type: AppEvent)
}

sealed class AppEvent {
    object LOGIN : AppEvent()
    object LOGOUT : AppEvent()
    // Outros tipos de eventos globais
}