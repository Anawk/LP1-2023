public class Loja {
   public String nomeloja, dona, produtos;

    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public String getDona() {
        return dona;
    }

    public void setDona(String dona) {
        this.dona = dona;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public Loja(String nomeloja, String dona, String produtos){
        System.out.println("Dados da loja:");
        this.dona=dona;
        this.nomeloja=nomeloja;
        this.produtos=produtos;
    }

    public void loja(){
        System.out.println("Nome da loja: "+ this.nomeloja+ "  || Dona:" + this.dona +"  || Produtos: " + this.produtos );
        System.out.println("");
    }

}
