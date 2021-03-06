fun overloadFun(p: Int, q: Long) {}
fun overloadFun(p: String, q: Long) {}

fun interface Action<T, U> {
    fun bar(t: T, u: U)
}

fun <T, U> foo(a: Action<T, U>) {}

fun test() {
    foo {<caret> x: String, y: Long -> overloadFun(x, y) }
}