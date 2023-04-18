package com.bn64.attalosmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    
    public static final ItemGroup ColorPlus = new ItemGroup("ColorPlus") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.COLOR_DYE.get());
        }
    };
    
}
