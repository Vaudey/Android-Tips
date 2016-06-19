
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class LauncherActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("DEBUG", "GESTION LAUNCHER UP");
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);
        launchSplashScreen();
    }

    private void launchSplashScreen() {
        int SPLASH_DISPLAY_LENGTH = 1500;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(LauncherActivity.this, MainActivity.class);
                LauncherActivity.this.startActivity(mainIntent);
                LauncherActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}



/* Android Manifest */

/* 
 <activity
 android:name=".activity.LauncherActivity"
 android:label="@string/app_name"
 android:theme="@style/AppTheme"
 android:screenOrientation="portrait">
 <intent-filter>
 <action android:name="android.intent.action.MAIN" />
 <category android:name="android.intent.category.LAUNCHER" />
 </intent-filter>
 </activity>
 
 
 <activity android:label="@string/app_name"
 android:theme="@style/AppTheme"
 android:name=".MainActivity"
 android:screenOrientation="portrait"/>
 */