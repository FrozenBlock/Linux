package net.frozenblock.linux.mod_compat

import net.frozenblock.lib.integration.api.ModIntegration
import net.frozenblock.lib.integration.api.ModIntegrationSupplier
import net.frozenblock.lib.integration.api.ModIntegrations
import net.frozenblock.linux.util.MOD_ID
import java.util.function.Supplier

class LinuxModIntegrations private constructor() {
    init {
        throw UnsupportedOperationException("TemplateModIntegrations contains only static declarations.")
    }

    companion object {
        val FROZENLIB_INTEGRATION: ModIntegration = registerAndGet(
            { FrozenLibIntegration() }, "frozenlib"
        )

        fun init() {
        }

        fun register(
            integration: Supplier<out ModIntegration?>?,
            modID: String
        ): ModIntegrationSupplier<out ModIntegration> {
            return ModIntegrations.register(integration, MOD_ID, modID)
        }

        fun <T : ModIntegration?> register(
            integration: Supplier<T>?,
            unloadedIntegration: Supplier<T>,
            modID: String
        ): ModIntegrationSupplier<T> {
            return ModIntegrations.register(integration, unloadedIntegration, MOD_ID, modID)
        }

        fun <T : ModIntegration?> registerAndGet(integration: Supplier<T>?, modID: String): ModIntegration {
            return ModIntegrations.register(integration, MOD_ID, modID).integration
        }
    }
}
