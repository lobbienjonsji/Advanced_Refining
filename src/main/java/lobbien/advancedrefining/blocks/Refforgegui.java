package lobbien.advancedrefining.blocks;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import lobbien.advancedrefining.util.Reference;

public class Refforgegui extends GuiContainer {
	private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID+":textures/gui/refining_forge.png");
	private final TileEntityRefiningForge tileentity;
	private InventoryPlayer player;
	public Refforgegui(InventoryPlayer player,TileEntityRefiningForge tileentity )
	{
		super(new ContainerRefiningForge(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
	}
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks,int mouseX, int mouseY) 
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(TEXTURES);
		this.drawTexturedModalRect(this.guiLeft,this.guiTop,0,0,this.xSize, this.ySize);
		if (TileEntityRefiningForge.isBurning(tileentity))
		{
			int k = this.getBurnLeftScaled(35);
			this.drawTexturedModalRect(this.guiLeft+72, this.guiTop+85+34-k, 182, 39 - k , 35, k );
			
		}
	}
	protected void drawGuiContainerForegroundLayer(float partialTicks,int mouseX, int mouseY) 
	{
		String tileName = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(tileName,(this.xSize/2-this.fontRenderer.getStringWidth(tileName)/2),  8, 4210752);
		this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 122, this.ySize, 4210752);
	}
	private int getBurnLeftScaled(int pixels)
	{
		int i = this.tileentity.getField(1);
		if(i==0) i=200;
		return this.tileentity.getField(0)*pixels/i;
	}
	private int getCookProgressScaled(int pixels)
	{
		int i = this.tileentity.getField(2);
		int j = this.tileentity.getField(3);
		return j!= 0 && i !=0 ? i*pixels/j: 0;
	}
}
