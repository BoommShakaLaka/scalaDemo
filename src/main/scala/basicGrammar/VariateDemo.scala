package basicGrammar

object VariateDemo {
  var v1: Byte = 127 // 8位有符号补码整数。数值区间为 -128 到 127
  var v2: Short = 32767 // 16位有符号补码整数。数值区间为 -32768 到 32767
  var v3: Int = 2147483647 // 32位有符号补码整数。数值区间为 -2147483648 到 2147483647
  var v4: Long = -9223372036854775808L // 64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807
  var v5: Float = 3.5f // 32 位, IEEE 754 标准的单精度浮点数
  var v6: Double = 1.3 // 64 位 IEEE 754 标准的双精度浮点数
  var v7: Char = 'C' // 16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF
  var v8: String = "Foo" // 字符序列
  var v9: Unit = () // 表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
  var v10: Null = null // null 或空引用
  //  var v11: Nothing =   // Nothing类型在Scala的类层级的最底端；它是任何其他类型的子类型。
  var v12: Any = 1 // Any是所有其他类的超类
  //  var v13:AnyRef  // AnyRef类是Scala里所有引用类(reference class)的基类
}
