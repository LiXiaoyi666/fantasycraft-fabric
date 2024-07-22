package net.lixiaoyi.fantasyfood;

import net.fabricmc.api.ModInitializer;

import net.lixiaoyi.fantasyfood.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FantasyFood implements ModInitializer {
	// 该日志记录器用于将文本写入控制台和日志文件。
	// 最佳做法是使用您的模式 ID 作为记录器名称。
	// 这样，信息、警告和错误就会一目了然。
	public static final String MOD_ID = "fantasyfood";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// 一旦 Minecraft 处于可加载 MOD 的状态，这段代码就会立即运行。
		// 不过，有些东西（如资源）可能仍未初始化。
		// 谨慎行事。

		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
	}
}