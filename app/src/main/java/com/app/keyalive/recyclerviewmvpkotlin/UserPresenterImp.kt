package com.app.keyalive.recyclerviewmvpkotlin

import com.app.keyalive.recyclerviewmvpkotlin.model.Users

/**
 * Created by keyalive on 17/02/2018.
 */
class UserPresenterImp :UserPresenter {
    var data : ArrayList<Users>?=null

    var userview :UserView?=null


    constructor(userview: UserView?) {
        this.userview = userview
        data=ArrayList<Users>()
    }

    override fun addList(nama: String, alamat: String) {

        var model = Users(nama,alamat)
        data?.add(model)



        userview?.berhasil(data!!)
    }
}