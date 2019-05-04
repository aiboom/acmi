package top.aiboom.remote.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import top.aiboom.remote.app.server.MyServer

class ServerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_server)
    }
}
