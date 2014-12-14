package com.example.filespermissions.utils;

import android.content.Context;
import android.view.ContextMenu;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by 启 on 2014/9/17.
 */
public class DataTool {

    //private static
    public static boolean saveInfo(Context context, String str, int mode) {
        try {
        FileOutputStream outputStream = null;
        switch (mode) {
            case 1:
                outputStream = context.openFileOutput("private.txt",
                        Context.MODE_PRIVATE);

                break;
            case 2:
                outputStream = context.openFileOutput("read.txt",
                        Context.MODE_WORLD_READABLE);
                break;
            case 3:
                outputStream = context.openFileOutput("write.txt",
                        Context.MODE_WORLD_WRITEABLE);
                break;
            case 4:
                outputStream = context.openFileOutput("read_write.txt",
                        Context.MODE_PRIVATE);
                break;
            case 5:
                outputStream = context.openFileOutput("public.txt",
                        Context.MODE_PRIVATE);
                break;
        }

            outputStream.write((str).getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
