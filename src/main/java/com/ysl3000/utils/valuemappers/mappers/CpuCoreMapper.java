package com.ysl3000.utils.valuemappers.mappers;

import com.ysl3000.utils.MessageWrapper;
import com.ysl3000.utils.valuemappers.ValueMapper;

/**
 * Created by ysl3000
 */
public class CpuCoreMapper implements ValueMapper {

  private final String coreMessageValue;

  public CpuCoreMapper() {
    StringBuilder stringBuilder = new StringBuilder();
    int processors = Runtime.getRuntime().availableProcessors();
    stringBuilder.append(processors);
    stringBuilder.append(" ");
    stringBuilder.append("core");
    if (processors > 1) {
      stringBuilder.append("s");
    }
    this.coreMessageValue = stringBuilder.toString();
  }

  @Override
  public void injectPlaceholder(MessageWrapper message) {
    message.replace("{core}", this.coreMessageValue);
  }
}
