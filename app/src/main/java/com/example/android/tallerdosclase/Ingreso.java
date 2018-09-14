package com.example.android.tallerdosclase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ingreso extends Activity {
    private EditText txtMarca, txtCapacidad, txtColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);

        txtMarca= findViewById(R.id.txtMarca);
        txtCapacidad = findViewById(R.id.txtCapacidad);
        txtColor= findViewById(R.id.txtColor);

    }

    public void guardar (View v){
        if (validar()){
            String marca, color;
            int capacidad;

            marca = txtMarca.getText().toString();
            capacidad = Integer.parseInt(txtCapacidad.getText().toString());
            color = txtColor.getText().toString();

            movil m = new movil(marca, capacidad,color);
            m.guardar();
            Toast.makeText(this, getResources().getString(R.string.mensaje),Toast.LENGTH_SHORT).show();
            borrar();
        }
    }

    public void limpiar(View v){
        borrar();
    }

    private void borrar(){
        txtMarca.setText("");
        txtCapacidad.setText("");
        txtColor.setText("");
        txtMarca.requestFocus();
    }

    public boolean validar(){
        if (txtMarca.getText().toString().isEmpty()){
            txtMarca.requestFocus();
            txtMarca.setError(getString(R.string.Error_1M));
            return false;
        }
        if (txtCapacidad.getText().toString().isEmpty()){
            txtCapacidad.requestFocus();
            txtCapacidad.setError(getString(R.string.Error_1));
            return false;
        }
        if (Integer.parseInt(txtCapacidad.getText().toString())==0){
            txtCapacidad.requestFocus();
            txtCapacidad.setError(getString(R.string.Error_2));
            return false;
        }
        if (txtColor.getText().toString().isEmpty()){
            txtColor.requestFocus();
            txtColor.setError(getString(R.string.Error_1C));
            return false;
        }

        return true;
    }
}
