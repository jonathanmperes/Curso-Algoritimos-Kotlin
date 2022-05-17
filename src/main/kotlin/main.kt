fun main() {

    val produtos = arrayOf<Produto>(
        Produto(nome = "Lamborguini", preco = 1000000.0),
        Produto(nome = "Jipe", preco = 46000.0),
        Produto(nome = "Brasília", preco = 16000.0),
        Produto(nome = "Smart", preco = 46000.0),
        Produto(nome = "Fusca", preco = 17000.0)
    )

    val sortedBy = produtos.sortedBy { it.preco }

    sortedBy.forEach { produto ->
        println("${produto.nome} custa ${produto.preco}")
    }
}

