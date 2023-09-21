// 継承についてのサンプルコード

fun main() {
    val pika = VariousPokemon("ピカチュウ", "でんき", "", 100) // 親クラスを継承した子クラスをインスタンス化
    val zeni = VariousPokemon("ゼニガメ", "みず", "", 80)

    println(pika.name)     // ピカチュウ
    println(pika.attack()) // ピカチュウ のこうげき!

    println(zeni.name)     // ピカチュウ
    println(zeni.attack()) // ピカチュウ のこうげき!
}

open class InheritPokemon ( // 継承する親クラスはopenにしておく必要がある
    val name: String,
    val type1: String,
    val type2: String,
    val hp: Int
){
    open fun attack() { // オーバーライドする場合は、関数をopenにしておく必要がある
        println("$name のこうげき!")
    }
}
class VariousPokemon( // 子クラス
    _name: String,
    _type1: String,
    _type2: String,
    _hp: Int
): InheritPokemon(_name, _type1, _type2, _hp) {
    override fun attack() { // attack関数をオーバーライドして別処理を上書きする
        println("$name の10万ボルト!")
    }
}

//val poke: Pikachu = Pikachu("ピカチュウ", "でんき", "", 100)
//val poke: Pokemon = Pikachu("ピカチュウ", "でんき", "", 100)
// 上記のようにpokeにはクラスを継承したすべてのクラスのインスタンスを入れられます。
// PikachuクラスでもZenigameクラスでもOk
// オーバーライドして処理を拡張することで同じメソッドでありながら異なるふるまいを実装することをポリモーフィズムと言います。
// open class (継承可) と final class (継承不可) のざっくりふたつがある