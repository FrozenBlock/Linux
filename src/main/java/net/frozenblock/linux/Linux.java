package net.frozenblock.linux;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.ModContainer;
import net.frozenblock.linux.mod_compat.LinuxModIntegrations;
import net.frozenblock.linux.util.LinuxConstants;
import net.frozenblock.linux.util.LinuxUtils;
import org.jetbrains.annotations.NotNull;
import org.quiltmc.qsl.frozenblock.misc.datafixerupper.api.QuiltDataFixerBuilder;
import org.quiltmc.qsl.frozenblock.misc.datafixerupper.api.QuiltDataFixes;

public class Linux implements ModInitializer {

	@Override
	public void onInitialize() {
		LinuxUtils.startMeasuring(this);
		applyDataFixes(LinuxConstants.MOD_CONTAINER);

		LinuxModIntegrations.init();

		LinuxUtils.stopMeasuring(this);
	}

	private static void applyDataFixes(final @NotNull ModContainer mod) {
		LinuxUtils.log("Applying DataFixes for FrozenBlock Template Mod with Data Version " + LinuxConstants.DATA_VERSION, true);

		var builder = new QuiltDataFixerBuilder(LinuxConstants.DATA_VERSION);
		builder.addSchema(0, QuiltDataFixes.BASE_SCHEMA);

		QuiltDataFixes.buildAndRegisterFixer(mod, builder);
		LinuxUtils.log("DataFixes for FrozenBlock Template Mod have been applied", true);
	}
}
