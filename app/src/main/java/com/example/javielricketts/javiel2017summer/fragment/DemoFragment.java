package com.example.javielricketts.javiel2017summer.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

import com.example.javielricketts.javiel2017summer.Adapter.ListNormalAdapter;
import com.example.javielricketts.javiel2017summer.R;

public class DemoFragment extends Fragment {

   private final ArrayList<String> contentList;
    private ListView listView;

    public DemoFragment() {
        // Required empty public constructor
    contentList = new ArrayList<String>();
    contentList.add("ViewPaper");
    contentList.add("ImageScaleType");
    contentList.add ("9patch");
        contentList.add ("A");
        contentList.add ("B");
        contentList.add ("C");
        contentList.add ("D");
        contentList.add ("E");
        contentList.add ("F");
        contentList.add ("G");
        contentList.add ("H");
        contentList.add ("I");
        contentList.add ("J");
        contentList.add ("K");
        contentList.add ("L");
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
//        listView = (ListView)view.findViewById(R.id.fragment_demo_lv);
//        ListNormalAdapter adapter = new ListNormalAdapter();
//        listView.setAdapter(adapter);

        return inflater.inflate(R.layout.fragment_demo, container, false);
    }

}
