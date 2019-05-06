package devpro.vn.dialogdemo;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button tbnShowDialog;
    private TextView tvRateApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbnShowDialog = findViewById(R.id.tbnShowDialog);
        tvRateApp = findViewById(R.id.tvRateApp);

        tbnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ĐOạn lấy vị trí



                showDialogRateApp();


            }
        });

    }
    private Dialog mDialog;
    private void showDialogRateApp(){
        mDialog = new Dialog(MainActivity.this);
        mDialog.setCanceledOnTouchOutside(false);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.popup_vote_app);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        Button btn0k = mDialog.findViewById(R.id.bntOK);
        Button btnCanner = mDialog.findViewById(R.id.bntCanner);
        btnCanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.dismiss();

            }
        });
        btn0k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvRateApp.setText(" Tôi đã Rate App");
                mDialog.dismiss();

            }
        });
        mDialog.show();

    }
}
