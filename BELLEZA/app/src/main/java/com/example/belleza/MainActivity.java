package com.example.belleza;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnproductos, btnservicios, btnsucursales;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_belleza);

        setContentView(R.layout.activity_main);

        btnproductos= (Button) findViewById(R.id.btnproductos);
        btnservicios= (Button) findViewById(R.id.btnservicios);
        btnsucursales= (Button) findViewById(R.id.btnsucursales);


        btnproductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), " BTN PRODUCTO lA FUNCIÓN SE IMPLEMENTARÁ EN LA SIGUENTE VERSION", Toast.LENGTH_SHORT).show();

            }
        });

        btnservicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), " BTN SERVICIOS lA FUNCIÓN SE IMPLEMENTARÁ EN LA SIGUENTE VERSION", Toast.LENGTH_SHORT).show();
            }
        });

        btnsucursales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "BTN SUCURSALES lA FUNCIÓN SE IMPLEMENTARÁ EN LA SIGUENTE VERSION", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.productos:
                Toast.makeText(getApplicationContext(), "PRODUCTO SELECCIONADO", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sucursales:
                Toast.makeText(getApplicationContext(), "SUCURSAL SELECCIONADA", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.servicios:
                Toast.makeText(getApplicationContext(), "SERVICIOS SELECCIONADOS", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}

