package net.dukat.firstmod.fluid;

import net.dukat.firstmod.block.ModBlocks;
import net.dukat.firstmod.item.Moditems;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public abstract class StarryWaterFluid extends ForgeFlowingFluid {

    public static final ForgeFlowingFluid.Properties PROPERTIES =
            new ForgeFlowingFluid.Properties(
                    ModFluidTypes.STARRY_WATER_TYPE,
                    ModFluids.STARRY_WATER,
                    ModFluids.FLOWING_STARRY_WATER
            )
                    .bucket(Moditems.STARRY_WATER_BUCKET)
                    .block(ModBlocks.STARRY_WATER_BLOCK);


    protected StarryWaterFluid(Properties properties) {
        super(properties);
    }

    @Override
    public FluidType getFluidType() {
        return ModFluidTypes.STARRY_WATER_TYPE.get();
    }

    public static class Source extends ForgeFlowingFluid.Source {
        public Source() {
            super(PROPERTIES);
        }

    }

    public static class Flowing extends ForgeFlowingFluid.Flowing {
        public Flowing() {
            super(PROPERTIES);
        }

    }
}

