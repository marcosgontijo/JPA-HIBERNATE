package aplicacao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		
		
//Conexão com banco de dados atraves de EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

// <!-- Usando o "find" para buscar entidade no banco de dados" --!/>		
//		Pessoa p = em.find(Pessoa.class, 2);
//		System.out.println(p);
		
// Objetos instanciado para criacao de volume no banco de dados.
		
//		Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
//		Pessoa p2 = new Pessoa(2, "Joaquim Torres", "joaquim@gmail.com");
//		Pessoa p3 = new Pessoa(3, "Ana Maria", "ana@gmail.com");
		
//em.persist + a instancia criada, para adicionar a criacacao dos volumes no banco de dados, e necessario criar uma transacao antes e fechar ele para o CRUD no Banco;		
	
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
//		
		System.out.println("Pronto");
		em.close();
		emf.close();
		
		

	}

}
