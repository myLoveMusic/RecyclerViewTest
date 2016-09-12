package com.lihang.recyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvRecyclerView;
    private List<String> datas = new ArrayList<String>();
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvRecyclerView = (RecyclerView) findViewById(R.id.rv_recycler_view);
        initDatas();
        myAdapter = new MyAdapter(datas);
        rvRecyclerView.setAdapter(myAdapter);
//        rvRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        rvRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        rvRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(5,StaggeredGridLayoutManager.VERTICAL));
        rvRecyclerView.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL_LIST));
        myAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onClick(View view, int position, String city) {
                Toast.makeText(MainActivity.this,"city:"+city+"position:"+position,Toast.LENGTH_SHORT ).show();
            }
        });
    }

    private void initDatas(){
        datas.add("New Your");
        datas.add("Boston");
        datas.add("Washington");
        datas.add("San Francisco");
        datas.add("California");
        datas.add("Chicago");
        datas.add("Houston");
        datas.add("Phoenix");
        datas.add("Philadelphia");
        datas.add("Pennsylvania");
        datas.add("San Antonio");
        datas.add("Austin");
        datas.add("Milwaukee");

    }

}
