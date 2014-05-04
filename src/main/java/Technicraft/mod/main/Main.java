package Technicraft.mod.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
import Technicraft.mod.main.Blocks.*;
import Technicraft.mod.main.Blocks.Grinder.*;
import Technicraft.mod.main.Items.ultraGem;
import Technicraft.mod.main.Items.wrenchDrill;
import Technicraft.mod.main.lib.ProxyCommon;
import Technicraft.mod.main.lib.References;
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
	public static Item silverMetal;
	public static Item chromiumMetal;
	public static Item copperDust;
	public static Item tinDust;
	public static Item leadDust;
	public static Item aluminiumDust;
	public static Item silverDust;
	public static Item chromiumDust;
	public static Item ironDust;
	public static Item goldDust;
	public static Item wrenchDrill;
	
	//Blocks
	public static Block copperOre;
	public static Block tinOre;
	public static Block leadOre;
	public static Block aluminiumOre;
	public static Block silverOre;
	public static Block chromiumOre;
	public static Block rubyOre;
	public static Block topazOre;
	public static Block sapphireOre;
	public static Block amethystOre;
	public static Block copperBlock;
	public static Block tinBlock;
	public static Block leadBlock;
	public static Block aluminiumBlock;
	public static Block chromiumBlock;
	public static Block silverBlock;
	public static Block rubyBlock;
	public static Block topazBlock;
	public static Block sapphireBlock;
	public static Block amethystBlock;
	public static Block basaltBlock;
	public static Block basaltCobble;
	public static Block marbleBlock;
	public static Block marbleCobble;
	
	//Machines
    public static Block grinder, lit_grinder;
    public static Block compressor, lit_compressor;
	
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
		ultraGem = new ultraGem().setUnlocalizedName("UltraGem").setTextureName("technicraft:gem_ultra").setCreativeTab(Technicraft);
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
		silverMetal = new Item().setUnlocalizedName("SilverIngot").setCreativeTab(Technicraft).setTextureName("technicraft:ingot_silver");
		GameRegistry.registerItem(silverMetal, "Silver Ingot");
		chromiumMetal = new Item().setUnlocalizedName("ChromiumIngot").setCreativeTab(Technicraft).setTextureName("technicraft:ingot_chromium");
		GameRegistry.registerItem(chromiumMetal, "Chromium Ingot");
		
		//Dusts
		copperDust = new Item().setUnlocalizedName("CopperDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_copper");
		GameRegistry.registerItem(copperDust, "Copper Dust");
		tinDust = new Item().setUnlocalizedName("TinDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_tin");
		GameRegistry.registerItem(tinDust, "Tin Dust");
		leadDust = new Item().setUnlocalizedName("LeadDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_lead");
		GameRegistry.registerItem(leadDust, "Lead Dust");
		aluminiumDust = new Item().setUnlocalizedName("AluminiumDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_aluminium");
		GameRegistry.registerItem(aluminiumDust, "Aluminium Dust");
		silverDust = new Item().setUnlocalizedName("SilverDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_silver");
		GameRegistry.registerItem(silverDust, "Silver Dust");
		chromiumDust = new Item().setUnlocalizedName("ChromiumDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_chromium");
		GameRegistry.registerItem(chromiumDust, "Chromium Dust");
		goldDust = new Item().setUnlocalizedName("GoldDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_gold");
		GameRegistry.registerItem(goldDust, "Gold Dust");
		ironDust = new Item().setUnlocalizedName("IronDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_iron");
		GameRegistry.registerItem(ironDust, "Iron Dust");
		
		//tools
		wrenchDrill = new wrenchDrill().setUnlocalizedName("WrenchDrill").setCreativeTab(Technicraft).setTextureName("technicraft:wrench_drill");
		GameRegistry.registerItem(wrenchDrill, "wrenchDrill");
		
		//Block
		copperOre = new copperOre(Material.rock).setCreativeTab(Technicraft);
		tinOre = new tinOre(Material.rock).setCreativeTab(Technicraft);
		leadOre = new leadOre(Material.rock).setCreativeTab(Technicraft);
		aluminiumOre = new aluminiumOre(Material.rock).setCreativeTab(Technicraft);
		silverOre = new silverOre(Material.rock).setCreativeTab(Technicraft);
		chromiumOre = new chromiumOre(Material.rock).setCreativeTab(Technicraft);
		topazOre = new topazOre(Material.rock).setCreativeTab(Technicraft);
		rubyOre = new rubyOre(Material.rock).setCreativeTab(Technicraft);
		sapphireOre = new sapphireOre(Material.rock).setCreativeTab(Technicraft);
		amethystOre = new amethystOre(Material.rock).setCreativeTab(Technicraft);
		
		copperBlock = new copperBlock(Material.iron).setCreativeTab(Technicraft);
		tinBlock = new tinBlock(Material.iron).setCreativeTab(Technicraft);
		leadBlock = new leadBlock(Material.iron).setCreativeTab(Technicraft);
		aluminiumBlock = new aluminiumBlock(Material.iron).setCreativeTab(Technicraft);
		chromiumBlock = new chromiumBlock(Material.iron).setCreativeTab(Technicraft);
		silverBlock = new silverBlock(Material.iron).setCreativeTab(Technicraft);
		topazBlock = new topazBlock(Material.iron).setCreativeTab(Technicraft);
		rubyBlock = new rubyBlock(Material.iron).setCreativeTab(Technicraft);
		sapphireBlock = new sapphireBlock(Material.iron).setCreativeTab(Technicraft);
		amethystBlock = new amethystBlock(Material.iron).setCreativeTab(Technicraft);
		basaltBlock = new basaltBlock(Material.rock).setCreativeTab(Technicraft);
		basaltCobble = new basaltCobble(Material.rock).setCreativeTab(Technicraft);
		marbleBlock = new marbleBlock(Material.rock).setCreativeTab(Technicraft);
		marbleCobble = new marbleCobble(Material.rock).setCreativeTab(Technicraft);
		//Ores
		
		//Compressed Blocks
		
		//Machnines
		grinder = new BlockGrinder(false).setHardness(3.5F).setStepSound(Block.soundTypePiston).setBlockName("grinder").setCreativeTab(Technicraft);
        lit_grinder = new BlockGrinder(true).setHardness(3.5F).setStepSound(Block.soundTypePiston).setLightLevel(0.875F).setBlockName("grinder");
		//Misc
        
        GameRegistry.registerWorldGenerator(new WorldGen(), 1);
		
	}
	

	@EventHandler
	public void load(FMLInitializationEvent event){
		proxy.registerRenderInformation();
		
		GameRegistry.registerBlock(copperOre, "copperOre");
		GameRegistry.registerBlock(tinOre, "tinOre");
		GameRegistry.registerBlock(leadOre, "leadOre");
		GameRegistry.registerBlock(aluminiumOre, "aluminiumOre");
		GameRegistry.registerBlock(chromiumOre, "chromiumOre");
		GameRegistry.registerBlock(silverOre, "silverOre");
		GameRegistry.registerBlock(rubyOre, "rubyOre");
		GameRegistry.registerBlock(sapphireOre, "sapphireOre");
		GameRegistry.registerBlock(topazOre, "topazOre");
		GameRegistry.registerBlock(amethystOre, "amethystOre");
		
		GameRegistry.registerBlock(copperBlock, "copperBlock");
		GameRegistry.registerBlock(tinBlock, "tinBlock");
		GameRegistry.registerBlock(leadBlock, "leadBlock");
		GameRegistry.registerBlock(aluminiumBlock, "aluminiumBlock");
		GameRegistry.registerBlock(silverBlock, "silverBlock");
		GameRegistry.registerBlock(chromiumBlock, "chromiumBlock");
		GameRegistry.registerBlock(topazBlock, "topazBlock");
		GameRegistry.registerBlock(sapphireBlock, "sapphireBlock");
		GameRegistry.registerBlock(rubyBlock, "rubyBlock");
		GameRegistry.registerBlock(amethystBlock, "amethystBlock");
		GameRegistry.registerBlock(basaltBlock, "basaltBlock");
		GameRegistry.registerBlock(basaltCobble, "basaltCobble");
		GameRegistry.registerBlock(marbleBlock, "marbleBlock");
		GameRegistry.registerBlock(marbleCobble, "marbleCobble");
		
		
		//Machines
		GameRegistry.registerBlock(grinder, "grinder");
        GameRegistry.registerBlock(lit_grinder, "lit_grinder");
        GameRegistry.registerTileEntity(TileEntityGrinder.class, References.MODID + ":grinder");
        NetworkRegistry.INSTANCE.registerGuiHandler(Main.getInstance(), new GrinderGuiHandler());
        {
        //crafting
        GameRegistry.addRecipe(new ItemStack(grinder), new Object[] {"FCF", "RIR", "FCF", 'F', Blocks.furnace, 'C', copperMetal, 'R', Items.redstone, 'I', Items.iron_ingot});
	    GameRegistry.addRecipe(new ItemStack(grinder), new Object[] {"FRF", "CIC", "FRF", 'F', Blocks.furnace, 'C', copperMetal, 'R', Items.redstone, 'I', Items.iron_ingot});
	    
	    GameRegistry.addRecipe(new ItemStack(copperBlock, 1), new Object[] { "CCC", "CCC", "CCC", 'C', copperMetal });
	    GameRegistry.addShapelessRecipe(new ItemStack(copperMetal,9), copperBlock);
	    
	    GameRegistry.addRecipe(new ItemStack(tinBlock, 1), new Object[] { "CCC", "CCC", "CCC", 'C', tinMetal });
	    GameRegistry.addShapelessRecipe(new ItemStack(tinMetal,9), tinBlock);
	    
	    GameRegistry.addRecipe(new ItemStack(leadBlock, 1), new Object[] { "CCC", "CCC", "CCC", 'C', leadMetal });
	    GameRegistry.addShapelessRecipe(new ItemStack(leadMetal,9), leadBlock);
	    
	    GameRegistry.addRecipe(new ItemStack(aluminiumBlock, 1), new Object[] { "CCC", "CCC", "CCC", 'C', aluminiumMetal });
	    GameRegistry.addShapelessRecipe(new ItemStack(aluminiumMetal,9), aluminiumBlock);
	    
	    GameRegistry.addRecipe(new ItemStack(chromiumBlock, 1), new Object[] { "CCC", "CCC", "CCC", 'C', chromiumMetal });
	    GameRegistry.addShapelessRecipe(new ItemStack(chromiumMetal,9), chromiumBlock);
	    
	    GameRegistry.addRecipe(new ItemStack(silverBlock, 1), new Object[] { "CCC", "CCC", "CCC", 'C', silverMetal });
	    GameRegistry.addShapelessRecipe(new ItemStack(silverMetal,9), silverBlock);
	    
	    GameRegistry.addRecipe(new ItemStack(amethystBlock, 1), new Object[] { "CCC", "CCC", "CCC", 'C', amethystGem });
	    GameRegistry.addShapelessRecipe(new ItemStack(amethystGem,9), amethystBlock);
	    
	    GameRegistry.addRecipe(new ItemStack(topazBlock, 1), new Object[] { "CCC", "CCC", "CCC", 'C', topazGem });
	    GameRegistry.addShapelessRecipe(new ItemStack(topazGem,9), topazBlock);
	    
	    GameRegistry.addRecipe(new ItemStack(sapphireBlock, 1), new Object[] { "CCC", "CCC", "CCC", 'C', sapphireGem });
	    GameRegistry.addShapelessRecipe(new ItemStack(sapphireGem,9), sapphireBlock);
	    
	    GameRegistry.addRecipe(new ItemStack(rubyBlock, 1), new Object[] { "CCC", "CCC", "CCC", 'C', rubyGem });
	    GameRegistry.addShapelessRecipe(new ItemStack(rubyGem,9), rubyBlock);
	    
	    GameRegistry.addRecipe(new ItemStack(wrenchDrill, 1), new Object[] { "IID", " L ", "BRL", 'I', Items.iron_ingot, 'D', Items.dye, 'R', Items.redstone, 'L', leadMetal, 'B', Blocks.stone_button});
	    //smelting
	    GameRegistry.addSmelting(copperDust, new ItemStack(copperMetal), 1.0F);
	    GameRegistry.addSmelting(tinDust, new ItemStack(tinMetal), 1.0F);
	    GameRegistry.addSmelting(leadDust, new ItemStack(leadMetal), 1.0F);
	    GameRegistry.addSmelting(aluminiumDust, new ItemStack(aluminiumMetal), 1.0F);
	    GameRegistry.addSmelting(chromiumDust, new ItemStack(chromiumMetal), 1.0F);
	    GameRegistry.addSmelting(silverDust, new ItemStack(silverMetal), 1.0F);
	    GameRegistry.addSmelting(goldDust, new ItemStack(Items.gold_ingot), 1.0F);
	    GameRegistry.addSmelting(ironDust, new ItemStack(Items.iron_ingot), 1.0F);
	    
	    GameRegistry.addSmelting(copperOre, new ItemStack(copperMetal), 1.0F);
	    GameRegistry.addSmelting(tinOre, new ItemStack(tinMetal), 1.0F);
	    GameRegistry.addSmelting(leadOre, new ItemStack(leadMetal), 1.0F);
	    GameRegistry.addSmelting(aluminiumOre, new ItemStack(aluminiumMetal), 1.0F);
	    GameRegistry.addSmelting(chromiumOre, new ItemStack(chromiumMetal), 1.0F);
	    GameRegistry.addSmelting(silverOre, new ItemStack(silverMetal), 1.0F);
	    GameRegistry.addSmelting(marbleCobble, new ItemStack(marbleBlock), 0.5F);
	    GameRegistry.addSmelting(basaltCobble, new ItemStack(basaltBlock), 0.5F);
	    
        }
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	public static Main getInstance() {
        return instance;
	}
}
