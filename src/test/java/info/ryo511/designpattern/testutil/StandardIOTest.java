package info.ryo511.designpattern.testutil;

import org.junit.jupiter.api.BeforeEach;

public class StandardIOTest {

  protected StandardInputStream in;
  protected StandardOutputStream out;

  @BeforeEach
  public void beforeEach() {
    in = new StandardInputStream();
    out = new StandardOutputStream();
    System.setIn(in);
    System.setOut(out);
  }

}
