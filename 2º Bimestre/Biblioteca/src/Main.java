
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Jade", new Dono("Sofia", "45435454634"));

       biblioteca.addLivros(new Livros("Salem", "Marina", 2008));

       //biblioteca.mostrarLivros();

        for (Livros livros: biblioteca.getLivros()) {
            System.out.println("Nome:" + livros.getNome());
        }
    }
}