package com.jawad.androidtv.ui

import androidx.fragment.app.Fragment
import com.jawad.androidtv.R
import com.jawad.androidtv.ui.base.BaseActivity
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity : BaseActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun supportFragmentInjector() = dispatchingAndroidInjector

    override val layoutId: Int
        get() = R.layout.activity_main

    override fun initializeViewModel() {
        //"Implemented for new update"
    }
}
