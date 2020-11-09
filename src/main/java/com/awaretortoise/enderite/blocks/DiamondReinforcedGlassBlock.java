package com.awaretortoise.enderite.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BreakableBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraftforge.common.ToolType;

public class DiamondReinforcedGlassBlock extends BreakableBlock {

    public DiamondReinforcedGlassBlock() {
        super(Block.Properties.create(Material.GLASS)
                .hardnessAndResistance(3.0f,1200.0f)
                .sound(SoundType.GLASS)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );

    }
}
