package kg.example.hw3mes6

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel(application: Application) : AndroidViewModel(application) {

    var mcounter = 0
    val liveData = MutableLiveData<Int>()
    var history = ""
    var mhistory = MutableLiveData<String>()


    fun onIncrement() {
        mcounter++
        liveData.value = mcounter
        history = "+"
        mhistory.value = history
    }

    fun onDecrement() {
        mcounter--
        liveData.value = mcounter
        history = "-"
        mhistory.value = history
    }


}