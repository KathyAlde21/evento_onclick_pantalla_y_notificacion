package cl.bootcamp.claseonclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    //aca declaro las variables y para eso llamo lo mismo que cree, ej: TexView tal cosa, etc
    //debo importarlas una vez que las creo con click derecho
    TextView mostrar;
    EditText texto;
    Button btnMostrar, btnNotificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //lee completo asi que puedo llamar directo el id


    //llamando variables => carpeta res representada en R y luego id porque ya estoy en activity_main
        texto = (EditText) findViewById(R.id.etMostrar);
        mostrar = (TextView) findViewById(R.id.tvMotrar);
        btnMostrar = (Button) findViewById(R.id.btnMostrar);
        btnNotificacion = (Button) findViewById(R.id.btnNotificacion);

    //evento onclick btnMostrar
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //llamando al texto
                mostrar.setText(texto.getText());
            }
        });
        mostrarNotificacion();
    }

    //evento onclick btnNotificacion llamando a mostrarNotificacion
    public void mostrarNotificacion() {
        btnNotificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //para mostrar notificacion en pantalla con Toast colocando el texto entre comas
               // Toast.makeText(v.getContext(), "Hola Mundo", Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), texto.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

}