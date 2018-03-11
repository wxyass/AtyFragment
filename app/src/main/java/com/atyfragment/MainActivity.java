package com.atyfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] urls = new String[] { "www.头条.com", "www.娱乐.com", "www.科技.com",
            "www.财经.com", "www.体育.com", "www.八卦.com" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 实例化控件
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        // viewPager设置数据适配器
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public int getCount() {
                return urls.length;
            }

            @Override
            public Fragment getItem(int position) {
                // 创建fragment
                //获取实例并传值
                Fragment fragment = NewsFragment.getInstance(urls[position]);
                return fragment;
            }
        });
    }


}
