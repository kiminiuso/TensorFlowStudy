package com.xiapanan.tensorflowstudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class IndexActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "IndexActivity";

    private static MyTSF mytsf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        Button ss = (Button) findViewById(R.id.click01);
        ss.setOnClickListener(this);

        Button sss = (Button) findViewById(R.id.click02);
        sss.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.click01:
                mytsf=new MyTSF(getAssets());
                float[] result = mytsf.getAddResult();
                for(int i=0;i<result.length;i++){
                    Log.i(TAG, "click01: "+result[i] );
                }
                break;
            case R.id.click02:
                Intent intent2=new  Intent();
                intent2.setClass(IndexActivity.this,DetectorActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }

}