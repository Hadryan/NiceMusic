package com.lzx.nicemusic.module.splash.presenter;

import com.lzx.nicemusic.base.mvp.factory.BasePresenter;
import com.lzx.nicemusic.module.main.presenter.MainModel;

/**
 * Created by xian on 2018/1/14.
 */

public class SplashPresenter extends BasePresenter<SplashContract.View> implements SplashContract.Presenter<SplashContract.View> {

    private MainModel mMainModel;

    public SplashPresenter() {
        mMainModel = new MainModel();
    }

    @Override
    public void requestMusicList() {
//        Disposable subscriber = Observable.create((ObservableOnSubscribe<Boolean>) emitter -> {
//            boolean hasCache = CacheManager.getImpl().hasCache(CacheManager.KEY_HOME_LIST_DATA);
//            emitter.onNext(hasCache);
//        }).filter(aBoolean -> {
//            if (aBoolean) {
//                mView.requestMainDataSuccess(true);
//                return false;
//            }
//            return true;
//        })
//                .flatMap(aBoolean -> mMainModel.loadMainData())
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(mainDataList1 -> mView.requestMainDataSuccess(false),
//                        throwable -> {
//                            mView.requestMainDataSuccess(true);
//                            LogUtil.i("Error#requestMusicList = " + throwable.getMessage());
//                            Toast.makeText(mContext, "数据解析出错", Toast.LENGTH_SHORT).show();
//                        });
//        addSubscribe(subscriber);
    }
}
