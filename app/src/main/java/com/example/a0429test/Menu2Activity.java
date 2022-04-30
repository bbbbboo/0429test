package com.example.a0429test;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class Menu2Activity extends AppCompatActivity {

    private final int Fragment_1 = 1;
    private final int Fragment_2 = 2;
    private final int Fragment_3 = 3;
    private final int Fragment_4 = 4;
    private final int Fragment_5 = 5;
    private final int Fragment_6 = 6;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        findViewById(R.id.sub2_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_1);
            }
        });
        findViewById(R.id.sub2_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_2);
            }
        });
        findViewById(R.id.sub2_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_3);
            }
        });
        findViewById(R.id.sub2_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_4);
            }
        });
        findViewById(R.id.sub2_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_5);
            }
        });
        findViewById(R.id.sub2_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_6);
            }
        });
        FragmentView(Fragment_1);
    }

    private void FragmentView(int fragment){

        //FragmentTransactiom를 이용해 프래그먼트사용
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (fragment){
            case 1:
                // 첫번 째 프래그먼트 호출
                Sub2_Menu1Activity fragment1 = new Sub2_Menu1Activity();
                transaction.replace(R.id.fragment_container, fragment1);
                transaction.commit();
                break;

            case 2:
                // 두번 째 프래그먼트 호출
                Sub2_Menu2Activity fragment2 = new Sub2_Menu2Activity();
                transaction.replace(R.id.fragment_container, fragment2);
                transaction.commit();
                break;

            case 3:
                // 두번 째 프래그먼트 호출
                Sub2_Menu3Activity fragment3 = new Sub2_Menu3Activity();
                transaction.replace(R.id.fragment_container, fragment3);
                transaction.commit();
                break;

            case 4:
                // 두번 째 프래그먼트 호출
                Sub2_Menu4Activity fragment4 = new Sub2_Menu4Activity();
                transaction.replace(R.id.fragment_container, fragment4);
                transaction.commit();
                break;

            case 5:
                // 두번 째 프래그먼트 호출
                Sub2_Menu5Activity fragment5 = new Sub2_Menu5Activity();
                transaction.replace(R.id.fragment_container, fragment5);
                transaction.commit();
                break;

            case 6:
                // 두번 째 프래그먼트 호출
                Sub2_Menu6Activity fragment6 = new Sub2_Menu6Activity();
                transaction.replace(R.id.fragment_container, fragment6);
                transaction.commit();
                break;
        }

    }
}