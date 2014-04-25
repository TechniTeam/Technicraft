package Technicraft.Technicraft.mod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class leadBlock extends Block {

	public leadBlock(Material rock) {
		super(rock);
		this.setStepSound(soundTypeMetal);
		this.setHardness(5.0F);
		this.setResistance(5.0f);
		this.setBlockName("LeadBlock");
		this.setBlockTextureName("technicraft:block_lead");
		
	}


}
