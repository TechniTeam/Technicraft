package Technicraft.mod.main.Blocks.Grinder;

import Technicraft.mod.main.Main;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GrinderRecipes
{
    private static final GrinderRecipes grindingBase = new GrinderRecipes();
    /**
     * The list of grinding results.
     */
    private Map grindingList = new HashMap();
    private Map experienceList = new HashMap();

    /**
     * Used to call methods addGrinding and getGrindingResult.
     */
    public static GrinderRecipes grinding()
    {
        return grindingBase;
    }

    private GrinderRecipes()
    {
        this.addGrinding(Blocks.iron_ore, new ItemStack(Main.ironDust, 2), 1.0F);
        this.addGrinding(Blocks.gold_ore, new ItemStack(Main.goldDust, 2), 1.0F);
        this.addGrinding(Main.copperOre, new ItemStack(Main.copperDust, 2), 1.0F);
        this.addGrinding(Main.tinOre, new ItemStack(Main.tinDust, 2), 1.0F);
        this.addGrinding(Main.leadOre, new ItemStack(Main.leadDust, 2), 1.0F);
        this.addGrinding(Main.aluminiumOre, new ItemStack(Main.aluminiumDust, 2), 1.0F);
        
        this.addGrinding(Items.iron_ingot, new ItemStack(Main.ironDust, 1), 1.0F);
        this.addGrinding(Items.gold_ingot, new ItemStack(Main.goldDust, 1), 1.0F);
        this.addGrinding(Main.copperMetal, new ItemStack(Main.copperDust, 1), 1.0F);
        this.addGrinding(Main.tinMetal, new ItemStack(Main.tinDust, 1), 1.0F);
        this.addGrinding(Main.leadMetal, new ItemStack(Main.leadDust, 1), 1.0F);
        this.addGrinding(Main.aluminiumMetal, new ItemStack(Main.aluminiumDust, 1), 1.0F);
    }

    public void addGrinding(Block p_151393_1_, ItemStack p_151393_2_, float p_151393_3_)
    {
        this.addGrinding(Item.getItemFromBlock(p_151393_1_), p_151393_2_, p_151393_3_);
    }

    public void addGrinding(Item p_151396_1_, ItemStack p_151396_2_, float p_151396_3_)
    {
        this.addGrinding(new ItemStack(p_151396_1_, 1, 32767), p_151396_2_, p_151396_3_);
    }

    public void addGrinding(ItemStack p_151394_1_, ItemStack p_151394_2_, float p_151394_3_)
    {
        this.grindingList.put(p_151394_1_, p_151394_2_);
        this.experienceList.put(p_151394_2_, Float.valueOf(p_151394_3_));
    }

    /**
     * Returns the grinding result of an item.
     */
    public ItemStack getGrindingResult(ItemStack p_151395_1_)
    {
        Iterator iterator = this.grindingList.entrySet().iterator();
        Map.Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Map.Entry)iterator.next();
        }
        while (!this.sameItemstacks(p_151395_1_, (ItemStack) entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean sameItemstacks(ItemStack p_151397_1_, ItemStack p_151397_2_)
    {
        return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
    }

    public Map getGrindingList()
    {
        return this.grindingList;
    }

    public float func_151398_b(ItemStack p_151398_1_)
    {
        float ret = p_151398_1_.getItem().getSmeltingExperience(p_151398_1_);
        if (ret != -1) return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Map.Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return 0.0F;
            }

            entry = (Map.Entry)iterator.next();
        }
        while (!this.sameItemstacks(p_151398_1_, (ItemStack) entry.getKey()));

        return ((Float)entry.getValue()).floatValue();
    }
}