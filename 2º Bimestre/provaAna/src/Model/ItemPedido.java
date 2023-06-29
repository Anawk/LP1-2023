package Model;

import Repository.ExibirInterface;


    public class ItemPedido implements ExibirInterface {
        private static long idBase;
        private long id;
        private String peca;
        private String modelo;
        private String tamanho;
        private double valor;


        @Override
        public void exibir(boolean completa) {
            if (completa){
                System.out.println("Item do pedido: " + id);
                System.out.println("Peça: " + peca);
                System.out.println("Modelo: " + modelo);
                System.out.println("Tamanho: " + tamanho);
                System.out.println("Valor: R$" + valor);
            }
            else{
                System.out.printf("%s, %s, %s, R$%f", peca, modelo, tamanho, valor);
            }
            System.out.println();
        }

        //construtor
        public ItemPedido(String peca, String modelo, String tamanho, double valor) {
            this.peca = peca;
            this.modelo = modelo;
            this.tamanho = tamanho;
            this.valor = valor;
            id = idBase++;
        }

        //getters e setters


        public static void setIdBase(long idBase) {
            ItemPedido.idBase = idBase;
        }

        public void setPeca(String peca) {
            this.peca = peca;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public static long getIdBase() {
            return idBase;
        }

        public long getId() {
            return id;
        }

        public String getPeca() {
            return peca;
        }

        public String getModelo() {
            return modelo;
        }

        public String getTamanho() {
            return tamanho;
        }

        public double getValor() {
            return valor;
        }


    }
