package com.ncpbails.fundamentallyfixed.items;

import com.ncpbails.fundamentallyfixed.FundamentallyFixed;
import com.ncpbails.fundamentallyfixed.block.ModBlocks;
import com.ncpbails.fundamentallyfixed.items.custom.FixedPotionItem;
import com.ncpbails.fundamentallyfixed.items.custom.MysticalStewItem;
import com.ncpbails.fundamentallyfixed.items.types.ModArmourMaterials;
import com.ncpbails.fundamentallyfixed.items.types.ModTiers;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FundamentallyFixed.MOD_ID);


    public static final RegistryObject<Item> BREEZE_ROD = ITEMS.register("breeze_rod", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BREEZE_POWDER = ITEMS.register("breeze_powder", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> INFERNO_ROD = ITEMS.register("inferno_rod", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> INFERNO_POWDER = ITEMS.register("inferno_powder", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> LOOSE_GRASS = ITEMS.register("loose_grass", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WORM = ITEMS.register("worm", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> TERRACOTTA_FRACTURE = ITEMS.register("terracotta_fracture", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_COPPER_NUGGET = ITEMS.register("raw_copper_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_ALUMINIUM_NUGGET = ITEMS.register("raw_aluminium_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_IRON_NUGGET = ITEMS.register("raw_iron_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_GOLD_NUGGET = ITEMS.register("raw_gold_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_LEAD_NUGGET = ITEMS.register("raw_lead_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_SILVER_NUGGET = ITEMS.register("raw_silver_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SPRING = ITEMS.register("spring", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //public static final RegistryObject<Item> ITEM_HOLDER = ITEMS.register("item_holder", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> HOOK = ITEMS.register("hook", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BRONZE_COIN = ITEMS.register("bronze_coin", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GRAVITITE_INGOT = ITEMS.register("gravitite_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GRAVITITE_NUGGET = ITEMS.register("gravitite_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STOLDUM_INGOT = ITEMS.register("stoldum_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STOLDUM_NUGGET = ITEMS.register("stoldum_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> VOIDENDUM_INGOT = ITEMS.register("voidendum_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> VOIDENDUM_NUGGET = ITEMS.register("voidendum_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MYTHRIL_NUGGET = ITEMS.register("mythril_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> HALLOWED_INGOT = ITEMS.register("hallowed_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> HALLOWED_NUGGET = ITEMS.register("hallowed_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CHLOROPHITE_INGOT = ITEMS.register("chlorophite_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CHLOROPHITE_NUGGET = ITEMS.register("chlorophite_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_INFERNUM = ITEMS.register("raw_infernum_debris", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_INFERNUM_NUGGET = ITEMS.register("raw_infernum_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> INFERNUM_NUGGET = ITEMS.register("infernum_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_PHYTON = ITEMS.register("raw_phyton_remains", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_PHYTON_NUGGET = ITEMS.register("raw_phyton_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //public static final RegistryObject<Item> ROUGH_RUBY = ITEMS.register("rough_ruby", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //public static final RegistryObject<Item> ROUGH_RUBY_SHARD = ITEMS.register("rough_ruby_shard", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ALUMINIUM_DUST = ITEMS.register("aluminium_dust", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> NETHERRACK_POWDER = ITEMS.register("netherrack_powder", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CALCIUM_POWDER = ITEMS.register("calcium_powder", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GROUND_PRISMARINE = ITEMS.register("ground_prismarine", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> WHEAT_FLOUR = ITEMS.register("wheat_flour", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ACORN_FLOUR = ITEMS.register("acorn_flour", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> COCOA_POWDER = ITEMS.register("cocoa_powder", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ALUMINIUM_SHEET = ITEMS.register("aluminium_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> LEAD_SHEET = ITEMS.register("lead_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SILVER_SHEET = ITEMS.register("silver_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> PRISMARITE_SHEET = ITEMS.register("prismarite_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GRAVITITE_SHEET = ITEMS.register("gravitite_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STOLDUM_SHEET = ITEMS.register("stoldum_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> VOIDENDUM_SHEET = ITEMS.register("voidendum_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MYTHRIL_SHEET = ITEMS.register("mythril_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> HALLOWED_SHEET = ITEMS.register("hallowed_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CHLOROPHITE_SHEET = ITEMS.register("chlorophite_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> NETHERITE_SHEET = ITEMS.register("netherite_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ELECTRUM_SHEET = ITEMS.register("electrum_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BRONZE_SHEET = ITEMS.register("bronze_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STEEL_SHEET = ITEMS.register("steel_sheet", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ROUGH_QUARTZ_SHARD = ITEMS.register("rough_quartz_shard", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> QUARTZ_SHARD = ITEMS.register("quartz_shard", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> QUARTZ = ITEMS.register("quartz", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> METEORITE_SCRAP = ITEMS.register("meteorite_scrap", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> METEORITE_DUST = ITEMS.register("meteorite_dust", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> METEORITE_NUGGET = ITEMS.register("meteorite_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> PRISMARINE_SHARD = ITEMS.register("prismarine_shard", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //public static final RegistryObject<Item> COW_HIDE = ITEMS.register("cow_hide", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //public static final RegistryObject<Item> HORSE_HIDE = ITEMS.register("horse_hide", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //public static final RegistryObject<Item> LLAMA_HIDE = ITEMS.register("llama_hide", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MAMMAL_HIDE = ITEMS.register("mammal_hide", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SAND_PILE = ITEMS.register("sand_pile", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> DIRT_PILE = ITEMS.register("dirt_pile", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SOUL_SAND_PILE = ITEMS.register("soul_sand_pile", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RED_SAND_PILE = ITEMS.register("red_sand_pile", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> FLORAROCK_PILE = ITEMS.register("florarock_pile", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> QUICKSOIL_PILE = ITEMS.register("quicksoil_pile", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SILVERFISH_EGGS = ITEMS.register("silverfish_eggs", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ModTiers.BRONZE, 3, -2.4f,
            new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModTiers.BRONZE, 5.5f, -3f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModTiers.BRONZE, 1, -2.8f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModTiers.BRONZE, 1.5f, -3f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModTiers.BRONZE, -2, 0f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> BRONZE_KNIFE = ITEMS.register("bronze_knife", () -> new KnifeItem(ModTiers.BRONZE, -2, 0f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(ModArmourMaterials.BRONZE, EquipmentSlot.HEAD,
            new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(ModArmourMaterials.BRONZE, EquipmentSlot.CHEST,
            new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(ModArmourMaterials.BRONZE, EquipmentSlot.LEGS,
            new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(ModArmourMaterials.BRONZE, EquipmentSlot.FEET,
            new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));


    public static final RegistryObject<Item> FLINT_HATCHET = ITEMS.register("flint_hatchet", () -> new AxeItem(ModTiers.FLINT, 5.5f, -3f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> FLINT_PICK = ITEMS.register("flint_pick", () -> new PickaxeItem(ModTiers.FLINT, 1, -2.8f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> FLINT_KNIFE = ITEMS.register("flint_knife", () -> new KnifeItem(ModTiers.FLINT, 1, 0f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_HATCHET = ITEMS.register("copper_hatchet", () -> new AxeItem(ModTiers.COPPER, 5.5f, -3f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_PICK = ITEMS.register("copper_pick", () -> new PickaxeItem(ModTiers.COPPER, 1, -2.8f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_KNIFE = ITEMS.register("copper_knife", () -> new KnifeItem(ModTiers.COPPER, -2, -2f,
            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));


    public static final RegistryObject<Item> POSITIVE_POTION_BASE = ITEMS.register("positive_potion_base", () ->
            new DrinkableItem(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> NEGATIVE_POTION_BASE = ITEMS.register("negative_potion_base", () ->
            new DrinkableItem(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MYSTICAL_STEW = ITEMS.register("mystical_stew", () -> new MysticalStewItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SPLASHTEST = ITEMS.register("splashtest", () ->
            new FixedPotionItem(new MobEffectInstance(MobEffects.GLOWING, 40, 1), new Item.Properties().tab(CreativeModeTab.TAB_BREWING)));

    public static final RegistryObject<Item> GRASS_SEEDS = ITEMS.register("grass_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GRASSES.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> WHEAT_SEEDS_FIXED = ITEMS.register("wheat_seeds_fixed",
            () -> new ItemNameBlockItem(ModBlocks.WHEAT_FIXED.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
