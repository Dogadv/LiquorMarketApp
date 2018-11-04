package org.dogadaev.liquormarket.presentation.view.activity;

import android.os.Bundle;

import org.dogadaev.liquormarket.R;
import org.dogadaev.liquormarket.presentation.view.fragment.ProductsFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    FragmentManager fragmentManager;
    ProductsFragment productsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        fragmentManager = getSupportFragmentManager();
        productsFragment = new ProductsFragment();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mainFragmentContainer, productsFragment);
        fragmentTransaction.commit();
    }
}
