package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Stream é uma solução para processar sequências de dados de forma:
		 *	- declarativa (iteração interna: escondida do programador)
		 *  - parallel-friendly (imutável -> thread safe) 
		 *  - sem efeitos colaterais
		 *  - sob demanda (lazy evaluation), os dados só são consumidos à medida que vão sendo necessários
		 *  - acesso sequencial (não há índices)
		 *  - single use (só pode ser usada uma vez)
		 *  
		 *  *Pipeline (linha de montagem): operações em streams retornam novas streams. Então é possível criar uma cadeia de operações (fluxo de processamento).
		 */
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		// criando a stream a partir da lista
		Stream<Integer> st1 = list.stream();
		
		System.out.println(Arrays.toString(st1.toArray())); // usando o toArray pra converter a Stream num Array e exibir na tela
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // método Stream.of permite adicionar os elementos diretamente na inicialização da Stream, entre os parênteses
		System.out.println(Arrays.toString(st2.toArray()));

		// método Stream.iterate: Stream.iterate(primeiro elemento da Stream, função de iteração e geração dos próximos elementos)
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // potencialmente infinita
		System.out.println(Arrays.toString(st3.limit(10).toArray())); // .limit está limitando pra n gerar infinitamente a Stream
		
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]); //.map aplica uma função a cada elemento da stream
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}	