package com.tozmart.tozsdkdemotest.utils;

import android.text.TextUtils;
import android.view.Gravity;
import android.widget.Toast;

import com.tozmart.toz_sdk.main.TozSDK;

/**
 * Created by tracy on 17/11/22.
 */

public class ShowToast {

    private static Toast mToast;

    public static void showToast(String content){
        showToast(content, Gravity.CENTER);
    }

    public static void showToast(String content, int gravity){
        if (!TextUtils.isEmpty(content)) {
            if(mToast == null){
                mToast = Toast.makeText(TozSDK.getApplicationContext(), content, Toast.LENGTH_SHORT);
            } else {
                mToast.setText(content);
            }
            mToast.setGravity(gravity, 0, 0);
            mToast.show();
        }
    }

    public static void showToast(int contentRes){
        showToast(contentRes, Gravity.CENTER);
    }


    public static void showToast(int contentRes, int gravity){
        try {
            if(mToast == null){
                mToast = Toast.makeText(TozSDK.getApplicationContext(), contentRes, Toast.LENGTH_SHORT);
            } else {
                mToast.setText(contentRes);
            }
            mToast.setGravity(gravity, 0, 0);
            mToast.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
