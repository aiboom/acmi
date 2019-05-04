package top.aiboom.lib.remote.callback

interface InitCallback {
    fun success(pairCode: Int)
    fun initError()
}