package net.frozenblock.linux

import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.ModContainer
import net.frozenblock.linux.mod_compat.LinuxModIntegrations
import net.frozenblock.linux.util.*
import org.quiltmc.qsl.frozenblock.misc.datafixerupper.api.QuiltDataFixerBuilder
import org.quiltmc.qsl.frozenblock.misc.datafixerupper.api.QuiltDataFixes
import kotlin.system.measureNanoTime

object Linux : ModInitializer {

    override fun onInitialize() {
        val time = measureNanoTime {
            applyDataFixes(MOD_CONTAINER)

            LinuxModIntegrations.init()
        }

        log("Linux took $time nanoseconds")
    }

    private fun applyDataFixes(mod: ModContainer) {
        log("Applying DataFixes for FrozenBlock Template Mod with Data Version $DATA_VERSION")

        val builder = QuiltDataFixerBuilder(DATA_VERSION)
        builder.addSchema(0, QuiltDataFixes.BASE_SCHEMA)

        QuiltDataFixes.buildAndRegisterFixer(mod, builder)
        log("DataFixes for FrozenBlock Template Mod have been applied")
    }
}
