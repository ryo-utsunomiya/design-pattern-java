package info.ryo511.designpattern.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EffectiveBannerTest {

  @Test
  void weak() {
    var SUT = new EffectiveBanner("Hello");
    assertEquals("(Hello)", SUT.weak());
  }

  @Test
  void strong() {
    var SUT = new EffectiveBanner("Hello");
    assertEquals("*Hello*", SUT.strong());
  }
}