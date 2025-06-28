
public class Quick {
	public static void quicksort( int[] vetor, int inicio, int fim ) {
		if( inicio < fim ) {
			int pivo = dividir( vetor, inicio, fim );
			quicksort( vetor , inicio , pivo - 1);
			quicksort( vetor, pivo + 1, fim);
		}
	}

	public static int dividir( int[] vetor, int inicio, int fim ) {
		int pivot = vetor[ fim ];
		int i = inicio - 1;

		for( int j = inicio; j < fim; j++ ) { 
			if( vetor[ j ] <= pivot ) {
				i = i + 1;
				int temp = vetor[ i ];
				vetor[ i ] = vetor[ j ];
				vetor[ j ] = temp;
			}
		}
		
		int temp = vetor[ i + 1 ];
		vetor[ i + 1 ] = vetor[ fim ];
		vetor[ fim ] = temp;

		return i + 1;
	}

	public static void main( String[] args ) {
		int[] vetor = {9, 1, 3, 5, 7, 8, 6, 0, 2, 4};

		quicksort( vetor, 0, vetor.length - 1 );

		for( int i = 0; i < vetor.length; i++ ) {
			System.out.println( "Vetor: "+ vetor[ i ] );
		}
	}	
}