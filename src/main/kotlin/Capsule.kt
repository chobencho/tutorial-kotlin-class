// カプセル化についてのサンプルコード

fun main() {
    val pokemon = ConcretePokemon() // インスタンスを生成　抽象クラスはインスタンス化できないため子クラスのConcretePokemonをインスタンス化
    pokemon.changeName("テキセツ")
    println(pokemon.getName())     // テキセツ

    pokemon.changeName("うんこ")   // 「不適切な名前です」
    println(pokemon.getName())     // テキセツ のまま

    pokemon.changeName("ぴかちゅう")   //
    println(pokemon.getName())     // ぴかちゅう
}

abstract class Pokemon2 { // 抽象クラス
    private var name: String = "" // privateにしてnameを隠蔽
    abstract val type1: String
    abstract val type2: String
    abstract val hp: Int

    abstract fun attack()

    fun changeName(newName: String) {
        // 不適切な名前はエラー
        if (newName == "うんこ") {
            print("不適切な名前です")
            return
        }
        this.name = newName
    }

    fun getName(): String {
        return this.name
    }
}

class ConcretePokemon : Pokemon2() {
    override val type1: String = "SomeType1"
    override val type2: String = "SomeType2"
    override val hp: Int = 100

    override fun attack() {
        println("${super.getName()} の10万ボルト!")
    }
}
