package Technicraft.mod.main.Blocks;

import java.util.Random;

import Technicraft.mod.main.lib.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class amethystOre extends Block {

	public amethystOre(Material rock) {
		super(rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(3.0F);
		this.setResistance(5.0f);
		this.setBlockName("AmethystOre");
		this.setBlockTextureName("technicraft:ore_amethyst");
		this.setHarvestLevel("pickaxe", 2);
	}
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(References.MODID + ":ore_amethyst");
}

		public Item getItemDropped(int metadata, Random random, int fortune) {
			return Technicraft.mod.main.Main.amethystGem;
		}
		public int getExpDrop(IBlockAccess block, int i, int j)
		{
		return (5);
		} 
}
