package Technicraft.Technicraft.mod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class tinOre extends Block {

	public tinOre(Material rock) {
		super(rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(5.0F);
		this.setResistance(5.0f);
		this.setBlockName("TinOre");
		this.setBlockTextureName("technicraft:ore_tin");
		
	}


}
