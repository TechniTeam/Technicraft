package wiiboy222.mod.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class sapphireOre extends Block {

	public sapphireOre(Material rock) {
		super(rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(4.0F);
		this.setResistance(4.0f);
		this.setBlockName("SapphireOre");
		this.setBlockTextureName("technicraft:ore_sapphire");
		this.setHarvestLevel("pickaxe", 2);
	}
		public Item getItemDropped(int metadata, Random random, int fortune) {
			return wiiboy.mod.main.Main.sapphireGem;
		}
		public int getExpDrop(IBlockAccess block, int i, int j)
		{
		return (5);
		} 
}
