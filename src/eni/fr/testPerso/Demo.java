package eni.fr.testPerso;

import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		Restaurant resto = new Restaurant();
		
		Clients toto = new Clients("toto",150);
		Clients tutu = new Clients("tutu",15);
		Clients tata = new Clients("tata",35);
		Clients titi = new Clients("titi",50);
		
		resto.getLstClient().add(toto);
		resto.getLstClient().add(tutu);
		resto.getLstClient().add(tata);
		resto.getLstClient().add(titi);
		
		System.out.println("Liste de client dans le restaurant"+resto.getLstClient());
		
		System.out.println("Le premier Stream");
		resto.getLstClient().stream()								//je stream donc la liste des clients
		.filter(v->v.getMontantCmd()>10 && v.getMontantCmd()<50)	//(un peut Équivalent au where en sql) je filtre que ceux qui ont payés plus de 10€ mais quand même moi de 50€
		.map(v->v.getNom())											//(un peut Équivalent au select en sql) je garde que leur nom
		.forEach(System.out::println);								//je fais une boucle foreach et pour chaque ligne je fais un affichage console
		
		//récupère la liste des NOMS de client(map) qui ont payés plus de 10€ et moins de 50€(filter) et le stock dans une list
		System.out.println("Le second Stream");
		List<String> a = resto.getLstClient().stream()				//je stream la liste des client
		.filter(v->v.getMontantCmd()>10 && v.getMontantCmd()<50)	//je ne prend que ceux qui on payÃ© + de 10 et - de 50 ICI v est notre client
		.map(v->v.getNom())											//je récup que les nom
		.collect(Collectors.toList());								//je stock dans une list (a ici)
		
		System.out.println(a);
	}

}
