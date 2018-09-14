package com.example.android.tallerdosclase;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;

public class Listado extends Activity {
    private TableLayout tabla;
    private ArrayList<movil> MovilesD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        tabla = findViewById(R.id.tabla);
        MovilesD = datos.obtener();

        for (int i = 0; i < MovilesD.size(); i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(String.valueOf(i+1));
            c2.setText(MovilesD.get(i).getMarca());
            c3.setText(String.valueOf(MovilesD.get(i).getCapacidad()));
            c4.setText(MovilesD.get(i).getColor());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla.addView(fila);
        }
    }
}
