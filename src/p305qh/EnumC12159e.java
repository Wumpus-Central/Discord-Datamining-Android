package p305qh;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C9899f;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qh.e */
/* loaded from: classes8.dex */
public enum EnumC12159e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    

    /* renamed from: l */
    public static final C12160a f27260l = new C12160a(null);

    /* renamed from: m */
    public static final Set<EnumC12159e> f27261m;

    /* renamed from: n */
    public static final Set<EnumC12159e> f27262n;

    /* renamed from: k */
    private final boolean f27275k;

    /* renamed from: qh.e$a */
    /* loaded from: classes8.dex */
    public static final class C12160a {
        private C12160a() {
        }

        public /* synthetic */ C12160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Set<EnumC12159e> H0;
        Set<EnumC12159e> H02;
        EnumC12159e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC12159e eVar : values) {
            if (eVar.f27275k) {
                arrayList.add(eVar);
            }
        }
        H0 = C9914r.m14786H0(arrayList);
        f27261m = H0;
        H02 = C9899f.m14957H0(values());
        f27262n = H02;
    }

    EnumC12159e(boolean z) {
        this.f27275k = z;
    }
}
