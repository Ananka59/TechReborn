package techreborn.init;

import net.minecraft.item.ItemStack;

import java.util.HashMap;

public class ModParts {

	public static HashMap<Integer, ItemStack> stackCable = new HashMap<>();

	public static void init() { // TODO 1.8
		// if (Loader.isModLoaded("IC2")) {
		// for (int i = 0; i < 11; i++) {
		// CablePart part = new CablePart();
		// part.setType(i);
		// ModPartRegistry.registerPart(part);
		// }
		// }
		// ModPartRegistry.addProvider("techreborn.partSystem.fmp.FMPFactory",
		// "ForgeMultipart");
		// ModPartRegistry.addProvider("techreborn.partSystem.QLib.QModPartFactory",
		// "qmunitylib");
		// ModPartRegistry.addAllPartsToSystems();
		// for (IPartProvider provider : ModPartRegistry.providers) {
		// if (provider.modID().equals("ForgeMultipart")) {
		// ModPartRegistry.masterProvider = provider;
		// }
		// }
	}
}
