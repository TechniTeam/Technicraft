package Technicraft.mod.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import Technicraft.Technicraft.mod.Blocks.amethystOre;
import Technicraft.Technicraft.mod.Blocks.sapphireOre;
import Technicraft.Technicraft.mod.Blocks.rubyOre;
import Technicraft.Technicraft.mod.Blocks.topazOre;
import Technicraft.Technicraft.mod.Blocks.aluminiumOre;
import Technicraft.Technicraft.mod.Blocks.copperOre;
import Technicraft.Technicraft.mod.Blocks.leadOre;
import Technicraft.Technicraft.mod.Blocks.tinOre;
import Technicraft.Technicraft.mod.Blocks.Grinder.BlockGrinder;
import Technicraft.Technicraft.mod.Blocks.Grinder.GrinderGuiHandler;
import Technicraft.Technicraft.mod.Blocks.Grinder.TileEntityGrinder;
import Technicraft.Technicraft.mod.lib.ProxyCommon;
import Technicraft.Technicraft.mod.lib.References;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@Mod(modid=References.MODID, name="Technicraft", version=References.MODID)

public class Main {
	
	//items
	public static Item ultraGem;
	public static Item rubyGem;
	public static Item sapphireGem;
	public static Item amethystGem;
	public static Item topazGem;
	public static Item copperMetal;
	public static Item tinMetal;
	public static Item leadMetal;
	public static Item aluminiumMetal;
	public static Item copperDust;
	public static Item tinDust;
	public static Item leadDust;
	public static Item aluminiumDust;
	public static Item ironDust;
	public static Item goldDust;
	
	//Blocks
	public static Block copperOre;
	public static Block tinOre;
	public static Block leadOre;
	public static Block aluminiumOre;
	public static Block rubyOre;
	public static Block topazOre;
	public static Block sapphireOre;
	public static Block amethystOre;
	
	//Machines
	public static Block ores;
    public static Block grinder, lit_grinder;
	
	public static CreativeTabs Technicraft = new CreativeTabs("Technicraft"){
		public Item getTabIconItem() {
			return ultraGem;
		}
	};
	
	@SidedProxy(clientSide = References.CLIENT, serverSide = References.COMMON)
	public static ProxyCommon proxy;
	
	@Mod.Instance(References.MODID)
    private static Main instance = new Main();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
	
		//Gems
		ultraGem = new Item().setUnlocalizedName("UltraGem").setCreativeTab(Technicraft).setTextureName("technicraft:gem_ultra");
		GameRegistry.registerItem(ultraGem, "Ultra Gem");
		rubyGem = new Item().setUnlocalizedName("RubyGem").setCreativeTab(Technicraft).setTextureName("technicraft:gem_ruby");
		GameRegistry.registerItem(rubyGem, "Ruby Gem");
		sapphireGem = new Item().setUnlocalizedName("SapphireGem").setCreativeTab(Technicraft).setTextureName("technicraft:gem_sapphire");
		GameRegistry.registerItem(sapphireGem, "Sapphire Gem");
		amethystGem = new Item().setUnlocalizedName("AmethystGem").setCreativeTab(Technicraft).setTextureName("technicraft:gem_amethyst");
		GameRegistry.registerItem(amethystGem, "Amethyst Gem");
		topazGem = new Item().setUnlocalizedName("TopazGem").setCreativeTab(Technicraft).setTextureName("technicraft:gem_topaz");
		GameRegistry.registerItem(topazGem, "Topaz Gem");
		
		//Ingots
		copperMetal = new Item().setUnlocalizedName("CopperIngot").setCreativeTab(Technicraft).setTextureName("technicraft:ingot_copper");
		GameRegistry.registerItem(copperMetal, "Copper Ingot");
		tinMetal = new Item().setUnlocalizedName("TinIngot").setCreativeTab(Technicraft).setTextureName("technicraft:ingot_tin");
		GameRegistry.registerItem(tinMetal, "Tin Ingot");
		leadMetal = new Item().setUnlocalizedName("LeadIngot").setCreativeTab(Technicraft).setTextureName("technicraft:ingot_lead");
		GameRegistry.registerItem(leadMetal, "Lead Ingot");
		aluminiumMetal = new Item().setUnlocalizedName("AluminiumIngot").setCreativeTab(Technicraft).setTextureName("technicraft:ingot_aluminium");
		GameRegistry.registerItem(aluminiumMetal, "Aluminium Ingot");
		
