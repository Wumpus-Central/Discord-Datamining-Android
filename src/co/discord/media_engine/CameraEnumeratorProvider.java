package co.discord.media_engine;

import android.content.Context;
import co.discord.media_engine.internal.ExtensionFunctionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m15073d2 = {"Lco/discord/media_engine/CameraEnumeratorProvider;", "", "()V", "TAG", "", "enumerator", "Lorg/webrtc/CameraEnumerator;", "createCapturer", "Lorg/webrtc/CameraVideoCapturer;", "cameraName", "get", "init", "", "context", "Landroid/content/Context;", "forceCamera1", "", "maybeInit", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class CameraEnumeratorProvider {
    public static final CameraEnumeratorProvider INSTANCE = new CameraEnumeratorProvider();
    private static final String TAG = "CameraEnumeratorProvider";
    private static CameraEnumerator enumerator;

    private CameraEnumeratorProvider() {
    }

    public static final CameraVideoCapturer createCapturer(String cameraName) {
        C9971q.m14633g(cameraName, "cameraName");
        CameraVideoCapturer createCapturer = get().createCapturer(cameraName, null);
        C9971q.m14634f(createCapturer, "get().createCapturer(cameraName, null)");
        return createCapturer;
    }

    public static final synchronized CameraEnumerator get() {
        CameraEnumerator cameraEnumerator;
        synchronized (CameraEnumeratorProvider.class) {
            cameraEnumerator = enumerator;
            if (cameraEnumerator == null) {
                ExtensionFunctionsKt.logi(TAG, "init was never called. Use Camera 1 API by default.");
                cameraEnumerator = new Camera1Enumerator();
            }
        }
        return cameraEnumerator;
    }

    public static final synchronized void maybeInit(Context context) {
        synchronized (CameraEnumeratorProvider.class) {
            C9971q.m14633g(context, "context");
            if (enumerator == null) {
                INSTANCE.init(context, false);
            }
        }
    }

    public final synchronized void init(Context context, boolean z) {
        CameraEnumerator cameraEnumerator;
        C9971q.m14633g(context, "context");
        if (z) {
            ExtensionFunctionsKt.logi(TAG, "Override: Forcing Camera 1 API");
            cameraEnumerator = new Camera1Enumerator();
        } else if (Camera2Enumerator.isSupported(context)) {
            ExtensionFunctionsKt.logi(TAG, "Use Camera 2 API");
            cameraEnumerator = new Camera2Enumerator(context.getApplicationContext());
        } else {
            ExtensionFunctionsKt.logi(TAG, "Camera 2 API is not supported. Use Camera 1 API");
            cameraEnumerator = new Camera1Enumerator();
        }
        enumerator = cameraEnumerator;
    }
}
