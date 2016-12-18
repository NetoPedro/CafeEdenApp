package com.netoapps2.cafeedenapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by pedroneto on 10/10/16.
 */
public class IntroFragment extends Fragment{

        private static final String ARG_SECTION_NUMBER = "section_number";

        public IntroFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static IntroFragment newInstance(int sectionNumber) {
            IntroFragment fragment = new IntroFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
             Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.intro_fragment, container, false);
            TextView text = (TextView) rootView.findViewById(R.id.textView);
            LinearLayout linearLayout = (LinearLayout) rootView.findViewById(R.id.linearLayoutIntro);

            //text.setMovementMethod(new ScrollingMovementMethod());
            return rootView;
        }

    }



