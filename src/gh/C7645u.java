package gh;

import kh.AbstractC9874c;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.AbstractC10609d;
import nf.C11088q;
import p218lh.C10440a;

/* renamed from: gh.u */
/* loaded from: classes8.dex */
public final class C7645u {

    /* renamed from: b */
    public static final C7646a f16652b = new C7646a(null);

    /* renamed from: a */
    private final String f16653a;

    /* renamed from: gh.u$a */
    /* loaded from: classes8.dex */
    public static final class C7646a {
        private C7646a() {
        }

        public /* synthetic */ C7646a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7645u m21811a(String name, String desc) {
            C9971q.m14633g(name, "name");
            C9971q.m14633g(desc, "desc");
            return new C7645u(name + '#' + desc, null);
        }

        /* renamed from: b */
        public final C7645u m21810b(AbstractC10609d signature) {
            C9971q.m14633g(signature, "signature");
            if (signature instanceof AbstractC10609d.C10611b) {
                return m21808d(signature.mo12733c(), signature.mo12734b());
            }
            if (signature instanceof AbstractC10609d.C10610a) {
                return m21811a(signature.mo12733c(), signature.mo12734b());
            }
            throw new C11088q();
        }

        /* renamed from: c */
        public final C7645u m21809c(AbstractC9874c nameResolver, C10440a.C10442c signature) {
            C9971q.m14633g(nameResolver, "nameResolver");
            C9971q.m14633g(signature, "signature");
            return m21808d(nameResolver.getString(signature.m13273y()), nameResolver.getString(signature.m13274x()));
        }

        /* renamed from: d */
        public final C7645u m21808d(String name, String desc) {
            C9971q.m14633g(name, "name");
            C9971q.m14633g(desc, "desc");
            return new C7645u(name + desc, null);
        }

        /* renamed from: e */
        public final C7645u m21807e(C7645u signature, int i) {
            C9971q.m14633g(signature, "signature");
            return new C7645u(signature.m21812a() + '@' + i, null);
        }
    }

    private C7645u(String str) {
        this.f16653a = str;
    }

    public /* synthetic */ C7645u(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public final String m21812a() {
        return this.f16653a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7645u) && C9971q.m14638b(this.f16653a, ((C7645u) obj).f16653a);
    }

    public int hashCode() {
        return this.f16653a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f16653a + ')';
    }
}
