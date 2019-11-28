package com.gaohui.android.code.learningbitmap

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val densityDpi = resources.displayMetrics.densityDpi

        val options = BitmapFactory.Options()


//
//        Log.d("gaohui", "densityDpi: $densityDpi")
//        //尺寸 216*216，xxh下面的dpi是480
//        val scale = densityDpi/480f
//
//        val byteCount = scale * 216 * scale * 216 * 4
//
//        Log.d("gaohui", "Calculator bitmap size: $byteCount")
//
//
//
//        val bitmapXxxh = BitmapFactory.decodeResource(resources, R.drawable.image_xxxh, options)
//
//        Log.d("gaohui","##### XXXH bitmap size: " + bitmapXxxh.byteCount)


//        val bitmapAssert = BitmapFactory.decodeStream(assets.open("image_assets.png"))
//
//        Log.d("gaohui","bitmapAssert bitmap size: " + bitmapAssert.byteCount)
//

//        val bitmapXxh = BitmapFactory.decodeResource(resources, R.drawable.image_xxh, options)
//
//        Log.d("gaohui","bitmapXxh size: " + bitmapXxh.byteCount)
//
//        val scaleXxh = densityDpi/480f
//        Log.d("gaohui","scaleXxh: $scaleXxh")
//        //图片高度和宽度都是216
//        val byteCountXxh = (scaleXxh * 216 )* (scaleXxh * 216) * 4
//        Log.d("gaohui", "Calculator bitmapXxh size: $byteCountXxh")
//
//        val intWidthXxH = (scaleXxh *216 + 0.5).toInt()
//
//
//        val bitmapXxxh = BitmapFactory.decodeResource(resources, R.drawable.image_xxxh, BitmapFactory.Options())
//
//        Log.d("gaohui","bitmapXxxh size: " + bitmapXxxh.byteCount)
//
//        val scaleXxxh = densityDpi/640f
//        //图片高度和宽度都是216
//        val byteCountXxxh = (scaleXxxh * 216  + 0.5f)* (scaleXxxh * 216 + 0.5) * 4
//        Log.d("gaohui", "Calculator bitmapXxXh size: $byteCountXxxh")
//
//        val intWidthXxxh =  (scaleXxxh *216 + 0.5).toInt()
//        Log.d("gaohui","intWidthXxH: $intWidthXxH intWidthXxxh: $intWidthXxxh")


        val scaleXxh = densityDpi/480f
        //图片高度和宽度都是216
        val w =  (scaleXxh * 216 + 0.5).toInt()
        val h = (scaleXxh * 216 + 0.5).toInt()
        val byteCountXxh = w * h * 4
        Log.d("gaohui", "Calculator bitmapXxh size: $byteCountXxh")

        val scaleXxxh = densityDpi/640f
        //图片高度和宽度都是216
        val byteCountXxxh = (scaleXxxh * 216  + 0.5f)* (scaleXxxh * 216 + 0.5) * 4
        Log.d("gaohui", "Calculator bitmapXxXh size: $byteCountXxxh")
    }
}
