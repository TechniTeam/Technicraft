package Technicraft.mod.main.Blocks;

import Technicraft.mod.main.lib.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class silverOre extends Block {

	public silverOre(Material rock) {
		super(rock);
		this.setStepSound(soundTypeStone);;
		this.setHardness(3.0F);
		this.setResistance(5.0f);
		this.setBlockName("SilverOre");
	}
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(References.MODID + ":ore_silver");
}


}
