package Technicraft.mod.main.Blocks;

import Technicraft.mod.main.lib.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class marbleCobble extends Block {

	public marbleCobble(Material rock) {
		super(rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(2.0F);
		this.setResistance(10.0f);
		this.setBlockName("MarbleCobble");
	}
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(References.MODID + ":cobble_Marble");
}


}
