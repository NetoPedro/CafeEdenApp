package com.netoapps2.cafeedenapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pedroneto on 01/10/16.‹
 */
public class ContactsFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";
    private Button botao ;

    private static final String FACEBOOK_URL = "https://www.facebook.com/amiguinhosdoeden";
    private static final String FACEBOOK_PAGE_ID = "amiguinhosdoeden";
        public ContactsFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static ContactsFragment newInstance(int sectionNumber) {
            ContactsFragment fragment = new ContactsFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_contacts, container, false);
            botao = (Button) rootView.findViewById(R.id.botaoMapa);
            View.OnClickListener action1 = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uriIntentMap = Uri.parse("geo:0,0?q=1600" + Uri.encode("R. Sousa Aroso 447, 4450-289, Matosinhos"));
                    Intent i = new Intent(Intent.ACTION_VIEW, uriIntentMap);
                    i.setPackage("com.google.android.apps.maps");
                    if (i.resolveActivity(getActivity().getPackageManager()) != null)
                        startActivity(i);
                    else {
                        botao.setEnabled(false);
                        botao.setText(R.string.botaoIndisponivel);

                    }
                }
            };
            View.OnClickListener action2 = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uriIntentCall = Uri.parse("tel:930551090");
                    Intent i = new Intent(Intent.ACTION_DIAL, uriIntentCall);
                    startActivity(i);
                }
            };
            View.OnClickListener action3 = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uriIntentCall = Uri.parse("tel:229374492");
                    Intent i = new Intent(Intent.ACTION_DIAL, uriIntentCall);
                    startActivity(i);
                }
            };
            View.OnClickListener action4 = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                    String facebookUrl = getFacebookPageURL(getContext());
                    facebookIntent.setData(Uri.parse(facebookUrl));
                    startActivity(facebookIntent);

                }
            };
            botao.setOnClickListener(action1);
            TextView telefoneText = (TextView) rootView.findViewById(R.id.telefone);
            TextView telemovelText = (TextView) rootView.findViewById(R.id.telemovel);
            TextView facebookText = (TextView) rootView.findViewById(R.id.facebook);
            ImageView telefoneLogo = (ImageView) rootView.findViewById(R.id.telemovelLogo);
            ImageView telemovelLogo = (ImageView) rootView.findViewById(R.id.telefoneLogo);
            ImageView facebookLogo = (ImageView) rootView.findViewById(R.id.facebookLogo);
            telefoneText.setOnClickListener(action2);
            telefoneLogo.setOnClickListener(action2);
            telemovelText.setOnClickListener(action3);
            telemovelLogo.setOnClickListener(action3);
            facebookText.setOnClickListener(action4);
            facebookLogo.setOnClickListener(action4);

            return rootView;
        }

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


