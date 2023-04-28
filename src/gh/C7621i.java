package gh;

import bi.AbstractC3578h;
import bi.C3577g;
import kotlin.jvm.internal.C9971q;
import p249nh.C11136b;

/* renamed from: gh.i */
/* loaded from: classes8.dex */
public final class C7621i implements AbstractC3578h {

    /* renamed from: a */
    private final AbstractC7633p f16620a;

    /* renamed from: b */
    private final C7618h f16621b;

    public C7621i(AbstractC7633p kotlinClassFinder, C7618h deserializedDescriptorResolver) {
        C9971q.m14633g(kotlinClassFinder, "kotlinClassFinder");
        C9971q.m14633g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f16620a = kotlinClassFinder;
        this.f16621b = deserializedDescriptorResolver;
    }

    @Override // bi.AbstractC3578h
    /* renamed from: a */
    public C3577g mo21860a(C11136b classId) {
        C9971q.m14633g(classId, "classId");
        AbstractC7637r b = C7636q.m21818b(this.f16620a, classId);
        if (b == null) {
            return null;
        }
        C9971q.m14638b(b.mo4628k(), classId);
        return this.f16621b.m21867i(b);
    }
}
