package techreborn.blocks.generator;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import reborncore.common.BaseTileBlock;
import techreborn.client.TechRebornCreativeTab;
import techreborn.tiles.energy.generator.TileWindMill;

/**
 * Created by modmuss50 on 25/02/2016.
 */
public class BlockWindMill extends BaseTileBlock {

	private final String prefix = "techreborn:blocks/machines/generators/";

	public BlockWindMill() {
		super(Material.IRON);
		setUnlocalizedName("techreborn.windmill");
		setCreativeTab(TechRebornCreativeTab.instance);
		setHardness(2.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileWindMill();
	}

}
