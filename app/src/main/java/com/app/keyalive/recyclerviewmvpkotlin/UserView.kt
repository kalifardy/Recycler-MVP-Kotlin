package com.app.keyalive.recyclerviewmvpkotlin

import com.app.keyalive.recyclerviewmvpkotlin.model.Users

/**
 * Created by keyalive on 17/02/2018.
 */
interface UserView {

    fun berhasil(data:ArrayList<Users>)
    fun tidaberhasil(pesan:String)
}