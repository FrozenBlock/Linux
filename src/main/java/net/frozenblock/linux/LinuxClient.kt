package net.frozenblock.linux

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment

@Environment(EnvType.CLIENT)
object LinuxClient : ClientModInitializer {
    override fun onInitializeClient() {
    }
}
