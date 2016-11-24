package com.example.zengzehao.messageshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public class MyFragment4 extends Fragment {
    private ListView listView;
    private ImageButton top_personinfo;
    private ImageButton top_add;
    public MyFragment4() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab04,container,false);
        listView = (ListView) view.findViewById(R.id.tab04_listview);
        List<Map<String,Object>> list = getData();
        listView.setAdapter(new Tab04ListViewAdapter(getActivity(),list));
       // txt_content.setText("第四个Fragment");
        //获取个人中心 和发布的ImageBUtton
        top_personinfo = (ImageButton) view.findViewById(R.id.top_personinfo);
        top_add = (ImageButton) view.findViewById(R.id.top_add);

        top_personinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"你点击了个人中心",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),PersonInfoActivity.class);
                startActivity(intent);
            }
        });

        top_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"你点击了发布按钮",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),CarpoolAddActivity.class);

                startActivity(intent);
                System.out.println("跳转到发布界面");
            }
        });

        Log.e("HEHE", "4日狗");
        return view;
    }

    public List<Map<String,Object>> getData(){
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        for(int i=0;i<10;i++){
            Map<String,Object> map = new HashMap<String,Object>();
     //       map.put("portrait",R.drawable.touxiang);
            map.put("username","14zhzeng");
            map.put("time","发表于10分钟前");
            map.put("starttime","集合时间:");
            map.put("starttime_display","2016年12月4日 14:00");
            map.put("startplace","出发地点：");
            map.put("starttime_display","汕头大学");
            map.put("endplace","目的地点：");
            map.put("endplace_display","潮汕站");
            map.put("need","需要人数：");
            map.put("need_display","3");
            map.put("clicks","点击量");
            map.put("clicks_display","10");
            list.add(map);
        }
        return list;
    }

}
