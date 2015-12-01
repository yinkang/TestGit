package com.yk.mac.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ListView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * PackageName  : com.yk.mac.myapplication
 * Version      : 1.0
 * Author       : YinKang
 * Company      : DiDi
 * Date         : 15/11/4
 * Time         : 下午6:08
 * Info         :
 * Copyright    : CopyRight © 2015 YinKang,All Rights Reserved
 */
public class LongImage extends ListView {
    private ArrayList<Bitmap> mBitmaps;//用于保存切割后图片
    private int mCloumn;//记录ImageView的个数
    private LongImageAdapter mAdapter;
    private int mHeight,mWidth;
    private boolean isLong;//用于标识是长图还是宽图
    private Rect mRect = new Rect();
    private BitmapRegionDecoder mDecoder;
    private Context mContext;


    public LongImage(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    public LongImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init();
    }

    private void init(){
        mRect = new Rect();
        mBitmaps = new ArrayList<>();

    }

    public void setBitmap(OutputStream outputStream,int height,int width) throws Exception {
        InputStream inputStream = parse(outputStream);
        mDecoder = BitmapRegionDecoder.newInstance(inputStream, true);
        mHeight = height;
        mWidth = width;
        if (mHeight>1024 && mWidth>1024){
            throw new IllegalArgumentException("the width and height of the bitmap are too large");
        }
        isLong = mHeight>mWidth;
        if (isLong){
            mCloumn = (int) Math.ceil((double)mHeight/4096);
            for (int i = 0;i<mCloumn;i++){
                if (i == mCloumn-1){
                    mRect.set(0,(mCloumn-1)*4096,mWidth,mHeight);
                    Log.v("LongImage","rect left:"+mRect.left+" top:"+mRect.top+" right:"+mRect.right+" bottom:"+mRect.bottom);
                    Bitmap bitmap1 = mDecoder.decodeRegion(mRect,null);
                    if (bitmap1!=null){
                        mBitmaps.add(bitmap1);
                    }
                }else {
                    mRect.set(0,i*4096,mWidth,(i+1)*4096);
                    Log.v("LongImage", "rect left:" + mRect.left + " top:" + mRect.top + " right:" + mRect.right + " bottom:" + mRect.bottom);
                    Bitmap bitmap1 = mDecoder.decodeRegion(mRect,null);
                    if (bitmap1!=null){
                        mBitmaps.add(bitmap1);
                    }
                }
            }
        }else {
            mCloumn = (int) Math.ceil((double)mWidth/4096);
            for (int i = 0;i<mCloumn;i++){
                if (i == mCloumn-1){
                    mRect.set((mCloumn-1)*4096,0,mWidth,mHeight);
                    Log.v("LongImage", "rect left:" + mRect.left + " top:" + mRect.top + " right:" + mRect.right + " bottom:" + mRect.bottom);
                    Bitmap bitmap1 = mDecoder.decodeRegion(mRect,null);
                    mBitmaps.add(bitmap1);
                }else {
                    mRect.set(i*4096,0,4096*(i+1),mHeight);
                    Log.v("LongImage", "rect left:" + mRect.left + " top:" + mRect.top + " right:" + mRect.right + " bottom:" + mRect.bottom);
                    Bitmap bitmap1 = mDecoder.decodeRegion(mRect,null);
                    mBitmaps.add(bitmap1);
                }
            }
        }
        mAdapter = new LongImageAdapter(mContext,mBitmaps,isLong);
        this.setAdapter(mAdapter);
    }

    public ByteArrayInputStream parse(OutputStream out) throws Exception
    {
        ByteArrayOutputStream baos;
        baos=(ByteArrayOutputStream) out;
        ByteArrayInputStream swapStream = new ByteArrayInputStream(baos.toByteArray());
        return swapStream;
    }

    public void setImageWidth(int width){
        ViewGroup.LayoutParams params = this.getLayoutParams();
        params.width = width;
        this.setLayoutParams(params);
        mAdapter.notifyDataSetChanged();
    }



}
