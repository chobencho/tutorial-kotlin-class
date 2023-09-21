// クラスについてサンプルコード

fun main() {
    val poke = Pokemon() // クラスをインスタンス化, オブジェクトが生成される

    println(poke.name)   // リザードン インスタンスからnameを取り出して表示
    println(poke.type1)  // ほのお
    poke.attack()        // リザードン のこうげき！　attack関数を実行
}

class Pokemon {
    val name: String = "リザードン"
    val type1: String = "ほのお"
    val type2: String = "ひこう"
    val hp: Int = 100

    fun attack() {
        println("$name のこうげき！")
    }
}

