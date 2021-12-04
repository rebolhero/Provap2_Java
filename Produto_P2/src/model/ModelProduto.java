package model;
/**
*
* @author julio
*/
public class ModelProduto {

    protected int id;
    protected String cod;
    protected String status;
    protected String nome;
    protected String descricao;
    protected int qtd_estoque;
    protected int estoque_minimo;
    protected int estoque_maximo;
    protected double preco_compra;
    protected double preco_venda;
    protected long bar_code;
    protected long ncm;
    protected double fator;
    protected String data_cadastro;
    protected String imagem;

    /**
    * Construtor
    */
    public ModelProduto(){}

    /**
    * seta o valor de id
    * @param pId
    */
    public void setId(int pId){
        this.id = pId;
    }
    /**
    * @return pk_id
    */
    public int getId(){
        return this.id;
    }

    /**
    * seta o valor de cod
    * @param pCod
    */
    public void setCod(String pCod){
        this.cod = pCod;
    }
    /**
    * @return cod
    */
    public String getCod(){
        return this.cod;
    }

    /**
    * seta o valor de status
    * @param pStatus
    */
    public void setStatus(String pStatus){
        this.status = pStatus;
    }
    /**
    * @return status
    */
    public String getStatus(){
        return this.status;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * @return nome
    */
    public String getNome(){
        return this.nome;
    }

    /**
    * seta o valor de descricao
    * @param pDescricao
    */
    public void setDescricao(String pDescricao){
        this.descricao = pDescricao;
    }
    /**
    * @return descricao
    */
    public String getDescricao(){
        return this.descricao;
    }

    /**
    * seta o valor de qtd_estoque
    * @param pQtd_estoque
    */
    public void setQtd_estoque(int pQtd_estoque){
        this.qtd_estoque = pQtd_estoque;
    }
    /**
    * @return qtd_estoque
    */
    public int getQtd_estoque(){
        return this.qtd_estoque;
    }

    /**
    * seta o valor de estoque_minimo
    * @param pEstoque_minimo
    */
    public void setEstoque_minimo(int pEstoque_minimo){
        this.estoque_minimo = pEstoque_minimo;
    }
    /**
    * @return estoque_minimo
    */
    public int getEstoque_minimo(){
        return this.estoque_minimo;
    }

    /**
    * seta o valor de estoque_maximo
    * @param pEstoque_maximo
    */
    public void setEstoque_maximo(int pEstoque_maximo){
        this.estoque_maximo = pEstoque_maximo;
    }
    /**
    * @return estoque_maximo
    */
    public int getEstoque_maximo(){
        return this.estoque_maximo;
    }

    /**
    * seta o valor de preco_compra
    * @param pPreco_compra
    */
    public void setPreco_compra(double pPreco_compra){
        this.preco_compra = pPreco_compra;
    }
    /**
    * @return preco_compra
    */
    public double getPreco_compra(){
        return this.preco_compra;
    }

    /**
    * seta o valor de preco_venda
    * @param pPreco_venda
    */
    public void setPreco_venda(double pPreco_venda){
        this.preco_venda = pPreco_venda;
    }
    /**
    * @return preco_venda
    */
    public double getPreco_venda(){
        return this.preco_venda;
    }

    /**
    * seta o valor de bar_code
    * @param pBar_code
    */
    public void setBar_code(long pBar_code){
        this.bar_code = pBar_code;
    }
    /**
    * @return bar_code
    */
    public long getBar_code(){
        return this.bar_code;
    }

    /**
    * seta o valor de ncm
    * @param pNcm
    */
    public void setNcm(long pNcm){
        this.ncm = pNcm;
    }
    /**
    * @return ncm
    */
    public long getNcm(){
        return this.ncm;
    }

    /**
    * seta o valor de fator
    * @param pFator
    */
    public void setFator(double pFator){
        this.fator = pFator;
    }
    /**
    * @return fator
    */
    public double getFator(){
        return this.fator;
    }

    /**
    * seta o valor de data_cadastro
    * @param pData_cadastro
    */
    public void setData_cadastro(String pData_cadastro){
        this.data_cadastro = pData_cadastro;
    }
    /**
    * @return data_cadastro
    */
    public String getData_cadastro(){
        return this.data_cadastro;
    }

    /**
    * seta o valor de imagem
    * @param pImagem
    */
    public void setImagem(String pImagem){
        this.imagem = pImagem;
    }
    /**
    * @return imagem
    */
    public String getImagem(){
        return this.imagem;
    }

    @Override
    public String toString(){
        return "ModelProduto {" + "::id = " + this.id + "::cod = " + this.cod + "::status = " + this.status + "::nome = " + this.nome + "::descricao = " + this.descricao + "::qtd_estoque = " + this.qtd_estoque + "::estoque_minimo = " + this.estoque_minimo + "::estoque_maximo = " + this.estoque_maximo + "::preco_compra = " + this.preco_compra + "::preco_venda = " + this.preco_venda + "::bar_code = " + this.bar_code + "::ncm = " + this.ncm + "::fator = " + this.fator + "::data_cadastro = " + this.data_cadastro + "::imagem = " + this.imagem +  "}";
    }
}