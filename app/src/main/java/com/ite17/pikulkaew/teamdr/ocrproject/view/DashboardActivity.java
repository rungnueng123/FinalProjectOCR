package com.ite17.pikulkaew.teamdr.ocrproject.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.ite17.pikulkaew.teamdr.ocrproject.R;

/**
 * Created by RUNGNUENG on 11/9/2560.
 */

public class DashboardActivity extends AppCompatActivity {

    ImageView title_search_dashboard;
    ImageView more_search_dashboard;
    EditText edit_search_dashboard;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initInstance();
    }

    private void initInstance() {

        title_search_dashboard = (ImageView) findViewById(R.id.title_search_dashboard);
        more_search_dashboard = (ImageView) findViewById(R.id.more_search_dashboard);
        edit_search_dashboard = (EditText) findViewById(R.id.edit_search_dashboard);

    }
}
