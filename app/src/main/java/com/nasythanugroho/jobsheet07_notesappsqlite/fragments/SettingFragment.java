package com.nasythanugroho.jobsheet07_notesappsqlite.fragments;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.nasythanugroho.jobsheet07_notesappsqlite.R;

public class SettingFragment extends PreferenceFragmentCompat {

        @Override
        public void onCreatePreferences(Bundle bundle, String s) {
            addPreferencesFromResource(R.xml.preference);
        }
    }