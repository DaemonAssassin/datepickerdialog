package com.gmail.mateendev3.datepickerdialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

import java.text.DateFormat;
import java.util.Calendar;

public class DatePickerDialogV2 extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    @Override
    public Dialog onCreateDialog( Bundle savedInstanceState) {

        Calendar calendar = Calendar.getInstance();
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        return new DatePickerDialog(
                requireActivity(),
                this,
                year,
                month,
                dayOfMonth
        );
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

        String todayDate1 = DateFormat.getDateInstance().format(calendar.getTime());
        String todayDate2 = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        String todayDate3 = getTodayDate(dayOfMonth, month + 1, year);

        TextView tvDate1 = requireActivity().findViewById(R.id.tv_date_1);
        TextView tvDate2 = requireActivity().findViewById(R.id.tv_date_2);
        TextView tvDate3 = requireActivity().findViewById(R.id.tv_date_3);

        tvDate1.setText(todayDate1);
        tvDate2.setText(todayDate2);
        tvDate3.setText(todayDate3);
    }

    private String getTodayDate(int dayOfMonth, int month, int year) {
        return getCurrentMonthName(month) + " " + dayOfMonth + ", " + year;
    }

    private String getCurrentMonthName(int month) {
        if (month == 1)
            return "JAN";
        else if (month == 2)
            return "FEB";
        else if (month == 3)
            return "MAR";
        else if (month == 4)
            return "APR";
        else if (month == 5)
            return "MAY";
        else if (month == 6)
            return "JUN";
        else if (month == 7)
            return "JUL";
        else if (month == 8)
            return "AUG";
        else if (month == 9)
            return "SEP";
        else if (month == 10)
            return "OCT";
        else if (month == 11)
            return "NOV";
        else if (month == 12)
            return "DEC";
        else
            return "JAN";
    }
}
