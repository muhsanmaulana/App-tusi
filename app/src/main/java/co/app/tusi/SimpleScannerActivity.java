package co.app.tusi;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class SimpleScannerActivity extends BaseScannerActivity implements ZXingScannerView.ResultHandler {
    private ZXingScannerView mScannerView;
    int saldo;
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_simple_scanner);
        setupToolbar();
        Intent before = getIntent();
        saldo = before.getIntExtra("SALDO",0);


        ViewGroup contentFrame = (ViewGroup) findViewById(R.id.content_frame);
        mScannerView = new ZXingScannerView(this);
        contentFrame.addView(mScannerView);
    }

    @Override
    public void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();
    }

    @Override
    public void handleResult(Result rawResult) {
        int cost = Integer.parseInt(rawResult.getText().toString());

        if(cost == 0) {
            Intent i = new Intent(SimpleScannerActivity.this, SudahiPerjalanan.class);
            i.putExtra("SALDO", saldo);
            startActivity(i);
        }
        else if(cost == 3500){
            saldo = saldo - cost;
            Intent i = new Intent(SimpleScannerActivity.this, RuteUpGancitActivity.class);
            i.putExtra("SALDO", saldo);
            finish();
            startActivity(i);
        }
        // Note:
        // * Wait 2 seconds to resume the preview.
        // * On older devices continuously stopping and resuming camera preview can result in freezing the app.
        // * I don't know why this is the case but I don't have the time to figure out.

    }
}
