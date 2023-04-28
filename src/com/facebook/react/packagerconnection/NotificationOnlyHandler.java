package com.facebook.react.packagerconnection;

import p414x3.C13925a;

/* loaded from: classes7.dex */
public abstract class NotificationOnlyHandler implements RequestHandler {
    private static final String TAG = JSPackagerClient.class.getSimpleName();

    @Override // com.facebook.react.packagerconnection.RequestHandler
    public abstract void onNotification(Object obj);

    @Override // com.facebook.react.packagerconnection.RequestHandler
    public final void onRequest(Object obj, Responder responder) {
        responder.error("Request is not supported");
        C13925a.m2288j(TAG, "Request is not supported");
    }
}
