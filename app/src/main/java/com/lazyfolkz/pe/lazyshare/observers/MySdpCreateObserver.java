package com.lazyfolkz.pe.lazyshare.observers;

import org.webrtc.SessionDescription;

/**
 * Created by vishnupe on 15/6/17.
 */

public abstract class MySdpCreateObserver extends MySdpObserver{

    @Override
    public void onCreateSuccess(SessionDescription sessionDescription) {
        doOnCreateSuccess(sessionDescription);
    }

    public abstract void doOnCreateSuccess(SessionDescription sessionDescription);
}

