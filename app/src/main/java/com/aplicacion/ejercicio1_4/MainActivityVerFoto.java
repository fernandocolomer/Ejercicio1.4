package com.aplicacion.ejercicio1_4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.aplicacion.ejercicio1_4.Datos.Persona;

import java.io.ByteArrayInputStream;

public class MainActivityVerFoto extends AppCompatActivity {
    EditText nombre, desc;
    ImageView foto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ver_foto);

        init();
        Bundle personas = getIntent().getExtras();
        Persona person;
        if(personas != null){
            person = (Persona) personas.getSerializable("persona");
            nombre.setText(person.getNombre());
            desc.setText(person.getDescripcion());
            showPhoto(person.getImagen());
            Bitmap bmImagen = BitmapFactory.decodeFile(person.getPath());
            foto.setImageBitmap(bmImagen);
        }
    }

    private void init(){
        nombre = findViewById(R.id.txtNombres);
        desc = findViewById(R.id.txtDescripcion);
        foto = findViewById(R.id.imageView);
    }

    private void showPhoto(byte[] img){
        Bitmap bitmap = null;
        ByteArrayInputStream bais = new ByteArrayInputStream(img);
        bitmap = BitmapFactory.decodeStream(bais);
        foto.setImageBitmap(bitmap);
    }



}