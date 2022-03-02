package io.github.overrun.pickItUpAndPutItDown.otherAsms;

import io.github.overrun.pickItUpAndPutItDown.PickItUpAndPutItDown;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(net.minecraft.client.gui.screen.TitleScreen.class)
public class TitleScreen {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		PickItUpAndPutItDown.LOGGER.info("Hey test you see!");
	}
}
