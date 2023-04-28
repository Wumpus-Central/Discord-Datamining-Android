package com.mrousavy.camera;

import android.annotation.SuppressLint;
import androidx.camera.core.AbstractC1874k;
import androidx.core.content.C2337a;
import androidx.core.util.AbstractC2511b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p145i0.AbstractC8143i1;
import p145i0.C8115c1;
import p145i0.C8166o0;
import p145i0.C8178p;
import p145i0.C8192u;
import p145i0.C8201x0;
import p353te.C13058b;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0000H\u0007\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0000H\u0007\u001a\f\u0010\t\u001a\u00020\u0005*\u00020\u0000H\u0007¨\u0006\n"}, m15073d2 = {"Lcom/mrousavy/camera/CameraView;", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Callback;", "onRecordCallback", "", "c", "a", "b", "d", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.o */
/* loaded from: classes6.dex */
public final class C6068o {

    @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"com/mrousavy/camera/o$a", "Landroidx/core/util/b;", "Li0/i1;", "event", "", "a", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.o$a */
    /* loaded from: classes6.dex */
    public static final class C6069a implements AbstractC2511b<AbstractC8143i1> {

        /* renamed from: a */
        final /* synthetic */ Callback f12331a;

        /* renamed from: b */
        final /* synthetic */ CameraView f12332b;

        C6069a(Callback callback, CameraView cameraView) {
            this.f12331a = callback;
            this.f12332b = cameraView;
        }

