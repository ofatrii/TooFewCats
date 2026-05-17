package com.example.mixin;

import net.minecraft.world.entity.npc.CatSpawner;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(CatSpawner.class)
public class ChangeCats {
	@ModifyConstant(method = "spawnInVillage", constant = @Constant(intValue = 5))
	private int ChangeMaxCats(int original) {
		return 50;
	}

	@ModifyConstant(method = "tick", constant = @Constant(intValue = 1200))
	private int ChangeCatRate(int orig) {
		return 1;
	}
}