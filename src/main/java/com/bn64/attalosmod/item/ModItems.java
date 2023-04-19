package com.bn64.attalosmod.item;

import com.bn64.attalosmod.AttalosMod;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

   public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, AttalosMod.MOD_ID);
      
      public static final RegistryObject<Item> COLOR_DYE = ITEMS.register("color_dye",
         () -> new Item(new Item.Properties().group(ModItemGroup.ColorPlus)));
      public static final RegistryObject<Item> FOREST_GREEN_DYE = ITEMS.register("forest_green_dye",
         () -> new Item(new Item.Properties().group(ModItemGroup.ColorPlus)));
      public static final RegistryObject<Item> FLAMING_ORANGE_DYE = ITEMS.register("flaming_orange_dye",
         () -> new Item(new Item.Properties().group(ModItemGroup.ColorPlus)));
      public static final RegistryObject<Item> MIDNIGHT_BLUE_DYE = ITEMS.register("midnight_blue_dye",
         () -> new Item(new Item.Properties().group(ModItemGroup.ColorPlus)));
      public static final RegistryObject<Item> GOLDEN_DYE = ITEMS.register("golden_dye",
         () -> new Item(new Item.Properties().group(ModItemGroup.ColorPlus)));
      public static final RegistryObject<Item> FUCHSIA_DYE = ITEMS.register("fuchsia_dye",
           () -> new Item(new Item.Properties().group(ModItemGroup.ColorPlus)));
           
      public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus); 
   }
}
