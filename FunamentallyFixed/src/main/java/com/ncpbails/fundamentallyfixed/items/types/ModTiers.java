package com.ncpbails.fundamentallyfixed.items.types;

import com.ncpbails.fundamentallyfixed.core.ModTags;
import com.ncpbails.fundamentallyfixed.items.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier BRONZE = new ForgeTier(1, 45, 1.0f, 0.0f, 2,
            ModTags.Blocks.NEEDS_BRONZE_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));
    public static final ForgeTier FLINT = new ForgeTier(0, 59, 2.0f, 0.0f, 15,
            ModTags.Blocks.NEEDS_FLINT_TOOL, () -> Ingredient.of(Items.FLINT));
    public static final ForgeTier COPPER = new ForgeTier(1, 131, 4.0f, 1.0f, 5,
            ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(ModItems.RAW_COPPER_NUGGET.get()));
    //WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
    //    return Ingredient.of(ItemTags.PLANKS);
    //}),
    //STONE(1, 131, 4.0F, 1.0F, 5, () -> {
    //    return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);
    //}),
    //IRON(2, 250, 6.0F, 2.0F, 14, () -> {
    //    return Ingredient.of(Items.IRON_INGOT);
    //}),
    //DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {
    //    return Ingredient.of(Items.DIAMOND);
    //}),
    //GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
    //    return Ingredient.of(Items.GOLD_INGOT);
    //}),
    //NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
    //    return Ingredient.of(Items.NETHERITE_INGOT);
    //});
}
