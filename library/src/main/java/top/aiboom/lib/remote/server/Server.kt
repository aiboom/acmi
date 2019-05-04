package top.aiboom.lib.remote.server

import top.aiboom.lib.remote.Client
import top.aiboom.lib.remote.ServerConfig
import top.aiboom.lib.remote.callback.DetectCallback
import top.aiboom.lib.remote.callback.InitCallback
import top.aiboom.lib.remote.callback.LifecycleCallback

interface Server {

    var pairCode: Int

    val clientList: List<Client>

    fun buildEnvironment(serverConfig: ServerConfig, initCallback: InitCallback, detectCallback: DetectCallback)

    fun onNewRequest(client: Client) //用来处理客户端发送的请求

    fun onLifecycleChanged(lifecycleCallback: LifecycleCallback) //用来检测服务器的运行状态
}