package com.yk.mac.myapplication;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by zhangpengyu on 14/10/23.
 */
public class BaseTextView extends TextView {
    public BaseTextView(Context context) {
        super(context);
    }

    public BaseTextView(Context context, AttributeSet attrs) {
        super(context,attrs);
    }

    public BaseTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(text, type);
    }

    private int getAvailableWidth()
    {
        Log.e("haha",getWidth()+"");
        Log.e("haha",getPaddingLeft()+"");
        Log.e("haha",getPaddingRight()+"");
        return getWidth() - getPaddingLeft() - getPaddingRight();
    }

    public boolean isOverFlowed(int lineNum)
    {
        Paint paint = getPaint();
        float width = paint.measureText(getText().toString());
        if (width > getAvailableWidth()*lineNum) return true;
        return false;
    }

}
