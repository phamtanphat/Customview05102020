package com.example.customview05102020;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EdittextImage extends RelativeLayout {
    private TextView mTitle;
    private ImageView mImg;
    private EditText mEdt;

    private String mTextTitle;
    private Integer mTextSize;
    private Integer mSrcImage;

    public EdittextImage(Context context) {
        super(context);
    }

    public EdittextImage(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public EdittextImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init(Context context , AttributeSet attributeSet){
        if (context != null && attributeSet != null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View v = layoutInflater.inflate(R.layout.layout_edittext_circle,this , true);
            TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.EdittextImage);
            mTextTitle = typedArray.getString(R.styleable.EdittextImage_title);
            mTextSize = typedArray.getInteger(R.styleable.EdittextImage_titleSize,0);
            mSrcImage = typedArray.getResourceId(R.styleable.EdittextImage_srcImage,R.mipmap.ic_launcher);

            typedArray.recycle();

            initView(v);
            mapView();
        }
    }
    private void initView(View v) {
        mEdt = v.findViewById(R.id.edittext);
        mImg = v.findViewById(R.id.imageView);
        mTitle = v.findViewById(R.id.textViewTitle);
    }
    private void mapView() {
        mTitle.setText(mTextTitle);
        mTitle.setTextSize((float) mTextSize);
        mImg.setImageResource(mSrcImage);
    }
}
