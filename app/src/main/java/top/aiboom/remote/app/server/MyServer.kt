package top.aiboom.remote.app.server

import top.aiboom.lib.remote.*
import top.aiboom.lib.remote.callback.DetectCallback
import top.aiboom.lib.remote.callback.InitCallback
import top.aiboom.lib.remote.callback.LifecycleCallback
import top.aiboom.lib.remote.server.Server

object MyServer: Server {

    override fun onLifecycleChanged(lifecycleCallback: LifecycleCallback) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNewRequest(client: Client) {

    }

    override fun buildEnvironment(
        serverConfig: ServerConfig,
        initCallback: InitCallback,
        detectCallback: DetectCallback
    ) {

    }

    override var pairCode: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}
    override val clientList: List<Client>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    private fun setConfig(serverConfig: ServerConfig) {

    }

}