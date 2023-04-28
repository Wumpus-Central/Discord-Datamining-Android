package ch;

import fi.AbstractC7304o0;
import fi.C7343y;
import fi.EnumC7319r1;
import java.util.Set;
import kotlin.collections.C9920v;
import kotlin.collections.C9922x;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p268og.AbstractC11319f1;

/* renamed from: ch.a */
/* loaded from: classes8.dex */
public final class C4005a extends C7343y {

    /* renamed from: d */
    private final EnumC7319r1 f6578d;

    /* renamed from: e */
    private final EnumC4007c f6579e;

    /* renamed from: f */
    private final boolean f6580f;

    /* renamed from: g */
    private final boolean f6581g;

    /* renamed from: h */
    private final Set<AbstractC11319f1> f6582h;

    /* renamed from: i */
    private final AbstractC7304o0 f6583i;

    public /* synthetic */ C4005a(EnumC7319r1 r1Var, EnumC4007c cVar, boolean z, boolean z2, Set set, AbstractC7304o0 o0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1Var, (i & 2) != 0 ? EnumC4007c.INFLEXIBLE : cVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : o0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static /* synthetic */ C4005a m33118f(C4005a aVar, EnumC7319r1 r1Var, EnumC4007c cVar, boolean z, boolean z2, Set set, AbstractC7304o0 o0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            r1Var = aVar.mo22864b();
        }
        if ((i & 2) != 0) {
            cVar = aVar.f6579e;
        }
        if ((i & 4) != 0) {
            z = aVar.f6580f;
        }
        if ((i & 8) != 0) {
            z2 = aVar.f6581g;
        }
        if ((i & 16) != 0) {
            set = aVar.mo22863c();
        }
        if ((i & 32) != 0) {
            o0Var = aVar.mo22865a();
        }
        return aVar.m33119e(r1Var, cVar, z, z2, set, o0Var);
    }

    @Override // fi.C7343y
    /* renamed from: a */
    public AbstractC7304o0 mo22865a() {
        return this.f6583i;
    }

    @Override // fi.C7343y
    /* renamed from: b */
    public EnumC7319r1 mo22864b() {
        return this.f6578d;
    }

    @Override // fi.C7343y
    /* renamed from: c */
    public Set<AbstractC11319f1> mo22863c() {
        return this.f6582h;
    }

    /* renamed from: e */
    public final C4005a m33119e(EnumC7319r1 howThisTypeIsUsed, EnumC4007c flexibility, boolean z, boolean z2, Set<? extends AbstractC11319f1> set, AbstractC7304o0 o0Var) {
        C9971q.m14633g(howThisTypeIsUsed, "howThisTypeIsUsed");
        C9971q.m14633g(flexibility, "flexibility");
        return new C4005a(howThisTypeIsUsed, flexibility, z, z2, set, o0Var);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4005a)) {
            return false;
        }
        C4005a aVar = (C4005a) obj;
        if (C9971q.m14638b(aVar.mo22865a(), mo22865a()) && aVar.mo22864b() == mo22864b() && aVar.f6579e == this.f6579e && aVar.f6580f == this.f6580f && aVar.f6581g == this.f6581g) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final EnumC4007c m33117g() {
        return this.f6579e;
    }

    /* renamed from: h */
    public final boolean m33116h() {
        return this.f6581g;
    }

    @Override // fi.C7343y
    public int hashCode() {
        int i;
        AbstractC7304o0 a = mo22865a();
        if (a != null) {
            i = a.hashCode();
        } else {
            i = 0;
        }
        int hashCode = i + (i * 31) + mo22864b().hashCode();
        int hashCode2 = hashCode + (hashCode * 31) + this.f6579e.hashCode();
        int i2 = hashCode2 + (hashCode2 * 31) + (this.f6580f ? 1 : 0);
        return i2 + (i2 * 31) + (this.f6581g ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean m33115i() {
        return this.f6580f;
    }

    /* renamed from: j */
    public final C4005a m33114j(boolean z) {
        return m33118f(this, null, null, z, false, null, null, 59, null);
    }

    /* renamed from: k */
    public C4005a m33113k(AbstractC7304o0 o0Var) {
        return m33118f(this, null, null, false, false, null, o0Var, 31, null);
    }

    /* renamed from: l */
    public final C4005a m33112l(EnumC4007c flexibility) {
        C9971q.m14633g(flexibility, "flexibility");
        return m33118f(this, null, flexibility, false, false, null, null, 61, null);
    }

    /* renamed from: m */
    public C4005a mo22862d(AbstractC11319f1 typeParameter) {
        Set set;
        C9971q.m14633g(typeParameter, "typeParameter");
        if (mo22863c() != null) {
            set = C9922x.m14713m(mo22863c(), typeParameter);
        } else {
            set = C9920v.m14723c(typeParameter);
        }
        return m33118f(this, null, null, false, false, set, null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + mo22864b() + ", flexibility=" + this.f6579e + ", isRaw=" + this.f6580f + ", isForAnnotationParameter=" + this.f6581g + ", visitedTypeParameters=" + mo22863c() + ", defaultType=" + mo22865a() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4005a(EnumC7319r1 howThisTypeIsUsed, EnumC4007c flexibility, boolean z, boolean z2, Set<? extends AbstractC11319f1> set, AbstractC7304o0 o0Var) {
        super(howThisTypeIsUsed, set, o0Var);
        C9971q.m14633g(howThisTypeIsUsed, "howThisTypeIsUsed");
        C9971q.m14633g(flexibility, "flexibility");
        this.f6578d = howThisTypeIsUsed;
        this.f6579e = flexibility;
        this.f6580f = z;
        this.f6581g = z2;
        this.f6582h = set;
        this.f6583i = o0Var;
    }
}
