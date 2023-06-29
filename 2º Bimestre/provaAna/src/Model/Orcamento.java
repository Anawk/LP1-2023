package Model;

import Repository.ExibirInterface;
import java.util.ArrayList;
import java.util.List;
import Model.ItemPedido;





    public class Orcamento implements ExibirInterface {

      private static long idBase;
      private long id;
      List<ItemPedido> itens = new ArrayList<>();
      private double valorTotal;


      @Override
      public void exibir(boolean completa) {
         if (completa){
            System.out.println("Orcamento: " + id);
            System.out.println("Itens:");
            for (ItemPedido item : itens) {
               System.out.printf("- %s, %s, %s, R$%f", item.getPeca(), item.getModelo(), item.getTamanho(), item.getValor());
            }
            System.out.println("Valor Total: R$" + valorTotal);
         }
         else{
            System.out.printf("%d, R$%f", id, valorTotal);
         }
         System.out.println();
      }



      public void addItem(ItemPedido itemPedido) {
         itens.add(itemPedido);
         valorTotal += itemPedido.getValor();
      }

      public void removerItem(ItemPedido itemPedido, long idPedido) throws RuntimeException {
         if (!itens.contains(idPedido))
            throw new RuntimeException("O item que você deseja remover não foi encontrado!");

         itens.remove(idPedido);
         valorTotal -= itemPedido.getValor();
      }

     //construtor
      public Orcamento() {
         id = idBase++;
      }

      //getters e setters
      public static long getIdBase() {
         return idBase;
      }

      public static void setIdBase(long idBase) {
         Orcamento.idBase = idBase;
      }

      public long getId() {
         return id;
      }

      public void setId(long id) {
         this.id = id;
      }

      public List<ItemPedido> getItens() {
         return itens;
      }

      public void setItens(List<ItemPedido> itens) {
         this.itens = itens;
      }

      public double getValorTotal() {
         return valorTotal;
      }

      public void setValorTotal(double valorTotal) {
         this.valorTotal = valorTotal;
      }
   }
