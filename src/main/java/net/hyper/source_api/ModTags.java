package net.hyper.source_api;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> DOUBLE_HANDED_WEAPONS = createTag("double_handed_weapons");
        public static final TagKey<Item> VISUALLY_DISABLES_OFFHAND = createTag("visually_disables_offhand");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(SourceAPI.MOD_ID, name));
        }
    }
}