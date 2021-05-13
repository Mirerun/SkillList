package app.murauchi.mirerun.imageview_skilllistsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.api.load
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://www.bing.com/images/search?view=detailV2&ccid=7FyEFRyR&id=60936B1CF92E0863EFAB757F3918AFD09B9AE393&thid=OIP.7FyEFRyR_gKD6IY0MeLWWAHaHv&mediaurl=https%3a%2f%2fcdn141.picsart.com%2f275322287034211.png&exph=1130&expw=1080&q=BTS+%e3%83%ad%e3%82%b4&simid=608055700055988951&ck=07F757D5D559B0EF3C4D3DE287CCDEB1&selectedIndex=50&FORM=IRPRST&ajaxhist=0&ajaxserp=0"
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.load(url)


        //val imageView = findViewById<ImageView>(R.id.imageView)
        //imageView.setImageResource(R.drawable.bts_logo)
    }
}