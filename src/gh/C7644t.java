package gh;

import bi.C3600t;
import kotlin.jvm.internal.C9971q;
import mh.C10612e;
import p070di.AbstractC6483f;
import p070di.EnumC6482e;
import p268og.AbstractC11304b1;

/* renamed from: gh.t */
/* loaded from: classes8.dex */
public final class C7644t implements AbstractC6483f {

    /* renamed from: b */
    private final AbstractC7637r f16648b;

    /* renamed from: c */
    private final C3600t<C10612e> f16649c;

    /* renamed from: d */
    private final boolean f16650d;

    /* renamed from: e */
    private final EnumC6482e f16651e;

    public C7644t(AbstractC7637r binaryClass, C3600t<C10612e> tVar, boolean z, EnumC6482e abiStability) {
        C9971q.m14633g(binaryClass, "binaryClass");
        C9971q.m14633g(abiStability, "abiStability");
        this.f16648b = binaryClass;
        this.f16649c = tVar;
        this.f16650d = z;
        this.f16651e = abiStability;
    }

    @Override // p070di.AbstractC6483f
    /* renamed from: a */
    public String mo21814a() {
        return "Class '" + this.f16648b.mo4628k().m10816b().m10803b() + '\'';
    }

    @Override // p268og.AbstractC11299a1
    /* renamed from: b */
    public AbstractC11304b1 mo4612b() {
        AbstractC11304b1 NO_SOURCE_FILE = AbstractC11304b1.f25237a;
        C9971q.m14634f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    /* renamed from: d */
    public final AbstractC7637r m21813d() {
        return this.f16648b;
    }

    public String toString() {
        return C7644t.class.getSimpleName() + ": " + this.f16648b;
    }
}
