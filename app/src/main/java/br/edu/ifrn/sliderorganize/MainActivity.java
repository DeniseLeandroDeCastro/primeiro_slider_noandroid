package br.edu.ifrn.sliderorganize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //Para esconder os botões do slider(opcional)
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        //Adicionando slides utilizando fragments
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_1)
                .build()
        );

        //Adicionando slides utilizando fragments
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2)
                .build()
        );

        /*
        //Começando a utilizar o slider
        addSlide(new SimpleSlide.Builder()
                                .title("Titulo")
                                .description("Descricao")
                                .image(R.drawable.um)
                                .background(android.R.color.holo_orange_light)
                                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo2")
                .description("Descricao2")
                .image(R.drawable.dois)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo3")
                .description("Descricao3")
                .image(R.drawable.tres)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo4")
                .description("Descricao4")
                .image(R.drawable.quatro)
                .background(android.R.color.holo_orange_light)
                .build()
        );
         */
    }
}