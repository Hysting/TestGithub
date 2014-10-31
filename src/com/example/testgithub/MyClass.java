package com.example.testgithub;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class MyClass {
	int b = 1;
	int a = 100;
    int c = 100;
    
	public MyClass() {
		 Context context;
		 List<Map<String, Object>> data;
		 int layout;
		// TODO Auto-generated constructor stub
        class MyThread extends Thread {
            boolean flag;
            int count;
            @Override
            public void run() {
                super.run();
                //根据布尔值判断是因为surface中UI的改变必须在callback的oncreate方法和destroy方法之间
                while (flag) {
                    Canvas canvas = null;
                    canvas.drawColor(Color.WHITE);
                    Paint paint = new Paint();
                    paint.setColor(Color.GRAY);

//                Shader shader = new LinearGradient(0,0,)
//                paint.setShader(shader);

                    canvas.drawRect(40, 40, 160, 160, paint);
                    paint.setColor(Color.RED);
                    canvas.drawText(count + "", 100, 100, paint);
                    count++;
                    //必须把画布解锁了，才能真正绘制
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        }
	}
	
}