        /* renamed from: a */
        public void accept(AbstractC8143i1 i1Var) {
            AbstractC6034a aVar;
            if (i1Var instanceof AbstractC8143i1.C8144a) {
                AbstractC8143i1.C8144a aVar2 = (AbstractC8143i1.C8144a) i1Var;
                if (aVar2.m20511l()) {
                    switch (aVar2.m20513j()) {
                        case 2:
                            aVar = new C6079s(aVar2.m20514i());
                            break;
                        case 3:
                            aVar = new C6083w(aVar2.m20514i());
                            break;
                        case 4:
                            aVar = new C6082v(aVar2.m20514i());
                            break;
                        case 5:
                            aVar = new C6035a0(aVar2.m20514i());
                            break;
                        case 6:
                            aVar = new C6060k0(aVar2.m20514i());
                            break;
                        case 7:
                            aVar = new C6056i0(aVar2.m20514i());
                            break;
                        case 8:
                            aVar = new C6045f0(aVar2.m20514i());
                            break;
                        default:
                            aVar = new C6058j0(aVar2.m20514i());
                            break;
                    }
                    this.f12331a.invoke(null, C13058b.m4676c(aVar.m26398a() + '/' + aVar.m26397b(), aVar.getMessage(), aVar, null, 8, null));
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("path", aVar2.m20512k().mo20344a().toString());
                    createMap.putDouble("duration", (aVar2.m20519d().mo20311c() / 1000000.0d) / 1000.0d);
                    createMap.putDouble("size", aVar2.m20519d().mo20312b() / 1000.0d);
                    this.f12331a.invoke(createMap, null);
                }
                AbstractC1874k camera$react_native_vision_camera_release = this.f12332b.getCamera$react_native_vision_camera_release();
                C9971q.m14636d(camera$react_native_vision_camera_release);
                camera$react_native_vision_camera_release.mo329b().mo3335f(C9971q.m14638b(this.f12332b.getTorch(), ViewProps.f37199ON));
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public static final void m26374a(CameraView cameraView) {
        C9971q.m14633g(cameraView, "<this>");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() == null) {
            throw new C6038c();
        } else if (cameraView.getActiveVideoRecording$react_native_vision_camera_release() != null) {
            C8201x0 activeVideoRecording$react_native_vision_camera_release = cameraView.getActiveVideoRecording$react_native_vision_camera_release();
            C9971q.m14636d(activeVideoRecording$react_native_vision_camera_release);
            activeVideoRecording$react_native_vision_camera_release.m20316l();
        } else {
            throw new C6043e0();
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    public static final void m26373b(CameraView cameraView) {
        C9971q.m14633g(cameraView, "<this>");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() == null) {
            throw new C6038c();
        } else if (cameraView.getActiveVideoRecording$react_native_vision_camera_release() != null) {
            C8201x0 activeVideoRecording$react_native_vision_camera_release = cameraView.getActiveVideoRecording$react_native_vision_camera_release();
            C9971q.m14636d(activeVideoRecording$react_native_vision_camera_release);
            activeVideoRecording$react_native_vision_camera_release.m20315n();
        } else {
            throw new C6043e0();
        }
    }

    /* renamed from: c */
    public static final void m26372c(CameraView cameraView, ReadableMap options, Callback onRecordCallback) {
        C9971q.m14633g(cameraView, "<this>");
        C9971q.m14633g(options, "options");
        C9971q.m14633g(onRecordCallback, "onRecordCallback");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() != null) {
            Boolean audio = cameraView.getAudio();
            Boolean bool = Boolean.TRUE;
            if (!C9971q.m14638b(audio, bool) || C2337a.m38137a(cameraView.getContext(), "android.permission.RECORD_AUDIO") == 0) {
                if (options.hasKey("flash")) {
                    boolean b = C9971q.m14638b(options.getString("flash"), ViewProps.f37199ON);
                    AbstractC1874k camera$react_native_vision_camera_release = cameraView.getCamera$react_native_vision_camera_release();
                    C9971q.m14636d(camera$react_native_vision_camera_release);
                    camera$react_native_vision_camera_release.mo329b().mo3335f(b);
                }
                String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
                C8178p a = new C8178p.C8179a(File.createTempFile("VisionCamera-" + format, ".mp4")).m20369a();
                C9971q.m14634f(a, "Builder(file).build()");
                C8115c1<C8166o0> videoCapture$react_native_vision_camera_release = cameraView.getVideoCapture$react_native_vision_camera_release();
                C9971q.m14636d(videoCapture$react_native_vision_camera_release);
                C8166o0 T = videoCapture$react_native_vision_camera_release.m20556T();
                C9971q.m14634f(T, "videoCapture!!.output");
                C8192u f0 = T.m20449f0(cameraView.getContext(), a);
                C9971q.m14634f(f0, "recorder.prepareRecording(context, fileOptions)");
                if (C9971q.m14638b(cameraView.getAudio(), bool)) {
                    f0 = f0.m20335h();
                    C9971q.m14634f(f0, "recording.withAudioEnabled()");
                }
                cameraView.setActiveVideoRecording$react_native_vision_camera_release(f0.m20336g(C2337a.m38130h(cameraView.getContext()), new C6069a(onRecordCallback, cameraView)));
                return;
            }
            throw new C6039c0();
        } else if (C9971q.m14638b(cameraView.getVideo(), Boolean.TRUE)) {
            throw new C6038c();
        } else {
            throw new C6062l0();
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: d */
    public static final void m26371d(CameraView cameraView) {
        C9971q.m14633g(cameraView, "<this>");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() == null) {
            throw new C6038c();
        } else if (cameraView.getActiveVideoRecording$react_native_vision_camera_release() != null) {
            C8201x0 activeVideoRecording$react_native_vision_camera_release = cameraView.getActiveVideoRecording$react_native_vision_camera_release();
            C9971q.m14636d(activeVideoRecording$react_native_vision_camera_release);
            activeVideoRecording$react_native_vision_camera_release.m20314p();
            AbstractC1874k camera$react_native_vision_camera_release = cameraView.getCamera$react_native_vision_camera_release();
            C9971q.m14636d(camera$react_native_vision_camera_release);
            camera$react_native_vision_camera_release.mo329b().mo3335f(C9971q.m14638b(cameraView.getTorch(), ViewProps.f37199ON));
        } else {
            throw new C6043e0();
        }
    }
}
