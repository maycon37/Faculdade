package com.teste.primeiroexemplo.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.teste.primeiroexemplo.model.Produto;

@Repository
public class ProdutoRepository {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

/**
 *  Metodo para retornar a lista de produtos
 * @return Lista de produtos.
 */
    public List<Produto> obterTodos(){
        return produtos;
    }
/**
 * Metodo que retorna o produto encontrado pelo seu Id.
 * @param id do produto que será localizado 
 * @return um produto caso tenha encotrado 
 */
    public Optional<Produto> obterPorId(Integer id){
        return produtos
            .stream()
            .filter(produto -> produto.getId() == id)
            .findFirst();
    }

    /**
     * Metodo para adicionar um produto na lista.
     * @param produto que sera adicionado.
     * @return Retorna o produto que foi adicionado na lista.
     */
    public Produto adicionar(Produto produto){
        ultimoId++;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
    }

    /**
     * Metodo para deletar o produto por id.
     * @param id do produto a ser deletado.
     */
    public void deletar(Integer id){
        produtos.removeIf(produto -> produto.getId() == id);
    }
    
/**
 * Metodo para atualizar o produto na lista
 * @param produto 
 * @return o produto atualizado
 */
    public Produto atualizar (Produto produto){
        // Encontrar o produto da lista
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());
        if(produtoEncontrado.isEmpty()){
            throw new InputMismatchException("Produto não encontrado");
        }
        // Preciso remover o produto antigo da lista.
        deletar(produto.getId());
        // Depois adicionar o novo produto atualizado na lista e sem alterar o Id.
        produtos.add(produto);
        
        return produto;
    }
}
