package p209l5;

import com.facebook.cache.common.CacheKey;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.util.concurrent.ExecutorService;
import p278p5.AbstractC11547i;
import p314r5.AbstractC12391e;
import p359u3.AbstractExecutorServiceC13188f;
import p380v5.AbstractC13432c;

/* renamed from: l5.b */
/* loaded from: classes7.dex */
public class C10342b {

    /* renamed from: a */
    private static boolean f22677a;

    /* renamed from: b */
    private static AbstractC10341a f22678b;

    /* renamed from: a */
    public static AbstractC10341a m13575a(PlatformBitmapFactory platformBitmapFactory, AbstractC12391e eVar, AbstractC11547i<CacheKey, AbstractC13432c> iVar, boolean z, ExecutorService executorService) {
        if (!f22677a) {
            try {
                f22678b = (AbstractC10341a) AnimatedFactoryV2Impl.class.getConstructor(PlatformBitmapFactory.class, AbstractC12391e.class, AbstractC11547i.class, Boolean.TYPE, AbstractExecutorServiceC13188f.class).newInstance(platformBitmapFactory, eVar, iVar, Boolean.valueOf(z), executorService);
            } catch (Throwable unused) {
            }
            if (f22678b != null) {
                f22677a = true;
            }
        }
        return f22678b;
    }
}
