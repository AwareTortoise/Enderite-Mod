package com.awaretortoise.enderite.items;

import com.awaretortoise.enderite.Enderite;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Enderite.TAB));
    }
}
