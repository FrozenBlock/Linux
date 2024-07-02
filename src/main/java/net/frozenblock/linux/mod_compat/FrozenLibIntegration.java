package net.frozenblock.linux.mod_compat;

import net.frozenblock.lib.integration.api.ModIntegration;
import net.frozenblock.linux.util.LinuxConstants;
import net.frozenblock.linux.util.LinuxUtils;

public class FrozenLibIntegration extends ModIntegration {
	public FrozenLibIntegration() {
		super("frozenlib");
	}

	@Override
	public void init() {
		LinuxUtils.log("FrozenLib integration ran!", LinuxConstants.UNSTABLE_LOGGING);
	}
}
