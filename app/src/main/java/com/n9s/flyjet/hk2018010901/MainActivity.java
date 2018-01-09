package com.n9s.flyjet.hk2018010901;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)   //建立選單
    {
        //menu.add("ADD");

        //menu.add(0, 1, 0, "ADD"); //參數1:群組id, 參數2:itemId, 參數3:item順序, 參數4:item名稱
        //menu.add(0, 2, 0, "Edit");

        getMenuInflater().inflate(R.menu.mymenu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) //建立選單, 依據itemId來判斷使用者點選哪一個item
    {
        //if(item.getTitle().equals("ADD"))  //比較字串
        //{
        //    Toast.makeText(MainActivity.this, "使用者按下 ADD", Toast.LENGTH_SHORT).show();
        //}

        switch(item.getItemId())
        {
            //case 1:
            case R.id.menu_add:
                Toast.makeText(MainActivity.this, "使用者按下 ADD", Toast.LENGTH_SHORT).show();
                break;
            //case 2:
            case R.id.menu_edit:
                Toast.makeText(MainActivity.this, "使用者按下 Edit", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
