package info.ryo511.designpattern.chainofresponsibility;

import static org.junit.jupiter.api.Assertions.*;

import info.ryo511.designpattern.testutil.StandardIOTest;
import org.junit.jupiter.api.Test;

class SupportTest extends StandardIOTest {

  @Test
  void test() {
    var alice = new NoSupport("Alice");
    var bob = new LimitSupport("Bob", 100);
    var charlie = new SpecialSupoort("Charlie", 100);
    var diana = new OddSupport("Elmo");
    alice.setNext(bob).setNext(charlie).setNext(diana);
    alice.support(new Trouble(0));
    alice.support(new Trouble(100));
    alice.support(new Trouble(101));
    alice.support(new Trouble(102));
    assertEquals("[Trouble 0] is resolved by [Bob].", out.readLine());
    assertEquals("[Trouble 100] is resolved by [Charlie].", out.readLine());
    assertEquals("[Trouble 101] is resolved by [Elmo].", out.readLine());
    assertEquals("[Trouble 102] is cannot be resolved.", out.readLine());
  }
}