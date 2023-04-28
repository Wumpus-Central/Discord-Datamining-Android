package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p065dc.C6430a;
import p420x9.C14004p;

/* renamed from: com.google.firebase.messaging.b0 */
/* loaded from: classes3.dex */
public class C5814b0 implements Closeable {

    /* renamed from: k */
    private final URL f11554k;

    /* renamed from: l */
    private volatile Future<?> f11555l;

    /* renamed from: m */
    private Task<Bitmap> f11556m;

    private C5814b0(URL url) {
        this.f11554k = url;
    }

    /* renamed from: h */
    private byte[] m27217h() {
        URLConnection openConnection = this.f11554k.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] c = C6430a.m25573c(C6430a.m25574b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + c.length + " bytes from " + this.f11554k);
                }
                if (c.length <= 1048576) {
                    return c;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
    }

    /* renamed from: i */
    public static C5814b0 m27216i(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C5814b0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m27214n(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.m28900c(m27218g());
        } catch (Exception e) {
            taskCompletionSource.m28901b(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11555l.cancel(true);
    }

    /* renamed from: g */
    public Bitmap m27218g() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f11554k);
        }
        byte[] h = m27217h();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(h, 0, h.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f11554k);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f11554k);
    }

    /* renamed from: l */
    public Task<Bitmap> m27215l() {
        return (Task) C14004p.m2051j(this.f11556m);
    }

    /* renamed from: p */
    public void m27213p(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11555l = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.a0
            @Override // java.lang.Runnable
            public final void run() {
                C5814b0.this.m27214n(taskCompletionSource);
            }
        });
        this.f11556m = taskCompletionSource.m28902a();
    }
}
