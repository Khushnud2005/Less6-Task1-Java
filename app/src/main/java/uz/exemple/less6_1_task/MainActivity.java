package uz.exemple.less6_1_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import uz.exemple.less6_1_task.adapter.GridViewAdapter;
import uz.exemple.less6_1_task.model.AlphabetModel;
import uz.exemple.less6_1_task.model.ArrayListModel;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.myGridViews);
        GridViewAdapter gridViewAdapter = new GridViewAdapter(
                MainActivity.this,
                new ArrayListModel().setListData()
        );
        gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        AlphabetModel model = (AlphabetModel) parent.getItemAtPosition(position);
        Toast.makeText(this,"Clicked by "+model.getLetters(),Toast.LENGTH_SHORT).show();

    }
}