package com.fabric.portfoliooverlap.model;

import com.fabric.portfoliooverlap.util.CommonUtils;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FundDetails {

  private List<Fund> funds;

  @Override
  public String toString() {
    return CommonUtils.convertToString(this);
  }
}
