package br.com.dheimy00.dto

data class UpdateProdutoDto(
    val idProduto: String?,
    val nome: String,
    val preco: Double,
    val quantidade: Int,
    val descricao: String
) {}