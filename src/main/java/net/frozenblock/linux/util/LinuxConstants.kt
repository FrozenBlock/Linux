package net.frozenblock.linux.util

import net.fabricmc.loader.api.FabricLoader
import net.fabricmc.loader.api.ModContainer
import org.slf4j.Logger
import org.slf4j.LoggerFactory


const val MOD_ID: String = "linux"
val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)
var DEV_LOGGING: Boolean = false

/**
 * Used for features that may be unstable and crash in public builds.
 *
 *
 * It's smart to use this for at least registries.
 */
var UNSTABLE_LOGGING: Boolean = FabricLoader.getInstance().isDevelopmentEnvironment
val MOD_CONTAINER: ModContainer = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow()

/**
 * Used for datafixers.
 *
 *
 * Is not necessary for a normal mod, but can be useful in some cases.
 */
const val DATA_VERSION: Int = 0

