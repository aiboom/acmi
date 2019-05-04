package top.aiboom.lib.remote.callback

import top.aiboom.lib.remote.Client

interface DetectCallback {

    fun newConnect(client: Client)

    fun disconnect(client: Client)

}