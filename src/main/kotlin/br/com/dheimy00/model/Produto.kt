package br.com.dheimy00.model


import javax.persistence.*

@Entity
data class Produto(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: String?,

    @Column(name = "id_produto", updatable = false, unique = true, nullable = false)
    var idProduto : String,

    @Column(name = "nome",nullable = false)
    var nome: String,

    @Column(name = "preco",nullable = false)
    var preco: Double,

    @Column(name = "quantidade",nullable = false)
    var quantidade: Int,

    @Column(name = "descricao",nullable = false)
    var descricao: String,

) {}
