package com.example.t06_toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        personalizarToolbar();
        acciones();
    }

    private void acciones() {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.v("texto",newText);
                return false;
            }
        });
    }

    private void personalizarToolbar() {
        setSupportActionBar(toolbar);
    }

    private void instancias() {
        toolbar = findViewById(R.id.toolbar);
        searchView = findViewById(R.id.barra_busqueda);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(getApplicationContext());
        menuInflater.inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opcion_menu_uno:
                Toast.makeText(getApplicationContext(),"Opcion 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.opcion_menu_dos:
                Toast.makeText(getApplicationContext(),"Opcion 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.opcion_menu_tres:
                Toast.makeText(getApplicationContext(),"Opcion 3", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
