package kr.co.tjoeun.a202200318;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjoeun.a202200318.adepters.Roomadepter;
import kr.co.tjoeun.a202200318.databinding.ActivityMainBinding;
import kr.co.tjoeun.a202200318.datas.Room;

public class MainActivity extends BaseActivity {

    List<Room> roomdatas = new ArrayList<>();
    Roomadepter roomadepter = null;

    ActivityMainBinding binding = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
    roomadepter = new Roomadepter(mContext,R.layout.room_list_item,roomdatas);
    binding.roomlistView.setAdapter(roomadepter);
    }
}
