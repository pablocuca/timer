package website.pablo;

import android.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.content.*;

public class MainActivity extends Activity 
{
    Button btnTelaCadExercicio;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnTelaCadExercicio = (Button)findViewById(R.id.btnTelaCadExercicio);

        btnTelaCadExercicio.setOnClickListener(new OnClickListener(){
                public void onClick(View view)
                {
                    Intent intent = new Intent(getBaseContext(), CadastroExercicioActivity.class);
                    startActivity(intent);
                }
            });
    }

}
