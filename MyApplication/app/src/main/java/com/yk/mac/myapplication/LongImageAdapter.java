package com.yk.mac.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * PackageName  : com.yk.mac.myapplication
 * Version      : 1.0
 * Author       : YinKang
 * Company      : DiDi
 * Date         : 15/11/5
 * Time         : 上午10:52
 * Info         :
 * Copyright    : CopyRight © 2015 YinKang,All Rights Reserved
 */
public class LongImageAdapter extends BaseAdapter {
    private ArrayList<Bitmap> mBitmaps;
    private Context mContext;
    private LayoutInflater mInflater;
    private boolean isLong;
    private int mHeight,mWidth;

    public LongImageAdapter(Context context,ArrayList<Bitmap> bitmaps,boolean longPic){
        this.mBitmaps = bitmaps;
        this.isLong = longPic;
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mBitmaps.size();
    }

    @Override
    public Object getItem(int position) {
        return mBitmaps.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Bitmap bitmap = mBitmaps.get(position);
        if (!isLong){
            // TODO: 15/11/5 如果图片是横向的话，将图片翻转
        }
        ViewHolder viewHolder;
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.long_image_item,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.long_image_item);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) viewHolder.imageView.getLayoutParams();
        if (mWidth == 0){
            params.width = ((WindowManager)(mContext.getSystemService(Context.WINDOW_SERVICE))).getDefaultDisplay().getWidth();
            mWidth = params.width;
        }else {
            params.width = mWidth;
        }
        params.height = (int) ((float)params.width/bitmap.getWidth()*bitmap.getHeight());
        viewHolder.imageView.setLayoutParams(params);
        viewHolder.imageView.setClickable(false);
        Log.v("LongImage", "imageView Width:" + viewHolder.imageView.getWidth() + "\t height" + viewHolder.imageView.getHeight());
        viewHolder.imageView.setImageBitmap(bitmap);
        return convertView;
    }
    private class ViewHolder{
        ImageView imageView;
    }

}
