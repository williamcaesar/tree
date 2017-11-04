package tree;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<String> mapaPercurso = new ArrayList<>();
	private static Scanner scan;
	public static int nivel = 0;
	public static boolean emLoop = true;
	public static int tmp = 0;

	public static void main(String[] args) {
		mapaPercurso.add("inicio");
		mapeia();
		chamaMapa(mapaPercurso);
		//gravaMapa(mapaPercurso);
	}

	public static void mapeia() {
		scan = new Scanner(System.in);
		String resposta, direcaoCorreta;
		System.out.println("NIVEL= " + nivel);
		while (true) {
			nivel++;
			System.out.println("indo ...");
			System.out.println("encontrou cor");
			System.out.println("vai pra que lado?");
			resposta = scan.nextLine();
			System.out.println("é a direção certa?");
			direcaoCorreta = scan.nextLine();
			System.out.println(direcaoCorreta);
			if (direcaoCorreta.equals("s")) {
				mapaPercurso.add(nivel + " " + resposta);
				mapeia();
			} else if (direcaoCorreta.equals("n")) {
				System.out.println("fail");
				nivel--;
				return;
			} else if (direcaoCorreta.equals("fim")) {
				emLoop = false;
				return;
			}
		}
	}

	public static void chamaMapa(ArrayList<String> mapa) {
		for (String s : mapa) {
			System.out.println(s);
		}
	}

	public static void gravaMapa(ArrayList<String> mapa) throws Throwable {
		for (String s : mapa) {
		 FileOutputStream fos = new FileOutputStream("t.tmp");
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeObject(s);
	        oos.close();
		}
	}
}
