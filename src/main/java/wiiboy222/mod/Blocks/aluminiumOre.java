package wiiboy222.mod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class aluminiumOre extends Block {

	public aluminiumOre(Material rock) {
		super(rock);
		this.setStepSound(soundTypeStone);;
		this.setHardness(5.0F);
		this.setResistance(5.0f);
		this.setBlockName("AluminumOre");
		this.setBlockTextureName("technicraft:ore_aluminium");
		
	}


}
