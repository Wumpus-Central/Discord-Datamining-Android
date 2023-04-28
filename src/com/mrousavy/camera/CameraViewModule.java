package com.mrousavy.camera;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import androidx.core.content.C2337a;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.UIManagerHelper;
import com.mrousavy.camera.frameprocessor.FrameProcessorRuntimeManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C10135k0;
import kotlinx.coroutines.C10139l;
import kotlinx.coroutines.C10230y0;
import kotlinx.coroutines.CoroutineScope;
import nf.C11093t;
import p353te.C13058b;
import tf.C13080d;

@ReactModule(name = "CameraView")
@Metadata(m15074d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 22\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J \u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J \u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J \u0010\u001b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00064"}, m15073d2 = {"Lcom/mrousavy/camera/CameraViewModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "cleanup", "", "viewId", "Lcom/mrousavy/camera/CameraView;", "findCameraView", "initialize", "onCatalystInstanceDestroy", "invalidate", "", "getName", "viewTag", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "takePhoto", "takeSnapshot", "Lcom/facebook/react/bridge/Callback;", "onRecordCallback", "startRecording", "pauseRecording", "resumeRecording", "stopRecording", "point", "focus", "getAvailableCameraDevices", "getCameraPermissionStatus", "getMicrophonePermissionStatus", "requestCameraPermission", "requestMicrophonePermission", "Ljava/util/concurrent/ExecutorService;", "frameProcessorThread", "Ljava/util/concurrent/ExecutorService;", "getFrameProcessorThread", "()Ljava/util/concurrent/ExecutorService;", "setFrameProcessorThread", "(Ljava/util/concurrent/ExecutorService;)V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;", "frameProcessorManager", "Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class CameraViewModule extends ReactContextBaseJavaModule {
    public static final C6028a Companion = new C6028a(null);
    private static int RequestCode = 10;
    public static final String TAG = "CameraView";
    private final CoroutineScope coroutineScope = C10135k0.m14187a(C10230y0.m13947a());
    private FrameProcessorRuntimeManager frameProcessorManager;
    private ExecutorService frameProcessorThread;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m15073d2 = {"Lcom/mrousavy/camera/CameraViewModule$a;", "", "", "status", "", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.CameraViewModule$a */
    /* loaded from: classes6.dex */
    public static final class C6028a {
        private C6028a() {
        }

        public /* synthetic */ C6028a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m26399a(int i) {
            return i != -1 ? i != 0 ? "not-determined" : "authorized" : "denied";
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraViewModule$focus$1", m14701f = "CameraViewModule.kt", m14700l = {162}, m14699m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$b */
    /* loaded from: classes6.dex */
    static final class C6029b extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        Object f12268k;

        /* renamed from: l */
        int f12269l;

        /* renamed from: m */
        final /* synthetic */ Promise f12270m;

        /* renamed from: n */
        final /* synthetic */ CameraViewModule f12271n;

        /* renamed from: o */
        final /* synthetic */ int f12272o;

        /* renamed from: p */
        final /* synthetic */ ReadableMap f12273p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6029b(Promise promise, CameraViewModule cameraViewModule, int i, ReadableMap readableMap, Continuation<? super C6029b> continuation) {
            super(2, continuation);
            this.f12270m = promise;
            this.f12271n = cameraViewModule;
            this.f12272o = i;
            this.f12273p = readableMap;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C6029b(this.f12270m, this.f12271n, this.f12272o, this.f12273p, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C6029b) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = tf.C13075b.m4650d()
                int r1 = r6.f12269l
                r2 = 1
                if (r1 == 0) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                java.lang.Object r0 = r6.f12268k
                com.facebook.react.bridge.Promise r0 = (com.facebook.react.bridge.Promise) r0
                nf.C11093t.m10930b(r7)     // Catch: all -> 0x0013
                goto L_0x0038
            L_0x0013:
                r7 = move-exception
                goto L_0x0041
            L_0x0015:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001d:
                nf.C11093t.m10930b(r7)
                com.facebook.react.bridge.Promise r7 = r6.f12270m
                com.mrousavy.camera.CameraViewModule r1 = r6.f12271n
                int r3 = r6.f12272o
                com.facebook.react.bridge.ReadableMap r4 = r6.f12273p
                com.mrousavy.camera.CameraView r1 = com.mrousavy.camera.CameraViewModule.access$findCameraView(r1, r3)     // Catch: all -> 0x003d
                r6.f12268k = r7     // Catch: all -> 0x003d
                r6.f12269l = r2     // Catch: all -> 0x003d
                java.lang.Object r1 = com.mrousavy.camera.C6065n.m26375a(r1, r4, r6)     // Catch: all -> 0x003d
                if (r1 != r0) goto L_0x0037
                return r0
            L_0x0037:
                r0 = r7
            L_0x0038:
                r7 = 0
                r0.resolve(r7)     // Catch: all -> 0x0013
                goto L_0x0078
            L_0x003d:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L_0x0041:
                r7.printStackTrace()
                boolean r1 = r7 instanceof com.mrousavy.camera.AbstractC6034a
                if (r1 == 0) goto L_0x004b
                com.mrousavy.camera.a r7 = (com.mrousavy.camera.AbstractC6034a) r7
                goto L_0x0051
            L_0x004b:
                com.mrousavy.camera.j0 r1 = new com.mrousavy.camera.j0
                r1.<init>(r7)
                r7 = r1
            L_0x0051:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r7.m26398a()
                r1.append(r2)
                r2 = 47
                r1.append(r2)
                java.lang.String r2 = r7.m26397b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r7.getMessage()
                java.lang.Throwable r7 = r7.getCause()
                r0.reject(r1, r2, r7)
            L_0x0078:
                kotlin.Unit r7 = kotlin.Unit.f22042a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.C6029b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraViewModule$getAvailableCameraDevices$1", m14701f = "CameraViewModule.kt", m14700l = {175, 176, 177}, m14699m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$c */
    /* loaded from: classes6.dex */
    static final class C6030c extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        Object f12274k;

        /* renamed from: l */
        Object f12275l;

        /* renamed from: m */
        Object f12276m;

        /* renamed from: n */
        Object f12277n;

        /* renamed from: o */
        long f12278o;

        /* renamed from: p */
        int f12279p;

        /* renamed from: q */
        final /* synthetic */ Promise f12280q;

        /* renamed from: r */
        final /* synthetic */ CameraViewModule f12281r;

        /* renamed from: s */
        final /* synthetic */ long f12282s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6030c(Promise promise, CameraViewModule cameraViewModule, long j, Continuation<? super C6030c> continuation) {
            super(2, continuation);
            this.f12280q = promise;
            this.f12281r = cameraViewModule;
            this.f12282s = j;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C6030c(this.f12280q, this.f12281r, this.f12282s, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C6030c) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x02c6 A[Catch: all -> 0x0667, TryCatch #2 {all -> 0x0667, blocks: (B:44:0x0144, B:48:0x0151, B:52:0x01a2, B:54:0x01c9, B:58:0x01db, B:60:0x01e7, B:65:0x020e, B:67:0x022f, B:68:0x0250, B:72:0x025a, B:76:0x0264, B:80:0x026e, B:84:0x0278, B:88:0x0282, B:92:0x028c, B:96:0x0296, B:99:0x02a7, B:100:0x02c6, B:101:0x02cf, B:103:0x02e7, B:104:0x0306, B:106:0x030c, B:107:0x0324, B:108:0x0328, B:110:0x033a, B:111:0x0355, B:114:0x0363, B:117:0x036e, B:118:0x037a, B:121:0x038e, B:123:0x0394, B:125:0x03a8, B:127:0x03c3, B:131:0x0409, B:134:0x0417, B:136:0x0421, B:138:0x0443, B:140:0x0449, B:141:0x0485, B:143:0x049b, B:145:0x04a4, B:148:0x04b3, B:150:0x04bc, B:152:0x04c5, B:153:0x04e9, B:155:0x04ef, B:157:0x0504, B:165:0x051c, B:167:0x0527, B:169:0x0532, B:171:0x0539, B:173:0x0544, B:177:0x054e, B:179:0x0555, B:181:0x055d, B:183:0x0564, B:185:0x056c, B:187:0x0576, B:189:0x057e, B:191:0x0585, B:195:0x059b, B:196:0x05d7, B:197:0x05fc, B:201:0x0639, B:129:0x03d6), top: B:218:0x0144 }] */
        /* JADX WARN: Removed duplicated region for block: B:103:0x02e7 A[Catch: all -> 0x0667, TryCatch #2 {all -> 0x0667, blocks: (B:44:0x0144, B:48:0x0151, B:52:0x01a2, B:54:0x01c9, B:58:0x01db, B:60:0x01e7, B:65:0x020e, B:67:0x022f, B:68:0x0250, B:72:0x025a, B:76:0x0264, B:80:0x026e, B:84:0x0278, B:88:0x0282, B:92:0x028c, B:96:0x0296, B:99:0x02a7, B:100:0x02c6, B:101:0x02cf, B:103:0x02e7, B:104:0x0306, B:106:0x030c, B:107:0x0324, B:108:0x0328, B:110:0x033a, B:111:0x0355, B:114:0x0363, B:117:0x036e, B:118:0x037a, B:121:0x038e, B:123:0x0394, B:125:0x03a8, B:127:0x03c3, B:131:0x0409, B:134:0x0417, B:136:0x0421, B:138:0x0443, B:140:0x0449, B:141:0x0485, B:143:0x049b, B:145:0x04a4, B:148:0x04b3, B:150:0x04bc, B:152:0x04c5, B:153:0x04e9, B:155:0x04ef, B:157:0x0504, B:165:0x051c, B:167:0x0527, B:169:0x0532, B:171:0x0539, B:173:0x0544, B:177:0x054e, B:179:0x0555, B:181:0x055d, B:183:0x0564, B:185:0x056c, B:187:0x0576, B:189:0x057e, B:191:0x0585, B:195:0x059b, B:196:0x05d7, B:197:0x05fc, B:201:0x0639, B:129:0x03d6), top: B:218:0x0144 }] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0324 A[Catch: all -> 0x0667, TryCatch #2 {all -> 0x0667, blocks: (B:44:0x0144, B:48:0x0151, B:52:0x01a2, B:54:0x01c9, B:58:0x01db, B:60:0x01e7, B:65:0x020e, B:67:0x022f, B:68:0x0250, B:72:0x025a, B:76:0x0264, B:80:0x026e, B:84:0x0278, B:88:0x0282, B:92:0x028c, B:96:0x0296, B:99:0x02a7, B:100:0x02c6, B:101:0x02cf, B:103:0x02e7, B:104:0x0306, B:106:0x030c, B:107:0x0324, B:108:0x0328, B:110:0x033a, B:111:0x0355, B:114:0x0363, B:117:0x036e, B:118:0x037a, B:121:0x038e, B:123:0x0394, B:125:0x03a8, B:127:0x03c3, B:131:0x0409, B:134:0x0417, B:136:0x0421, B:138:0x0443, B:140:0x0449, B:141:0x0485, B:143:0x049b, B:145:0x04a4, B:148:0x04b3, B:150:0x04bc, B:152:0x04c5, B:153:0x04e9, B:155:0x04ef, B:157:0x0504, B:165:0x051c, B:167:0x0527, B:169:0x0532, B:171:0x0539, B:173:0x0544, B:177:0x054e, B:179:0x0555, B:181:0x055d, B:183:0x0564, B:185:0x056c, B:187:0x0576, B:189:0x057e, B:191:0x0585, B:195:0x059b, B:196:0x05d7, B:197:0x05fc, B:201:0x0639, B:129:0x03d6), top: B:218:0x0144 }] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x033a A[Catch: all -> 0x0667, LOOP:2: B:109:0x0338->B:110:0x033a, LOOP_END, TryCatch #2 {all -> 0x0667, blocks: (B:44:0x0144, B:48:0x0151, B:52:0x01a2, B:54:0x01c9, B:58:0x01db, B:60:0x01e7, B:65:0x020e, B:67:0x022f, B:68:0x0250, B:72:0x025a, B:76:0x0264, B:80:0x026e, B:84:0x0278, B:88:0x0282, B:92:0x028c, B:96:0x0296, B:99:0x02a7, B:100:0x02c6, B:101:0x02cf, B:103:0x02e7, B:104:0x0306, B:106:0x030c, B:107:0x0324, B:108:0x0328, B:110:0x033a, B:111:0x0355, B:114:0x0363, B:117:0x036e, B:118:0x037a, B:121:0x038e, B:123:0x0394, B:125:0x03a8, B:127:0x03c3, B:131:0x0409, B:134:0x0417, B:136:0x0421, B:138:0x0443, B:140:0x0449, B:141:0x0485, B:143:0x049b, B:145:0x04a4, B:148:0x04b3, B:150:0x04bc, B:152:0x04c5, B:153:0x04e9, B:155:0x04ef, B:157:0x0504, B:165:0x051c, B:167:0x0527, B:169:0x0532, B:171:0x0539, B:173:0x0544, B:177:0x054e, B:179:0x0555, B:181:0x055d, B:183:0x0564, B:185:0x056c, B:187:0x0576, B:189:0x057e, B:191:0x0585, B:195:0x059b, B:196:0x05d7, B:197:0x05fc, B:201:0x0639, B:129:0x03d6), top: B:218:0x0144 }] */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0361  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0363 A[Catch: all -> 0x0667, TryCatch #2 {all -> 0x0667, blocks: (B:44:0x0144, B:48:0x0151, B:52:0x01a2, B:54:0x01c9, B:58:0x01db, B:60:0x01e7, B:65:0x020e, B:67:0x022f, B:68:0x0250, B:72:0x025a, B:76:0x0264, B:80:0x026e, B:84:0x0278, B:88:0x0282, B:92:0x028c, B:96:0x0296, B:99:0x02a7, B:100:0x02c6, B:101:0x02cf, B:103:0x02e7, B:104:0x0306, B:106:0x030c, B:107:0x0324, B:108:0x0328, B:110:0x033a, B:111:0x0355, B:114:0x0363, B:117:0x036e, B:118:0x037a, B:121:0x038e, B:123:0x0394, B:125:0x03a8, B:127:0x03c3, B:131:0x0409, B:134:0x0417, B:136:0x0421, B:138:0x0443, B:140:0x0449, B:141:0x0485, B:143:0x049b, B:145:0x04a4, B:148:0x04b3, B:150:0x04bc, B:152:0x04c5, B:153:0x04e9, B:155:0x04ef, B:157:0x0504, B:165:0x051c, B:167:0x0527, B:169:0x0532, B:171:0x0539, B:173:0x0544, B:177:0x054e, B:179:0x0555, B:181:0x055d, B:183:0x0564, B:185:0x056c, B:187:0x0576, B:189:0x057e, B:191:0x0585, B:195:0x059b, B:196:0x05d7, B:197:0x05fc, B:201:0x0639, B:129:0x03d6), top: B:218:0x0144 }] */
        /* JADX WARN: Removed duplicated region for block: B:125:0x03a8 A[Catch: all -> 0x0667, TryCatch #2 {all -> 0x0667, blocks: (B:44:0x0144, B:48:0x0151, B:52:0x01a2, B:54:0x01c9, B:58:0x01db, B:60:0x01e7, B:65:0x020e, B:67:0x022f, B:68:0x0250, B:72:0x025a, B:76:0x0264, B:80:0x026e, B:84:0x0278, B:88:0x0282, B:92:0x028c, B:96:0x0296, B:99:0x02a7, B:100:0x02c6, B:101:0x02cf, B:103:0x02e7, B:104:0x0306, B:106:0x030c, B:107:0x0324, B:108:0x0328, B:110:0x033a, B:111:0x0355, B:114:0x0363, B:117:0x036e, B:118:0x037a, B:121:0x038e, B:123:0x0394, B:125:0x03a8, B:127:0x03c3, B:131:0x0409, B:134:0x0417, B:136:0x0421, B:138:0x0443, B:140:0x0449, B:141:0x0485, B:143:0x049b, B:145:0x04a4, B:148:0x04b3, B:150:0x04bc, B:152:0x04c5, B:153:0x04e9, B:155:0x04ef, B:157:0x0504, B:165:0x051c, B:167:0x0527, B:169:0x0532, B:171:0x0539, B:173:0x0544, B:177:0x054e, B:179:0x0555, B:181:0x055d, B:183:0x0564, B:185:0x056c, B:187:0x0576, B:189:0x057e, B:191:0x0585, B:195:0x059b, B:196:0x05d7, B:197:0x05fc, B:201:0x0639, B:129:0x03d6), top: B:218:0x0144 }] */
        /* JADX WARN: Removed duplicated region for block: B:206:0x066b A[Catch: all -> 0x0671, TryCatch #5 {all -> 0x0671, blocks: (B:8:0x002b, B:17:0x005a, B:20:0x0069, B:23:0x0083, B:31:0x00ce, B:33:0x00dc, B:36:0x00e2, B:203:0x0663, B:206:0x066b, B:207:0x0670), top: B:222:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:211:0x0679  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x067c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dc A[Catch: all -> 0x0671, TryCatch #5 {all -> 0x0671, blocks: (B:8:0x002b, B:17:0x005a, B:20:0x0069, B:23:0x0083, B:31:0x00ce, B:33:0x00dc, B:36:0x00e2, B:203:0x0663, B:206:0x066b, B:207:0x0670), top: B:222:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e2 A[Catch: all -> 0x0671, TRY_LEAVE, TryCatch #5 {all -> 0x0671, blocks: (B:8:0x002b, B:17:0x005a, B:20:0x0069, B:23:0x0083, B:31:0x00ce, B:33:0x00dc, B:36:0x00e2, B:203:0x0663, B:206:0x066b, B:207:0x0670), top: B:222:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01c9 A[Catch: all -> 0x0667, TryCatch #2 {all -> 0x0667, blocks: (B:44:0x0144, B:48:0x0151, B:52:0x01a2, B:54:0x01c9, B:58:0x01db, B:60:0x01e7, B:65:0x020e, B:67:0x022f, B:68:0x0250, B:72:0x025a, B:76:0x0264, B:80:0x026e, B:84:0x0278, B:88:0x0282, B:92:0x028c, B:96:0x0296, B:99:0x02a7, B:100:0x02c6, B:101:0x02cf, B:103:0x02e7, B:104:0x0306, B:106:0x030c, B:107:0x0324, B:108:0x0328, B:110:0x033a, B:111:0x0355, B:114:0x0363, B:117:0x036e, B:118:0x037a, B:121:0x038e, B:123:0x0394, B:125:0x03a8, B:127:0x03c3, B:131:0x0409, B:134:0x0417, B:136:0x0421, B:138:0x0443, B:140:0x0449, B:141:0x0485, B:143:0x049b, B:145:0x04a4, B:148:0x04b3, B:150:0x04bc, B:152:0x04c5, B:153:0x04e9, B:155:0x04ef, B:157:0x0504, B:165:0x051c, B:167:0x0527, B:169:0x0532, B:171:0x0539, B:173:0x0544, B:177:0x054e, B:179:0x0555, B:181:0x055d, B:183:0x0564, B:185:0x056c, B:187:0x0576, B:189:0x057e, B:191:0x0585, B:195:0x059b, B:196:0x05d7, B:197:0x05fc, B:201:0x0639, B:129:0x03d6), top: B:218:0x0144 }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01db A[Catch: all -> 0x0667, TryCatch #2 {all -> 0x0667, blocks: (B:44:0x0144, B:48:0x0151, B:52:0x01a2, B:54:0x01c9, B:58:0x01db, B:60:0x01e7, B:65:0x020e, B:67:0x022f, B:68:0x0250, B:72:0x025a, B:76:0x0264, B:80:0x026e, B:84:0x0278, B:88:0x0282, B:92:0x028c, B:96:0x0296, B:99:0x02a7, B:100:0x02c6, B:101:0x02cf, B:103:0x02e7, B:104:0x0306, B:106:0x030c, B:107:0x0324, B:108:0x0328, B:110:0x033a, B:111:0x0355, B:114:0x0363, B:117:0x036e, B:118:0x037a, B:121:0x038e, B:123:0x0394, B:125:0x03a8, B:127:0x03c3, B:131:0x0409, B:134:0x0417, B:136:0x0421, B:138:0x0443, B:140:0x0449, B:141:0x0485, B:143:0x049b, B:145:0x04a4, B:148:0x04b3, B:150:0x04bc, B:152:0x04c5, B:153:0x04e9, B:155:0x04ef, B:157:0x0504, B:165:0x051c, B:167:0x0527, B:169:0x0532, B:171:0x0539, B:173:0x0544, B:177:0x054e, B:179:0x0555, B:181:0x055d, B:183:0x0564, B:185:0x056c, B:187:0x0576, B:189:0x057e, B:191:0x0585, B:195:0x059b, B:196:0x05d7, B:197:0x05fc, B:201:0x0639, B:129:0x03d6), top: B:218:0x0144 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x022f A[Catch: all -> 0x0667, TryCatch #2 {all -> 0x0667, blocks: (B:44:0x0144, B:48:0x0151, B:52:0x01a2, B:54:0x01c9, B:58:0x01db, B:60:0x01e7, B:65:0x020e, B:67:0x022f, B:68:0x0250, B:72:0x025a, B:76:0x0264, B:80:0x026e, B:84:0x0278, B:88:0x0282, B:92:0x028c, B:96:0x0296, B:99:0x02a7, B:100:0x02c6, B:101:0x02cf, B:103:0x02e7, B:104:0x0306, B:106:0x030c, B:107:0x0324, B:108:0x0328, B:110:0x033a, B:111:0x0355, B:114:0x0363, B:117:0x036e, B:118:0x037a, B:121:0x038e, B:123:0x0394, B:125:0x03a8, B:127:0x03c3, B:131:0x0409, B:134:0x0417, B:136:0x0421, B:138:0x0443, B:140:0x0449, B:141:0x0485, B:143:0x049b, B:145:0x04a4, B:148:0x04b3, B:150:0x04bc, B:152:0x04c5, B:153:0x04e9, B:155:0x04ef, B:157:0x0504, B:165:0x051c, B:167:0x0527, B:169:0x0532, B:171:0x0539, B:173:0x0544, B:177:0x054e, B:179:0x0555, B:181:0x055d, B:183:0x0564, B:185:0x056c, B:187:0x0576, B:189:0x057e, B:191:0x0585, B:195:0x059b, B:196:0x05d7, B:197:0x05fc, B:201:0x0639, B:129:0x03d6), top: B:218:0x0144 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0257  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0261  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0263  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x026b  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0275  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0277  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x027f  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0281  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0289  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x028b  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0293  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0295  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x02a7 A[Catch: all -> 0x0667, TRY_ENTER, TryCatch #2 {all -> 0x0667, blocks: (B:44:0x0144, B:48:0x0151, B:52:0x01a2, B:54:0x01c9, B:58:0x01db, B:60:0x01e7, B:65:0x020e, B:67:0x022f, B:68:0x0250, B:72:0x025a, B:76:0x0264, B:80:0x026e, B:84:0x0278, B:88:0x0282, B:92:0x028c, B:96:0x0296, B:99:0x02a7, B:100:0x02c6, B:101:0x02cf, B:103:0x02e7, B:104:0x0306, B:106:0x030c, B:107:0x0324, B:108:0x0328, B:110:0x033a, B:111:0x0355, B:114:0x0363, B:117:0x036e, B:118:0x037a, B:121:0x038e, B:123:0x0394, B:125:0x03a8, B:127:0x03c3, B:131:0x0409, B:134:0x0417, B:136:0x0421, B:138:0x0443, B:140:0x0449, B:141:0x0485, B:143:0x049b, B:145:0x04a4, B:148:0x04b3, B:150:0x04bc, B:152:0x04c5, B:153:0x04e9, B:155:0x04ef, B:157:0x0504, B:165:0x051c, B:167:0x0527, B:169:0x0532, B:171:0x0539, B:173:0x0544, B:177:0x054e, B:179:0x0555, B:181:0x055d, B:183:0x0564, B:185:0x056c, B:187:0x0576, B:189:0x057e, B:191:0x0585, B:195:0x059b, B:196:0x05d7, B:197:0x05fc, B:201:0x0639, B:129:0x03d6), top: B:218:0x0144 }] */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r52) {
            /*
                Method dump skipped, instructions count: 1708
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.C6030c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraViewModule$startRecording$1", m14701f = "CameraViewModule.kt", m14700l = {}, m14699m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$d */
    /* loaded from: classes6.dex */
    static final class C6031d extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        int f12283k;

        /* renamed from: m */
        final /* synthetic */ int f12285m;

        /* renamed from: n */
        final /* synthetic */ ReadableMap f12286n;

        /* renamed from: o */
        final /* synthetic */ Callback f12287o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6031d(int i, ReadableMap readableMap, Callback callback, Continuation<? super C6031d> continuation) {
            super(2, continuation);
            this.f12285m = i;
            this.f12286n = readableMap;
            this.f12287o = callback;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C6031d(this.f12285m, this.f12286n, this.f12287o, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C6031d) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            C13080d.m4646d();
            if (this.f12283k == 0) {
                C11093t.m10930b(obj);
                try {
                    C6068o.m26372c(CameraViewModule.this.findCameraView(this.f12285m), this.f12286n, this.f12287o);
                } catch (AbstractC6034a e) {
                    this.f12287o.invoke(null, C13058b.m4676c(e.m26398a() + '/' + e.m26397b(), e.getMessage(), e, null, 8, null));
                } catch (Throwable th2) {
                    this.f12287o.invoke(null, C13058b.m4676c("capture/unknown", "An unknown error occurred while trying to start a video recording!", th2, null, 8, null));
                }
                return Unit.f22042a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraViewModule$takePhoto$1", m14701f = "CameraViewModule.kt", m14700l = {97}, m14699m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$e */
    /* loaded from: classes6.dex */
    static final class C6032e extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        Object f12288k;

        /* renamed from: l */
        int f12289l;

        /* renamed from: m */
        final /* synthetic */ Promise f12290m;

        /* renamed from: n */
        final /* synthetic */ CameraViewModule f12291n;

        /* renamed from: o */
        final /* synthetic */ int f12292o;

        /* renamed from: p */
        final /* synthetic */ ReadableMap f12293p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6032e(Promise promise, CameraViewModule cameraViewModule, int i, ReadableMap readableMap, Continuation<? super C6032e> continuation) {
            super(2, continuation);
            this.f12290m = promise;
            this.f12291n = cameraViewModule;
            this.f12292o = i;
            this.f12293p = readableMap;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C6032e(this.f12290m, this.f12291n, this.f12292o, this.f12293p, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C6032e) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = tf.C13075b.m4650d()
                int r1 = r6.f12289l
                r2 = 1
                if (r1 == 0) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                java.lang.Object r0 = r6.f12288k
                com.facebook.react.bridge.Promise r0 = (com.facebook.react.bridge.Promise) r0
                nf.C11093t.m10930b(r7)     // Catch: all -> 0x0013
                goto L_0x0039
            L_0x0013:
                r7 = move-exception
                goto L_0x0041
            L_0x0015:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001d:
                nf.C11093t.m10930b(r7)
                com.facebook.react.bridge.Promise r7 = r6.f12290m
                com.mrousavy.camera.CameraViewModule r1 = r6.f12291n
                int r3 = r6.f12292o
                com.facebook.react.bridge.ReadableMap r4 = r6.f12293p
                com.mrousavy.camera.CameraView r1 = com.mrousavy.camera.CameraViewModule.access$findCameraView(r1, r3)     // Catch: all -> 0x003d
                r6.f12288k = r7     // Catch: all -> 0x003d
                r6.f12289l = r2     // Catch: all -> 0x003d
                java.lang.Object r1 = com.mrousavy.camera.C6070p.m26369a(r1, r4, r6)     // Catch: all -> 0x003d
                if (r1 != r0) goto L_0x0037
                return r0
            L_0x0037:
                r0 = r7
                r7 = r1
            L_0x0039:
                r0.resolve(r7)     // Catch: all -> 0x0013
                goto L_0x0078
            L_0x003d:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L_0x0041:
                r7.printStackTrace()
                boolean r1 = r7 instanceof com.mrousavy.camera.AbstractC6034a
                if (r1 == 0) goto L_0x004b
                com.mrousavy.camera.a r7 = (com.mrousavy.camera.AbstractC6034a) r7
                goto L_0x0051
            L_0x004b:
                com.mrousavy.camera.j0 r1 = new com.mrousavy.camera.j0
                r1.<init>(r7)
                r7 = r1
            L_0x0051:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r7.m26398a()
                r1.append(r2)
                r2 = 47
                r1.append(r2)
                java.lang.String r2 = r7.m26397b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r7.getMessage()
                java.lang.Throwable r7 = r7.getCause()
                r0.reject(r1, r2, r7)
            L_0x0078:
                kotlin.Unit r7 = kotlin.Unit.f22042a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.C6032e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraViewModule$takeSnapshot$1", m14701f = "CameraViewModule.kt", m14700l = {108}, m14699m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$f */
    /* loaded from: classes6.dex */
    static final class C6033f extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        Object f12294k;

        /* renamed from: l */
        int f12295l;

        /* renamed from: m */
        final /* synthetic */ Promise f12296m;

        /* renamed from: n */
        final /* synthetic */ CameraViewModule f12297n;

        /* renamed from: o */
        final /* synthetic */ int f12298o;

        /* renamed from: p */
        final /* synthetic */ ReadableMap f12299p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6033f(Promise promise, CameraViewModule cameraViewModule, int i, ReadableMap readableMap, Continuation<? super C6033f> continuation) {
            super(2, continuation);
            this.f12296m = promise;
            this.f12297n = cameraViewModule;
            this.f12298o = i;
            this.f12299p = readableMap;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C6033f(this.f12296m, this.f12297n, this.f12298o, this.f12299p, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C6033f) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = tf.C13075b.m4650d()
                int r1 = r6.f12295l
                r2 = 1
                if (r1 == 0) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                java.lang.Object r0 = r6.f12294k
                com.facebook.react.bridge.Promise r0 = (com.facebook.react.bridge.Promise) r0
                nf.C11093t.m10930b(r7)     // Catch: all -> 0x0013
                goto L_0x0039
            L_0x0013:
                r7 = move-exception
                goto L_0x0041
            L_0x0015:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001d:
                nf.C11093t.m10930b(r7)
                com.facebook.react.bridge.Promise r7 = r6.f12296m
                com.mrousavy.camera.CameraViewModule r1 = r6.f12297n
                int r3 = r6.f12298o
                com.facebook.react.bridge.ReadableMap r4 = r6.f12299p
                com.mrousavy.camera.CameraView r1 = com.mrousavy.camera.CameraViewModule.access$findCameraView(r1, r3)     // Catch: all -> 0x003d
                r6.f12294k = r7     // Catch: all -> 0x003d
                r6.f12295l = r2     // Catch: all -> 0x003d
                java.lang.Object r1 = com.mrousavy.camera.C6074q.m26368a(r1, r4, r6)     // Catch: all -> 0x003d
                if (r1 != r0) goto L_0x0037
                return r0
            L_0x0037:
                r0 = r7
                r7 = r1
            L_0x0039:
                r0.resolve(r7)     // Catch: all -> 0x0013
                goto L_0x0078
            L_0x003d:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L_0x0041:
                r7.printStackTrace()
                boolean r1 = r7 instanceof com.mrousavy.camera.AbstractC6034a
                if (r1 == 0) goto L_0x004b
                com.mrousavy.camera.a r7 = (com.mrousavy.camera.AbstractC6034a) r7
                goto L_0x0051
            L_0x004b:
                com.mrousavy.camera.j0 r1 = new com.mrousavy.camera.j0
                r1.<init>(r7)
                r7 = r1
            L_0x0051:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r7.m26398a()
                r1.append(r2)
                r2 = 47
                r1.append(r2)
                java.lang.String r2 = r7.m26397b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r7.getMessage()
                java.lang.Throwable r7 = r7.getCause()
                r0.reject(r1, r2, r7)
            L_0x0078:
                kotlin.Unit r7 = kotlin.Unit.f22042a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.C6033f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraViewModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9971q.m14633g(reactContext, "reactContext");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C9971q.m14634f(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.frameProcessorThread = newSingleThreadExecutor;
    }

    private final void cleanup() {
        if (C10135k0.m14180h(this.coroutineScope)) {
            C10135k0.m14183e(this.coroutineScope, "CameraViewModule has been destroyed.", null, 2, null);
        }
        this.frameProcessorManager = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraView findCameraView(int i) {
        String str;
        StringBuilder sb2;
        Log.d("CameraView", "Finding view " + i + "...");
        CameraView cameraView = null;
        View view = null;
        if (getReactApplicationContext() != null) {
            UIManager uIManager = UIManagerHelper.getUIManager(getReactApplicationContext(), i);
            if (uIManager != null) {
                view = uIManager.resolveView(i);
            }
            cameraView = (CameraView) view;
        }
        if (getReactApplicationContext() != null) {
            sb2 = new StringBuilder();
            str = "Found view ";
        } else {
            sb2 = new StringBuilder();
            str = "Couldn't find view ";
        }
        sb2.append(str);
        sb2.append(i);
        sb2.append('!');
        Log.d("CameraView", sb2.toString());
        if (cameraView != null) {
            return cameraView;
        }
        throw new C6064m0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$0(CameraViewModule this$0) {
        C9971q.m14633g(this$0, "this$0");
        ReactApplicationContext reactApplicationContext = this$0.getReactApplicationContext();
        C9971q.m14634f(reactApplicationContext, "reactApplicationContext");
        this$0.frameProcessorManager = new FrameProcessorRuntimeManager(reactApplicationContext, this$0.frameProcessorThread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requestCameraPermission$lambda$4(int i, Promise promise, int i2, String[] strArr, int[] grantResults) {
        boolean z;
        int i3;
        C9971q.m14633g(promise, "$promise");
        C9971q.m14633g(strArr, "<anonymous parameter 1>");
        C9971q.m14633g(grantResults, "grantResults");
        if (i2 != i) {
            return false;
        }
        if (grantResults.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i3 = grantResults[0];
        } else {
            i3 = -1;
        }
        promise.resolve(Companion.m26399a(i3));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requestMicrophonePermission$lambda$5(int i, Promise promise, int i2, String[] strArr, int[] grantResults) {
        boolean z;
        int i3;
        C9971q.m14633g(promise, "$promise");
        C9971q.m14633g(strArr, "<anonymous parameter 1>");
        C9971q.m14633g(grantResults, "grantResults");
        if (i2 != i) {
            return false;
        }
        if (grantResults.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i3 = grantResults[0];
        } else {
            i3 = -1;
        }
        promise.resolve(Companion.m26399a(i3));
        return true;
    }

    @ReactMethod
    public final void focus(int i, ReadableMap point, Promise promise) {
        C9971q.m14633g(point, "point");
        C9971q.m14633g(promise, "promise");
        C10139l.m14174d(this.coroutineScope, null, null, new C6029b(promise, this, i, point, null), 3, null);
    }

    @ReactMethod
    public final void getAvailableCameraDevices(Promise promise) {
        C9971q.m14633g(promise, "promise");
        C10139l.m14174d(this.coroutineScope, null, null, new C6030c(promise, this, System.currentTimeMillis(), null), 3, null);
    }

    @ReactMethod
    public final void getCameraPermissionStatus(Promise promise) {
        C9971q.m14633g(promise, "promise");
        promise.resolve(Companion.m26399a(C2337a.m38137a(getReactApplicationContext(), "android.permission.CAMERA")));
    }

    public final ExecutorService getFrameProcessorThread() {
        return this.frameProcessorThread;
    }

    @ReactMethod
    public final void getMicrophonePermissionStatus(Promise promise) {
        C9971q.m14633g(promise, "promise");
        promise.resolve(Companion.m26399a(C2337a.m38137a(getReactApplicationContext(), "android.permission.RECORD_AUDIO")));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CameraView";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        if (this.frameProcessorManager == null) {
            this.frameProcessorThread.execute(new Runnable() { // from class: com.mrousavy.camera.k
                @Override // java.lang.Runnable
                public final void run() {
                    CameraViewModule.initialize$lambda$0(CameraViewModule.this);
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        cleanup();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        cleanup();
    }

    @ReactMethod
    public final void pauseRecording(int i, Promise promise) {
        AbstractC6034a aVar;
        C9971q.m14633g(promise, "promise");
        try {
            C6068o.m26374a(findCameraView(i));
            promise.resolve(null);
        } catch (Throwable th2) {
            th2.printStackTrace();
            if (th2 instanceof AbstractC6034a) {
                aVar = th2;
            } else {
                aVar = new C6058j0(th2);
            }
            promise.reject(aVar.m26398a() + '/' + aVar.m26397b(), aVar.getMessage(), aVar.getCause());
        }
    }

    @ReactMethod
    public final void requestCameraPermission(final Promise promise) {
        C9971q.m14633g(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity instanceof PermissionAwareActivity) {
            final int i = RequestCode;
            RequestCode = i + 1;
            ((PermissionAwareActivity) currentActivity).requestPermissions(new String[]{"android.permission.CAMERA"}, i, new PermissionListener() { // from class: com.mrousavy.camera.i
                @Override // com.facebook.react.modules.core.PermissionListener
                public final boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
                    boolean requestCameraPermission$lambda$4;
                    requestCameraPermission$lambda$4 = CameraViewModule.requestCameraPermission$lambda$4(i, promise, i2, strArr, iArr);
                    return requestCameraPermission$lambda$4;
                }
            });
            return;
        }
        promise.reject("NO_ACTIVITY", "No PermissionAwareActivity was found! Make sure the app has launched before calling this function.");
    }

    @ReactMethod
    public final void requestMicrophonePermission(final Promise promise) {
        C9971q.m14633g(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity instanceof PermissionAwareActivity) {
            final int i = RequestCode;
            RequestCode = i + 1;
            ((PermissionAwareActivity) currentActivity).requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, i, new PermissionListener() { // from class: com.mrousavy.camera.j
                @Override // com.facebook.react.modules.core.PermissionListener
                public final boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
                    boolean requestMicrophonePermission$lambda$5;
                    requestMicrophonePermission$lambda$5 = CameraViewModule.requestMicrophonePermission$lambda$5(i, promise, i2, strArr, iArr);
                    return requestMicrophonePermission$lambda$5;
                }
            });
            return;
        }
        promise.reject("NO_ACTIVITY", "No PermissionAwareActivity was found! Make sure the app has launched before calling this function.");
    }

    @ReactMethod
    public final void resumeRecording(int i, Promise promise) {
        AbstractC6034a aVar;
        C9971q.m14633g(promise, "promise");
        try {
            C6068o.m26373b(findCameraView(i));
            promise.resolve(null);
        } catch (Throwable th2) {
            th2.printStackTrace();
            if (th2 instanceof AbstractC6034a) {
                aVar = th2;
            } else {
                aVar = new C6058j0(th2);
            }
            promise.reject(aVar.m26398a() + '/' + aVar.m26397b(), aVar.getMessage(), aVar.getCause());
        }
    }

    public final void setFrameProcessorThread(ExecutorService executorService) {
        C9971q.m14633g(executorService, "<set-?>");
        this.frameProcessorThread = executorService;
    }

    @ReactMethod
    public final void startRecording(int i, ReadableMap options, Callback onRecordCallback) {
        C9971q.m14633g(options, "options");
        C9971q.m14633g(onRecordCallback, "onRecordCallback");
        C10139l.m14174d(this.coroutineScope, null, null, new C6031d(i, options, onRecordCallback, null), 3, null);
    }

    @ReactMethod
    public final void stopRecording(int i, Promise promise) {
        AbstractC6034a aVar;
        C9971q.m14633g(promise, "promise");
        try {
            C6068o.m26371d(findCameraView(i));
            promise.resolve(null);
        } catch (Throwable th2) {
            th2.printStackTrace();
            if (th2 instanceof AbstractC6034a) {
                aVar = th2;
            } else {
                aVar = new C6058j0(th2);
            }
            promise.reject(aVar.m26398a() + '/' + aVar.m26397b(), aVar.getMessage(), aVar.getCause());
        }
    }

    @ReactMethod
    public final void takePhoto(int i, ReadableMap options, Promise promise) {
        C9971q.m14633g(options, "options");
        C9971q.m14633g(promise, "promise");
        C10139l.m14174d(this.coroutineScope, null, null, new C6032e(promise, this, i, options, null), 3, null);
    }

    @ReactMethod
    public final void takeSnapshot(int i, ReadableMap options, Promise promise) {
        C9971q.m14633g(options, "options");
        C9971q.m14633g(promise, "promise");
        C10139l.m14174d(this.coroutineScope, null, null, new C6033f(promise, this, i, options, null), 3, null);
    }
}
