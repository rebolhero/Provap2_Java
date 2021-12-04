package DAO;

import model.ModelProduto;
import conexao.ConexaoMySql;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
*
* @author julio
*/
public class DAOProduto extends ConexaoMySql {

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public int salvarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO produto ("                   
                    + "cod,"
                    + "stat,"
                    + "nome,"
                    + "descricao,"
                    + "qtd_estoque,"
                    + "estoque_minimo,"
                    + "estoque_maximo,"
                    + "preco_compra,"
                    + "preco_venda,"
                    + "bar_code,"
                    + "ncm,"
                    + "fator,"
                    + "data_cadastro,"
                    + "imagem"
                + ") VALUES ("                    
                    + "'" + pModelProduto.getCod() + "',"
                    + "'" + pModelProduto.getStatus() + "',"
                    + "'" + pModelProduto.getNome() + "',"
                    + "'" + pModelProduto.getDescricao() + "',"
                    + "'" + pModelProduto.getQtd_estoque() + "',"
                    + "'" + pModelProduto.getEstoque_minimo() + "',"
                    + "'" + pModelProduto.getEstoque_maximo() + "',"
                    + "'" + pModelProduto.getPreco_compra() + "',"
                    + "'" + pModelProduto.getPreco_venda() + "',"
                    + "'" + pModelProduto.getBar_code() + "',"
                    + "'" + pModelProduto.getNcm() + "',"
                    + "'" + pModelProduto.getFator() + "',"
                    + "'" + pModelProduto.getData_cadastro() + "',"
                    + "'" + pModelProduto.getImagem() + "'"
                + ");"
            ); 
            
            
        }catch(Exception e){
            e.printStackTrace();
            
            JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar o Produto");
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Produto
    * @param pId
    * @return ModelProduto
    */
    public ModelProduto getProdutoDAO(int pId){
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id,"
                    + "cod,"
                    + "stat,"
                    + "nome,"
                    + "descricao,"
                    + "qtd_estoque,"
                    + "estoque_minimo,"
                    + "estoque_maximo,"
                    + "preco_compra,"
                    + "preco_venda,"
                    + "bar_code,"
                    + "ncm,"
                    + "fator,"
                    + "data_cadastro,"
                    + "imagem"
                 + " FROM"
                     + " produto"
                 + " WHERE"
                     + " pk_id = '" + pId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setCod(this.getResultSet().getString(2));
                modelProduto.setStatus(this.getResultSet().getString(3));
                modelProduto.setNome(this.getResultSet().getString(4));
                modelProduto.setDescricao(this.getResultSet().getString(5));
                modelProduto.setQtd_estoque(this.getResultSet().getInt(6));
                modelProduto.setEstoque_minimo(this.getResultSet().getInt(7));
                modelProduto.setEstoque_maximo(this.getResultSet().getInt(8));
                modelProduto.setPreco_compra(this.getResultSet().getDouble(9));
                modelProduto.setPreco_venda(this.getResultSet().getDouble(10));
                modelProduto.setBar_code(this.getResultSet().getInt(11));
                modelProduto.setNcm(this.getResultSet().getInt(12));
                modelProduto.setFator(this.getResultSet().getDouble(13));
                modelProduto.setData_cadastro(this.getResultSet().getString(14));
                modelProduto.setImagem(this.getResultSet().getString(15));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
    * recupera uma lista de Produto
        * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoDAO(){
        ArrayList<ModelProduto> listamodelProduto = new ArrayList();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id,"
                    + "cod,"
                    + "stat,"
                    + "nome,"
                    + "descricao,"
                    + "qtd_estoque,"
                    + "estoque_minimo,"
                    + "estoque_maximo,"
                    + "preco_compra,"
                    + "preco_venda,"
                    + "bar_code,"
                    + "ncm,"
                    + "fator,"
                    + "data_cadastro,"
                    + "imagem"
                 + " FROM"
                     + " produto"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setCod(this.getResultSet().getString(2));
                modelProduto.setStatus(this.getResultSet().getString(3));
                modelProduto.setNome(this.getResultSet().getString(4));
                modelProduto.setDescricao(this.getResultSet().getString(5));
                modelProduto.setQtd_estoque(this.getResultSet().getInt(6));
                modelProduto.setEstoque_minimo(this.getResultSet().getInt(7));
                modelProduto.setEstoque_maximo(this.getResultSet().getInt(8));
                modelProduto.setPreco_compra(this.getResultSet().getDouble(9));
                modelProduto.setPreco_venda(this.getResultSet().getDouble(10));
                modelProduto.setBar_code(this.getResultSet().getInt(11));
                modelProduto.setNcm(this.getResultSet().getInt(12));
                modelProduto.setFator(this.getResultSet().getDouble(13));
                modelProduto.setData_cadastro(this.getResultSet().getString(14));
                modelProduto.setImagem(this.getResultSet().getString(15));
                listamodelProduto.add(modelProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE produto SET "
                    + "pk_id = '" + pModelProduto.getId() + "',"
                    + "cod = '" + pModelProduto.getCod() + "',"
                    + "stat = '" + pModelProduto.getStatus() + "',"
                    + "nome = '" + pModelProduto.getNome() + "',"
                    + "descricao = '" + pModelProduto.getDescricao() + "',"
                    + "qtd_estoque = '" + pModelProduto.getQtd_estoque() + "',"
                    + "estoque_minimo = '" + pModelProduto.getEstoque_minimo() + "',"
                    + "estoque_maximo = '" + pModelProduto.getEstoque_maximo() + "',"
                    + "preco_compra = '" + pModelProduto.getPreco_compra() + "',"
                    + "preco_venda = '" + pModelProduto.getPreco_venda() + "',"
                    + "bar_code = '" + pModelProduto.getBar_code() + "',"
                    + "ncm = '" + pModelProduto.getNcm() + "',"
                    + "fator = '" + pModelProduto.getFator() + "',"
                    + "data_cadastro = '" + pModelProduto.getData_cadastro() + "',"
                    + "imagem = '" + pModelProduto.getImagem() + "'"
                + " WHERE "
                    + "pk_id = '" + pModelProduto.getId() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Produto
    * @param pId
    * @return boolean
    */
    public boolean excluirProdutoDAO(int pId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM produto "
                + " WHERE "
                    + "pk_id = '" + pId + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}