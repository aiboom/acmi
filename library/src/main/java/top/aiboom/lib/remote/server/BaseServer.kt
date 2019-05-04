package top.aiboom.lib.remote.server

import top.aiboom.lib.remote.Client
import top.aiboom.lib.remote.ServerConfig
import top.aiboom.lib.remote.callback.DetectCallback
import top.aiboom.lib.remote.callback.InitCallback
import top.aiboom.lib.remote.callback.LifecycleCallback

//Based on nio
class BaseServer: Server {

    override var pairCode: Int
        get() = 0
        set(value) {}

    override val clientList: List<Client>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun buildEnvironment(
        serverConfig: ServerConfig,
        initCallback: InitCallback,
        detectCallback: DetectCallback
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNewRequest(client: Client) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLifecycleChanged(lifecycleCallback: LifecycleCallback) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    
}