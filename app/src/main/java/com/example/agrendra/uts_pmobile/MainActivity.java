package com.example.agrendra.uts_pmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    ListView list;
    String[] itemname = {
            "Rumus Luas dan Keliling",
            "Rumus Luas dan Kelilingi",
            "Rumus Luas dan Keliling",
            "Rumus Luas dan Keliling",
            "Rumus Luas dan Keliling",
            "Rumus Luas dan Keliling"
    };

    Integer[] imgid = {
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon
    };

    String[] descriptionitem = {
            "Persegi Panjang",
            "Persegi",
            "Lingkaran",
            "Segitiga",
            "Trapesium",
            "Jajar Genjang"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid, descriptionitem);
        list.setAdapter(adapter);
        intent = new Intent(MainActivity.this, DetailActivity.class);
        list.setOnItemClickListener((AdapterView.OnItemClickListener) this);
    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent.putExtra("Tit", "List 1");
                intent.putExtra("text", "Merupakan Contoh dari list, " +
                        "Aplikasi merupakan Tugas dan Latihan, " +
                        "Pemrogaman Mobile 2016/2017");
                intent.putExtra("gambar", R.drawable.icon);
                startActivity(intent);
                break;
            case 1:
                intent.putExtra("Tit", "List 2");
                intent.putExtra("text", "Merupakan Contoh dari list, " +
                        "Aplikasi merupakan Tugas dan Latihan, " +
                        "Pemrogaman Mobile 2016/2017");
                intent.putExtra("gambar", R.drawable.icon);
                startActivity(intent);
                break;
            case 2:
                intent.putExtra("Tit", "List 3");
                intent.putExtra("text", "Merupakan Contoh dari list, " +
                        "Aplikasi merupakan Tugas dan Latihan, " +
                        "Pemrogaman Mobile 2016/2017");
                intent.putExtra("gambar", R.drawable.icon);
                startActivity(intent);
                break;
            case 3:
                intent.putExtra("Tit", "List 4");
                intent.putExtra("text", "Merupakan Contoh dari list, " +
                        "Aplikasi merupakan Tugas dan Latihan, " +
                        "Pemrogaman Mobile 2016/2017");
                startActivity(intent);
                break;
            case 4:
                intent.putExtra("Tit", "List 5");
                intent.putExtra("text", "Merupakan Contoh dari list, " +
                        "Aplikasi merupakan Tugas dan Latihan, " +
                        "Pemrogaman Mobile 2016/2017");
                intent.putExtra("gambar", R.drawable.icon);
                startActivity(intent);
                break;
            case 5:
                intent.putExtra("Tit", "List 6");
                intent.putExtra("text", "Merupakan Contoh dari list, " +
                        "Aplikasi merupakan Tugas dan Latihan, " +
                        "Pemrogaman Mobile 2016/2017");
                intent.putExtra("gambar", R.drawable.icon);
                startActivity(intent);
                break;
            case 6:
                intent.putExtra("Tit", "List 7");
                intent.putExtra("text", "Merupakan Contoh dari list, " +
                        "Aplikasi merupakan Tugas dan Latihan, " +
                        "Pemrogaman Mobile 2016/2017");
                intent.putExtra("gambar", R.drawable.icon);
                startActivity(intent);
                break;
            case 7:
                intent.putExtra("Tit", "List 8");
                intent.putExtra("text", "Merupakan Contoh dari list, " +
                        "Aplikasi merupakan Tugas dan Latihan, " +
                        "Pemrogaman Mobile 2016/2017");
                intent.putExtra("gambar", R.drawable.icon);
                startActivity(intent);
                break;
            case 8:
                intent.putExtra("Tit", "List 9");
                intent.putExtra("text", "Merupakan Contoh dari list, " +
                        "Aplikasi merupakan Tugas dan Latihan, " +
                        "Pemrogaman Mobile 2016/2017");
                intent.putExtra("gambar", R.drawable.icon);
                startActivity(intent);
                break;
            case 9:
                intent.putExtra("Tit", "List 9");
                intent.putExtra("text", "Merupakan Contoh dari list, " +
                        "Aplikasi merupakan Tugas dan Latihan, " +
                        "Pemrogaman Mobile 2016/2017");
                intent.putExtra("gambar", R.drawable.icon);
                startActivity(intent);
                break;
        }
    }
}
