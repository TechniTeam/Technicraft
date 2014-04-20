package wiiboy222.mod.Blocks.Grinder;

import wiiboy222.mod.Blocks.Grinder.GuiGrinder;
import wiiboy222.mod.Blocks.Grinder.ContainerGrinder;
import wiiboy222.mod.Blocks.Grinder.TileEntityGrinder;
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