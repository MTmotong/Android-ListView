package com.example.listviewtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {
	
	
	private List<Fruit> fruitList = new ArrayList<Fruit>();
	/*private String[] data = { "Apple", "Banana", "Orange", "Watermelon", "Pear", "plum", "lemon", "lychee", 
			"Grape", "Pineapple", "Strawberry", "Cherry", "Mango", "date", "mulberry" };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits(); //初始化水果数据
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
       /* ArrayAdapter<String> adapter = new ArrayAdapter<String> (
        		MainActivity.this, android.R.layout.simple_list_item_1, data);*/
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);	
    }

    private void initFruits() {
    	Fruit apple = new Fruit("Apple", R.drawable.apple);
    	fruitList.add(apple);
    	Fruit banana = new Fruit("Banana", R.drawable.banana);
    	fruitList.add(banana);
    	Fruit orange = new Fruit("Orange", R.drawable.orange);
    	fruitList.add(orange);
    	Fruit watermelon = new Fruit("Watermelon", R.drawable.watermelon);
    	fruitList.add(watermelon);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
