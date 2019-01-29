package com.mad.trafficclient.fragment.lhwfragment2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.mad.trafficclient.R;
import com.mad.trafficclient.model.WeiguiCar;

public class ChartFragment07 extends Fragment {
    WeiguiCar weigui;
    private ProgressBar pb;
    private HorizontalBarChart chartview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        weigui = (WeiguiCar) arguments.getSerializable("Weigui");
        View view = inflater.inflate(R.layout.lhwfragment02_7, container, false);

        initView(view);
        return view;

    }


    private void initView(View view) {
        pb = (ProgressBar) view.findViewById(R.id.pb);
        chartview = (HorizontalBarChart) view.findViewById(R.id.chartview);
    }
}
