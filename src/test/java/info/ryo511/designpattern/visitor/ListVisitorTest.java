package info.ryo511.designpattern.visitor;

import static org.junit.jupiter.api.Assertions.*;

import info.ryo511.designpattern.testutil.StandardIOTest;
import org.junit.jupiter.api.Test;

class ListVisitorTest extends StandardIOTest {

  @Test
  public void test() {
    var rootDir = new Directory("root");
    var binDir = new Directory("bin");
    rootDir.add(binDir);
    binDir.add(new File("vi", 10000));
    binDir.add(new File("latex", 20000));
    rootDir.accept(new ListVisitor());
    assertEquals("/root (30000)", out.readLine());
    assertEquals("/root/bin (30000)", out.readLine());
    assertEquals("/root/bin/vi (10000)", out.readLine());
    assertEquals("/root/bin/latex (20000)", out.readLine());
  }
}