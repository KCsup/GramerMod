package org.kcsup.gm.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.kcsup.gm.GramerMod;
import org.kcsup.gm.blocks.BlockItemBase;
import org.kcsup.gm.blocks.GramerBlock;
import org.kcsup.gm.blocks.GramerOreBlock;
import org.kcsup.gm.items.ItemBase;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, GramerMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, GramerMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> GRAMER_HEAD = ITEMS.register("gramer_head", ItemBase::new);
    public static final RegistryObject<Item> GRAMER_INGOT = ITEMS.register("gramer_ingot", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> GRAMER_BLOCK = BLOCKS.register("gramer_block", GramerBlock::new);
    public static final RegistryObject<Block> GRAMER_ORE_BLOCK = BLOCKS.register("gramer_ore", GramerOreBlock::new);

    // Block Items
    public static final RegistryObject<Item> GRAMER_BLOCK_ITEM = ITEMS.register("gramer_block",
            () -> new BlockItemBase(GRAMER_BLOCK.get()));
    public static final RegistryObject<Item> GRAMER_ORE_BLOCK_ITEM = ITEMS.register("gramer_ore",
            () -> new BlockItemBase(GRAMER_ORE_BLOCK.get()));

}
