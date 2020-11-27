package org.kcsup.gm.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import org.kcsup.gm.GramerMod;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(GramerMod.TAB));
    }
}
