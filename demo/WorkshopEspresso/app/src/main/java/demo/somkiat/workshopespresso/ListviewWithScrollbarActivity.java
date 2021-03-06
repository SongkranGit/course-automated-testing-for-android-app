package demo.somkiat.workshopespresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class ListviewWithScrollbarActivity extends AppCompatActivity {

    private TextView mtxtSelectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_with_scrollbar);

        mtxtSelectedItem = (TextView) findViewById(R.id.txt_selected_item);

        String[] todolist = {
                "pick up the kids",
                "pay bills",
                "do laundry",
                "buy groceries",
                "go to the gym",
                "clean room",
                "call mum",
                "pick up the kids",
                "pay bills",
                "do laundry",
                "buy groceries",
                "go to the gym",
                "clean room",
                "call mum",
                "pick up the kids",
                "pay bills",
                "do laundry",
                "buy groceries",
                "go to the gym",
                "Before latest",
                "Latest"
        };
        List<String> list = Arrays.asList(todolist);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        ListView listView = (ListView) findViewById(R.id.list_of_todos);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = ((TextView) view).getText().toString();
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                mtxtSelectedItem.setText(text);
            }
        });

    }
}
