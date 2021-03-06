package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onButtonClicked(View v) {
    	
    	new AlertDialog.Builder(this)
    	.setTitle("Mensagem")
    	.setMessage("Desenha alterar o status do texto")
    	.setPositiveButton("Sim", new DialogInterface
    			.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
				    	TextView text = (TextView) findViewById(R.id.textView1);
				    	if (text.getVisibility() == View.INVISIBLE) {
				    		text.setVisibility(View.VISIBLE);
				    		Toast.makeText(MainActivity.this, R.string.hello_world, Toast.LENGTH_SHORT).show();
				    	} else {
				    		text.setVisibility(View.INVISIBLE);
				    		Toast.makeText(MainActivity.this, "Esconder texto", Toast.LENGTH_SHORT).show();
				    	}
					}
				}).setNeutralButton("N�o", null).show();
			
    	/*new AlertDialog.Builder(this)
    	.setTitle("Mensagem")
    	.setMessage("Desenha mostrar")
    	.show();*/
    }
    
}
