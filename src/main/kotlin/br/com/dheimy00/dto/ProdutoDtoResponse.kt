package br.com.dheimy00.dto

data class ProdutoDtoResponse(
    val idProduto: String,
    val nome: String,
    val preco: Double,
    val quantidade: Int,
    val descricao: String
) {}