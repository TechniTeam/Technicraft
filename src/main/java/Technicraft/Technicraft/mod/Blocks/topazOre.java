package Technicraft.Technicraft.mod.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class topazOre extends Block {

	public topazOre(Material rock) {
		super(rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(4.0F);
		this.setResistance(4.0f);
		this.setBlockName("TopazOre");
		this.setBlockTextureName("technicraft:ore_topaz");
		this.setHarvestLevel("pickaxe", 2);
	}
		public Item getItemDropped(int metadata, Random random, int fortune) {
			return Technicraft.mod.main.Main.topazGem;
		}
		public int getExpDrop(IBlockAccess block, int i, int j)
		{
		return (5);
		} 
}
