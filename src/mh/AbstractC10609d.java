package mh;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mh.d */
/* loaded from: classes8.dex */
public abstract class AbstractC10609d {

    /* renamed from: mh.d$a */
    /* loaded from: classes8.dex */
    public static final class C10610a extends AbstractC10609d {

        /* renamed from: a */
        private final String f23494a;

        /* renamed from: b */
        private final String f23495b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10610a(String name, String desc) {
            super(null);
            C9971q.m14633g(name, "name");
            C9971q.m14633g(desc, "desc");
            this.f23494a = name;
            this.f23495b = desc;
        }

        @Override // mh.AbstractC10609d
        /* renamed from: a */
        public String mo12735a() {
            return mo12733c() + ':' + mo12734b();
        }

        @Override // mh.AbstractC10609d
        /* renamed from: b */
        public String mo12734b() {
            return this.f23495b;
        }

        @Override // mh.AbstractC10609d
        /* renamed from: c */
        public String mo12733c() {
            return this.f23494a;
        }

        /* renamed from: d */
        public final String m12737d() {
            return mo12733c();
        }

        /* renamed from: e */
        public final String m12736e() {
            return mo12734b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10610a)) {
                return false;
            }
            C10610a aVar = (C10610a) obj;
            return C9971q.m14638b(mo12733c(), aVar.mo12733c()) && C9971q.m14638b(mo12734b(), aVar.mo12734b());
        }

        public int hashCode() {
            return (mo12733c().hashCode() * 31) + mo12734b().hashCode();
        }
    }

    /* renamed from: mh.d$b */
    /* loaded from: classes8.dex */
    public static final class C10611b extends AbstractC10609d {

        /* renamed from: a */
        private final String f23496a;

        /* renamed from: b */
        private final String f23497b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10611b(String name, String desc) {
            super(null);
            C9971q.m14633g(name, "name");
            C9971q.m14633g(desc, "desc");
            this.f23496a = name;
            this.f23497b = desc;
        }

        @Override // mh.AbstractC10609d
        /* renamed from: a */
        public String mo12735a() {
            return mo12733c() + mo12734b();
        }

        @Override // mh.AbstractC10609d
        /* renamed from: b */
        public String mo12734b() {
            return this.f23497b;
        }

        @Override // mh.AbstractC10609d
        /* renamed from: c */
        public String mo12733c() {
            return this.f23496a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10611b)) {
                return false;
            }
            C10611b bVar = (C10611b) obj;
            return C9971q.m14638b(mo12733c(), bVar.mo12733c()) && C9971q.m14638b(mo12734b(), bVar.mo12734b());
        }

        public int hashCode() {
            return (mo12733c().hashCode() * 31) + mo12734b().hashCode();
        }
    }

    private AbstractC10609d() {
    }

    public /* synthetic */ AbstractC10609d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo12735a();

    /* renamed from: b */
    public abstract String mo12734b();

    /* renamed from: c */
    public abstract String mo12733c();

    public final String toString() {
        return mo12735a();
    }
}
