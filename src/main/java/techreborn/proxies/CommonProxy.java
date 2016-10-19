package techreborn.proxies;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import techreborn.Core;
import techreborn.compat.ICompatModule;

public class CommonProxy implements ICompatModule {

    public static boolean isChiselAround;

    //Called before anything is loaded
    public void prePreInit(FMLPreInitializationEvent event) {
        isChiselAround = Loader.isModLoaded("chisel");
        if (isChiselAround) {
            Core.logHelper.info("Hello chisel, shiny things will be enabled in techreborn");
        }
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Override
    public void serverStarting(FMLServerStartingEvent event) {

    }

    public void registerFluidBlockRendering(Block block, String name) {

    }

    public void registerCustomBlockSateLocation(Block block, String name) {

    }

    public void registerCustomBlockStateLocation(Block block, String name) {
        registerCustomBlockStateLocation(block, name, true);
    }

    public void registerCustomBlockStateLocation(Block block, String name, boolean item) {

    }

    public void registerSubItemInventoryLocation(Item item, int meta, String location, String name) {

    }

    public void registerSubBlockInventoryLocation(Block block, int meta, String location, String name) {
        registerSubItemInventoryLocation(Item.getItemFromBlock(block), meta, location, name);
    }

    public boolean isCTMAvailable() {
        return false;
    }


}
