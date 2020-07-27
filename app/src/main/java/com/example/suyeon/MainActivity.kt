package com.example.suyeon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btn.setOnClickListener {
////            textView.setText("hello kotlin!!")
//            textSay.text = "Hello Kotlin"

        // 파라미터가 없는 클래스
        class Kotlin() {
            init {
                Log.d("class", "kotlin 클래스 생성됨.")
            }
        }

        // 파라미터가 있는 세컨더리 생성자
        class KotlinTwo {
            constructor(value: String) {
                Log.d("class", "KotlinTwo: 파라미터 값은 ${value}입니다.")
            }
        }

        // 프로퍼티와 메서드가 있는 클래스
        class KotlinThree {
            var one: String = "None"
            fun printOne() {
                Log.d("class", "KotlinThree: one에 입력된 값은 ${one}입니다.")
            }
        }

        class KotlinFour {
            companion object {
                var one: String = "None"
                fun printOne() {
                    Log.d("class", "KotlinFour: one에 입력된 값은 ${one}입니다.")
                }
            }
        }

        // 데이타 클래스는 기본적으로 getter, setter 함수 생성
        // java Object 클래스에 정의된 함수들을 자동으로 생성한다.
        data class DataUser(var name: String, var age: Int)
        val data user
    }
}