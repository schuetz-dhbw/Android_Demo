package de.dhbw.heidenheim.schuetz.simplenavigation.ui

import kotlinx.serialization.Serializable

@Serializable
object HomeRoute

@Serializable
data class ProfileRoute(val name: String = "Gast")

@Serializable
object SettingsRoute