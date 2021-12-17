package com.gmail.mateendev3.datepickerdialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDatePickerDialog extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(
                getActivity(),
                this,
                year,
                month,
                day
        );
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Toast.makeText(requireActivity(), "year: " + year + "\nmonth: " + month + "\nday: " + dayOfMonth, Toast.LENGTH_LONG).show();

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance().format(c.getTime());
        String currentDateString1 = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView tvDate = getActivity().findViewById(R.id.tv_date);
        TextView tvDate1 = getActivity().findViewById(R.id.tv_date1);
        TextView tvDate2 = getActivity().findViewById(R.id.tv_date2);

        tvDate.setText(currentDateString);
        tvDate1.setText(currentDateString1);
        tvDate2.setText(todayDate(dayOfMonth, month + 1, year));


    }

    private String todayDate(int dayOfMonth, int month, int year) {
        return showMonth(month) + " " + dayOfMonth + ", " + year;
    }

    private String showMonth(int month) {
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
