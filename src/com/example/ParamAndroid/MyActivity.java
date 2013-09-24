package com.example.ParamAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
 * User: rober
 * Date: 22/09/13
 * Time: 11:13 PM
 * Actividad principal, es lo primero que el usuario ejecuta debe mostrar la vista main
 */
public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //Asignar los objetos de la vista a objetos java para manipularlos
        final EditText texto = (EditText)findViewById(R.id.txtEscrito);
        final Button enviar = (Button)findViewById(R.id.btnEnviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, NuevaVentana.class);
                Bundle bundle = new Bundle();
                bundle.putString("Parametro",texto.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
