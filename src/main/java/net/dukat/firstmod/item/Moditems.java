package net.dukat.firstmod.item;

import net.dukat.firstmod.FirstMod;
import net.dukat.firstmod.fluid.ModFluids;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Items;




public class Moditems {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

        public static final RegistryObject<Item> ENDAMBER = ITEMS.register("endamber", () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDAMBER_IGNOT = ITEMS.register("endamber_ignot", () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STARRY_WATER_BUCKET =
                ITEMS.register("starry_water_bucket",
                        () -> new BucketItem(
                                ModFluids.STARRY_WATER,
                                new Item.Properties()
                                        .craftRemainder(Items.BUCKET)
                                        .stacksTo(1)
                        ));

        public static void register(IEventBus eventBus){
            ITEMS.register(eventBus);
        }




}
