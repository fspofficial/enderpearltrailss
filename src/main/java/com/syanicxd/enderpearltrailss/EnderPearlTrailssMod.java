package com.syanicxd.enderpearltrailss;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class EnderPearlTrailssMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("Ender Pearl Trails Mod initialized!");
    }
}