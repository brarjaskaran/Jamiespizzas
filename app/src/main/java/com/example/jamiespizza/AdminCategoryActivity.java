package com.example.jamiespizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView traditional_pizza, gourment_pizza, pasta, burger;
    private ImageView  salads, ribs_n_wings, deserts, milkshakes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        traditional_pizza = findViewById(R.id.traditional_pizza_id);
        gourment_pizza = findViewById(R.id.gourmet_pizza_id);
        pasta = findViewById(R.id.pastas_id);
        burger = findViewById(R.id.burgers_id);

        salads = findViewById(R.id.salads_id);
        ribs_n_wings = findViewById(R.id.ribs_n_wings_id);
        deserts = findViewById(R.id.deserts_id);
        milkshakes = findViewById(R.id.milkshakes_id);

        traditional_pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Traditional Pizza");
                startActivity(intent);


            }
        });

        gourment_pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Gourment Pizza");
                startActivity(intent);

            }
        });

        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Pasta");
                startActivity(intent);

            }
        });

        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Burger");
                startActivity(intent);


            }
        });

        salads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Salads");
                startActivity(intent);


            }
        });



        ribs_n_wings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Ribs n Wings");
                startActivity(intent);


            }
        });

        deserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Deserts");
                startActivity(intent);

            }
        });

        milkshakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Milkshakes");
                startActivity(intent);

            }
        });


    }
}
