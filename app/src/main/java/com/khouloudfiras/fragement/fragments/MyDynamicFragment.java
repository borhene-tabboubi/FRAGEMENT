package com.khouloudfiras.fragement.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.khouloudfiras.fragement.R;

public class MyDynamicFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflatethe layoutfor thisfragment

        return inflater.inflate(R.layout.fragment_my_dynamic, container, false);
    }
}

