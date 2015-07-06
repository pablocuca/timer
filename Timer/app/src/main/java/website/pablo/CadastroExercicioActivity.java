package website.pablo;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.widget.RadioGroup.*;

public class CadastroExercicioActivity extends Activity
{
    RadioGroup rdbGrpCadExercicio;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO: Implement this method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_exercicio);

        rdbGrpCadExercicio = (RadioGroup)findViewById(R.id.rdbGrpCadExercicio);

        rdbGrpCadExercicio.setOnCheckedChangeListener(new OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId)
                {

                    if (checkedId == R.id.rdbComposto)
                    {
                        Toast.makeText(getBaseContext(), "Composto selecionado",
                                       Toast.LENGTH_SHORT).show();
                    }

                    if (checkedId == R.id.rdbSimples)
                    {
                        Toast.makeText(getBaseContext(), "Simples selecionado",
                                       Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }
}
