public class Clientes {
    public String nomecliente,CPF,tel;

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Clientes(String nomecliente, String CPF, String tel){
        this.CPF=CPF;
        this.tel=tel;
        this.nomecliente=nomecliente;



    }

    public void dadoscliente(){
        System.out.println("Dados do cliente: ");
        System.out.println("Nome: "+ this.nomecliente+ " CPF: "+ this.CPF+ " Telefone: "+ this.tel);
        System.out.println("");
    }

}
