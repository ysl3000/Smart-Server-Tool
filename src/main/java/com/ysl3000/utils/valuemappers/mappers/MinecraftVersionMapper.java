package com.ysl3000.utils.valuemappers.mappers;

import com.ysl3000.utils.MessageWrapper;
import com.ysl3000.utils.valuemappers.ValueMapper;
import org.bukkit.Server;

/**
 * Created by ysl3000
 */
public class MinecraftVersionMapper implements ValueMapper {

  private final Server server;

  public MinecraftVersionMapper(Server server) {
    this.server = server;
  }

  @Override
  public void injectPlaceholder(MessageWrapper message) {
    if (server.getVersion().length() >= 16) {
      message.replace("{minecraft_version}", server.getVersion().substring(11));
    }
  }
}
