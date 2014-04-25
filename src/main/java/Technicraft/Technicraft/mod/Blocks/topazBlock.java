package Technicraft.Technicraft.mod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class topazBlock extends Block {

	public topazBlock(Material rock) {
		super(rock);
		this.setStepSound(soundTypeMetal);;
		this.setHardness(5.0F);
		this.setResistance(5.0f);
		this.setBlockName("TopazBlock");
		this.setBlockTextureName("technicraft:block_topaz");
		
	}


}
