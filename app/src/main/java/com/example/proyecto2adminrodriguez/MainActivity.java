package com.example.proyecto2adminrodriguez;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity { // inicia clase
    public Button btnVenta, btnContacto, btnProducto;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //inicia onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //integracion de xml-java
        btnVenta = findViewById(R.id.btnVenta);
        btnContacto = findViewById(R.id.btnContacto);
        btnProducto = findViewById(R.id.btnProducto);

        // evento para abrir la nueva ventana
        btnVenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirVenta = new Intent(getApplicationContext(), Venta.class);
                startActivity(abrirVenta);

            }
        });

        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirContacto = new Intent(getApplicationContext(), Contacto.class);
                startActivity(abrirContacto);
            }
        });

        btnProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirProducto = new Intent(getApplicationContext(), Producto.class);
                startActivity(abrirProducto);
            }
        });


    }//termina onCreate
}//termina clase