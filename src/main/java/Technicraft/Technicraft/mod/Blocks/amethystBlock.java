package Technicraft.Technicraft.mod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class amethystBlock extends Block {

	public amethystBlock(Material rock) {
		super(rock);
		this.setStepSound(soundTypeMetal);
		this.setHardness(5.0F);
		this.setResistance(5.0f);
		this.setBlockName("AmethystBlock");
		this.setBlockTextureName("technicraft:block_amethyst");
		
	}


}
