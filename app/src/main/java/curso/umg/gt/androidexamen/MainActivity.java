package curso.umg.gt.androidexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nombres, apellidos, password, password1;
    boolean boln=false,bola=false,bolp=false,bolp1=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombres = (EditText) findViewById(R.id.etNom);
        apellidos = (EditText) findViewById(R.id.etApp);
        password = (EditText) findViewById(R.id.etPass);
        password1 = (EditText) findViewById(R.id.etPass1);

    }

    public void addEstudiante(View view) {
        String v_nom = nombres.getText().toString();
        String v_app = apellidos.getText().toString();
        String v_pass = password.getText().toString();
        String v_pass1 = password1.getText().toString();

        if (v_nom.equals("")){
            boln = false;
        }else{
            boln = true;
        }
        if (v_app.equals("")){
            bola = false;
        }else{
            bola = true;
        }

        if (v_pass.equals("")){
            bolp = false;
        }else{
            bolp = true;
        }
        if (v_pass1.equals("")){
            bolp1 = false;
        }else{
            bolp1 = true;
        }

        if (boln == true && bola == true && bolp == true && bolp1 == true && v_pass.equals(v_pass1)) {
            Intent del = new Intent(this, Encuesta.class);
            this.startActivity(del);

        }else{
            Toast toast1 = Toast.makeText(this, "Las contraseñas no coinciden o debe completar datos", Toast.LENGTH_SHORT);
            toast1.show();
        }



    }

    public void cancelarEstudiante(View view) {
    }
}
