package com.github.project_animals;

import com.github.project_animals.registry.ModBlocks;
import com.github.project_animals.registry.ModItems;
import net.fabricmc.api.ModInitializer;


public class ProjectAnimals implements ModInitializer {
    public static final String MOD_ID = "project_animals";

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        ModBlocks.init();
        ModItems.init();
    }
}
