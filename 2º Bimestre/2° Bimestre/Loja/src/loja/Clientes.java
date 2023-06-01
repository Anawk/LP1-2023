package loja;

public class Clientes {
    private String nomecliente,CPF, tel ;

    public Clientes(String nomecliente, String CPF, String tel) {
        this.nomecliente = nomecliente;
        this.CPF = CPF;
        this.tel = tel;
    }



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

    public void dadoscliente(){
        System.out.println("Dados do cliente: ");
        System.out.println("Nome: "+ this.nomecliente+ " CPF: "+ this.CPF+ " Telefone: "+ this.tel);
        System.out.println("");
    }
}