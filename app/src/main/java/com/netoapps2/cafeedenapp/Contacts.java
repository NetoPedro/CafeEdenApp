package com.netoapps2.cafeedenapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Contacts extends AppCompatActivity {

    private Button botao ;

    private static final String FACEBOOK_URL = "https://www.facebook.com/amiguinhosdoeden";
    private static final String FACEBOOK_PAGE_ID = "amiguinhosdoeden";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        botao = (Button) findViewById(R.id.botaoMapa);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriIntentMap = Uri.parse("geo:0,0?q=1600" + Uri.encode("R. Sousa Aroso 447, 4450-289, Matosinhos"));
                Intent i = new Intent(Intent.ACTION_VIEW, uriIntentMap);
                i.setPackage("com.google.android.apps.maps");
                if (i.resolveActivity(getPackageManager()) != null)
                    startActivity(i);
                else {
                    botao.setEnabled(false);
                    botao.setText(R.string.botaoIndisponivel);

                }
            }
        });
        TextView telefoneText = (TextView) findViewById(R.id.telefone);
        TextView telemovelText = (TextView) findViewById(R.id.telemovel);
        TextView facebookText = (TextView) findViewById(R.id.facebook);
        telefoneText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriIntentCall = Uri.parse("tel:930551090");
                Intent i = new Intent(Intent.ACTION_DIAL, uriIntentCall);
                startActivity(i);
            }
        });
        telemovelText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriIntentCall = Uri.parse("tel:229374492");
                Intent i = new Intent(Intent.ACTION_DIAL, uriIntentCall);
                startActivity(i);
            }
        });

        facebookText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getFacebookPageURL(Contacts.this);
                facebookIntent.setData(Uri.parse(facebookUrl));
                startActivity(facebookIntent);

            }
        });



    }

    //method to get the right URL to use in the intent
    private String getFacebookPageURL(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else { //older versions of fb app
                return "fb://page/" + FACEBOOK_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL; //normal web url
        }
    }
}
