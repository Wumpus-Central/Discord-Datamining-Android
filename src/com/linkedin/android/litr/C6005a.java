package com.linkedin.android.litr;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ge.AbstractC7580a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import p138he.C8008a;

/* renamed from: com.linkedin.android.litr.a */
/* loaded from: classes6.dex */
class C6005a {

    /* renamed from: e */
    private static final String f12161e = "a";

    /* renamed from: a */
    private final Map<String, Future<?>> f12162a;

    /* renamed from: b */
    private final AbstractC7580a f12163b;

    /* renamed from: c */
    private Bundle f12164c = new Bundle();

    /* renamed from: d */
    private HandlerC6006b f12165d;

    /* renamed from: com.linkedin.android.litr.a$b */
    /* loaded from: classes6.dex */
    private static class HandlerC6006b extends Handler {

        /* renamed from: a */
        private final AbstractC7580a f12166a;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            List<C8008a> list;
            Object obj = message.obj;
            if (obj == null) {
                list = null;
            } else {
                list = (List) obj;
            }
            Bundle data = message.getData();
            String string = data.getString("jobId");
            if (string != null) {
                int i = message.what;
                if (i == 0) {
                    this.f12166a.onStarted(string);
                } else if (i == 1) {
                    this.f12166a.onCompleted(string, list);
                } else if (i == 2) {
                    this.f12166a.onError(string, (Throwable) data.getSerializable("throwable"), list);
                } else if (i == 3) {
                    this.f12166a.onProgress(string, data.getFloat("progress"));
                } else if (i != 4) {
                    String str = C6005a.f12161e;
                    Log.e(str, "Unknown event received: " + message.what);
                } else {
                    this.f12166a.onCancelled(string, list);
                }
            } else {
                throw new IllegalArgumentException("Handler message doesn't contain an id!");
            }
        }

        private HandlerC6006b(Looper looper, AbstractC7580a aVar) {
            super(looper);
            this.f12166a = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6005a(Map<String, Future<?>> map, AbstractC7580a aVar, Looper looper) {
        this.f12162a = map;
        this.f12163b = aVar;
        if (looper != null) {
            this.f12165d = new HandlerC6006b(looper, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m26468b(String str, List<C8008a> list) {
        this.f12162a.remove(str);
        HandlerC6006b bVar = this.f12165d;
        if (bVar == null) {
            this.f12163b.onCancelled(str, list);
            return;
        }
        Message obtain = Message.obtain(bVar, 4);
        obtain.obj = list;
        this.f12164c.putString("jobId", str);
        obtain.setData(this.f12164c);
        obtain.sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m26467c(String str, List<C8008a> list) {
        this.f12162a.remove(str);
        HandlerC6006b bVar = this.f12165d;
        if (bVar == null) {
            this.f12163b.onCompleted(str, list);
            return;
        }
        Message obtain = Message.obtain(bVar, 1);
        obtain.obj = list;
        this.f12164c.putString("jobId", str);
        obtain.setData(this.f12164c);
        obtain.sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m26466d(String str, Throwable th2, List<C8008a> list) {
        this.f12162a.remove(str);
        HandlerC6006b bVar = this.f12165d;
        if (bVar == null) {
            this.f12163b.onError(str, th2, list);
            return;
        }
        Message obtain = Message.obtain(bVar, 2);
        obtain.obj = list;
        this.f12164c.putString("jobId", str);
        this.f12164c.putSerializable("throwable", th2);
        obtain.setData(this.f12164c);
        obtain.sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m26465e(String str, float f) {
        HandlerC6006b bVar = this.f12165d;
        if (bVar == null) {
            this.f12163b.onProgress(str, f);
            return;
        }
        Message obtain = Message.obtain(bVar, 3);
        obtain.obj = null;
        this.f12164c.putString("jobId", str);
        this.f12164c.putFloat("progress", f);
        obtain.setData(this.f12164c);
        obtain.sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m26464f(String str) {
        HandlerC6006b bVar = this.f12165d;
        if (bVar == null) {
            this.f12163b.onStarted(str);
            return;
        }
        Message obtain = Message.obtain(bVar, 0);
        obtain.obj = null;
        this.f12164c.putString("jobId", str);
        obtain.setData(this.f12164c);
        obtain.sendToTarget();
    }
}
