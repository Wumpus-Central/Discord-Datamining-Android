package com.mrousavy.camera.frameprocessor;

import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.UIManagerHelper;
import com.mrousavy.camera.C6064m0;
import com.mrousavy.camera.CameraView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p078e6.AbstractC6709a;

@Metadata(m15074d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 J\t\u0010\u000b\u001a\u00020\nH\u0082 J\u0011\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082 J\t\u0010\u000f\u001a\u00020\nH\u0082 J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006$"}, m15073d2 = {"Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;", "", "", "jsContext", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "jsCallInvokerHolder", "Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;", "scheduler", "Lcom/facebook/jni/HybridData;", "initHybrid", "", "initializeRuntime", "Lcom/mrousavy/camera/frameprocessor/FrameProcessorPlugin;", "plugin", "registerPlugin", "installJSIBindings", "", "viewId", "Lcom/mrousavy/camera/CameraView;", "findCameraViewById", "mHybridData", "Lcom/facebook/jni/HybridData;", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "a", "Ljava/lang/ref/WeakReference;", "mContext", "b", "Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;", "mScheduler", "context", "Ljava/util/concurrent/ExecutorService;", "frameProcessorThread", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/concurrent/ExecutorService;)V", "c", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class FrameProcessorRuntimeManager {

    /* renamed from: c */
    public static final C6046a f12303c = new C6046a(null);

    /* renamed from: d */
    private static final ArrayList<FrameProcessorPlugin> f12304d = new ArrayList<>();

    /* renamed from: e */
    private static boolean f12305e;

    /* renamed from: a */
    private WeakReference<ReactApplicationContext> f12306a;

    /* renamed from: b */
    private VisionCameraScheduler f12307b;
    @AbstractC6709a
    private HybridData mHybridData;

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m15073d2 = {"Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager$a;", "", "Ljava/util/ArrayList;", "Lcom/mrousavy/camera/frameprocessor/FrameProcessorPlugin;", "Lkotlin/collections/ArrayList;", "Plugins", "Ljava/util/ArrayList;", "b", "()Ljava/util/ArrayList;", "", "enableFrameProcessors", "Z", "a", "()Z", "setEnableFrameProcessors", "(Z)V", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.frameprocessor.FrameProcessorRuntimeManager$a */
    /* loaded from: classes6.dex */
    public static final class C6046a {
        private C6046a() {
        }

        public /* synthetic */ C6046a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m26392a() {
            return FrameProcessorRuntimeManager.f12305e;
        }

        /* renamed from: b */
        public final ArrayList<FrameProcessorPlugin> m26391b() {
            return FrameProcessorRuntimeManager.f12304d;
        }
    }

    static {
        f12305e = true;
        try {
            System.loadLibrary("reanimated");
            System.loadLibrary("VisionCamera");
        } catch (UnsatisfiedLinkError unused) {
            Log.w("FrameProcessorRuntime", "Failed to load Reanimated/VisionCamera C++ library. Frame Processors are disabled!");
            f12305e = false;
        }
    }

    public FrameProcessorRuntimeManager(ReactApplicationContext context, ExecutorService frameProcessorThread) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(frameProcessorThread, "frameProcessorThread");
        if (f12305e) {
            CallInvokerHolder jSCallInvokerHolder = context.getCatalystInstance().getJSCallInvokerHolder();
            C9971q.m14635e(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
            this.f12307b = new VisionCameraScheduler(frameProcessorThread);
            this.f12306a = new WeakReference<>(context);
            long j = context.getJavaScriptContextHolder().get();
            VisionCameraScheduler visionCameraScheduler = this.f12307b;
            C9971q.m14636d(visionCameraScheduler);
            this.mHybridData = initHybrid(j, (CallInvokerHolderImpl) jSCallInvokerHolder, visionCameraScheduler);
            initializeRuntime();
            Log.i("FrameProcessorRuntime", "Installing Frame Processor Plugins...");
            for (FrameProcessorPlugin frameProcessorPlugin : f12304d) {
                registerPlugin(frameProcessorPlugin);
            }
            Log.i("FrameProcessorRuntime", "Successfully installed " + f12304d.size() + " Frame Processor Plugins!");
            Log.i("FrameProcessorRuntime", "Installing JSI Bindings on JS Thread...");
            context.runOnJSQueueThread(new Runnable() { // from class: com.mrousavy.camera.frameprocessor.b
                @Override // java.lang.Runnable
                public final void run() {
                    FrameProcessorRuntimeManager.m26395b(FrameProcessorRuntimeManager.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m26395b(FrameProcessorRuntimeManager this$0) {
        C9971q.m14633g(this$0, "this$0");
        this$0.installJSIBindings();
    }

    private final native HybridData initHybrid(long j, CallInvokerHolderImpl callInvokerHolderImpl, VisionCameraScheduler visionCameraScheduler);

    private final native void initializeRuntime();

    private final native void installJSIBindings();

    private final native void registerPlugin(FrameProcessorPlugin frameProcessorPlugin);

    @AbstractC6709a
    @Keep
    public final CameraView findCameraViewById(int i) {
        ReactApplicationContext reactApplicationContext;
        String str;
        StringBuilder sb2;
        Log.d("FrameProcessorRuntime", "Finding view " + i + "...");
        WeakReference<ReactApplicationContext> weakReference = this.f12306a;
        CameraView cameraView = null;
        View view = null;
        if (weakReference != null) {
            reactApplicationContext = weakReference.get();
        } else {
            reactApplicationContext = null;
        }
        if (reactApplicationContext != null) {
            UIManager uIManager = UIManagerHelper.getUIManager(reactApplicationContext, i);
            if (uIManager != null) {
                view = uIManager.resolveView(i);
            }
            cameraView = (CameraView) view;
        }
        if (cameraView != null) {
            sb2 = new StringBuilder();
            str = "Found view ";
        } else {
            sb2 = new StringBuilder();
            str = "Couldn't find view ";
        }
        sb2.append(str);
        sb2.append(i);
        sb2.append('!');
        Log.d("FrameProcessorRuntime", sb2.toString());
        if (cameraView != null) {
            return cameraView;
        }
        throw new C6064m0(i);
    }
}
