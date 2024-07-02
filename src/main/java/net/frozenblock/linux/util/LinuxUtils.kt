package net.frozenblock.linux.util

import net.minecraft.resources.ResourceLocation


// LOGGING
fun log(string: String?, shouldLog: Boolean = true) {
    if (shouldLog) {
        LOGGER.info(string)
    }
}

fun logMod(string: String, shouldLog: Boolean = true) {
    if (shouldLog) {
        LOGGER.info("$string $MOD_ID")
    }
}

fun id(path: String): ResourceLocation {
    return ResourceLocation.fromNamespaceAndPath(MOD_ID, path)
}

fun vanillaId(path: String): ResourceLocation {
    return ResourceLocation.withDefaultNamespace(path)
}

fun string(path: String): String {
    return id(path).toString()
}
