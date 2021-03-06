


package com.example.javielricketts.javiel2017summer;

        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.javielricketts.javiel2017summer.fragment.WorkFragment;

public class MainActivity extends AppCompatActivity {

    private TextView tv_demo;
    private TextView tv_work;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        setListener();
    }

    private void initialView() {
        tv_demo = (TextView) findViewById(R.id.activity_tool_demo);
//        tv_work = (TextView)findViewById(R.id.activity_tool_work);
    }
    private void setListener() { {
//      final   WorkFragment workFragment = new WorkFragment();
//        final DemoFragment demoFragment = new DemoFragment();
//        getFragmentManager().beginTransaction()
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.activity_main_fragment,demoFragment.commit();
    }



        tv_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You clicked demo", Toast.LENGTH_SHORT).show();
//                tv_work.setTextColor(Color.BLACK);
//                tv_demo.setTextColor(Color.RED);
//                getFragmentManager().beginTransaction()
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.activity_main_fragment,demoFragment.commit();
            }
        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             // changes color//
            tv_work.setTextColor(Color.RED);
            tv_demo.setTextColor(Color.BLACK);

            }
        };

        tv_work.setOnClickListener(listener);
    }

    public void login(View v) {
        Toast.makeText(MainActivity.this,"You clicked login", Toast.LENGTH_SHORT).show();
    }
}

