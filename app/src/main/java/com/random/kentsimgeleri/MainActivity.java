package com.random.kentsimgeleri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.random.kentsimgeleri.databinding.ActivityDetaylarBinding;
import com.random.kentsimgeleri.databinding.ActivityMainBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
     ArrayList<LanMark> lanMarkArrayList;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding =ActivityMainBinding .inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        lanMarkArrayList = new ArrayList<>();


        LanMark MesciduAksa=new LanMark("Mescidul Aksa", "Kudüs",R.drawable.kudus);
        LanMark GalataKulesi=new LanMark("Galata Kulesi","İstanbul",R.drawable.galatakulesi);
        LanMark  Kabbe= new LanMark("Kabbe","Mekke",R.drawable.mekke);
        LanMark Cami=new LanMark("Cami","Bağdat",R.drawable.bagdat);

        lanMarkArrayList.add(MesciduAksa);
        lanMarkArrayList.add(GalataKulesi);
        lanMarkArrayList.add(Kabbe);
        lanMarkArrayList.add(Cami);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LanMarkAdapter lanMarkAdapter= new LanMarkAdapter(lanMarkArrayList);
        binding.recyclerView.setAdapter(lanMarkAdapter);

       /* ArrayAdapter arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,lanMarkArrayList.stream().map(lanMark -> lanMark.name).collect(Collectors.toList()));
        binding.listview.setAdapter(arrayAdapter);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,DetaylarActivity.class);
                intent.putExtra("landmark",lanMarkArrayList.get(position));
                startActivity(intent);
            }
        });*/


    }
}