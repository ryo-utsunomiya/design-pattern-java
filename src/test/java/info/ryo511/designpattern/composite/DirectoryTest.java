package info.ryo511.designpattern.composite;

import static org.junit.jupiter.api.Assertions.*;

import info.ryo511.designpattern.testutil.StandardIOTest;
import org.junit.jupiter.api.Test;

class DirectoryTest extends StandardIOTest {

  @Test
  void test() {
    var rootDir = new Directory("root");
    var binDir = new Directory("bin");
    rootDir.add(binDir);
    binDir.add(new File("vi", 10000));
    binDir.add(new File("latex", 20000));
    rootDir.printList();
    assertEquals("/root (30000)", out.readLine());
    assertEquals("/bin (30000)", out.readLine());
    assertEquals("/vi (10000)", out.readLine());
    assertEquals("/latex (20000)", out.readLine());
  }
}