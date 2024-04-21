package net.mcreator.morevarients.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.morevarients.init.MoreVarientsModBlocks;

public class TealConcretePowderUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), MoreVarientsModBlocks.TEAL_CONCRETE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), MoreVarientsModBlocks.TEAL_CONCRETE.get().defaultBlockState(), 3);
		}
	}
}