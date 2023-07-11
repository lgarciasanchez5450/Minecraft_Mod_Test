package com.example.examplemod.item;

import com.example.examplemod.LeosMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LeosMod.MOD_ID);

    public static final RegistryObject <Item> _ITEM_NAME_ = ITEMS.register("_item_identifier_",() -> new Item(new Item.Properties()));

    private static final FoodProperties thing  = new FoodProperties.Builder().alwaysEat().nutrition(100).saturationMod(20).fast().build();
    public static final RegistryObject <Item> PERFECT_FOOD = ITEMS.register("perfect_food",() -> new Item(new Item.Properties().food(thing).fireResistant().stacksTo(3)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
