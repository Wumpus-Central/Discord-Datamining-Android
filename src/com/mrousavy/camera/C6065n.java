package com.mrousavy.camera;

import androidx.camera.core.C1935v1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nf.C11093t;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m15073d2 = {"Lcom/mrousavy/camera/CameraView;", "Lcom/facebook/react/bridge/ReadableMap;", "pointMap", "", "a", "(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.n */
/* loaded from: classes6.dex */
public final class C6065n {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView_FocusKt", m14701f = "CameraView+Focus.kt", m14700l = {20, 28}, m14699m = "focus")
    /* renamed from: com.mrousavy.camera.n$a */
    /* loaded from: classes6.dex */
    public static final class C6066a extends AbstractC9930d {

        /* renamed from: k */
        Object f12324k;

        /* renamed from: l */
        /* synthetic */ Object f12325l;

        /* renamed from: m */
        int f12326m;

        C6066a(Continuation<? super C6066a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            this.f12325l = obj;
            this.f12326m |= Integer.MIN_VALUE;
            return C6065n.m26375a(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/camera/core/v1;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView_FocusKt$focus$point$1", m14701f = "CameraView+Focus.kt", m14700l = {}, m14699m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.n$b */
    /* loaded from: classes6.dex */
    public static final class C6067b extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super C1935v1>, Object> {

        /* renamed from: k */
        int f12327k;

        /* renamed from: l */
        final /* synthetic */ CameraView f12328l;

        /* renamed from: m */
        final /* synthetic */ double f12329m;

        /* renamed from: n */
        final /* synthetic */ double f12330n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6067b(CameraView cameraView, double d, double d2, Continuation<? super C6067b> continuation) {
            super(2, continuation);
            this.f12328l = cameraView;
            this.f12329m = d;
            this.f12330n = d2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C6067b(this.f12328l, this.f12329m, this.f12330n, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C1935v1> continuation) {
            return ((C6067b) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            C13080d.m4646d();
            if (this.f12327k == 0) {
                C11093t.m10930b(obj);
                return this.f12328l.getPreviewView$react_native_vision_camera_release().getMeteringPointFactory().m39446b((float) this.f12329m, (float) this.f12330n);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m26375a(com.mrousavy.camera.CameraView r21, com.facebook.react.bridge.ReadableMap r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
        /*
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof com.mrousavy.camera.C6065n.C6066a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.mrousavy.camera.n$a r2 = (com.mrousavy.camera.C6065n.C6066a) r2
            int r3 = r2.f12326m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f12326m = r3
            goto L_0x001c
        L_0x0017:
            com.mrousavy.camera.n$a r2 = new com.mrousavy.camera.n$a
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.f12325l
            java.lang.Object r3 = tf.C13075b.m4650d()
            int r4 = r2.f12326m
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0041
            if (r4 == r6) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            nf.C11093t.m10930b(r1)
            goto L_0x00cc
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            java.lang.Object r0 = r2.f12324k
            androidx.camera.core.m r0 = (androidx.camera.core.AbstractC1883m) r0
            nf.C11093t.m10930b(r1)
            goto L_0x0099
        L_0x0041:
            nf.C11093t.m10930b(r1)
            androidx.camera.core.k r1 = r21.getCamera$react_native_vision_camera_release()
            if (r1 == 0) goto L_0x00db
            androidx.camera.core.m r1 = r1.mo329b()
            if (r1 == 0) goto L_0x00db
            java.lang.String r4 = "x"
            boolean r7 = r0.hasKey(r4)
            if (r7 == 0) goto L_0x00cf
            java.lang.String r7 = "y"
            boolean r8 = r0.hasKey(r7)
            if (r8 == 0) goto L_0x00cf
            android.content.res.Resources r8 = r21.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            double r9 = r0.getDouble(r4)
            double r11 = (double) r8
            double r15 = r9 * r11
            double r7 = r0.getDouble(r7)
            double r17 = r7 * r11
            kotlinx.coroutines.CoroutineScope r0 = r21.getCoroutineScope$react_native_vision_camera_release()
            kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
            com.mrousavy.camera.n$b r4 = new com.mrousavy.camera.n$b
            r19 = 0
            r13 = r4
            r14 = r21
            r13.<init>(r14, r15, r17, r19)
            r2.f12324k = r1
            r2.f12326m = r6
            java.lang.Object r0 = kotlinx.coroutines.C10129j.m14192g(r0, r4, r2)
            if (r0 != r3) goto L_0x0094
            return r3
        L_0x0094:
            r20 = r1
            r1 = r0
            r0 = r20
        L_0x0099:
            java.lang.String r4 = "CameraView.focus(pointMa…loat(), y.toFloat());\n  }"
            kotlin.jvm.internal.C9971q.m14634f(r1, r4)
            androidx.camera.core.v1 r1 = (androidx.camera.core.C1935v1) r1
            androidx.camera.core.g0$a r4 = new androidx.camera.core.g0$a
            r6 = 3
            r4.<init>(r1, r6)
            r6 = 5
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            androidx.camera.core.g0$a r1 = r4.m39783c(r6, r1)
            androidx.camera.core.g0 r1 = r1.m39784b()
            java.lang.String r4 = "Builder(point, FocusMete…er 5 seconds\n    .build()"
            kotlin.jvm.internal.C9971q.m14634f(r1, r4)
            gc.b r0 = r0.mo3333h(r1)
            java.lang.String r1 = "cameraControl.startFocusAndMetering(action)"
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            r1 = 0
            r2.f12324k = r1
            r2.f12326m = r5
            java.lang.Object r0 = p408wi.C13889a.m2379b(r0, r2)
            if (r0 != r3) goto L_0x00cc
            return r3
        L_0x00cc:
            kotlin.Unit r0 = kotlin.Unit.f22042a
            return r0
        L_0x00cf:
            com.mrousavy.camera.z r1 = new com.mrousavy.camera.z
            java.lang.String r2 = "point"
            java.lang.String r0 = r22.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00db:
            com.mrousavy.camera.c r0 = new com.mrousavy.camera.c
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C6065n.m26375a(com.mrousavy.camera.CameraView, com.facebook.react.bridge.ReadableMap, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
