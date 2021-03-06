package com.example.a91910.afinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TabHost.OnTabChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        TabHost.TabSpec spec;

        spec=host.newTabSpec("待完成項目");
        spec.setIndicator("待完成項目");
        spec.setContent(R.id.待完成項目);
        host.addTab(spec);

        spec=host.newTabSpec("已完成項目");
        spec.setIndicator("已完成項目");
        spec.setContent(R.id.已完成項目);
        host.addTab(spec);


        host.setOnTabChangedListener(this);
    }

    @Override
    public void onTabChanged(String tabId) {
        Toast.makeText(MainActivity.this, tabId , Toast.LENGTH_LONG).show();
    }
}