package com.ysl3000.stubs;

import be.seeseemelk.mockbukkit.ServerMock;
import be.seeseemelk.mockbukkit.entity.PlayerMock;
import java.util.UUID;

/**
 * Created by ysl3000
 */
public class SmartPlayerStub extends PlayerMock {

  private boolean playedBefore = false;

  public SmartPlayerStub(ServerMock server, String name) {
    super(server, name);
  }

  public SmartPlayerStub(ServerMock server, String name, UUID uuid) {
    super(server, name, uuid);
  }

  @Override
  public boolean hasPlayedBefore() {
    return playedBefore;
  }
  public void setPlayedBefore(boolean playedBefore){
    this.playedBefore=playedBefore;
  }
}