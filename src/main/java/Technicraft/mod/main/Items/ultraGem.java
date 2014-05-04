package Technicraft.mod.main.Items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ultraGem extends Item {

	public static Item ultraGem; {
        }
        public boolean hasEffect(ItemStack itemstack)
        {
                return true;
        }
        public EnumRarity getRarity(ItemStack itemstack)
        {
                return EnumRarity.epic;
        }

}