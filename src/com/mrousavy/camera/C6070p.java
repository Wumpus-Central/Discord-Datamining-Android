package com.mrousavy.camera;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.camera.core.C1813g1;
import androidx.camera.core.ImageProxy;
import androidx.exifinterface.media.C2892a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C10135k0;
import kotlinx.coroutines.CoroutineScope;
import nf.C11093t;
import p339sf.C12894g;
import p353te.C13067k;
import p353te.C13069m;
import tf.C13076c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m15073d2 = {"Lcom/mrousavy/camera/CameraView;", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.p */
/* loaded from: classes6.dex */
public final class C6070p {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/facebook/react/bridge/WritableMap;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2", m14701f = "CameraView+TakePhoto.kt", m14700l = {22, 68, 87}, m14699m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.p$a */
    /* loaded from: classes6.dex */
    public static final class C6071a extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super WritableMap>, Object> {

        /* renamed from: k */
        Object f12333k;

        /* renamed from: l */
        Object f12334l;

        /* renamed from: m */
        long f12335m;

        /* renamed from: n */
        int f12336n;

        /* renamed from: o */
        int f12337o;

        /* renamed from: p */
        private /* synthetic */ Object f12338p;

        /* renamed from: q */
        final /* synthetic */ CameraView f12339q;

        /* renamed from: r */
        final /* synthetic */ ReadableMap f12340r;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$1", m14701f = "CameraView+TakePhoto.kt", m14700l = {}, m14699m = "invokeSuspend")
        /* renamed from: com.mrousavy.camera.p$a$a */
        /* loaded from: classes6.dex */
        public static final class C0176a extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: k */
            int f12341k;

            /* renamed from: l */
            final /* synthetic */ File f12342l;

            /* renamed from: m */
            final /* synthetic */ Ref$ObjectRef<C2892a> f12343m;

            /* renamed from: n */
            final /* synthetic */ boolean f12344n;

            /* renamed from: o */
            final /* synthetic */ Integer f12345o;

            /* renamed from: p */
            final /* synthetic */ ImageProxy f12346p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0176a(File file, Ref$ObjectRef<C2892a> ref$ObjectRef, boolean z, Integer num, ImageProxy imageProxy, Continuation<? super C0176a> continuation) {
                super(2, continuation);
                this.f12342l = file;
                this.f12343m = ref$ObjectRef;
                this.f12344n = z;
                this.f12345o = num;
                this.f12346p = imageProxy;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0176a(this.f12342l, this.f12343m, this.f12344n, this.f12345o, this.f12346p, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0176a) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Object invokeSuspend(Object obj) {
                boolean z;
                T t;
                C13080d.m4646d();
                if (this.f12341k == 0) {
                    C11093t.m10930b(obj);
                    Log.d("CameraView", "Saving picture to " + this.f12342l.getAbsolutePath() + "...");
                    Integer num = this.f12345o;
                    ImageProxy imageProxy = this.f12346p;
                    File file = this.f12342l;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (num != null && num.intValue() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C13069m.m4659b(imageProxy, file, z);
                    Log.i("CameraView.performance", "Finished image saving in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                    Ref$ObjectRef<C2892a> ref$ObjectRef = this.f12343m;
                    if (this.f12344n) {
                        t = 0;
                    } else {
                        t = new C2892a(this.f12342l);
                    }
                    ref$ObjectRef.f22069k = t;
                    return Unit.f22042a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/camera/core/ImageProxy;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$results$1", m14701f = "CameraView+TakePhoto.kt", m14700l = {116}, m14699m = "invokeSuspend")
        /* renamed from: com.mrousavy.camera.p$a$b */
        /* loaded from: classes6.dex */
        public static final class C6072b extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super ImageProxy>, Object> {

            /* renamed from: k */
            long f12347k;

            /* renamed from: l */
            Object f12348l;

            /* renamed from: m */
            Object f12349m;

            /* renamed from: n */
            int f12350n;

            /* renamed from: o */
            final /* synthetic */ CameraView f12351o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6072b(CameraView cameraView, Continuation<? super C6072b> continuation) {
                super(2, continuation);
                this.f12351o = cameraView;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C6072b(this.f12351o, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageProxy> continuation) {
                return ((C6072b) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Object invokeSuspend(Object obj) {
                Object d;
                long j;
                Continuation c;
                Object d2;
                d = C13080d.m4646d();
                int i = this.f12350n;
                if (i == 0) {
                    C11093t.m10930b(obj);
                    Log.d("CameraView", "Taking picture...");
                    long nanoTime = System.nanoTime();
                    C1813g1 imageCapture$react_native_vision_camera_release = this.f12351o.getImageCapture$react_native_vision_camera_release();
                    C9971q.m14636d(imageCapture$react_native_vision_camera_release);
                    ExecutorService takePhotoExecutor = this.f12351o.getTakePhotoExecutor$react_native_vision_camera_release();
                    C9971q.m14634f(takePhotoExecutor, "takePhotoExecutor");
                    this.f12348l = imageCapture$react_native_vision_camera_release;
                    this.f12349m = takePhotoExecutor;
                    this.f12347k = nanoTime;
                    this.f12350n = 1;
                    c = C13076c.m4647c(this);
                    C12894g gVar = new C12894g(c);
                    imageCapture$react_native_vision_camera_release.m39753n0(takePhotoExecutor, new C13067k(gVar));
                    obj = gVar.m5178a();
                    d2 = C13080d.m4646d();
                    if (obj == d2) {
                        C9933g.m14691c(this);
                    }
                    if (obj == d) {
                        return d;
                    }
                    j = nanoTime;
                } else if (i == 1) {
                    j = this.f12347k;
                    Executor executor = (Executor) this.f12349m;
                    C1813g1 g1Var = (C1813g1) this.f12348l;
                    C11093t.m10930b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ImageProxy imageProxy = (ImageProxy) obj;
                long nanoTime2 = System.nanoTime();
                Log.i("CameraView.performance", "Finished image capture in " + ((nanoTime2 - j) / 1000000) + "ms");
                return imageProxy;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$results$2", m14701f = "CameraView+TakePhoto.kt", m14700l = {}, m14699m = "invokeSuspend")
        /* renamed from: com.mrousavy.camera.p$a$c */
        /* loaded from: classes6.dex */
        public static final class C6073c extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super File>, Object> {

            /* renamed from: k */
            int f12352k;

            /* renamed from: l */
            final /* synthetic */ CameraView f12353l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6073c(CameraView cameraView, Continuation<? super C6073c> continuation) {
                super(2, continuation);
                this.f12353l = cameraView;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C6073c(this.f12353l, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
                return ((C6073c) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Object invokeSuspend(Object obj) {
                C13080d.m4646d();
                if (this.f12352k == 0) {
                    C11093t.m10930b(obj);
                    Log.d("CameraView", "Creating temp file...");
                    File createTempFile = File.createTempFile("mrousavy", ".jpg", this.f12353l.getContext().getCacheDir());
                    createTempFile.deleteOnExit();
                    return createTempFile;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6071a(CameraView cameraView, ReadableMap readableMap, Continuation<? super C6071a> continuation) {
            super(2, continuation);
            this.f12339q = cameraView;
            this.f12340r = readableMap;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C6071a aVar = new C6071a(this.f12339q, this.f12340r, continuation);
            aVar.f12338p = obj;
            return aVar;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WritableMap> continuation) {
            return ((C6071a) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        /* JADX WARN: Removed duplicated region for block: B:79:0x0244  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 652
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C6070p.C6071a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    /* renamed from: a */
    public static final Object m26369a(CameraView cameraView, ReadableMap readableMap, Continuation<? super WritableMap> continuation) {
        return C10135k0.m14181g(new C6071a(cameraView, readableMap, null), continuation);
    }
}
