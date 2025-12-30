package net.dukat.firstmod.fluid;

import net.dukat.firstmod.FirstMod;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {


    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, FirstMod.MOD_ID);

    public static final RegistryObject<FluidType> STARRY_WATER_TYPE =
            FLUID_TYPES.register("starry_water",
                    () ->  new FluidType(FluidType.Properties.create()
                            .density(1000)
                            .viscosity(1000)
                            .canSwim(true)
                            .canDrown(true)
                    )
            );
}
