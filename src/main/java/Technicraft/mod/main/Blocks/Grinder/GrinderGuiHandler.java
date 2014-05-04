package Technicraft.mod.main.Blocks.Grinder;

import Technicraft.mod.main.Blocks.Grinder.ContainerGrinder;
import Technicraft.mod.main.Blocks.Grinder.GuiGrinder;
import Technicraft.mod.main.Blocks.Grinder.TileEntityGrinder;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GrinderGuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(tileEntity instanceof TileEntityGrinder) {
            return new ContainerGrinder(player.inventory, (TileEntityGrinder)tileEntity);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(tileEntity instanceof TileEntityGrinder) {
            return new GuiGrinder(player.inventory, (TileEntityGrinder)tileEntity);
        }
        return null;
    }
}