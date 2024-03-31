
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morevarients.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.morevarients.MoreVarientsMod;

public class MoreVarientsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreVarientsMod.MODID);
	public static final RegistryObject<CreativeModeTab> MORE_VARIANT_STAIRS = REGISTRY.register("more_variant_stairs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.more_varients.more_variant_stairs")).icon(() -> new ItemStack(MoreVarientsModBlocks.RED_CONCRETE_STAIRS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MoreVarientsModBlocks.WHITE_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.GRAY_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BLACK_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BROWN_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.RED_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.ORANGE_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.YELLOW_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.LIME_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.GREEN_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CYAN_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BLUE_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.PURPLE_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.MAGENTA_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.PINK_CONCRETE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.WHITE_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.GRAY_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BLACK_TERRACOTTA_STAITS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BROWN_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.RED_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.ORANGE_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.YELLOW_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.LIME_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.GREEN_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CYAN_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.LIGHT_BLUE_TERRACOTTA.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BLUE_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.PURPLE_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.MAGENTA_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.THACTHED_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_STONE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.GRANITE_BRICK_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.ANDESITE_BRICK_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.DIORITE_BRICK_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.QUARTZ_BRICK_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.ACACIA_MOSAIC_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BIRCH_MOSAIC_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHERRY_MOSAIC_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CRIMSON_MOSAIC_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.DARK_OAK_MOSAIC_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.JUNGLE_MOSAIC_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.MANGROVE_MOSAIC_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.OAK_MOSAIC_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SPRUCE_MOSAIC_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.WARPED_MOSAIC_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_ACACIA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_BIRCH_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_CHERRY_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_CRIMSON_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_DARK_OAK_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_JUNGLE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_MANGROVE_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_OAK_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_SPRUCE_SAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_WARPED_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.PINK_TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.TERRACOTTA_STAIRS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.TERRACOTTA_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.WHITE_TERRACOTTA_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.GRAY_TERRACOTTA_SALB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BROWN_TERRACOTTA_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BLACK_TERRACOTTA_SLAB.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> MORE_SLABS = REGISTRY.register("more_slabs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.more_varients.more_slabs")).icon(() -> new ItemStack(MoreVarientsModBlocks.RED_CONCRETE_SLAB.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MoreVarientsModBlocks.WHITE_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.GRAY_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BLACK_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BROWN_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.RED_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.ORANGE_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.YELLOW_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.LIME_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.GREEN_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CYAN_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BLUE_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.PURPLE_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.MAGENTA_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.PINK_CONCRETE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.THATCHED_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.GRANITE_BRICK_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.DIORITE_BRICK_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.ANDESITE_BRICK_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.QUARTZ_BRICK_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.ACACIA_MOSAIC_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BIRCH_MOSAIC_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHERRY_MOSAIC_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CRIMSON_MOSAIC_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.DARK_OAK_MOSAIC_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.JUNGLE_MOSAIC_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.MANGROVE_MOSAIC_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.OAK_MOSAIC_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SPRUCE_MOSAIC_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.WARPED_MOSAIC_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_ACACIA_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_BIRCH_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_CHERRY_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_CRIMSON_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_DARK_OAK_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_JUNGLE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_MANGROVE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_OAK_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_SPRUCE_SLAB.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_WARPED_SLAB.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> MORE_BLOCKS = REGISTRY.register("more_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.more_varients.more_blocks")).icon(() -> new ItemStack(MoreVarientsModBlocks.CHIPPED_OAK_LOG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MoreVarientsModBlocks.CRACKED_POLISHED_GRANITE.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CRACKED_POLISHED_ANDESITE.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CRACKED_POLISHED_DIORITE.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CRACKED_POLISHED_DEEPSLATE.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CRACKED_POLISHED_BLACKSTONE.get().asItem());
				tabData.accept(MoreVarientsModBlocks.GRANITE_BRICKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.DIORITE_BRICKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.ANDESITE_BRICKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHIPPED_ACACIA_LOG.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHIPPED_BIRCH_LOG.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHIPPED_CHERRY_LOG.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHIPPED_CRIMSON_STEM.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHIPPED_DARK_OAK_LOG.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHIPPED_JUNGLE_LOG.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHIPPED_MANGROVE_LOG.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHIPPED_OAK_LOG.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHIPPED_SPRUCE_LOG.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHIPPED_WARPED_STEM.get().asItem());
				tabData.accept(MoreVarientsModBlocks.ACACIA_MOSAIC.get().asItem());
				tabData.accept(MoreVarientsModBlocks.BIRCH_MOSAIC.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CHERRY_MOSAIC.get().asItem());
				tabData.accept(MoreVarientsModBlocks.CRIMSON_MOSAIC.get().asItem());
				tabData.accept(MoreVarientsModBlocks.DARK_OAK_MOSAIC.get().asItem());
				tabData.accept(MoreVarientsModBlocks.JUNGLE_MOSAIC.get().asItem());
				tabData.accept(MoreVarientsModBlocks.MANGROVE_MOSAIC.get().asItem());
				tabData.accept(MoreVarientsModBlocks.OAK_MOSAIC.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SPRUCE_MOSAIC.get().asItem());
				tabData.accept(MoreVarientsModBlocks.WARPED_MOSAIC.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_ACACIA_PLANKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_BIRCH_PLANKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_CHERRY_PLANKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_CRIMSON_PLANKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_DARK_OAK_PLANKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_JUNGLE_PLANKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_MANGROVE_PLANKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_OAK_PLANKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_SPRUCE_PLANKS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_WARPED_PLANKS.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> MORE_WALLS = REGISTRY.register("more_walls",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.more_varients.more_walls")).icon(() -> new ItemStack(MoreVarientsModBlocks.GRANITE_BRICK_WALL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MoreVarientsModBlocks.GRANITE_BRICK_WALL.get().asItem());
				tabData.accept(MoreVarientsModBlocks.DIORITE_BRICK_WALL.get().asItem());
				tabData.accept(MoreVarientsModBlocks.ANDESITE_BRICK_WALL.get().asItem());
				tabData.accept(MoreVarientsModBlocks.QUARTZ_WALLS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.QUARTZ_BRICK_WALLS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.SMOOTH_QUARTZ_WALLS.get().asItem());
				tabData.accept(MoreVarientsModBlocks.PILLARED_QUARTZ_WALL.get().asItem());
			})

					.build());
}
