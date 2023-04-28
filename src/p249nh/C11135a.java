package p249nh;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p326ri.C12718u;

/* renamed from: nh.a */
/* loaded from: classes8.dex */
public final class C11135a {

    /* renamed from: e */
    private static final C0355a f24708e = new C0355a(null);
    @Deprecated

    /* renamed from: f */
    private static final C11142f f24709f;
    @Deprecated

    /* renamed from: g */
    private static final C11137c f24710g;

    /* renamed from: a */
    private final C11137c f24711a;

    /* renamed from: b */
    private final C11137c f24712b;

    /* renamed from: c */
    private final C11142f f24713c;

    /* renamed from: d */
    private final C11137c f24714d;

    /* renamed from: nh.a$a */
    /* loaded from: classes8.dex */
    private static final class C0355a {
        private C0355a() {
        }

        public /* synthetic */ C0355a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C11142f fVar = C11144h.f24745m;
        f24709f = fVar;
        C11137c k = C11137c.m10794k(fVar);
        C9971q.m14634f(k, "topLevel(LOCAL_NAME)");
        f24710g = k;
    }

    public C11135a(C11137c packageName, C11137c cVar, C11142f callableName, C11137c cVar2) {
        C9971q.m14633g(packageName, "packageName");
        C9971q.m14633g(callableName, "callableName");
        this.f24711a = packageName;
        this.f24712b = cVar;
        this.f24713c = callableName;
        this.f24714d = cVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11135a)) {
            return false;
        }
        C11135a aVar = (C11135a) obj;
        return C9971q.m14638b(this.f24711a, aVar.f24711a) && C9971q.m14638b(this.f24712b, aVar.f24712b) && C9971q.m14638b(this.f24713c, aVar.f24713c) && C9971q.m14638b(this.f24714d, aVar.f24714d);
    }

    public int hashCode() {
        int hashCode = this.f24711a.hashCode() * 31;
        C11137c cVar = this.f24712b;
        int i = 0;
        int hashCode2 = (((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f24713c.hashCode()) * 31;
        C11137c cVar2 = this.f24714d;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String C;
        StringBuilder sb2 = new StringBuilder();
        String b = this.f24711a.m10803b();
        C9971q.m14634f(b, "packageName.asString()");
        C = C12718u.m5741C(b, '.', '/', false, 4, null);
        sb2.append(C);
        sb2.append("/");
        C11137c cVar = this.f24712b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f24713c);
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public /* synthetic */ C11135a(C11137c cVar, C11137c cVar2, C11142f fVar, C11137c cVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, fVar, (i & 8) != 0 ? null : cVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11135a(C11137c packageName, C11142f callableName) {
        this(packageName, null, callableName, null, 8, null);
        C9971q.m14633g(packageName, "packageName");
        C9971q.m14633g(callableName, "callableName");
    }
}
