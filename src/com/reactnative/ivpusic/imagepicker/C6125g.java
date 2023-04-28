package com.reactnative.ivpusic.imagepicker;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.reactnative.ivpusic.imagepicker.g */
/* loaded from: classes6.dex */
public class C6125g {

    /* renamed from: a */
    private Promise f12471a;

    /* renamed from: b */
    private int f12472b;

    /* renamed from: c */
    private boolean f12473c;

    /* renamed from: d */
    private AtomicInteger f12474d;

    /* renamed from: e */
    private WritableArray f12475e;

    /* renamed from: f */
    private boolean f12476f;

    /* renamed from: a */
    private synchronized boolean m26221a() {
        if (this.f12476f) {
            Log.w("image-crop-picker", "Skipping result, already sent...");
            return false;
        } else if (this.f12471a != null) {
            return true;
        } else {
            Log.w("image-crop-picker", "Trying to notify success but promise is not set");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m26220b(String str, String str2) {
        if (m26221a()) {
            Log.e("image-crop-picker", "Promise rejected. " + str2);
            this.f12471a.reject(str, str2);
            this.f12476f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void m26219c(String str, Throwable th2) {
        if (m26221a()) {
            Log.e("image-crop-picker", "Promise rejected. " + th2.getMessage());
            this.f12471a.reject(str, th2);
            this.f12476f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void m26218d(WritableMap writableMap) {
        if (m26221a()) {
            if (this.f12473c) {
                this.f12475e.pushMap(writableMap);
                if (this.f12474d.addAndGet(1) == this.f12472b) {
                    this.f12471a.resolve(this.f12475e);
                    this.f12476f = true;
                }
            } else {
                this.f12471a.resolve(writableMap);
                this.f12476f = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void m26217e(int i) {
        this.f12472b = i;
        this.f12474d = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void m26216f(Promise promise, boolean z) {
        this.f12471a = promise;
        this.f12473c = z;
        this.f12476f = false;
        this.f12472b = 0;
        this.f12474d = new AtomicInteger(0);
        if (z) {
            this.f12475e = new WritableNativeArray();
        }
    }
}
