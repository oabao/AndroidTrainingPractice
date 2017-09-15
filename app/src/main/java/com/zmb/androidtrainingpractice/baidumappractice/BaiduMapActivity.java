package com.zmb.androidtrainingpractice.baidumappractice;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baidu.lbsapi.BMapManager;
import com.baidu.lbsapi.MKGeneralListener;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;
import com.zmb.androidtrainingpractice.R;

import java.util.List;

public class BaiduMapActivity extends AppCompatActivity {
    private BMapManager bMapManager;
    private MapView mapView;
    BaiduMap baiduMap = null;
    private LocationManager manager;
    private Location location;
    private String provider;
    private List<String> providerlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.activity_baidu_map);
        mapView = (MapView) findViewById(R.id.map_view);
        baiduMap = mapView.getMap();
        baiduMap.setMapType(BaiduMap.MAP_TYPE_SATELLITE);
        baiduMap.setTrafficEnabled(true);
        baiduMap.setBaiduHeatMapEnabled(true);
        baiduMap.setCompassEnable(true);
        baiduMap.setMyLocationEnabled(true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

}