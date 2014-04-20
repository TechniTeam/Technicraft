package wiiboy222.mod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class copperOre extends Block {

	public copperOre(Material rock) {
		super(rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(5.0F);
		this.setResistance(5.0f);
		this.setBlockName("CopperOre");
		this.setBlockTextureName("technicraft:ore_copper");
		
	}


}
