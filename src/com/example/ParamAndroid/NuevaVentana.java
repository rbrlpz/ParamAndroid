package com.example.ParamAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * User: rober
 * Date: 22/09/13
 * Time: 11:13 PM
 * Actividad correspondiente a la nueva ventana la cual será llamada desde la actividad principal
 * Ésta actividad recibe un parámetro proveniente de la actividad anterior y será asignado a un elemento
 * de la vista.
 */
public class NuevaVentana extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nueva_ventana); //carga el layout nueva_ventana.xml existente en res/layouts
        TextView mensaje = (TextView)findViewById(R.id.Parametro); //asigna el objeto de la vista cuyo id es Parametro a un objeto de clase
        /*
        * La clase Bundle es literalmente un bulto de datos, dicho parametro se comunica desde la clase principal sobre el parametro Extras del Intent
        * Un Intent es una descripcion abstracta de una operacion a ser realizada es usada para lanzar actividades o enviar componentes que se
        * comuniquen en segundo plano
        * */
        Bundle bundle = getIntent().getExtras();
        /*
        Asignamos el parametro que se extrae del bundle al objeto tipo TextView
         */
        mensaje.setText(bundle.getString("Parametro"));
    }
}
