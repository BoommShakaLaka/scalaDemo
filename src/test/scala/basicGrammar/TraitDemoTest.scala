package basicGrammar

import org.junit.Test

class TraitDemoTest {
  @Test
  def test1(): Unit = {
    def td = new TraitDemo

    td.DemoShow()
    td.demoShow1()
    td.demoShow2()
  }
}
