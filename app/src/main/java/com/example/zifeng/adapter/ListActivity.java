package com.example.zifeng.adapter;

import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by ZiFeng on 2018/3/18.
 */
public class ListActivity extends android.app.ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 不使用布局文件
        String[] arr = {"王者荣耀","绝地求生","QQ飞车"};
        // 创建ArrayAdapter对象
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,arr);
        setListAdapter(adapter);
    }
}
