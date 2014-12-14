package com.example.datastore.utils;

import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by 启 on 2014/9/17.
 */
public class DataTool {

    public static boolean saveInfo(Context context, String username, String password) {
        File file = new File(context.getFilesDir().getPath(), "pwd.txt");
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write((username + "##" + password).getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
