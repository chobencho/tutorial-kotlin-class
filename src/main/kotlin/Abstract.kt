// 抽象化についてのサンプルコード

fun main() {
    val pika = VariousAbstractPokemon("ピカチュウ", "でんき", "", 100)
    val zeni = VariousAbstractPokemon("ぜにがめ", "みず", "", 80)

    println(pika.attack()) // ピカチュウ の10万ボルト!
    println(zeni.attack()) // ピカチュウ の10万ボルト!
}

abstract class AbstractPokemon { // 抽象クラスはabstractを付ける
    abstract val name: String    // 抽象プロパティもabstractを付ける
    abstract val type1: String
    abstract val type2: String
    abstract val hp: Int

    open fun attack() {
        println("$name のこうげき！")
    }
}

class VariousAbstractPokemon(
    override val name: String,
    override val type1: String,
    override val type2: String,
    override val hp: Int
) : AbstractPokemon() {

    override fun attack() {
        super.attack()
        println("$name の10万ボルト!")
    }
}

// 抽象化クラスは自身ではインスタンス化できず、子クラスに継承することを前提としたクラス
// 抽象メソッドは必ずオーバーライドしなければならない。自身で値を持つことはできない
// クラスを抽象化しておくとプロパティやメソッドをオーバーライドしなければいけなくなるためルールを明確化できその後の開発が楽
// 開発初期、設計フェーズでよくつかわれる
// 抽象クラスとインターフェースの違い→インターフェースは、値を持てない、多重継承OK