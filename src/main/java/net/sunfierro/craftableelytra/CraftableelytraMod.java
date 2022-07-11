package net.sunfierro.craftableelytra;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.sunfierro.craftableelytra.init.CraftableelytraModItems;

import net.fabricmc.api.ModInitializer;

public class CraftableelytraMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "craftableelytra";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing CraftableelytraMod");

		CraftableelytraModItems.load();

	}
}
