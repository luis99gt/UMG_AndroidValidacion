package curso.umg.gt.androidexamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {

    RadioGroup rgA, rgJ, rgS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        rgA = (RadioGroup) findViewById(R.id.rgAndroid);
        rgJ = (RadioGroup) findViewById(R.id.rgJava);
        rgS = (RadioGroup) findViewById(R.id.rgSpring);

    }

    public void enviarE(View view) {
        String sA = ((RadioButton)findViewById(rgA.getCheckedRadioButtonId())).getText().toString();
        String sJ = ((RadioButton)findViewById(rgJ.getCheckedRadioButtonId())).getText().toString();
        String sS = ((RadioButton)findViewById(rgS.getCheckedRadioButtonId())).getText().toString();

        String msj="";
        if (sA.equals("Si") ){
            msj = msj+" Android";

        } if(sJ.equals("Si") ) {
            msj = msj +" Java";
        } if(sS.equals("Si") ) {
            msj = msj +" Spring";
        }

        Toast toast1 = Toast.makeText(this, "Preferencias:"+msj, Toast.LENGTH_LONG);
        toast1.show();


    }
}
