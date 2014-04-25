package Technicraft.Technicraft.mod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class aluminiumBlock extends Block {

	public aluminiumBlock(Material rock) {
		super(rock);
		this.setStepSound(soundTypeMetal);
		this.setHardness(5.0F);
		this.setResistance(5.0f);
		this.setBlockName("AluminiumBlock");
		this.setBlockTextureName("technicraft:block_aluminium");
		
	}


}
