package org.example;


import lombok.Getter;
import lombok.Setter;

public class Produto {

    @Getter
    @Setter
    private Double Preco;
    @Getter
    @Setter
    private String Descricao;

    private Burguer burguer;

    private Bebida bebida;

    private Sobremesa sobremesa;

    private Fritas fritas;


    @Override
    public String toString() {
        return "Produto: " +
                "\nPreco= " + "R$" + Preco +
                "\nDescricao: " + Descricao +
                "\nburguer=" + burguer.getGramas() + "g" +
                "\nbebida=" + bebida.getQuantidadeBebida() + "ml" +
                "\nsobremesa=" + sobremesa.getTamanhoSobremesa() +
                "\nfritas=" + fritas.getTamanhoFritas() + "g";
    }


    public Produto() {
       burguer = new Burguer();
       bebida = new Bebida();
       sobremesa = new Sobremesa();
       fritas = new Fritas();
    }



    public Produto ComboSaciado(Produto produto) {
        produto.setPreco(80.00);
        produto.setDescricao("Hambúrguer bom demais brother, muita preguiça pra fazer a descrição, pede que é bom, tmj");
        produto.burguer.setGramas(180);
        produto.bebida.setQuantidadeBebida(150);
        produto.sobremesa.setTamanhoSobremesa("Uma fatia");
        produto.fritas.setTamanhoFritas(150);
        return produto;


    }

    public Produto ComboPassarMal(Produto produto) {
        produto.setPreco(100.00);
        produto.setDescricao("Mano, to com preguica, eu podia pegar do chat mas não to a fim, pede que é bom, tmj");
        produto.burguer.setGramas(180);
        produto.bebida.setQuantidadeBebida(150);
        produto.sobremesa.setTamanhoSobremesa("Duas fatia");
        produto.fritas.setTamanhoFritas(150);
        return produto;
    }

    public Produto ComboTigrinho(Produto produto) {;
        produto.setPreco(200.00);
        produto.setDescricao("Esse combo é brabo tá, se voce usar meu codigo no tigre já vem com 60% de desconto, só me manda um print");
        produto.burguer.setGramas(180);
        produto.bebida.setQuantidadeBebida(150);
        produto.sobremesa.setTamanhoSobremesa("Duas fatia");
        produto.fritas.setTamanhoFritas(150);
        return produto;
    }

    public Produto ComboDavi(Produto produto) {
        produto.setPreco(100.00);
        produto.setDescricao("Esse foi em homenagem a mim, embora o codigo esteja ruim");
        produto.burguer.setGramas(180);
        produto.bebida.setQuantidadeBebida(150);
        produto.sobremesa.setTamanhoSobremesa("tres fatias");
        produto.fritas.setTamanhoFritas(150);
        return produto;
    }




    public void MostrarProduto(int EscolhaUsuario, Produto produto) {
        switch(EscolhaUsuario) {
            case 1:
                System.out.println(ComboSaciado(produto));
                break;
            case 2:
                 System.out.println(ComboPassarMal(produto));
                break;
            case 3:
                System.out.println(ComboTigrinho(produto));
                break;
            case 4:
                System.out.println(ComboDavi(produto));
                break;

        }
    }

    public void ComprarProduto(int EscolhaUsuario) {
        switch(EscolhaUsuario) {
            case 1, 3, 2, 4:
                System.out.println("\nBoa rapa, um dia eu guardo isso no Database e continuo o resto, tmj valeu por vir até aqui e o codigo tá um lixo");
                break;

        }
    }
    }


