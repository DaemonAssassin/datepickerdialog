package com.gmail.mateendev3.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvDate1, tvDate2, tvDate3;
    Button btnSetDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*tvDate1 = findViewById(R.id.tv_date_1);
        tvDate2 = findViewById(R.id.tv_date_2);
        tvDate3 = findViewById(R.id.tv_date_3);*/
        btnSetDate = findViewById(R.id.btn_set_date2);

        btnSetDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialogV2 dialog = new DatePickerDialogV2();
                dialog.show(getSupportFragmentManager(), "SHOW_DATE_DIALOG");
            }
        });

    }
}