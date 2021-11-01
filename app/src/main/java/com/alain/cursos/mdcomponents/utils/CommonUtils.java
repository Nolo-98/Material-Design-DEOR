package com.alain.cursos.mdcomponents.utils;

/* *
 * Project: MD Components from com.alain.cursos.mdcomponents.utils
 * Created by Alain Nicolás Tello on 13/09/2019 at 06:03 PM
 * All rights reserved 2019.
 * Course Material Design and Theming for Android
 * More info: https://www.udemy.com/especialidad-en-firebase-para-android-con-mvp-profesional/
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

<<<<<<< HEAD
import com.alain.cursos.mdcomponents.fragments.BottomFragment;
import com.alain.cursos.mdcomponents.fragments.BottomNavigationBarFragment;
import com.alain.cursos.mdcomponents.fragments.CheckboxFragment;
import com.alain.cursos.mdcomponents.fragments.FloatingActionBottomFragment;
import com.alain.cursos.mdcomponents.fragments.SnackBarFragment;
import com.alain.cursos.mdcomponents.fragments.TextFieldFragment;
=======
import com.alain.cursos.mdcomponents.ButtonFragment;
>>>>>>> 0b756ea0d8cc067870aeb7b794adc4e1ba579942

public class CommonUtils {

    public static void setFragment(AppCompatActivity activity, String nameFragment, int contentRes){
        Fragment fragment = getFragmentById(nameFragment);
        activity.getSupportFragmentManager().beginTransaction()
                .add(contentRes, fragment)
                .commit();
    }

    private static Fragment getFragmentById(String nameFragment) {
        Fragment fragment = null;

        switch (nameFragment){
            //SCROLL
<<<<<<< HEAD
            case BottomFragment.TAG:
                fragment = new BottomFragment();
                break;
            case TextFieldFragment.TAG:
                fragment = new TextFieldFragment();
                break;
            case CheckboxFragment.TAG:
                fragment = new CheckboxFragment();
                break;

            //STATIC
            case BottomNavigationBarFragment.TAG:
            fragment = new BottomNavigationBarFragment();

            case SnackBarFragment.TAG:
                fragment = new SnackBarFragment();
                break;

            case FloatingActionBottomFragment.TAG:
                fragment = new FloatingActionBottomFragment();
                break;
=======
            case ButtonFragment.TAG:
                fragment = new ButtonFragment();
                break;

            //STATIC
>>>>>>> 0b756ea0d8cc067870aeb7b794adc4e1ba579942
        }

        return fragment;
    }
}
