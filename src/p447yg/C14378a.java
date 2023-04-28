package p447yg;

import bi.AbstractC3596r;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p249nh.C11142f;
import p268og.AbstractC11301b;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11335j1;
import p325rh.AbstractC12667i;
import p325rh.C12669k;

/* renamed from: yg.a */
/* loaded from: classes8.dex */
public final class C14378a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yg.a$a */
    /* loaded from: classes8.dex */
    public static class C0467a extends AbstractC12667i {

        /* renamed from: a */
        final /* synthetic */ AbstractC3596r f32540a;

        /* renamed from: b */
        final /* synthetic */ Set f32541b;

        /* renamed from: c */
        final /* synthetic */ boolean f32542c;

        /* renamed from: yg.a$a$a */
        /* loaded from: classes8.dex */
        class C0468a implements Function1<AbstractC11301b, Unit> {
            C0468a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m726a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            /* renamed from: b */
            public Unit invoke(AbstractC11301b bVar) {
                if (bVar == null) {
                    m726a(0);
                }
                C0467a.this.f32540a.mo4619a(bVar);
                return Unit.f22042a;
            }
        }

        C0467a(AbstractC3596r rVar, Set set, boolean z) {
            this.f32540a = rVar;
            this.f32541b = set;
            this.f32542c = z;
        }

        /* renamed from: f */
        private static /* synthetic */ void m727f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "fromSuper";
            } else if (i == 2) {
                objArr[0] = "fromCurrent";
            } else if (i == 3) {
                objArr[0] = "member";
            } else if (i != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i == 1 || i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p325rh.AbstractC12668j
        /* renamed from: a */
        public void mo652a(AbstractC11301b bVar) {
            if (bVar == null) {
                m727f(0);
            }
            C12669k.m6007K(bVar, new C0468a());
            this.f32541b.add(bVar);
        }

        @Override // p325rh.AbstractC12668j
        /* renamed from: d */
        public void mo728d(AbstractC11301b bVar, Collection<? extends AbstractC11301b> collection) {
            if (bVar == null) {
                m727f(3);
            }
            if (collection == null) {
                m727f(4);
            }
            if (!this.f32542c || bVar.mo6245g() == AbstractC11301b.EnumC11302a.FAKE_OVERRIDE) {
                super.mo728d(bVar, collection);
            }
        }

        @Override // p325rh.AbstractC12667i
        /* renamed from: e */
        public void mo651e(AbstractC11301b bVar, AbstractC11301b bVar2) {
            if (bVar == null) {
                m727f(1);
            }
            if (bVar2 == null) {
                m727f(2);
            }
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m733a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static AbstractC11335j1 m732b(C11142f fVar, AbstractC11313e eVar) {
        if (fVar == null) {
            m733a(19);
        }
        if (eVar == null) {
            m733a(20);
        }
        Collection<AbstractC11309d> l = eVar.mo6110l();
        if (l.size() != 1) {
            return null;
        }
        for (AbstractC11335j1 j1Var : l.iterator().next().mo6242i()) {
            if (j1Var.getName().equals(fVar)) {
                return j1Var;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static <D extends AbstractC11301b> Collection<D> m731c(C11142f fVar, Collection<D> collection, Collection<D> collection2, AbstractC11313e eVar, AbstractC3596r rVar, C12669k kVar, boolean z) {
        if (fVar == null) {
            m733a(12);
        }
        if (collection == null) {
            m733a(13);
        }
        if (collection2 == null) {
            m733a(14);
        }
        if (eVar == null) {
            m733a(15);
        }
        if (rVar == null) {
            m733a(16);
        }
        if (kVar == null) {
            m733a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kVar.m5984v(fVar, collection, collection2, eVar, new C0467a(rVar, linkedHashSet, z));
        return linkedHashSet;
    }

    /* renamed from: d */
    public static <D extends AbstractC11301b> Collection<D> m730d(C11142f fVar, Collection<D> collection, Collection<D> collection2, AbstractC11313e eVar, AbstractC3596r rVar, C12669k kVar) {
        if (fVar == null) {
            m733a(0);
        }
        if (collection == null) {
            m733a(1);
        }
        if (collection2 == null) {
            m733a(2);
        }
        if (eVar == null) {
            m733a(3);
        }
        if (rVar == null) {
            m733a(4);
        }
        if (kVar == null) {
            m733a(5);
        }
        return m731c(fVar, collection, collection2, eVar, rVar, kVar, false);
    }

    /* renamed from: e */
    public static <D extends AbstractC11301b> Collection<D> m729e(C11142f fVar, Collection<D> collection, Collection<D> collection2, AbstractC11313e eVar, AbstractC3596r rVar, C12669k kVar) {
        if (fVar == null) {
            m733a(6);
        }
        if (collection == null) {
            m733a(7);
        }
        if (collection2 == null) {
            m733a(8);
        }
        if (eVar == null) {
            m733a(9);
        }
        if (rVar == null) {
            m733a(10);
        }
        if (kVar == null) {
            m733a(11);
        }
        return m731c(fVar, collection, collection2, eVar, rVar, kVar, true);
    }
}
