import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso Java");
		curso1.setCargaHoraria(10);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JS");
		curso2.setDescricao("Curso JS");
		curso2.setCargaHoraria(5);		
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Java");
		mentoria1.setDescricao("Mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Java & JS");
		bootcamp.setDescricao("Bootcamp Dio");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dev1 = new Dev();
		dev1.setNome("Douglas");
		dev1.increverBootcamp(bootcamp);
		System.out.println("Dev Inscrito em  " + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("-");
		System.out.println("Dev Inscrito em  " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos:  " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println("***********************************************");
		
		Dev dev2 = new Dev();
		dev2.setNome("Pedro");
		dev2.increverBootcamp(bootcamp);
		System.out.println("Dev Inscrito em  " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		System.out.println("-");
		System.out.println("Dev Inscrito em  " + dev2.getConteudosInscritos());
		System.out.println("XP: " + dev2.calcularTotalXp());
		System.out.println("Conteúdos Concluidos:  " + dev2.getConteudosConcluidos());
		
		/*System.out.println(curso1);
		System.out.println(mentoria1);*/
		
		

	}

}
