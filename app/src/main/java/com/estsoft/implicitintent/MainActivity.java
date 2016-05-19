package com.estsoft.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String ACTION_SHARED_ACTIVITY =
                                "com.estsoft.android.action.SHARE_ACTION";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById( R.id.button1 ).setOnClickListener( this );
        findViewById( R.id.button2 ).setOnClickListener( this );
        findViewById( R.id.button3 ).setOnClickListener( this );
        findViewById( R.id.button4 ).setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch( viewId ) {
            case R.id.button1 : {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse( "tel:01047616934" ) );
                startActivity(intent);
                break;
            }
            case R.id.button2 : {
                Intent intent = new Intent( Intent.ACTION_PICK );
                intent.setData( Uri.parse("content://com.android.contacts/data/phones") );
                startActivity( intent );
                break;
            }
            case R.id.button3 : {
                Intent intent = new Intent( Intent.ACTION_VIEW );
                intent.setData( Uri.parse("http://www.naver.com") );
                startActivity( intent );
                break;
            }
            case R.id.button4 : {
                Intent intent = new Intent( ACTION_SHARED_ACTIVITY );
                startActivity( intent );
                break;
            }
            default:
                break;
        }
    }
}
