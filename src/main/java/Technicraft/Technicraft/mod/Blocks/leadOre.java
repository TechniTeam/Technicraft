package Technicraft.Technicraft.mod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class leadOre extends Block {

	public leadOre(Material rock) {
		super(rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(5.0F);
		this.setResistance(5.0f);
		this.setBlockName("LeadOre");
		this.setBlockTextureName("technicraft:ore_lead");
		
	}


}
