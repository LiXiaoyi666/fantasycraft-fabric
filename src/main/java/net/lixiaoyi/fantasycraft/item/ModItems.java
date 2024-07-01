package net.lixiaoyi.fantasycraft.item;

import net.lixiaoyi.fantasycraft.FantasyCraft;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COOKED_EGG = registerItems("cooked_egg", new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(FantasyCraft.MOD_ID, id), item);
    }
    public static void registerModItems(){
        FantasyCraft.LOGGER.info("Registering Items");
    }
}
