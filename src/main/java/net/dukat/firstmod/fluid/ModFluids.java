package net.dukat.firstmod.fluid;

import net.dukat.firstmod.FirstMod;
import net.dukat.firstmod.block.ModBlocks;
import net.dukat.firstmod.item.Moditems;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.material.Fluid;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, FirstMod.MOD_ID);

    // SOURCE
    public static final RegistryObject<ForgeFlowingFluid> STARRY_WATER =
            FLUIDS.register("starry_water", () ->
                    new ForgeFlowingFluid.Source(STARRY_WATER_PROPERTIES)
            );

    // FLOWING
    public static final RegistryObject<ForgeFlowingFluid> FLOWING_STARRY_WATER =
            FLUIDS.register("flowing_starry_water", () ->
                    new ForgeFlowingFluid.Flowing(STARRY_WATER_PROPERTIES)
            );

    // PROPERTIES
    public static final ForgeFlowingFluid.Properties STARRY_WATER_PROPERTIES =
            new ForgeFlowingFluid.Properties(
                    ModFluidTypes.STARRY_WATER_TYPE,
                    STARRY_WATER,
                    FLOWING_STARRY_WATER
            )
                    .bucket(Moditems.STARRY_WATER_BUCKET)
                    .block(ModBlocks.STARRY_WATER_BLOCK);
}