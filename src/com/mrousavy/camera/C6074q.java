package com.mrousavy.camera;

import android.graphics.Bitmap;
import androidx.exifinterface.media.C2892a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import nf.C11093t;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m15073d2 = {"Lcom/mrousavy/camera/CameraView;", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.q */
/* loaded from: classes6.dex */
public final class C6074q {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView_TakeSnapshotKt", m14701f = "CameraView+TakeSnapshot.kt", m14700l = {16}, m14699m = "takeSnapshot")
    /* renamed from: com.mrousavy.camera.q$a */
    /* loaded from: classes6.dex */
    public static final class C6075a extends AbstractC9930d {

        /* renamed from: k */
        /* synthetic */ Object f12354k;

        /* renamed from: l */
        int f12355l;

        C6075a(Continuation<? super C6075a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            this.f12354k = obj;
            this.f12355l |= Integer.MIN_VALUE;
            return C6074q.m26368a(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/facebook/react/bridge/WritableMap;", "kotlin.jvm.PlatformType", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2", m14701f = "CameraView+TakeSnapshot.kt", m14700l = {22, 25, 34}, m14699m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.q$b */
    /* loaded from: classes6.dex */
    public static final class C6076b extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super WritableMap>, Object> {

        /* renamed from: k */
        Object f12356k;

        /* renamed from: l */
        Object f12357l;

        /* renamed from: m */
        Object f12358m;

        /* renamed from: n */
        Object f12359n;

        /* renamed from: o */
        boolean f12360o;

        /* renamed from: p */
        int f12361p;

        /* renamed from: q */
        final /* synthetic */ CameraView f12362q;

        /* renamed from: r */
        final /* synthetic */ ReadableMap f12363r;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2$1", m14701f = "CameraView+TakeSnapshot.kt", m14700l = {}, m14699m = "invokeSuspend")
        /* renamed from: com.mrousavy.camera.q$b$a */
        /* loaded from: classes6.dex */
        public static final class C6077a extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: k */
            int f12364k;

            /* renamed from: l */
            final /* synthetic */ Ref$ObjectRef<File> f12365l;

            /* renamed from: m */
            final /* synthetic */ CameraView f12366m;

            /* renamed from: n */
            final /* synthetic */ Ref$ObjectRef<C2892a> f12367n;

            /* renamed from: o */
            final /* synthetic */ Bitmap f12368o;

            /* renamed from: p */
            final /* synthetic */ int f12369p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6077a(Ref$ObjectRef<File> ref$ObjectRef, CameraView cameraView, Ref$ObjectRef<C2892a> ref$ObjectRef2, Bitmap bitmap, int i, Continuation<? super C6077a> continuation) {
                super(2, continuation);
                this.f12365l = ref$ObjectRef;
                this.f12366m = cameraView;
                this.f12367n = ref$ObjectRef2;
                this.f12368o = bitmap;
                this.f12369p = i;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C6077a(this.f12365l, this.f12366m, this.f12367n, this.f12368o, this.f12369p, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C6077a) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.exifinterface.media.a] */
            /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object, java.io.File] */
            /* JADX WARN: Unknown variable types count: 1 */
            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    tf.C13075b.m4650d()
                    int r0 = r3.f12364k
                    if (r0 != 0) goto L_0x0059
                    nf.C11093t.m10930b(r4)
                    kotlin.jvm.internal.Ref$ObjectRef<java.io.File> r4 = r3.f12365l
                    com.mrousavy.camera.CameraView r0 = r3.f12366m
                    android.content.Context r0 = r0.getContext()
                    java.io.File r0 = r0.getCacheDir()
                    java.lang.String r1 = "mrousavy"
                    java.lang.String r2 = ".jpg"
                    java.io.File r0 = java.io.File.createTempFile(r1, r2, r0)
                    r0.deleteOnExit()
                    java.lang.String r1 = "createTempFile(\"mrousavy….apply { deleteOnExit() }"
                    kotlin.jvm.internal.C9971q.m14634f(r0, r1)
                    r4.f22069k = r0
                    java.io.FileOutputStream r4 = new java.io.FileOutputStream
                    kotlin.jvm.internal.Ref$ObjectRef<java.io.File> r0 = r3.f12365l
                    T r0 = r0.f22069k
                    java.io.File r0 = (java.io.File) r0
                    r4.<init>(r0)
                    android.graphics.Bitmap r0 = r3.f12368o
                    int r1 = r3.f12369p
                    android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: all -> 0x0052
                    r0.compress(r2, r1, r4)     // Catch: all -> 0x0052
                    r0 = 0
                    p426xf.C14082c.m1713a(r4, r0)
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.exifinterface.media.a> r4 = r3.f12367n
                    androidx.exifinterface.media.a r0 = new androidx.exifinterface.media.a
                    kotlin.jvm.internal.Ref$ObjectRef<java.io.File> r1 = r3.f12365l
                    T r1 = r1.f22069k
                    java.io.File r1 = (java.io.File) r1
                    r0.<init>(r1)
                    r4.f22069k = r0
                    kotlin.Unit r4 = kotlin.Unit.f22042a
                    return r4
                L_0x0052:
                    r0 = move-exception
                    throw r0     // Catch: all -> 0x0054
                L_0x0054:
                    r1 = move-exception
                    p426xf.C14082c.m1713a(r4, r0)
                    throw r1
                L_0x0059:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C6074q.C6076b.C6077a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/Bitmap;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2$bitmap$1", m14701f = "CameraView+TakeSnapshot.kt", m14700l = {}, m14699m = "invokeSuspend")
        /* renamed from: com.mrousavy.camera.q$b$b */
        /* loaded from: classes6.dex */
        public static final class C0177b extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {

            /* renamed from: k */
            int f12370k;

            /* renamed from: l */
            final /* synthetic */ CameraView f12371l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0177b(CameraView cameraView, Continuation<? super C0177b> continuation) {
                super(2, continuation);
                this.f12371l = cameraView;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0177b(this.f12371l, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
                return ((C0177b) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Object invokeSuspend(Object obj) {
                C13080d.m4646d();
                if (this.f12370k == 0) {
                    C11093t.m10930b(obj);
                    Bitmap bitmap = this.f12371l.getPreviewView$react_native_vision_camera_release().getBitmap();
                    if (bitmap != null) {
                        return bitmap;
                    }
                    throw new C6038c();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6076b(CameraView cameraView, ReadableMap readableMap, Continuation<? super C6076b> continuation) {
            super(2, continuation);
            this.f12362q = cameraView;
            this.f12363r = readableMap;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C6076b(this.f12362q, this.f12363r, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WritableMap> continuation) {
            return ((C6076b) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[Catch: all -> 0x0058, TryCatch #2 {all -> 0x0058, blocks: (B:18:0x0054, B:31:0x0097, B:34:0x00b5, B:36:0x00c4, B:38:0x00cd), top: B:61:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0101 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x013b A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:8:0x002c, B:42:0x010a, B:44:0x013b, B:47:0x0145, B:48:0x014d), top: B:59:0x002c }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0145 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:8:0x002c, B:42:0x010a, B:44:0x013b, B:47:0x0145, B:48:0x014d), top: B:59:0x002c }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0168  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 384
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C6074q.C6076b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m26368a(com.mrousavy.camera.CameraView r4, com.facebook.react.bridge.ReadableMap r5, kotlin.coroutines.Continuation<? super com.facebook.react.bridge.WritableMap> r6) {
        /*
            boolean r0 = r6 instanceof com.mrousavy.camera.C6074q.C6075a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.mrousavy.camera.q$a r0 = (com.mrousavy.camera.C6074q.C6075a) r0
            int r1 = r0.f12355l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12355l = r1
            goto L_0x0018
        L_0x0013:
            com.mrousavy.camera.q$a r0 = new com.mrousavy.camera.q$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f12354k
            java.lang.Object r1 = tf.C13075b.m4650d()
            int r2 = r0.f12355l
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            nf.C11093t.m10930b(r6)
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            nf.C11093t.m10930b(r6)
            com.mrousavy.camera.q$b r6 = new com.mrousavy.camera.q$b
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.f12355l = r3
            java.lang.Object r6 = kotlinx.coroutines.C10135k0.m14181g(r6, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.String r4 = "CameraView.takeSnapshot(…orch == \"on\")\n    }\n  }\n}"
            kotlin.jvm.internal.C9971q.m14634f(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C6074q.m26368a(com.mrousavy.camera.CameraView, com.facebook.react.bridge.ReadableMap, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
