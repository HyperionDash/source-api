package net.hyper.source_api;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> VISUALLY_DISABLES_MAINHAND = createTag("visually_disables_mainhand");
        public static final TagKey<Item> VISUALLY_DISABLES_OFFHAND = createTag("visually_disables_offhand");

        public static final TagKey<Item> CROSSBOW_CHARGE_MAINHAND = createTag("crossbow_charge_mainhand");
        public static final TagKey<Item> BOW_AND_ARROW_MAINHAND = createTag("bow_and_arrow_mainhand");
        public static final TagKey<Item> CROSSBOW_HOLD_MAINHAND = createTag("crossbow_hold_mainhand");
        public static final TagKey<Item> SPYGLASS_MAINHAND = createTag("spyglass_mainhand");
        public static final TagKey<Item> THROW_SPEAR_MAINHAND = createTag("throw_spear_mainhand");
        public static final TagKey<Item> TOOT_HORN_MAINHAND = createTag("toot_horn_mainhand");
        public static final TagKey<Item> EMPTY_MAINHAND = createTag("empty_mainhand");
        public static final TagKey<Item> BLOCK_MAINHAND = createTag("block_mainhand");
        public static final TagKey<Item> BRUSH_MAINHAND = createTag("brush_mainhand");

        public static final TagKey<Item> CROSSBOW_CHARGE_OFFHAND = createTag("crossbow_charge_offhand");
        public static final TagKey<Item> BOW_AND_ARROW_OFFHAND = createTag("bow_and_arrow_offhand");
        public static final TagKey<Item> CROSSBOW_HOLD_OFFHAND = createTag("crossbow_hold_offhand");
        public static final TagKey<Item> SPYGLASS_OFFHAND = createTag("spyglass_offhand");
        public static final TagKey<Item> THROW_SPEAR_OFFHAND = createTag("throw_spear_offhand");
        public static final TagKey<Item> TOOT_HORN_OFFHAND = createTag("toot_horn_offhand");
        public static final TagKey<Item> EMPTY_OFFHAND = createTag("empty_offhand");
        public static final TagKey<Item> BLOCK_OFFHAND = createTag("block_offhand");
        public static final TagKey<Item> BRUSH_OFFHAND = createTag("brush_offhand");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(SourceAPI.MOD_ID, name));
        }
    }
}