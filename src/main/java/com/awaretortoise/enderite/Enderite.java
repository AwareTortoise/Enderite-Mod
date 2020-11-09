package com.awaretortoise.enderite;

import com.awaretortoise.enderite.blocks.DiamondReinforcedGlassBlock;
import com.awaretortoise.enderite.util.RegistryHandler;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod("enderite")
public class Enderite
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "enderite";

    public Enderite() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
        RenderTypeLookup.setRenderLayer(RegistryHandler.DIAMOND_REINFORCED_GLASS.get(), RenderType.getCutout());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    public static final ItemGroup TAB = new ItemGroup("enderiteTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ENDERITE_DUST.get());
        }
    };
}
