package com.owo.bom;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import owo.bom.SampleBezierView;
import owo.bom.SampleBezierViewLevel1;
import owo.bom.WaterDropView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //   Debug.waitForDebugger();
//    Bezier view = new Bezier(this);
//    Point[] pts = new Point[] {
//      new Point(100, 150), new Point(80, 100), new Point(50, 50), new Point(100, 0),
//      new Point(150, 50), new Point(120, 100), new Point(100, 150),
//      };
//    view.setControlPoints(pts);
        SampleBezierView view = new SampleBezierView(this);

        view.setBackgroundColor(Color.BLACK);
        setContentView(view);


    }
}
