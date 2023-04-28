package com.mrousavy.camera;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.MediaStreamTrack;

@Metadata(m15074d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0016\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0007J!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0013J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0010H\u0007J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0010H\u0007J!\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u0013J\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0010H\u0007J\u001a\u0010\"\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 H\u0007J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0007J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0007J!\u0010*\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b*\u0010\u0013J!\u0010,\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b,\u0010\u0013J\u001a\u0010.\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\nH\u0007J\u0018\u00100\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0010H\u0007J\u0018\u00102\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00101\u001a\u00020\nH\u0007J\u0018\u00104\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00103\u001a\u00020&H\u0007J\u0018\u00106\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0010H\u0007J\u0018\u00108\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00107\u001a\u00020\nH\u0007¨\u0006?"}, m15073d2 = {"Lcom/mrousavy/camera/CameraViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/mrousavy/camera/CameraView;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "view", "", "onAfterUpdateTransaction", "", "", "", "getExportedCustomDirectEventTypeConstants", "getName", "cameraId", "setCameraId", "", "photo", "setPhoto", "(Lcom/mrousavy/camera/CameraView;Ljava/lang/Boolean;)V", MediaStreamTrack.VIDEO_TRACK_KIND, "setVideo", MediaStreamTrack.AUDIO_TRACK_KIND, "setAudio", "enableFrameProcessor", "setEnableFrameProcessor", "enableDepthData", "setEnableDepthData", "enableHighQualityPhotos", "setEnableHighQualityPhotos", "enablePortraitEffectsMatteDelivery", "setEnablePortraitEffectsMatteDelivery", "Lcom/facebook/react/bridge/ReadableMap;", "format", "setFormat", "", "fps", "setFps", "", "frameProcessorFps", "setFrameProcessorFps", "hdr", "setHdr", "lowLightBoost", "setLowLightBoost", "colorSpace", "setColorSpace", "isActive", "setIsActive", "torch", "setTorch", "zoom", "setZoom", "enableZoomGesture", "setEnableZoomGesture", "orientation", "setOrientation", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class CameraViewManager extends ViewGroupManager<CameraView> {
    public static final String TAG = "CameraView";
    public static final C6027a Companion = new C6027a(null);
    private static final HashMap<CameraView, ArrayList<String>> cameraViewTransactions = new HashMap<>();

    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002RI\u0010\f\u001a4\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\bj\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\tj\b\u0012\u0004\u0012\u00020\u0004`\u000b`\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m15073d2 = {"Lcom/mrousavy/camera/CameraViewManager$a;", "", "Lcom/mrousavy/camera/CameraView;", "view", "", "changedProp", "", "b", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "cameraViewTransactions", "Ljava/util/HashMap;", "c", "()Ljava/util/HashMap;", "TAG", "Ljava/lang/String;", "<init>", "()V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.CameraViewManager$a */
    /* loaded from: classes6.dex */
    public static final class C6027a {
        private C6027a() {
        }

        public /* synthetic */ C6027a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m26404b(CameraView cameraView, String str) {
            if (m26403c().get(cameraView) == null) {
                m26403c().put(cameraView, new ArrayList<>());
            }
            ArrayList<String> arrayList = m26403c().get(cameraView);
            C9971q.m14636d(arrayList);
            arrayList.add(str);
        }

        /* renamed from: c */
        public final HashMap<CameraView, ArrayList<String>> m26403c() {
            return CameraViewManager.cameraViewTransactions;
        }
    }

    public CameraViewManager(ReactApplicationContext reactContext) {
        C9971q.m14633g(reactContext, "reactContext");
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("cameraViewReady", MapBuilder.m30831of("registrationName", "onViewReady")).put("cameraInitialized", MapBuilder.m30831of("registrationName", "onInitialized")).put("cameraError", MapBuilder.m30831of("registrationName", "onError")).put("cameraPerformanceSuggestionAvailable", MapBuilder.m30831of("registrationName", "onFrameProcessorPerformanceSuggestionAvailable")).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CameraView";
    }

    @ReactProp(name = MediaStreamTrack.AUDIO_TRACK_KIND)
    public final void setAudio(CameraView view, Boolean bool) {
        C9971q.m14633g(view, "view");
        if (!C9971q.m14638b(view.getAudio(), bool)) {
            Companion.m26404b(view, MediaStreamTrack.AUDIO_TRACK_KIND);
        }
        view.setAudio(bool);
    }

    @ReactProp(name = "cameraId")
    public final void setCameraId(CameraView view, String cameraId) {
        C9971q.m14633g(view, "view");
        C9971q.m14633g(cameraId, "cameraId");
        if (!C9971q.m14638b(view.getCameraId(), cameraId)) {
            Companion.m26404b(view, "cameraId");
        }
        view.setCameraId(cameraId);
    }

    @ReactProp(name = "colorSpace")
    public final void setColorSpace(CameraView view, String str) {
        C9971q.m14633g(view, "view");
        if (!C9971q.m14638b(view.getColorSpace(), str)) {
            Companion.m26404b(view, "colorSpace");
        }
        view.setColorSpace(str);
    }

    @ReactProp(name = "enableDepthData")
    public final void setEnableDepthData(CameraView view, boolean z) {
        C9971q.m14633g(view, "view");
        if (view.getEnableDepthData() != z) {
            Companion.m26404b(view, "enableDepthData");
        }
        view.setEnableDepthData(z);
    }

    @ReactProp(name = "enableFrameProcessor")
    public final void setEnableFrameProcessor(CameraView view, boolean z) {
        C9971q.m14633g(view, "view");
        if (view.getEnableFrameProcessor() != z) {
            Companion.m26404b(view, "enableFrameProcessor");
        }
        view.setEnableFrameProcessor(z);
    }

    @ReactProp(name = "enableHighQualityPhotos")
    public final void setEnableHighQualityPhotos(CameraView view, Boolean bool) {
        C9971q.m14633g(view, "view");
        if (!C9971q.m14638b(view.getEnableHighQualityPhotos(), bool)) {
            Companion.m26404b(view, "enableHighQualityPhotos");
        }
        view.setEnableHighQualityPhotos(bool);
    }

    @ReactProp(name = "enablePortraitEffectsMatteDelivery")
    public final void setEnablePortraitEffectsMatteDelivery(CameraView view, boolean z) {
        C9971q.m14633g(view, "view");
        if (view.getEnablePortraitEffectsMatteDelivery() != z) {
            Companion.m26404b(view, "enablePortraitEffectsMatteDelivery");
        }
        view.setEnablePortraitEffectsMatteDelivery(z);
    }

    @ReactProp(name = "enableZoomGesture")
    public final void setEnableZoomGesture(CameraView view, boolean z) {
        C9971q.m14633g(view, "view");
        if (view.getEnableZoomGesture() != z) {
            Companion.m26404b(view, "enableZoomGesture");
        }
        view.setEnableZoomGesture(z);
    }

    @ReactProp(name = "format")
    public final void setFormat(CameraView view, ReadableMap readableMap) {
        C9971q.m14633g(view, "view");
        if (!C9971q.m14638b(view.getFormat(), readableMap)) {
            Companion.m26404b(view, "format");
        }
        view.setFormat(readableMap);
    }

    @ReactProp(defaultInt = -1, name = "fps")
    public final void setFps(CameraView view, int i) {
        Integer num;
        C9971q.m14633g(view, "view");
        Integer fps = view.getFps();
        if (fps == null || fps.intValue() != i) {
            Companion.m26404b(view, "fps");
        }
        if (i > 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        view.setFps(num);
    }

    @ReactProp(defaultDouble = 1.0d, name = "frameProcessorFps")
    public final void setFrameProcessorFps(CameraView view, double d) {
        boolean z;
        C9971q.m14633g(view, "view");
        if (view.getFrameProcessorFps() == d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Companion.m26404b(view, "frameProcessorFps");
        }
        view.setFrameProcessorFps(d);
    }

    @ReactProp(name = "hdr")
    public final void setHdr(CameraView view, Boolean bool) {
        C9971q.m14633g(view, "view");
        if (!C9971q.m14638b(view.getHdr(), bool)) {
            Companion.m26404b(view, "hdr");
        }
        view.setHdr(bool);
    }

    @ReactProp(name = "isActive")
    public final void setIsActive(CameraView view, boolean z) {
        C9971q.m14633g(view, "view");
        if (view.m26412t() != z) {
            Companion.m26404b(view, "isActive");
        }
        view.setActive(z);
    }

    @ReactProp(name = "lowLightBoost")
    public final void setLowLightBoost(CameraView view, Boolean bool) {
        C9971q.m14633g(view, "view");
        if (!C9971q.m14638b(view.getLowLightBoost(), bool)) {
            Companion.m26404b(view, "lowLightBoost");
        }
        view.setLowLightBoost(bool);
    }

    @ReactProp(name = "orientation")
    public final void setOrientation(CameraView view, String orientation) {
        C9971q.m14633g(view, "view");
        C9971q.m14633g(orientation, "orientation");
        if (!C9971q.m14638b(view.getOrientation(), orientation)) {
            Companion.m26404b(view, "orientation");
        }
        view.setOrientation(orientation);
    }

    @ReactProp(name = "photo")
    public final void setPhoto(CameraView view, Boolean bool) {
        C9971q.m14633g(view, "view");
        if (!C9971q.m14638b(view.getPhoto(), bool)) {
            Companion.m26404b(view, "photo");
        }
        view.setPhoto(bool);
    }

    @ReactProp(name = "torch")
    public final void setTorch(CameraView view, String torch) {
        C9971q.m14633g(view, "view");
        C9971q.m14633g(torch, "torch");
        if (!C9971q.m14638b(view.getTorch(), torch)) {
            Companion.m26404b(view, "torch");
        }
        view.setTorch(torch);
    }

    @ReactProp(name = MediaStreamTrack.VIDEO_TRACK_KIND)
    public final void setVideo(CameraView view, Boolean bool) {
        C9971q.m14633g(view, "view");
        if (!C9971q.m14638b(view.getVideo(), bool)) {
            Companion.m26404b(view, MediaStreamTrack.VIDEO_TRACK_KIND);
        }
        view.setVideo(bool);
    }

    @ReactProp(name = "zoom")
    public final void setZoom(CameraView view, double d) {
        boolean z;
        C9971q.m14633g(view, "view");
        float f = (float) d;
        if (view.getZoom() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Companion.m26404b(view, "zoom");
        }
        view.setZoom(f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public CameraView createViewInstance(ThemedReactContext context) {
        C9971q.m14633g(context, "context");
        NativeModule nativeModule = context.getNativeModule(CameraViewModule.class);
        C9971q.m14636d(nativeModule);
        return new CameraView(context, ((CameraViewModule) nativeModule).getFrameProcessorThread());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(CameraView view) {
        C9971q.m14633g(view, "view");
        super.onAfterUpdateTransaction((CameraViewManager) view);
        HashMap<CameraView, ArrayList<String>> hashMap = cameraViewTransactions;
        ArrayList<String> arrayList = hashMap.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        view.m26410v(arrayList);
        hashMap.remove(view);
    }
}
