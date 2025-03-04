package com.example.proyecto2adminrodriguez;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Venta extends AppCompatActivity { // empieza clase
    public EditText etProducto, etCantidad, etPrecio;
    public TextView tvResultadoVenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {// empieza onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venta);
        // integración de XML a Java
        etProducto = findViewById(R.id.etProducto);
        etCantidad =  findViewById(R.id.etCantidad);
        etPrecio = findViewById(R.id.etPrecio);

        tvResultadoVenta = findViewById(R.id.tvResultadoVenta);

    } // termina onCreate

    public void venta(View view){ // inicia método
        String nombreProducto = etProducto.getText().toString();
        int cantidadProducto = Integer.parseInt(etCantidad.getText().toString());
        float precioProducto = Float.parseFloat(etPrecio.getText().toString());

        float ventaTotal = cantidadProducto * precioProducto;
        tvResultadoVenta.setText(String.valueOf(ventaTotal));
    } // termina método
}// termina clase