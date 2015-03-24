package myself.smartphonestatus;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;



import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


/**
 * Created by Pramoda Fernando on 12/15/2014.
 */

@SuppressWarnings("deprecation")
public class StatusActivity extends TabActivity {


    @SuppressWarnings("deprecation")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TabHost host = getTabHost();

        TabSpec statusspec = host.newTabSpec("Phone");
        statusspec.setIndicator("Phone",getResources().getDrawable(R.drawable.nphone));
        Intent phoneStatusIntent = new Intent(this, MyActivity.class);
        statusspec.setContent(phoneStatusIntent);

        TabSpec batteryspec = host.newTabSpec("Battery");
        batteryspec.setIndicator("Battery", getResources().getDrawable(R.drawable.nbattery));
        Intent batteryIntent = new Intent(this, BatteryStatusActivity.class);
        batteryspec.setContent(batteryIntent);

        // Adding all TabSpec to TabHost
        host.addTab(statusspec);
        host.addTab(batteryspec);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.phonestatus, menu);
        return true;
    }
}
