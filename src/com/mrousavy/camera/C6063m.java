package com.mrousavy.camera;

import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11067f;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0000\u001a\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\r"}, m15073d2 = {"Lcom/mrousavy/camera/CameraView;", "", "d", "", "error", "b", "", "currentFps", "suggestedFps", "c", "e", "Lcom/facebook/react/bridge/WritableMap;", "a", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.m */
/* loaded from: classes6.dex */
public final class C6063m {
    /* renamed from: a */
    private static final WritableMap m26380a(Throwable th2) {
        String b;
        WritableMap map = Arguments.createMap();
        map.putString("message", th2.getMessage());
        b = C11067f.m10980b(th2);
        map.putString("stacktrace", b);
        Throwable cause = th2.getCause();
        if (cause != null) {
            map.putMap("cause", m26380a(cause));
        }
        C9971q.m14634f(map, "map");
        return map;
    }

    /* renamed from: b */
    public static final void m26379b(CameraView cameraView, Throwable error) {
        AbstractC6034a aVar;
        C9971q.m14633g(cameraView, "<this>");
        C9971q.m14633g(error, "error");
        Log.e("CameraView", "invokeOnError(...):");
        error.printStackTrace();
        if (error instanceof AbstractC6034a) {
            aVar = (AbstractC6034a) error;
        } else {
            aVar = new C6058j0(error);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", C6078r.m26367a(aVar));
        createMap.putString("message", aVar.getMessage());
        Throwable cause = aVar.getCause();
        if (cause != null) {
            createMap.putMap("cause", m26380a(cause));
        }
        Context context = cameraView.getContext();
        C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraError", createMap);
    }

    /* renamed from: c */
    public static final void m26378c(CameraView cameraView, double d, double d2) {
        String str;
        C9971q.m14633g(cameraView, "<this>");
        Log.e("CameraView", "invokeOnFrameProcessorPerformanceSuggestionAvailable(suggestedFps: " + d2 + "):");
        WritableMap createMap = Arguments.createMap();
        if (d2 > d) {
            str = "can-use-higher-fps";
        } else {
            str = "should-use-lower-fps";
        }
        createMap.putString("type", str);
        createMap.putDouble("suggestedFrameProcessorFps", d2);
        Context context = cameraView.getContext();
        C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraPerformanceSuggestionAvailable", createMap);
    }

    /* renamed from: d */
    public static final void m26377d(CameraView cameraView) {
        C9971q.m14633g(cameraView, "<this>");
        Log.i("CameraView", "invokeOnInitialized()");
        Context context = cameraView.getContext();
        C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraInitialized", null);
    }

    /* renamed from: e */
    public static final void m26376e(CameraView cameraView) {
        C9971q.m14633g(cameraView, "<this>");
        WritableMap createMap = Arguments.createMap();
        Context context = cameraView.getContext();
        C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraViewReady", createMap);
    }
}
