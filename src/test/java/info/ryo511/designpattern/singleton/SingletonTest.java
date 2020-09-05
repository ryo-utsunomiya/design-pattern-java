package info.ryo511.designpattern.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {

  @Test
  public void instanceIsSame() {
    assertSame(Singleton.INSTANCE, Singleton.INSTANCE);
  }
}