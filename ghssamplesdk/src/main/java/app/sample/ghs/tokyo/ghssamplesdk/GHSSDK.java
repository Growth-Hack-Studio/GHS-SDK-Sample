package app.sample.ghs.tokyo.ghssamplesdk;

import android.util.Log;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Created by yohei on 2017/04/28.
 */

public class GHSSDK {

    static ScheduledExecutorService sExecutor = Executors.newScheduledThreadPool(2);

    public static void hello() {
        Log.d("GHSSDK", "hello, World.");
    }

    public static void asyncTask() {
        sExecutor.execute(new Runnable() {
            @Override
            public void run() {
                // do io task.
            }
        });
    }
}
