package com.example.administrator.scrollviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private RecyclerView mRecyclerView;
    private Button mSend;
    private ArrayList<String> mDatas;
    private HomeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        mEditText = (EditText)findViewById(R.id.idea_content);
        mRecyclerView = (RecyclerView)findViewById(R.id.ImgList);
        mSend = (Button)findViewById(R.id.send);
        mSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Home.class);
                startActivity(intent);
            }
        });

    }
    public void InitImgList(){
        mAdapter = new HomeAdapter(mDatas,MainActivity.this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
    }
    public void initData(){
        mDatas = new ArrayList<>();
        for(int i = 'A' ; i < 'Z';i++){
            mDatas.add(""+(char)i);
        }
    }
}
