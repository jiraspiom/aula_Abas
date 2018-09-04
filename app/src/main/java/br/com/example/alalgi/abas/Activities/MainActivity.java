package br.com.example.alalgi.abas.Activities;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import br.com.example.alalgi.abas.Fragments.EmAltaFragment;
import br.com.example.alalgi.abas.Fragments.HomeFragment;
import br.com.example.alalgi.abas.Fragments.IncricoesFragment;
import br.com.example.alalgi.abas.R;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        smartTabLayout = findViewById(R.id.viewPagertab);

        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("Youtube");

        //Configurando as abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Home", HomeFragment.class)
                .add("Inscrições", IncricoesFragment.class)
                .add("Em alta", EmAltaFragment.class)
                .create());

        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
    }




}
