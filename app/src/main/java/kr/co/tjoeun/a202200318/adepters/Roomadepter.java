package kr.co.tjoeun.a202200318.adepters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import kr.co.tjoeun.a202200318.R;
import kr.co.tjoeun.a202200318.datas.Room;

public class Roomadepter extends ArrayAdapter<Room> {

    Context mContext;
    List<Room> mList;
    LayoutInflater inf;

    public Roomadepter(@NonNull Context context, int resource, @NonNull List<Room> objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row==null){
            row= inf.inflate(R.layout.room_list_item,null);
        }

      Room data = mList.get(position);
        TextView prices =row.findViewById(R.id.prices);
        TextView addressAndFloorTxt =row.findViewById(R.id.addressAndFloorTxt);
        TextView descTxt =row.findViewById(R.id.descTxt);
        //가격설정=setText에는 int값 넣지말자
        //1만이상이면 억단위로 표현 아니면 숫자만 ,찍어서
        if (data.getPrice()>=10000){
            int uk = data.getPrice()/10000;
            int thousand = data.getPrice()%10000;
            prices.setText(String.format("%d억%,d",uk,thousand));

        }else {
            prices.setText(String.format("%,d",data,prices));
        }



        return row;

    }
}
