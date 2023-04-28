package com.shopify.reactnative.skia;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import p078e6.AbstractC6709a;

/* loaded from: classes8.dex */
public class PlatformContext {
    private final ReactContext mContext;
    @AbstractC6709a
    private final HybridData mHybridData;
    private boolean _drawLoopActive = false;
    private boolean _isPaused = false;
    private final String TAG = "PlatformContext";

    public PlatformContext(ReactContext reactContext) {
        this.mContext = reactContext;
        this.mHybridData = initHybrid(reactContext.getResources().getDisplayMetrics().density);
    }

    private byte[] getStreamAsBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr, 0, 4096);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private native HybridData initHybrid(float f);

    /* JADX INFO: Access modifiers changed from: private */
    public native void notifyDrawLoop();

    private native void notifyTaskReady();

    /* JADX INFO: Access modifiers changed from: private */
    public void postFrameLoop() {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.shopify.reactnative.skia.PlatformContext.1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                if (!PlatformContext.this._isPaused) {
                    PlatformContext.this.notifyDrawLoop();
                    if (PlatformContext.this._drawLoopActive) {
                        PlatformContext.this.postFrameLoop();
                    }
                }
            }
        });
    }

    @AbstractC6709a
    public void beginDrawLoop() {
        if (!this._drawLoopActive) {
            this._drawLoopActive = true;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.shopify.reactnative.skia.PlatformContext.3
                @Override // java.lang.Runnable
                public void run() {
                    PlatformContext.this.postFrameLoop();
                }
            });
        }
    }

    @AbstractC6709a
    public void endDrawLoop() {
        if (this._drawLoopActive) {
            this._drawLoopActive = false;
        }
    }

    protected void finalize() {
        this.mHybridData.resetNative();
        super.finalize();
    }

    @AbstractC6709a
    public byte[] getJniStreamFromSource(String str) {
        int identifier = this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName());
        if (identifier == 0) {
            identifier = this.mContext.getResources().getIdentifier(str, "raw", this.mContext.getPackageName());
        }
        if (identifier != 0) {
            return getStreamAsBytes(this.mContext.getResources().openRawResource(identifier));
        }
        try {
            URI uri = new URI(str);
            if (uri.getScheme() != null) {
                URL url = uri.toURL();
                url.openConnection().connect();
                return getStreamAsBytes(new BufferedInputStream(url.openStream(), 8192));
            }
            throw new Exception("Invalid URI scheme");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        } catch (URISyntaxException e3) {
            e3.printStackTrace();
            return null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPause() {
        Log.i("PlatformContext", "Paused");
        this._isPaused = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onResume() {
        this._isPaused = false;
        Log.i("PlatformContext", "Resume");
        if (this._drawLoopActive) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.shopify.reactnative.skia.PlatformContext.4
                @Override // java.lang.Runnable
                public void run() {
                    PlatformContext.this.postFrameLoop();
                }
            });
        }
    }

    @AbstractC6709a
    public void raise(final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.shopify.reactnative.skia.PlatformContext.2
            @Override // java.lang.Runnable
            public void run() {
                PlatformContext.this.mContext.handleException(new Exception(str));
            }
        });
    }
}
