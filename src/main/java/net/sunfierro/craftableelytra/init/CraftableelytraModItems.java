package net.sunfierro.craftableelytra.init;

import net.sunfierro.craftableelytra.item.ElytrawingItem;
import net.sunfierro.craftableelytra.CraftableelytraMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class CraftableelytraModItems {
	public static Item ELYTRAWING;

	public static void load() {
		ELYTRAWING = Registry.register(Registry.ITEM, new ResourceLocation(CraftableelytraMod.MODID, "elytrawing"), new ElytrawingItem());
	}
}
