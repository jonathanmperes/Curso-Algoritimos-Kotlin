fun testaMenorPreco() {
    val produtos = arrayOf<Produto>(
        Produto(nome = "Lamborguini", preco = 1000000.0),
        Produto(nome = "Jipe", preco = 46000.0),
        Produto(nome = "Brasília", preco = 16000.0),
        Produto(nome = "Smart", preco = 46000.0),
        Produto(nome = "Fusca", preco = 17000.0)
    )
    var maisBarato = maisBarato(produtos)
    println(maisBarato)

    produtos.forEach { produto ->
        if (produto.preco < maisBarato) {
            produto.preco.also { maisBarato = it }
        }
    }
    println(maisBarato)
}

fun maisBarato(produtos: Array<Produto>): Double {
    var maisBarato = Double.MAX_VALUE
    for (produto in produtos) {
        if (produto.preco < maisBarato) {
            maisBarato = produto.preco
        }
    }
    return maisBarato
}