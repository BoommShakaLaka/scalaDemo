package basicGrammar

import org.junit.Test

class ClassDemoTest {
  @Test
  def test1(): Unit = {
    var classDemo = new ClassDemo(1, 2);
    classDemo.move(10, 10);
  }
}
