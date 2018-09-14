package com.example.android.tallerdosclase;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Reportes extends Activity {
    private Spinner Re;
    private Resources recursos;
    private String[] op1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);

        Re = findViewById(R.id.spnReportes);
        recursos = this.getResources();

        op1 = recursos.getStringArray(R.array.Reportes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op1);
        Re.setAdapter(adapter);
    }
    public void reporte(){
        int opcion1;
        String reporte ="";
        if (validar()){

            opcion1 = Re.getSelectedItemPosition();
            switch (opcion1){
                case 1:
                    reporte = reporte+metodos.Reporte1();
                    break;
                case 2:
                    //reporte = reporte+metodos.Reporte2();
                    break;
                case 3:
                    //reporte = reporte+metodos.Reporte2();
                    break;

            }

        }

    }

    public boolean validar() {
        int o1 = Re.getSelectedItemPosition();

        if (o1 == 0) {
            Toast.makeText(this, recursos.getString(R.string.error_re), Toast.LENGTH_SHORT).show();
            Re.setSelection(0);
            return false;
        }
        return true;
    }

}