		//Dusts
		copperDust = new Item().setUnlocalizedName("CopperDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_copper");
		GameRegistry.registerItem(copperDust, "Copper Dust");
		tinDust = new Item().setUnlocalizedName("TinDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_tin");
		GameRegistry.registerItem(tinDust, "Tin Dust");
		leadDust = new Item().setUnlocalizedName("LeadDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_lead");
		GameRegistry.registerItem(leadDust, "Lead Dust");
		aluminiumDust = new Item().setUnlocalizedName("AluminiumDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_aluminium");
		GameRegistry.registerItem(aluminiumDust, "Aluminium Dust");
		goldDust = new Item().setUnlocalizedName("GoldDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_gold");
		GameRegistry.registerItem(goldDust, "Gold Dust");
		ironDust = new Item().setUnlocalizedName("IronDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_iron");
		GameRegistry.registerItem(ironDust, "Iron Dust");
		
		//Block
		copperOre = new copperOre(Material.rock).setCreativeTab(Technicraft);
		tinOre = new tinOre(Material.rock).setCreativeTab(Technicraft);
		leadOre = new leadOre(Material.rock).setCreativeTab(Technicraft);
		aluminiumOre = new aluminiumOre(Material.rock).setCreativeTab(Technicraft);
		topazOre = new topazOre(Material.rock).setCreativeTab(Technicraft);
		rubyOre = new rubyOre(Material.rock).setCreativeTab(Technicraft);
		sapphireOre = new sapphireOre(Material.rock).setCreativeTab(Technicraft);
		amethystOre = new amethystOre(Material.rock).setCreativeTab(Technicraft);
		
		
		//Ores
		
		//Compressed Blocks
		
		//Machnines
		grinder = new BlockGrinder(false).setHardness(3.5F).setStepSound(Block.soundTypePiston).setBlockName("grinder").setCreativeTab(Technicraft);
        lit_grinder = new BlockGrinder(true).setHardness(3.5F).setStepSound(Block.soundTypePiston).setLightLevel(0.875F).setBlockName("grinder");
		//Misc
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		proxy.registerRenderInformation();
		
		GameRegistry.registerBlock(copperOre, "copperOre");
		GameRegistry.registerBlock(tinOre, "tinOre");
		GameRegistry.registerBlock(leadOre, "leadOre");
		GameRegistry.registerBlock(aluminiumOre, "aluminiumOre");
		GameRegistry.registerBlock(rubyOre, "rubyOre");
		GameRegistry.registerBlock(sapphireOre, "sapphireOre");
		GameRegistry.registerBlock(topazOre, "topazOre");
		GameRegistry.registerBlock(amethystOre, "amethystOre");
		
		//Machines
		GameRegistry.registerBlock(grinder, "grinder");
        GameRegistry.registerBlock(lit_grinder, "lit_grinder");
        GameRegistry.registerTileEntity(TileEntityGrinder.class, References.MODID + ":grinder");
        NetworkRegistry.INSTANCE.registerGuiHandler(Main.getInstance(), new GrinderGuiHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	public static Main getInstance() {
        return instance;
	}

private void initRecipes() 
{
    GameRegistry.addRecipe(new ItemStack(grinder), new Object[] {"FCF", "RIR", "FCF", 'F', Blocks.furnace, 'C', copperMetal, 'R', Items.redstone, 'I', Items.iron_ingot});
    GameRegistry.addRecipe(new ItemStack(grinder), new Object[] {"FRF", "CIC", "FRF", 'F', Blocks.furnace, 'C', copperMetal, 'R', Items.redstone, 'I', Items.iron_ingot});
    
    //smelting
}
}