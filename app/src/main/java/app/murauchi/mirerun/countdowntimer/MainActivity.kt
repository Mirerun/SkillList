package app.murauchi.mirerun.countdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //残り時間のセット
    var second = 10

    //タイマーを設定する、millisInFuture->カウントダウンを開始する時間、countDownInterval->何秒ごとにカウントするか
    val timer : CountDownTimer = object : CountDownTimer(10000,1000) { //10000->10秒

        //タイマーが終了するときに呼ばれる
        override fun onFinish() {
            //STARTボタンを表示する
            startButton.isVisible = true
            //残り時間をリセット
            second = 10
            //時間の表示をもとに戻す
            secondText.text = second.toString()
        }

        override fun onTick(millisUntilFinished: Long) {
            //残り時間を1秒ずつ減らす
            second = second - 1
            //残り時間表示
            secondText.text = second.toString()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //残り時間を表示する
        secondText.text = second.toString()

        //STARTボタンがタップされた時
        startButton.setOnClickListener {
            //STARTボタンを見えない状態にする
            startButton.isVisible = false

            //タイマー開始
            timer.start()
        }
    }
}