package net.haltocarrick.dragons;

import net.fabricmc.api.ModInitializer;
import net.haltocarrick.dragons.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dragons implements ModInitializer {
    public static final String MOD_ID = "dragons";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
