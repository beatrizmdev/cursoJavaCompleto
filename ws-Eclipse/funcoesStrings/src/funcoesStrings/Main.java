package funcoesStrings;

public class Main {

	public static void main(String[] args) {
		
		String original = " abcde FGHIJ ABC abc DEFG    ";
		System.out.println("Original: -" + original + "-");
		
		// -> minúsculo ------------------------------------------------------------------
		
		String s01 = original.toLowerCase();
		System.out.println("Minúsculo: -" + s01 + "-");
		
		// -> maiúsculo ------------------------------------------------------------------
		String s02 = original.toUpperCase();
		System.out.println("Maiúsculo: -" + s02 + "-");	
		
		// -> eliminar espaços no início e fim -------------------------------------------
		String s03 = original.trim();
		System.out.println("Trim: -" + s03 + "-");
		
		// -> gera string a partir de um caractere específico em diante ------------------
		String s04 = original.substring(2);
		System.out.println("Substring(2): -" + s04 + "-");

		// -> gera string a partir de um caractere específico e até outro específico -----
		String s05 = original.substring(2, 9); // do 2 até o 8
		System.out.println("Substring(2, 9): -" + s05 + "-");
		
		// -> localizar e substituir -----------------------------------------------------
		String s06 = original.replace('a', 'x');
		System.out.println("Replace('a', 'x'): -" + s06 + "-");
		
		// -> localizar e substituir em substrings ---------------------------------------
		String s07 = original.replace("abc", "xy");
		System.out.println("Replace(\"abc\", \"xy\"): -" + s07 + "-");
		
		// -> pegar a primeira posição de uma substring ----------------------------------
		int s08 = original.indexOf("bc");
		System.out.println("indexOf(\"bc\"): -" + s08 + "-");
		
		// -> pegar a última posição de uma substring ------------------------------------
		int s09 = original.lastIndexOf("bc");
		System.out.println("lastIndexOf(\"bc\"): -" + s09 + "-");
		
		
		// recortar uma string - função split()
		String s = "potato apple lemon";
		
		String[] vect = s.split(" "); //usando o espaço em branco como separador
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(s);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}