package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Data> datas=new ArrayList<Data>();
    RecyclerAdapter recyclerAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        recyclerView=findViewById(R.id.recyclerview);
        recyclerAdapter=new RecyclerAdapter(datas,this);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(manager);
    }
    private void initdata()
    {
        HttpConnect httpConnect=new HttpConnect("https://news-at.zhihu.com/api/4/news/latest");
        httpConnect.sendRequestWithHttpURLConnection(new HttpConnect.Callback() {
            @Override
            public void finish(String respone) {
                   parseJSON(respone);//手解版
                //parseJSONByGson(respone);//gson版
            }
        });
    }

    //Gson版
//    private void parseJSONByGson(String respone){
//        Gson gson=new Gson();
//        DataGson dataGson=gson.fromJson(respone,DataGson.class);
//        List<DataGson.StoriesBean> storys=dataGson.getStories();
//        for (DataGson.StoriesBean storiesBean:storys) {
//            Data data=new Data(storiesBean.getImages().get(0),storiesBean.getTitle());
//            datas.add(data);
//        }
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                recyclerAdapter.notifyDataSetChanged();
//            }
//        });
//    }

    private void parseJSON(String respone) {
        try {
            JSONObject jsonObject=new JSONObject(respone);
            JSONArray jsonArray=new JSONArray(jsonObject.getString("stories"));
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                //   Log.d("maff1", "parseJSON: "+jsonObject1.getString("images"));
                JSONArray jsonArray1=new JSONArray(jsonObject1.getString("images"));
                Data data=new Data(jsonArray1.get(0).toString(),jsonObject1.getString("title"));
                datas.add(data);
            }
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    recyclerAdapter.notifyDataSetChanged();
                }
            });

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    }

