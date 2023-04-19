package com.bn64.attalosmod.block;

import java.util.function.Supplier;

import com.bn64.attalosmod.AttalosMod;
import com.bn64.attalosmod.item.ModItemGroup;
import com.bn64.attalosmod.item.ModItems;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
        = DeferredRegister.create(ForgeRegistries.BLOCKS, AttalosMod.MOD_ID);

    public static final RegistryObject<Block> COLOR_WOOL = registerBlock("color_wool",
        () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
        .hardnessAndResistance(0.8f).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> FOREST_GREEN_WOOL = registerBlock("forest_green_wool",
        () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
        .hardnessAndResistance(0.8f).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> FLAMING_ORANGE_WOOL = registerBlock("flaming_orange_wool",
        () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
        .hardnessAndResistance(0.8f).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> MIDNIGHT_BLUE_WOOL = registerBlock("midnight_blue_wool",
        () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
        .hardnessAndResistance(0.8f).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> GOLDEN_WOOL = registerBlock("golden_wool",
        () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
        .hardnessAndResistance(0.8f).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> FUCHSIA_WOOL = registerBlock("fuchsia_wool",
        () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
        .hardnessAndResistance(0.8f).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> DIAMOND_BLUE_WOOL = registerBlock("diamond_blue_wool",
        () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
        .hardnessAndResistance(0.8f).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> ISA_WOOL = registerBlock("isa_wool",
        () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
        .hardnessAndResistance(0.8f).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> CRIMSON_RED_WOOL = registerBlock("crimson_red_wool",
        () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
        .hardnessAndResistance(0.8f).sound(SoundType.CLOTH)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
        new Item.Properties().group(ModItemGroup.ColorPlus)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}