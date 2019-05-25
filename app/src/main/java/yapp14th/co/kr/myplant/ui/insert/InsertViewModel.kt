package yapp14th.co.kr.myplant.ui.insert

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import io.realm.RealmResults
import yapp14th.co.kr.myplant.R
import yapp14th.co.kr.myplant.utils.SharedPreferenceUtil
import java.text.SimpleDateFormat
import java.util.*

class InsertViewModel(app: Application) : AndroidViewModel(app) {
    var date : RealmResults<*>? = null
    var insertDate = SimpleDateFormat("MM월 dd일").format(Date())

    var year : Int = 0
    var month : Int = 0
    var day : Int = 0
    var emotionsColor = arrayListOf(
            SharedPreferenceUtil.getStringData(SharedPreferenceUtil.EMOTION_1),
            SharedPreferenceUtil.getStringData(SharedPreferenceUtil.EMOTION_2),
            SharedPreferenceUtil.getStringData(SharedPreferenceUtil.EMOTION_3),
            SharedPreferenceUtil.getStringData(SharedPreferenceUtil.EMOTION_4),
            SharedPreferenceUtil.getStringData(SharedPreferenceUtil.EMOTION_5),
            SharedPreferenceUtil.getStringData(SharedPreferenceUtil.EMOTION_6),
            SharedPreferenceUtil.getStringData(SharedPreferenceUtil.EMOTION_7),
            SharedPreferenceUtil.getStringData(SharedPreferenceUtil.EMOTION_8)
    )

    var emotionsTitle = app.resources.getStringArray(R.array.emotions).toMutableList().apply {
        add(SharedPreferenceUtil.getStringData(SharedPreferenceUtil.EMOTION_1))
    }


    override fun onCleared() {
        super.onCleared()
    }
}