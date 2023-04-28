package p208l4;

import android.content.Context;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.C4908b;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import p007a6.C1271b;

/* renamed from: l4.c */
/* loaded from: classes7.dex */
public class C10338c {

    /* renamed from: a */
    private static final Class<?> f22661a = C10338c.class;

    /* renamed from: b */
    private static C10339d f22662b = null;

    /* renamed from: c */
    private static volatile boolean f22663c = false;

    private C10338c() {
    }

    /* renamed from: a */
    public static ImagePipeline m13589a() {
        return m13588b().m31353j();
    }

    /* renamed from: b */
    public static C4908b m13588b() {
        return C4908b.m31351l();
    }

    /* renamed from: c */
    public static void m13587c(Context context, ImagePipelineConfig imagePipelineConfig) {
        m13586d(context, imagePipelineConfig, null);
    }

    /* renamed from: d */
    public static void m13586d(Context context, ImagePipelineConfig imagePipelineConfig, C10337b bVar) {
        m13585e(context, imagePipelineConfig, bVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (p007a6.C1271b.m41491d() != false) goto L_0x0089;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (p007a6.C1271b.m41491d() == false) goto L_0x0097;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (p007a6.C1271b.m41491d() == false) goto L_0x0097;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (p007a6.C1271b.m41491d() == false) goto L_0x0097;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (p007a6.C1271b.m41491d() == false) goto L_0x0097;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
        p007a6.C1271b.m41493b();
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m13585e(android.content.Context r5, com.facebook.imagepipeline.core.ImagePipelineConfig r6, p208l4.C10337b r7, boolean r8) {
        /*
            boolean r0 = p007a6.C1271b.m41491d()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "Fresco#initialize"
            p007a6.C1271b.m41494a(r0)
        L_0x000b:
            boolean r0 = p208l4.C10338c.f22663c
            r1 = 1
            if (r0 == 0) goto L_0x0018
            java.lang.Class<?> r0 = p208l4.C10338c.f22661a
            java.lang.String r2 = "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"
            p414x3.C13925a.m2308D(r0, r2)
            goto L_0x001a
        L_0x0018:
            p208l4.C10338c.f22663c = r1
        L_0x001a:
            p314r5.C12394h.m6925b(r8)
            boolean r8 = p116g6.C7420a.m22710c()
            if (r8 != 0) goto L_0x0097
            boolean r8 = p007a6.C1271b.m41491d()
            if (r8 == 0) goto L_0x002e
            java.lang.String r8 = "Fresco.initialize->SoLoader.init"
            p007a6.C1271b.m41494a(r8)
        L_0x002e:
            java.lang.Class<com.facebook.imagepipeline.nativecode.NativeCodeInitializer> r8 = com.facebook.imagepipeline.nativecode.NativeCodeInitializer.class
            java.lang.String r0 = "init"
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: all -> 0x004c, NoSuchMethodException -> 0x004e, InvocationTargetException -> 0x005d, IllegalAccessException -> 0x006c, ClassNotFoundException -> 0x007b
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: all -> 0x004c, NoSuchMethodException -> 0x004e, InvocationTargetException -> 0x005d, IllegalAccessException -> 0x006c, ClassNotFoundException -> 0x007b
            java.lang.reflect.Method r8 = r8.getMethod(r0, r2)     // Catch: all -> 0x004c, NoSuchMethodException -> 0x004e, InvocationTargetException -> 0x005d, IllegalAccessException -> 0x006c, ClassNotFoundException -> 0x007b
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: all -> 0x004c, NoSuchMethodException -> 0x004e, InvocationTargetException -> 0x005d, IllegalAccessException -> 0x006c, ClassNotFoundException -> 0x007b
            r0[r4] = r5     // Catch: all -> 0x004c, NoSuchMethodException -> 0x004e, InvocationTargetException -> 0x005d, IllegalAccessException -> 0x006c, ClassNotFoundException -> 0x007b
            r1 = 0
            r8.invoke(r1, r0)     // Catch: all -> 0x004c, NoSuchMethodException -> 0x004e, InvocationTargetException -> 0x005d, IllegalAccessException -> 0x006c, ClassNotFoundException -> 0x007b
            boolean r8 = p007a6.C1271b.m41491d()
            if (r8 == 0) goto L_0x0097
            goto L_0x0089
        L_0x004c:
            r5 = move-exception
            goto L_0x008d
        L_0x004e:
            g6.c r8 = new g6.c     // Catch: all -> 0x004c
            r8.<init>()     // Catch: all -> 0x004c
            p116g6.C7420a.m22711b(r8)     // Catch: all -> 0x004c
            boolean r8 = p007a6.C1271b.m41491d()
            if (r8 == 0) goto L_0x0097
            goto L_0x0089
        L_0x005d:
            g6.c r8 = new g6.c     // Catch: all -> 0x004c
            r8.<init>()     // Catch: all -> 0x004c
            p116g6.C7420a.m22711b(r8)     // Catch: all -> 0x004c
            boolean r8 = p007a6.C1271b.m41491d()
            if (r8 == 0) goto L_0x0097
            goto L_0x0089
        L_0x006c:
            g6.c r8 = new g6.c     // Catch: all -> 0x004c
            r8.<init>()     // Catch: all -> 0x004c
            p116g6.C7420a.m22711b(r8)     // Catch: all -> 0x004c
            boolean r8 = p007a6.C1271b.m41491d()
            if (r8 == 0) goto L_0x0097
            goto L_0x0089
        L_0x007b:
            g6.c r8 = new g6.c     // Catch: all -> 0x004c
            r8.<init>()     // Catch: all -> 0x004c
            p116g6.C7420a.m22711b(r8)     // Catch: all -> 0x004c
            boolean r8 = p007a6.C1271b.m41491d()
            if (r8 == 0) goto L_0x0097
        L_0x0089:
            p007a6.C1271b.m41493b()
            goto L_0x0097
        L_0x008d:
            boolean r6 = p007a6.C1271b.m41491d()
            if (r6 == 0) goto L_0x0096
            p007a6.C1271b.m41493b()
        L_0x0096:
            throw r5
        L_0x0097:
            android.content.Context r5 = r5.getApplicationContext()
            if (r6 != 0) goto L_0x00a1
            com.facebook.imagepipeline.core.C4908b.m31342u(r5)
            goto L_0x00a4
        L_0x00a1:
            com.facebook.imagepipeline.core.C4908b.m31341v(r6)
        L_0x00a4:
            m13584f(r5, r7)
            boolean r5 = p007a6.C1271b.m41491d()
            if (r5 == 0) goto L_0x00b0
            p007a6.C1271b.m41493b()
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p208l4.C10338c.m13585e(android.content.Context, com.facebook.imagepipeline.core.ImagePipelineConfig, l4.b, boolean):void");
    }

    /* renamed from: f */
    private static void m13584f(Context context, C10337b bVar) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("Fresco.initializeDrawee");
        }
        C10339d dVar = new C10339d(context, bVar);
        f22662b = dVar;
        SimpleDraweeView.initialize(dVar);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    /* renamed from: g */
    public static PipelineDraweeControllerBuilder m13583g() {
        return f22662b.get();
    }
}
