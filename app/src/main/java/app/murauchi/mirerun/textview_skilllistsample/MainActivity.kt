package app.murauchi.mirerun.textview_skilllistsample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //コード上でtextの文字を変える
        text1.text = "Hello World!"

        //コード上で文字の色を変える
        text1.setTextColor{ Color.rgb(30,197,218)}

        //コード上で文字サイズを変える
        text1.setTextSize(12,0f)
    }
}