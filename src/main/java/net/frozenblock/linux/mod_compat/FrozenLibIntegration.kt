package net.frozenblock.linux.mod_compat

import net.frozenblock.lib.integration.api.ModIntegration
import net.frozenblock.linux.util.UNSTABLE_LOGGING
import net.frozenblock.linux.util.log

class FrozenLibIntegration : ModIntegration("frozenlib") {
    override fun init() {
        log("FrozenLib integration ran!", UNSTABLE_LOGGING)
    }
}
