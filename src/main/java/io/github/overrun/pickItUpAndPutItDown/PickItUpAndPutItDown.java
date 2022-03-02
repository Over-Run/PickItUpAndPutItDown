package io.github.overrun.pickItUpAndPutItDown;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PickItUpAndPutItDown implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("baka4n");

	@Override
	public void onInitialize() {
		LOGGER.info("Hey!look!it's Pick It Up And Put It Down!");
	}
}
