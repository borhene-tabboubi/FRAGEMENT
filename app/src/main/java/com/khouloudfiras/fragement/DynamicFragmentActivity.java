package com.khouloudfiras.fragement;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.khouloudfiras.fragement.fragments.MyDynamicFragment;

public class DynamicFragmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new MyDynamicFragment()).commit();
    }
}