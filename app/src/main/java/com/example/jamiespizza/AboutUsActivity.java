package com.example.jamiespizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

//        Element adsElement = new Element();
//        adsElement.setTitle("Advertise Here");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.jamies_logo_without_backgroud)
                .setDescription("Jamies Pizza Android Application \n" +
                        "Pizza � burgers � wings � dessert �")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("Contact Details")
                .addEmail("jamiespizzas@gmail.com")
                .addWebsite("http://www.jamiespizza.com.au/#!dl=1861&n=OurStory")
                .addFacebook("jamiespizzeria")
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);



    }

    private Element createCopyright() {
        Element copyright = new Element();
        final String copyrightString = String.format("Copyright %d by Jamies Pizzas", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setIconDrawable(R.drawable.jamies_logo_without_backgroud);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutUsActivity.this, copyrightString, Toast.LENGTH_SHORT).show();


            }
        });
        return copyright;

    }
}
