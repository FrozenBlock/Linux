package net.frozenblock.linux.mod_compat;

import net.frozenblock.lib.integration.api.ModIntegration;
import net.frozenblock.lib.integration.api.ModIntegrationSupplier;
import net.frozenblock.lib.integration.api.ModIntegrations;
import net.frozenblock.linux.util.LinuxConstants;
import java.util.function.Supplier;

public final class LinuxModIntegrations {

	public static final ModIntegration FROZENLIB_INTEGRATION = registerAndGet(FrozenLibIntegration::new, "frozenlib");

	private LinuxModIntegrations() {
		throw new UnsupportedOperationException("TemplateModIntegrations contains only static declarations.");
	}

	public static void init() {
	}

	public static ModIntegrationSupplier<? extends ModIntegration> register(Supplier<? extends ModIntegration> integration, String modID) {
		return ModIntegrations.register(integration, LinuxConstants.MOD_ID, modID);
	}

	public static <T extends ModIntegration> ModIntegrationSupplier<T> register(Supplier<T> integration, Supplier<T> unloadedIntegration, String modID) {
		return ModIntegrations.register(integration, unloadedIntegration, LinuxConstants.MOD_ID, modID);
	}

	public static <T extends ModIntegration> ModIntegration registerAndGet(Supplier<T> integration, String modID) {
		return ModIntegrations.register(integration, LinuxConstants.MOD_ID, modID).getIntegration();
	}
}
