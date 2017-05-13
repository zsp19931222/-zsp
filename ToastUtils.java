package utils;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/16 0016.
 */

public class ToastUtils {
    public static void Toast(Activity activity,String message){
        Toast.makeText(activity,message,Toast.LENGTH_SHORT).show();
    }
}
