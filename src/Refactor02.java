/**
 * Ejemplo de código Extraer funcionalidad
 * 
 * @author      Paco Gomez <fjgomez@florida-uni.es>
 * @version     1.0 
 * @since       1.2          (the version of the package this class was first added to)
 */
public class Refactor02 {

	public static void main(String[] args) {
		//Tenemos los arrays de goles marcados por jugador y partido
		int[] jugador1={2,5,3,0,1};
		int[] jugador2={1,1,3,1,4};
		int[] jugador3={1,0,2,1,0};
		

		//Calculamos la media geométrica para el primer jugador
		calculaMedia(jugador1,"1");
		//Calculamos la media geométrica para el segundo jugador
		calculaMedia(jugador2,"2");
		//Calculamos la media geométrica para el tercer jugador
		calculaMedia(jugador3,"3");
	}
	public static void calculaMedia(int[] jugador, String sjug){
		float resultado=0;
		for(int i=0;i<jugador.length;i++)
		{
			resultado=resultado+jugador[i];
		}
		resultado=resultado/jugador.length;
		System.out.println("La media de goles del jugador "+sjug+" es: "+resultado);
		resultado=0;
	}

}
