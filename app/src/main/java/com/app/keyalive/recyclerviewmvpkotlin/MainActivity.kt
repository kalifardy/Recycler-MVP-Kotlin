package com.app.keyalive.recyclerviewmvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.app.keyalive.recyclerviewmvpkotlin.model.Users
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), UserView {

    lateinit var presenter : UserPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initPresenter()
        initView()
    }

    private fun initView() {

        btn_proses.setOnClickListener {
            presenter.addList(inputnama_edt.text.toString(),inputalamat_edt.text.toString())
        }
    }

    private fun initPresenter() {
        presenter = UserPresenterImp(this)

    }
    override fun berhasil(data: ArrayList<Users>) {
    var iniadapter =RecyclerAdapter(data)
        recyclerview.adapter=iniadapter
        recyclerview.layoutManager=LinearLayoutManager(this)
    }

    override fun tidaberhasil(pesan: String) {
    }

}
