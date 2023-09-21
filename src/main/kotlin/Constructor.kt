// コンストラクタについてのサンプルコード

fun main() {
    val poke = TryConstructorPokemon("ピカチュウ") // インスタンス化 nameの初期値を設定
    println(poke.name)    // ピカチュウ

    val pika = TryAttackConstructorPokemon("ピカチュウ", "でんき", "", 200) // インスタンス化 nameの初期値を設定
    println(pika.name)    // ピカチュウ
    println(pika.type1)    // でんき
    println(pika.type2)    //
    println(pika.hp)    // 200
}

class TryConstructorPokemon {
    val name: String

    constructor(_name: String) { // 初期値として設定したピカチュウを流し込む
        name = _name //nameにピカチュウを代入して返す
    }
}

class TryAttackConstructorPokemon(
    val name: String,
    val type1: String,
    val type2: String,
    val hp: Int
) {
    fun attack() {
        println("$name のこうげき！")
    }
}