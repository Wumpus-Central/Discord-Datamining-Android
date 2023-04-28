package p254o2;

import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9474l;
import p275p2.AbstractC11511b;
import p343t2.C12945f;

/* renamed from: o2.i */
/* loaded from: classes.dex */
public class C11177i implements AbstractC11170c {

    /* renamed from: a */
    private final String f24889a;

    /* renamed from: b */
    private final EnumC11178a f24890b;

    /* renamed from: c */
    private final boolean f24891c;

    /* renamed from: o2.i$a */
    /* loaded from: classes.dex */
    public enum EnumC11178a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: a */
        public static EnumC11178a m10582a(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public C11177i(String str, EnumC11178a aVar, boolean z) {
        this.f24889a = str;
        this.f24890b = aVar;
        this.f24891c = z;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        if (e0Var.m21539A()) {
            return new C9474l(this);
        }
        C12945f.m5009c("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* renamed from: b */
    public EnumC11178a m10585b() {
        return this.f24890b;
    }

    /* renamed from: c */
    public String m10584c() {
        return this.f24889a;
    }

    /* renamed from: d */
    public boolean m10583d() {
        return this.f24891c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f24890b + '}';
    }
}
