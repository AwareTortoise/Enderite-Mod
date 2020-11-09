package com.awaretortoise.enderite.util;

import com.awaretortoise.enderite.Enderite;
import com.awaretortoise.enderite.blocks.BlockItemBase;
import com.awaretortoise.enderite.blocks.DiamondReinforcedGlassBlock;
import com.awaretortoise.enderite.blocks.EnderiteOreBlock;
import com.awaretortoise.enderite.items.ItemBase;
import com.awaretortoise.enderite.tools.EnderiteItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Enderite.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Enderite.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> ENDERITE_DUST = ITEMS.register("enderite_dust", ItemBase::new);
    public static final RegistryObject<Item> EMPTY_IMBUEMENT = ITEMS.register("empty_imbuement", ItemBase::new);

    // Tools
    public static final RegistryObject<SwordItem> ENDERITE_SWORD = ITEMS.register("enderite_sword", () ->
            new SwordItem(EnderiteItemTier.ENDERITE, 9, -2.4f, new Item.Properties().group(Enderite.TAB)));

    // Blocks
    public static final RegistryObject<Block> ENDERITE_ORE = BLOCKS.register("enderite_ore", EnderiteOreBlock::new);
    public static final RegistryObject<Block> DIAMOND_REINFORCED_GLASS = BLOCKS.register("diamond_reinforced_glass", DiamondReinforcedGlassBlock::new);

    // Block Items
    public static final RegistryObject<Item> ENDERITE_ORE_ITEM = ITEMS.register("enderite_ore", () -> new BlockItemBase(ENDERITE_ORE.get()));
    public static final RegistryObject<Item> DIAMOND_REINFORCED_GLASS_ITEM = ITEMS.register("diamond_reinforced_glass", () -> new BlockItemBase(DIAMOND_REINFORCED_GLASS.get()));
}
