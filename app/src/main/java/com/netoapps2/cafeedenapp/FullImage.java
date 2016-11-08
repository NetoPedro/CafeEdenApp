package com.netoapps2.cafeedenapp;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class FullImage extends AppCompatActivity {

    private ImageView esquerda;
    private ImageView direita;
    private int  position;
    private ImageAdapter imageAdapter;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);
        Intent i = getIntent();
        imageAdapter= new ImageAdapter(this);
        imageAdapter.sortByCategory();
        imageView = (ImageView) findViewById(R.id.fullImageView);
        position = i.getExtras().getInt("pos");
        esquerda = (ImageView) findViewById(R.id.moverImagemEsquerda);
        direita = (ImageView) findViewById(R.id.moverImagemDireita);
        esquerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position == 0) position = imageAdapter.getCount() -1;
                else position--;
                instanciarImagem();
            }

        });
        direita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == imageAdapter.getCount() -1  ) position = 0;
                else position++;
                instanciarImagem();
            }

        });
    instanciarImagem();



    }

    private void instanciarImagem(){
        Animation animation = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        ImagemGaleria imagemGaleria = (ImagemGaleria) imageAdapter.getItem(position);
        //Picasso.with(this).load( Uri.parse((String) imageAdapter.getItem(position))).into(imageView);
        //imageView.setImageResource((Integer) imageAdapter.getItem(position));
        Glide.with(this)
                .load(imagemGaleria.getUrl())
                .fitCenter()
                .placeholder(R.drawable.loading)
                .crossFade()
                .into(imageView);
        Snackbar snackbar = Snackbar
                .make((View) imageView.getParent(), (position+1)+"/"+imageAdapter.getCount() + "\nCategoria : "+
                       imagemGaleria.getCategoria() , Snackbar.LENGTH_LONG);

        snackbar.show();
        imageView.startAnimation(animation);



    }
}
