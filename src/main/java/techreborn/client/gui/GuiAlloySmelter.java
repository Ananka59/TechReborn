package techreborn.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import reborncore.client.gui.BaseGui;
import reborncore.common.container.RebornContainer;
import reborncore.common.powerSystem.TilePowerAcceptor;
import techreborn.client.container.ContainerAlloySmelter;
import techreborn.tiles.TileAlloySmelter;

public class GuiAlloySmelter extends GuiTechReborn
{
	public static final ResourceLocation texture = new ResourceLocation("techreborn",  "textures/gui/electric_alloy_furnace.png");
	TileAlloySmelter alloysmelter;

    public GuiAlloySmelter(EntityPlayer player, TileEntity tileEntity)
    {
        super(RebornContainer.createContainer(ContainerAlloySmelter.class, tileEntity, player), tileEntity, player, texture, "techreborn.alloysmelter");//, tileEntity, overlays, texture, "tile.techreborn.alloysmelter.name");
        alloysmelter = (TileAlloySmelter) tileEntity;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {
        super.drawGuiContainerBackgroundLayer(p_146976_1_, p_146976_2_, p_146976_3_);
        //drawProgressBar(alloysmelter, 79, 34);
        drawPowerBar(alloysmelter, 15, 50);
    }

    //	public GuiAlloySmelter(EntityPlayer player, TileAlloySmelter tilealloysmelter)
//	{
//		super(RebornContainer.createContainer(ContainerAlloySmelter.class, tilealloysmelter, player));
//		this.xSize = 176;
//		this.ySize = 167;
//		alloysmelter = tilealloysmelter;
//	}
//
//	@Override
//	public void initGui()
//	{
//		int k = (this.width - this.xSize) / 2;
//		int l = (this.height - this.ySize) / 2;
//		super.initGui();
//	}
//
//	@Override
//	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
//	{
//		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
//		this.mc.getTextureManager().bindTexture(texture);
//		int k = (this.width - this.xSize) / 2;
//		int l = (this.height - this.ySize) / 2;
//		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
//
//		int j = 0;
//
//		j = alloysmelter.getProgressScaled(24);
//		if (j > 0)
//		{
//			this.drawTexturedModalRect(k + 79, l + 34, 176, 14, j + 1, 16);
//		}
//
//		j = alloysmelter.getEnergyScaled(12);
//		if (j > 0)
//		{
//			this.drawTexturedModalRect(k + 56, l + 36 + 12 - j, 176, 12 - j, 14, j + 2);
//		}
//	}
//
//	protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
//	{
//		String name = I18n.translateToLocal("tile.techreborn.alloysmelter.name");
//		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6,
//				4210752);
//		this.fontRendererObj.drawString(I18n.translateToLocalFormatted("container.inventory", new Object[0]), 8,
//				this.ySize - 96 + 2, 4210752);
//	}
}
