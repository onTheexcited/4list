package cn.edu.bistu.cs.se.list;

import android.app.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private final static String name="textName";
    private final static String clas="textClass";
    private final static String interger="textInt";
    private final static String content="textContent";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names={"小明","小华","小方"};
        String[] classes={"一班","二班","三班"};
        String[] intergers={"001","002","003"};
        String[] contents={"男，1234567","女，2345678","男，3456789"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++){
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(name,names[i]);
            item.put(clas,classes[i]);
            item.put(interger,intergers[i]);
            item.put(content,contents[i]);
            items.add(item);
        }
        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,items,R.layout.item,new String[]{name,clas,interger,content},new int[]{R.id.textName,R.id.textClass,R.id.textInt,R.id.textContent});
        ListView list=(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
