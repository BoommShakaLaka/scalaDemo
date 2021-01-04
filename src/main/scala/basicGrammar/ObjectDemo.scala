package basicGrammar


object ObjectDemo {
  var x: Int = 1
  var y: Int = 2

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("x 的坐标点：" + x);
    println("Y 的坐标点：" + y);
  }

  def test1(): Unit = {
    print("ddd")
  }
}
