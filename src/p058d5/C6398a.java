package p058d5;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p006a5.AbstractC1266b;
import p006a5.C1267c;
import p006a5.C1269d;
import p025b5.C3382a;
import p025b5.C3383b;
import p038c5.C3765a;
import p057d4.AbstractC6395b;
import p191k5.AbstractC9748a;
import p191k5.AbstractC9751c;
import p191k5.C9753e;
import p226m5.AbstractC10483b;
import p226m5.C10484c;
import p278p5.AbstractC11547i;
import p361u5.AbstractC13192a;
import p380v5.AbstractC13432c;
import p380v5.C13430a;
import p394w3.C13740j;
import p415x4.AbstractC13928a;
import p415x4.C13930c;
import p436y4.AbstractC14224b;
import p436y4.AbstractC14225c;
import p436y4.C14223a;
import p456z4.C14541a;
import p456z4.C14542b;
import p456z4.C14543c;
import p456z4.C14544d;

/* renamed from: d5.a */
/* loaded from: classes7.dex */
public class C6398a implements AbstractC13192a {

    /* renamed from: a */
    private final AbstractC10483b f13368a;

    /* renamed from: b */
    private final ScheduledExecutorService f13369b;

    /* renamed from: c */
    private final ExecutorService f13370c;

    /* renamed from: d */
    private final AbstractC6395b f13371d;

    /* renamed from: e */
    private final PlatformBitmapFactory f13372e;

    /* renamed from: f */
    private final AbstractC11547i<CacheKey, AbstractC13432c> f13373f;

    /* renamed from: g */
    private final Supplier<Integer> f13374g;

    /* renamed from: h */
    private final Supplier<Integer> f13375h;

    /* renamed from: i */
    private final Supplier<Boolean> f13376i;

    public C6398a(AbstractC10483b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, AbstractC6395b bVar2, PlatformBitmapFactory platformBitmapFactory, AbstractC11547i<CacheKey, AbstractC13432c> iVar, Supplier<Integer> supplier, Supplier<Integer> supplier2, Supplier<Boolean> supplier3) {
        this.f13368a = bVar;
        this.f13369b = scheduledExecutorService;
        this.f13370c = executorService;
        this.f13371d = bVar2;
        this.f13372e = platformBitmapFactory;
        this.f13373f = iVar;
        this.f13374g = supplier;
        this.f13375h = supplier2;
        this.f13376i = supplier3;
    }

    /* renamed from: c */
    private AbstractC9748a m25630c(C9753e eVar) {
        AbstractC9751c d = eVar.m15431d();
        return this.f13368a.mo13064a(eVar, new Rect(0, 0, d.getWidth(), d.getHeight()));
    }

    /* renamed from: d */
    private C10484c m25629d(C9753e eVar) {
        return new C10484c(new C14541a(eVar.hashCode(), this.f13376i.get().booleanValue()), this.f13373f);
    }

    /* renamed from: e */
    private AbstractC13928a m25628e(C9753e eVar, Bitmap.Config config) {
        AbstractC1266b bVar;
        C1269d dVar;
        AbstractC9748a c = m25630c(eVar);
        AbstractC14224b f = m25627f(eVar);
        C3383b bVar2 = new C3383b(f, c);
        int intValue = this.f13375h.get().intValue();
        if (intValue > 0) {
            C1269d dVar2 = new C1269d(intValue);
            bVar = m25626g(bVar2, config);
            dVar = dVar2;
        } else {
            dVar = null;
            bVar = null;
        }
        return C13930c.m2250n(new C14223a(this.f13372e, f, new C3382a(c), bVar2, dVar, bVar), this.f13371d, this.f13369b);
    }

    /* renamed from: f */
    private AbstractC14224b m25627f(C9753e eVar) {
        int intValue = this.f13374g.get().intValue();
        if (intValue == 1) {
            return new C14542b(m25629d(eVar), true);
        }
        if (intValue == 2) {
            return new C14542b(m25629d(eVar), false);
        }
        if (intValue != 3) {
            return new C14544d();
        }
        return new C14543c();
    }

    /* renamed from: g */
    private AbstractC1266b m25626g(AbstractC14225c cVar, Bitmap.Config config) {
        PlatformBitmapFactory platformBitmapFactory = this.f13372e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new C1267c(platformBitmapFactory, cVar, config, this.f13370c);
    }

    @Override // p361u5.AbstractC13192a
    /* renamed from: b */
    public boolean mo4367b(AbstractC13432c cVar) {
        return cVar instanceof C13430a;
    }

    /* renamed from: h */
    public C3765a mo4368a(AbstractC13432c cVar) {
        Bitmap.Config config;
        C13430a aVar = (C13430a) cVar;
        AbstractC9751c n = aVar.m3740n();
        C9753e eVar = (C9753e) C13740j.m2834g(aVar.m3739p());
        if (n != null) {
            config = n.mo15440h();
        } else {
            config = null;
        }
        return new C3765a(m25628e(eVar, config));
    }
}
