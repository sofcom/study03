package com.nasplus.study03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPrintLog.setOnClickListener {
            //"로그 출력" 버튼을 누를때마다의 행위를 적는다.
            //Log.d("study03 메인 앱에서 ","버튼 누름!!")
            Log.d("study03 메인 앱에서", "버튼 누릅!")
        }
    }
}