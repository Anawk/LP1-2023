import entity.Endereco;
import entity.Pedido;
import entity.Pessoa;
import entity.Produtos;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        
            Pessoa p1 = new Pessoa("Ana", "Maria", "aninhadograu@gmail.com", new Endereco("ppp", "João Pessoa"));
            Pessoa p2 = new Pessoa("Brenda", "Giron", "bbdofutivoli@gmail.com", new Endereco("ppp", "João Pessoa"));
            Pessoa p3 = new Pessoa("GuMelissa", "Emilia", "guemiliamatadordeonça@gmail.com", new Endereco("ppp", "João Pessoa"));
            Pessoa p4 = new Pessoa("Gabriel", "Luna", "lunesmaia@gmail.com", new Endereco("ppp", "João Pessoa"));
            Pessoa p5 = new Pessoa("Isa", "Pantufa", "pantufachocolateira@gmail.com", new Endereco("ppp", "João Pessoa"));
            Pessoa p6 = new Pessoa("Crestane", "Loira", "cretãoloirão@gmail.com", new Endereco("jose bonifacio", "Fortaleza"));


            Session session = HibernateUtil.getSessionFactory().openSession();

            Transaction transaction = session.beginTransaction();

            //salvou no banco de dados
            session.persist(p1);
            session.persist(p2);
            session.persist(p3);
            session.persist(p4);
            session.persist(p5);
            session.persist(p6);

            //fechar transação
            transaction.commit();

            List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();



            //iguais
            pessoas.forEach(p -> System.out.println(p.toString()));


        //iguaiss
        //for (Pessoa p: pessoas){
        //System.out.println(p.toString());
        // }



        Endereco e1 = new Endereco("joao augusto", "São Paulo");
        Endereco e2 = new Endereco("cataratas", "Foz do Iguaçu");
        Endereco e3 = new Endereco("paralela", "Salvador");
        Endereco e4 = new Endereco("paulo gustavo", "Rio de janeiro");
        Endereco e5 = new Endereco("oscar freire", "São Paulo");
        Endereco e6 = new Endereco("petronio portela", "Belo Horizonte");

        Session sessioon = HibernateUtil.getSessionFactory().openSession();

        Transaction transactioon = sessioon.beginTransaction();

        sessioon.persist(e1);
        sessioon.persist(e2);
        sessioon.persist(e3);
        sessioon.persist(e4);
        sessioon.persist(e5);
        sessioon.persist(e6);

        transactioon.commit();

        //List<Endereco> enderecos = sessioon.createQuery("from enderecos", Endereco.class).list();

         //enderecos.forEach(p -> System.out.println(p.toString()));


         Produtos prod1 = new Produtos("arroz", "200,00");
         Produtos prod2 = new Produtos("feijão", "500,00");
         List<Produtos> produtosList = new ArrayList<>();

         Session session1 = HibernateUtil.getSessionFactory().openSession();
         Transaction transaction1 = session1.beginTransaction();

         session1.persist(prod1);
         session1.persist(prod2);

        transaction1.commit();


        Pedido pedido1 = new Pedido(p2, Arrays.asList(prod1,prod2));

        Session session2 = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction2 = session2.beginTransaction();

        //session2.persist(pedido1);

//
//        Pedido d1 = new Pedido("Isadora",);
//         Pedido d2 = new Pedido();
//         Pedido d3 = new Pedido();
//         Pedido d4 = new Pedido();
//         Pedido d5 = new Pedido();
//         Pedido d6 = new Pedido();



}
}


