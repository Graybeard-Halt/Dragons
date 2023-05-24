package net.haltocarrick.dragons.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.haltocarrick.dragons.Dragons;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
        public static final Item DRAGON_SCALES = register("dragon_scales",
                new Item(new Item.Settings()));

        private static Item register(String id, Item item) {
            return Registry.register(Registries.ITEM, new Identifier(Dragons.MOD_ID, id), item);
        }
        public static void addItemToGroup(){
            addToGroup(ItemGroups.INGREDIENTS, DRAGON_SCALES);
        }
        private static void addToGroup(ItemGroup group, Item item){
            ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        }

        public static void registerModItems(){
            Dragons.LOGGER.info("There is no spoon");
            addItemToGroup();
        }

}
