package Technicraft.mod.main.Blocks;

import java.util.Random;

import Technicraft.mod.main.Main;
import Technicraft.mod.main.lib.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.Block;

public class basaltBlock extends Block {

	public basaltBlock(Material rock) {
		super(rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(1.5F);
		this.setResistance(10.0f);
		this.setBlockName("BasaltBlock");
	}
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(References.MODID + ":block_Basalt");
}

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
{
    return Item.getItemFromBlock(Main.basaltCobble);

	}
}
