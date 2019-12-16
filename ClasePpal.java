import org.json.JSONArray;
import org.json.JSONObject;

public class ClasePpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub7
		String json="{\"partida\": {\"id\":21255,\"jugadores\":[{\"nombre\":\" CONSUELO\",\"asignatura\":\"Ciencias de la Naturaleza\",\"descripcion\":\"ACTIVIDAD SOBRE HABITOS SALUDABLES PARA NIÑOS DE PRIMARIA\",\"creador\":\"MARÍA LLANOS\",\"preguntas\":[{\"letra\":\"A\",\"posicion\":\"Empieza por\",\"definicion\":\"ACCIÓN PARA MANTENERSE LIMPIO\",\"solucion\":\"ASEARSE\"},{\"letra\":\"B\",\"posicion\":\"Empieza por\",\"definicion\":\"ACCIÓN DE METER EL CUERPO EN AGUA CON LA FINALIDAD DE LIMPIARSE\",\"solucion\":\"BAÑARSE\"},{\"letra\":\"C\",\"posicion\":\"Empieza por\",\"definicion\":\"ACCIÓN DE INGERIR ALIMENTOS \",\"solucion\":\"COMER\"},{\"letra\":\"D\",\"posicion\":\"Empieza por\",\"definicion\":\"ACTIVIDAD FISICA SUJETA A NORMAS DETERMINADAS DONDE SE PRUEBA LA DESTREZA Y HABILIDAD FISICA\",\"solucion\":\"DEPORTE\"},{\"letra\":\"F\",\"posicion\":\"Empieza por\",\"definicion\":\"ALIMENTO QUE DEBES COMER 5 PIEZAS DIARIA\",\"solucion\":\"FRUTA\"},{\"letra\":\"H\",\"posicion\":\"Empieza por\",\"definicion\":\"LIMPIEZA DE LAS PERSONAS PARA MANTENERSE SALUDABLES\",\"solucion\":\"HIGIENE\"},{\"letra\":\"L\",\"posicion\":\"Empieza por\",\"definicion\":\"ACCIÓN DE CEPILLAR LAS PIEZAS DENTALES\",\"solucion\":\"LAVARSE LOS DIENTES\"},{\"letra\":\"N\",\"posicion\":\"Empieza por\",\"definicion\":\"DEPORTE DE AGUA\",\"solucion\":\"NATACIÓN\"},{\"letra\":\"S\",\"posicion\":\"Empieza por\",\"definicion\":\"ACCIÓN DE MANTENER RELACIONES INTIMAS CON OTRA PERSONA \",\"solucion\":\"SEXO\"},{\"letra\":\"V\",\"posicion\":\"Empieza por\",\"definicion\":\"HORTALIZAS QUE POR LO GENERALMENTE SON DE COLOR VERDE\",\"solucion\":\"VEGETAL/VERDURA\"}]}]}}";
		JSONObject objeto_total=new JSONObject(json);
		JSONObject objeto_partida=objeto_total.getJSONObject("partida");
				JSONArray lista_jugadores=objeto_partida.getJSONArray("jugadores");
		for (int indice=0;indice<lista_jugadores.length(); indice++)
		{
			JSONObject objeto_jugador=(JSONObject)lista_jugadores.get(indice);
			String nombre=objeto_jugador.getString("nombre");
			System.out.println(nombre);
			JSONArray lista_preguntas=objeto_jugador.getJSONArray("preguntas");
			for (int indice_preguntas=0; indice_preguntas<lista_preguntas.length(); indice_preguntas++)
			{
				JSONObject objeto_pregunta=(JSONObject)lista_preguntas.get(indice_preguntas);
				String letra=objeto_pregunta.getString("letra");
				String posicion=objeto_pregunta.getString("posicion");
				String definicion=objeto_pregunta.getString("definicion");
				String solucion=objeto_pregunta.getString("solucion");
				System.out.println(letra+" "+posicion+" "+definicion+" "+solucion);
				
						}
		}
	}

}
