package p208l4;

import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.backends.pipeline.C4791a;
import java.util.concurrent.Executor;
import p277p4.AbstractC11528a;
import p278p5.AbstractC11564s;
import p361u5.AbstractC13192a;
import p380v5.AbstractC13432c;
import p394w3.C13732e;

/* renamed from: l4.e */
/* loaded from: classes7.dex */
public class C10340e {

    /* renamed from: a */
    private Resources f22670a;

    /* renamed from: b */
    private AbstractC11528a f22671b;

    /* renamed from: c */
    private AbstractC13192a f22672c;

    /* renamed from: d */
    private Executor f22673d;

    /* renamed from: e */
    private AbstractC11564s<CacheKey, AbstractC13432c> f22674e;

    /* renamed from: f */
    private C13732e<AbstractC13192a> f22675f;

    /* renamed from: g */
    private Supplier<Boolean> f22676g;

    /* renamed from: a */
    public void m13581a(Resources resources, AbstractC11528a aVar, AbstractC13192a aVar2, Executor executor, AbstractC11564s<CacheKey, AbstractC13432c> sVar, C13732e<AbstractC13192a> eVar, Supplier<Boolean> supplier) {
        this.f22670a = resources;
        this.f22671b = aVar;
        this.f22672c = aVar2;
        this.f22673d = executor;
        this.f22674e = sVar;
        this.f22675f = eVar;
        this.f22676g = supplier;
    }

    /* renamed from: b */
    protected C4791a m13580b(Resources resources, AbstractC11528a aVar, AbstractC13192a aVar2, Executor executor, AbstractC11564s<CacheKey, AbstractC13432c> sVar, C13732e<AbstractC13192a> eVar) {
        return new C4791a(resources, aVar, aVar2, executor, sVar, eVar);
    }

    /* renamed from: c */
    public C4791a m13579c() {
        C4791a b = m13580b(this.f22670a, this.f22671b, this.f22672c, this.f22673d, this.f22674e, this.f22675f);
        Supplier<Boolean> supplier = this.f22676g;
        if (supplier != null) {
            b.m31938y0(supplier.get().booleanValue());
        }
        return b;
    }
}
