package p217lg;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7304o0;
import fi.C7236d1;
import fi.C7270h0;
import fi.C7296m1;
import fi.C7322s1;
import fi.EnumC7338w1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mg.C10597a;
import p087ei.AbstractC6936g;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11138d;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p268og.AbstractC11368q0;
import p268og.AbstractC11388u0;
import p268og.AbstractC11390v0;
import p268og.AbstractC11392w0;
import p268og.C11371s;
import p268og.C11393x;
import p304qg.AbstractC12125a;
import p304qg.AbstractC12126b;
import p304qg.AbstractC12127c;
import p324rg.C12649x;
import p325rh.C12661e;
import p388vh.C13508c;
import p406wg.EnumC13881d;
import p448yh.AbstractC14411h;
import pg.AbstractC11672g;

/* renamed from: lg.h */
/* loaded from: classes8.dex */
public abstract class AbstractC10420h {

    /* renamed from: g */
    public static final C11142f f22828g = C11142f.m10764i("<built-ins module>");

    /* renamed from: a */
    private C12649x f22829a;

    /* renamed from: b */
    private AbstractC6938i<C12649x> f22830b;

    /* renamed from: c */
    private final AbstractC6938i<C10425e> f22831c;

    /* renamed from: d */
    private final AbstractC6938i<Collection<AbstractC11368q0>> f22832d;

    /* renamed from: e */
    private final AbstractC6936g<C11142f, AbstractC11313e> f22833e;

    /* renamed from: f */
    private final AbstractC6944n f22834f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg.h$a */
    /* loaded from: classes8.dex */
    public class C10421a implements Function0<Collection<AbstractC11368q0>> {
        C10421a() {
        }

        /* renamed from: a */
        public Collection<AbstractC11368q0> invoke() {
            return Arrays.asList(AbstractC10420h.this.m13369r().mo6135n0(C10434k.f22894u), AbstractC10420h.this.m13369r().mo6135n0(C10434k.f22896w), AbstractC10420h.this.m13369r().mo6135n0(C10434k.f22897x), AbstractC10420h.this.m13369r().mo6135n0(C10434k.f22895v));
        }
    }

    /* renamed from: lg.h$b */
    /* loaded from: classes8.dex */
    class C10422b implements Function0<C10425e> {
        C10422b() {
        }

        /* renamed from: a */
        public C10425e invoke() {
            EnumC10426i[] values;
            EnumMap enumMap = new EnumMap(EnumC10426i.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (EnumC10426i iVar : EnumC10426i.values()) {
                AbstractC7304o0 q = AbstractC10420h.this.m13371q(iVar.m13343e().m10771b());
                AbstractC7304o0 q2 = AbstractC10420h.this.m13371q(iVar.m13345c().m10771b());
                enumMap.put((EnumMap) iVar, (EnumC10426i) q2);
                hashMap.put(q, q2);
                hashMap2.put(q2, q);
            }
            return new C10425e(enumMap, hashMap, hashMap2, null);
        }
    }

    /* renamed from: lg.h$c */
    /* loaded from: classes8.dex */
    class C10423c implements Function1<C11142f, AbstractC11313e> {
        C10423c() {
        }

        /* renamed from: a */
        public AbstractC11313e invoke(C11142f fVar) {
            AbstractC11326h e = AbstractC10420h.this.m13367s().mo636e(fVar, EnumC13881d.FROM_BUILTINS);
            if (e == null) {
                throw new AssertionError("Built-in class " + C10434k.f22894u.m10802c(fVar) + " is not found");
            } else if (e instanceof AbstractC11313e) {
                return (AbstractC11313e) e;
            } else {
                throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + e);
            }
        }
    }

    /* renamed from: lg.h$d */
    /* loaded from: classes8.dex */
    class C10424d implements Function0<Void> {

        /* renamed from: k */
        final /* synthetic */ C12649x f22838k;

        C10424d(C12649x xVar) {
            this.f22838k = xVar;
        }

        /* renamed from: a */
        public Void invoke() {
            if (AbstractC10420h.this.f22829a == null) {
                AbstractC10420h.this.f22829a = this.f22838k;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + AbstractC10420h.this.f22829a + " (attempting to reset to " + this.f22838k + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lg.h$e */
    /* loaded from: classes8.dex */
    public static class C10425e {

        /* renamed from: a */
        public final Map<EnumC10426i, AbstractC7304o0> f22840a;

        /* renamed from: b */
        public final Map<AbstractC7267g0, AbstractC7304o0> f22841b;

        /* renamed from: c */
        public final Map<AbstractC7304o0, AbstractC7304o0> f22842c;

        /* synthetic */ C10425e(Map map, Map map2, Map map3, C10421a aVar) {
            this(map, map2, map3);
        }

        /* renamed from: a */
        private static /* synthetic */ void m13348a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private C10425e(Map<EnumC10426i, AbstractC7304o0> map, Map<AbstractC7267g0, AbstractC7304o0> map2, Map<AbstractC7304o0, AbstractC7304o0> map3) {
            if (map == null) {
                m13348a(0);
            }
            if (map2 == null) {
                m13348a(1);
            }
            if (map3 == null) {
                m13348a(2);
            }
            this.f22840a = map;
            this.f22841b = map2;
            this.f22842c = map3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10420h(AbstractC6944n nVar) {
        if (nVar == null) {
            m13402a(0);
        }
        this.f22834f = nVar;
        this.f22832d = nVar.mo23898c(new C10421a());
        this.f22831c = nVar.mo23898c(new C10422b());
        this.f22833e = nVar.mo23892i(new C10423c());
    }

    /* renamed from: A */
    private static AbstractC7267g0 m13431A(AbstractC7267g0 g0Var, AbstractC11327h0 h0Var) {
        C11136b k;
        C11136b a;
        AbstractC11313e a2;
        if (g0Var == null) {
            m13402a(71);
        }
        if (h0Var == null) {
            m13402a(72);
        }
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p == null) {
            return null;
        }
        C10439o oVar = C10439o.f22968a;
        if (!oVar.m13314b(p.getName()) || (k = C13508c.m3530k(p)) == null || (a = oVar.m13315a(k)) == null || (a2 = C11393x.m10149a(h0Var, a)) == null) {
            return null;
        }
        return a2.mo6166p();
    }

    /* renamed from: A0 */
    public static boolean m13430A0(AbstractC11346m mVar) {
        if (mVar == null) {
            m13402a(10);
        }
        while (mVar != null) {
            if (mVar instanceof AbstractC11344l0) {
                return ((AbstractC11344l0) mVar).mo6103e().m10796i(C10434k.f22893t);
            }
            mVar = mVar.mo6104b();
        }
        return false;
    }

    /* renamed from: B0 */
    public static boolean m13428B0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(142);
        }
        return m13380l0(g0Var, C10434k.C10435a.f22910f);
    }

    /* renamed from: C0 */
    public static boolean m13426C0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(132);
        }
        if (m13359w0(g0Var) || m13353z0(g0Var) || m13357x0(g0Var) || m13355y0(g0Var)) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public static EnumC10426i m13415N(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(92);
        }
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p == null) {
            return null;
        }
        return m13413P(p);
    }

    /* renamed from: P */
    public static EnumC10426i m13413P(AbstractC11346m mVar) {
        if (mVar == null) {
            m13402a(77);
        }
        if (C10434k.C10435a.f38780H0.contains(mVar.getName())) {
            return C10434k.C10435a.f38784J0.get(C12661e.m6041m(mVar));
        }
        return null;
    }

    /* renamed from: Q */
    private AbstractC11313e m13412Q(EnumC10426i iVar) {
        if (iVar == null) {
            m13402a(16);
        }
        return m13373p(iVar.m13343e().m10771b());
    }

    /* renamed from: S */
    public static EnumC10426i m13410S(AbstractC11346m mVar) {
        if (mVar == null) {
            m13402a(76);
        }
        if (C10434k.C10435a.f38778G0.contains(mVar.getName())) {
            return C10434k.C10435a.f38782I0.get(C12661e.m6041m(mVar));
        }
        return null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m13402a(int i) {
        String str;
        int i2;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i2 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: a0 */
    public static boolean m13401a0(AbstractC11313e eVar) {
        if (eVar == null) {
            m13402a(108);
        }
        return m13394e(eVar, C10434k.C10435a.f22902b);
    }

    /* renamed from: b0 */
    public static boolean m13399b0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(139);
        }
        return m13390g0(g0Var, C10434k.C10435a.f22902b);
    }

    /* renamed from: c0 */
    public static boolean m13397c0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(88);
        }
        return m13390g0(g0Var, C10434k.C10435a.f22916i);
    }

    /* renamed from: d0 */
    public static boolean m13395d0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(90);
        }
        if (m13397c0(g0Var) || m13372p0(g0Var)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m13394e(AbstractC11326h hVar, C11138d dVar) {
        if (hVar == null) {
            m13402a(103);
        }
        if (dVar == null) {
            m13402a(104);
        }
        if (!hVar.getName().equals(dVar.m10785i()) || !dVar.equals(C12661e.m6041m(hVar))) {
            return false;
        }
        return true;
    }

    /* renamed from: e0 */
    public static boolean m13393e0(AbstractC11313e eVar) {
        if (eVar == null) {
            m13402a(89);
        }
        if (m13394e(eVar, C10434k.C10435a.f22916i) || m13413P(eVar) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public static boolean m13391f0(AbstractC11346m mVar) {
        if (mVar == null) {
            m13402a(9);
        }
        if (C12661e.m6036r(mVar, AbstractC10413b.class, false) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    private static boolean m13390g0(AbstractC7267g0 g0Var, C11138d dVar) {
        if (g0Var == null) {
            m13402a(97);
        }
        if (dVar == null) {
            m13402a(98);
        }
        return m13361v0(g0Var.mo5172N0(), dVar);
    }

    /* renamed from: h0 */
    private static boolean m13388h0(AbstractC7267g0 g0Var, C11138d dVar) {
        if (g0Var == null) {
            m13402a(134);
        }
        if (dVar == null) {
            m13402a(135);
        }
        if (!m13390g0(g0Var, dVar) || g0Var.mo5171O0()) {
            return false;
        }
        return true;
    }

    /* renamed from: i0 */
    public static boolean m13386i0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(141);
        }
        return m13374o0(g0Var);
    }

    /* renamed from: j0 */
    public static boolean m13384j0(AbstractC11346m mVar) {
        if (mVar == null) {
            m13402a(161);
        }
        if (mVar.mo6162a().getAnnotations().mo9037l(C10434k.C10435a.f22948y)) {
            return true;
        }
        if (!(mVar instanceof AbstractC11388u0)) {
            return false;
        }
        AbstractC11388u0 u0Var = (AbstractC11388u0) mVar;
        boolean L = u0Var.mo6277L();
        AbstractC11390v0 f = u0Var.mo6437f();
        AbstractC11392w0 h = u0Var.mo6436h();
        if (f != null && m13384j0(f)) {
            if (!L) {
                return true;
            }
            if (h != null && m13384j0(h)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    public static boolean m13382k0(AbstractC11313e eVar) {
        if (eVar == null) {
            m13402a(158);
        }
        return m13394e(eVar, C10434k.C10435a.f22917i0);
    }

    /* renamed from: l0 */
    private static boolean m13380l0(AbstractC7267g0 g0Var, C11138d dVar) {
        if (g0Var == null) {
            m13402a(105);
        }
        if (dVar == null) {
            m13402a(106);
        }
        if (g0Var.mo5171O0() || !m13390g0(g0Var, dVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: m0 */
    public static boolean m13378m0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(136);
        }
        if (!m13376n0(g0Var) || C7322s1.m22935l(g0Var)) {
            return false;
        }
        return true;
    }

    /* renamed from: n0 */
    public static boolean m13376n0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(138);
        }
        return m13390g0(g0Var, C10434k.C10435a.f22904c);
    }

    /* renamed from: o0 */
    public static boolean m13374o0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(140);
        }
        if (!m13399b0(g0Var) || !g0Var.mo5171O0()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private AbstractC11313e m13373p(String str) {
        if (str == null) {
            m13402a(14);
        }
        AbstractC11313e invoke = this.f22833e.invoke(C11142f.m10767f(str));
        if (invoke == null) {
            m13402a(15);
        }
        return invoke;
    }

    /* renamed from: p0 */
    public static boolean m13372p0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(91);
        }
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p == null || m13413P(p) == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public AbstractC7304o0 m13371q(String str) {
        if (str == null) {
            m13402a(46);
        }
        AbstractC7304o0 p = m13373p(str).mo6166p();
        if (p == null) {
            m13402a(47);
        }
        return p;
    }

    /* renamed from: q0 */
    public static boolean m13370q0(AbstractC11313e eVar) {
        if (eVar == null) {
            m13402a(96);
        }
        if (m13410S(eVar) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public static boolean m13368r0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(94);
        }
        if (g0Var.mo5171O0() || !m13366s0(g0Var)) {
            return false;
        }
        return true;
    }

    /* renamed from: s0 */
    public static boolean m13366s0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(95);
        }
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (!(p instanceof AbstractC11313e) || !m13370q0((AbstractC11313e) p)) {
            return false;
        }
        return true;
    }

    /* renamed from: t0 */
    public static boolean m13364t0(AbstractC11313e eVar) {
        if (eVar == null) {
            m13402a(107);
        }
        if (m13394e(eVar, C10434k.C10435a.f22902b) || m13394e(eVar, C10434k.C10435a.f22904c)) {
            return true;
        }
        return false;
    }

    /* renamed from: u0 */
    public static boolean m13362u0(AbstractC7267g0 g0Var) {
        return g0Var != null && m13380l0(g0Var, C10434k.C10435a.f22914h);
    }

    /* renamed from: v0 */
    public static boolean m13361v0(AbstractC7268g1 g1Var, C11138d dVar) {
        if (g1Var == null) {
            m13402a(101);
        }
        if (dVar == null) {
            m13402a(102);
        }
        AbstractC11326h p = g1Var.mo4565p();
        if (!(p instanceof AbstractC11313e) || !m13394e(p, dVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: w0 */
    public static boolean m13359w0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(128);
        }
        return m13388h0(g0Var, C10434k.C10435a.f38770C0.m10795j());
    }

    /* renamed from: x0 */
    public static boolean m13357x0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(130);
        }
        return m13388h0(g0Var, C10434k.C10435a.f38774E0.m10795j());
    }

    /* renamed from: y0 */
    public static boolean m13355y0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(131);
        }
        return m13388h0(g0Var, C10434k.C10435a.f38776F0.m10795j());
    }

    /* renamed from: z0 */
    public static boolean m13353z0(AbstractC7267g0 g0Var) {
        if (g0Var == null) {
            m13402a(129);
        }
        return m13388h0(g0Var, C10434k.C10435a.f38772D0.m10795j());
    }

    /* renamed from: B */
    public AbstractC7304o0 m13429B() {
        AbstractC7304o0 R = m13411R(EnumC10426i.FLOAT);
        if (R == null) {
            m13402a(60);
        }
        return R;
    }

    /* renamed from: C */
    public AbstractC11313e m13427C(int i) {
        return m13373p(C10434k.m13332b(i));
    }

    /* renamed from: D */
    public AbstractC7304o0 m13425D() {
        AbstractC7304o0 R = m13411R(EnumC10426i.INT);
        if (R == null) {
            m13402a(58);
        }
        return R;
    }

    /* renamed from: D0 */
    public void m13424D0(C12649x xVar) {
        if (xVar == null) {
            m13402a(1);
        }
        this.f22834f.mo23897d(new C10424d(xVar));
    }

    /* renamed from: E */
    public AbstractC11313e m13423E() {
        AbstractC11313e o = m13375o(C10434k.C10435a.f22917i0.m10782l());
        if (o == null) {
            m13402a(21);
        }
        return o;
    }

    /* renamed from: F */
    public AbstractC7304o0 m13422F() {
        AbstractC7304o0 R = m13411R(EnumC10426i.LONG);
        if (R == null) {
            m13402a(59);
        }
        return R;
    }

    /* renamed from: G */
    public AbstractC11313e m13421G() {
        return m13373p("Nothing");
    }

    /* renamed from: H */
    public AbstractC7304o0 m13420H() {
        AbstractC7304o0 p = m13421G().mo6166p();
        if (p == null) {
            m13402a(48);
        }
        return p;
    }

    /* renamed from: I */
    public AbstractC7304o0 m13419I() {
        AbstractC7304o0 U0 = m13387i().mo5166U0(true);
        if (U0 == null) {
            m13402a(51);
        }
        return U0;
    }

    /* renamed from: J */
    public AbstractC7304o0 m13418J() {
        AbstractC7304o0 U0 = m13420H().mo5166U0(true);
        if (U0 == null) {
            m13402a(49);
        }
        return U0;
    }

    /* renamed from: K */
    public AbstractC11313e m13417K() {
        return m13373p("Number");
    }

    /* renamed from: L */
    public AbstractC7304o0 m13416L() {
        AbstractC7304o0 p = m13417K().mo6166p();
        if (p == null) {
            m13402a(55);
        }
        return p;
    }

    /* renamed from: M */
    protected AbstractC12127c mo10867M() {
        AbstractC12127c.C12129b bVar = AbstractC12127c.C12129b.f27212a;
        if (bVar == null) {
            m13402a(4);
        }
        return bVar;
    }

    /* renamed from: O */
    public AbstractC7304o0 m13414O(EnumC10426i iVar) {
        if (iVar == null) {
            m13402a(73);
        }
        AbstractC7304o0 o0Var = this.f22831c.invoke().f22840a.get(iVar);
        if (o0Var == null) {
            m13402a(74);
        }
        return o0Var;
    }

    /* renamed from: R */
    public AbstractC7304o0 m13411R(EnumC10426i iVar) {
        if (iVar == null) {
            m13402a(53);
        }
        AbstractC7304o0 p = m13412Q(iVar).mo6166p();
        if (p == null) {
            m13402a(54);
        }
        return p;
    }

    /* renamed from: T */
    public AbstractC7304o0 m13409T() {
        AbstractC7304o0 R = m13411R(EnumC10426i.SHORT);
        if (R == null) {
            m13402a(57);
        }
        return R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public AbstractC6944n m13408U() {
        AbstractC6944n nVar = this.f22834f;
        if (nVar == null) {
            m13402a(6);
        }
        return nVar;
    }

    /* renamed from: V */
    public AbstractC11313e m13407V() {
        return m13373p("String");
    }

    /* renamed from: W */
    public AbstractC7304o0 m13406W() {
        AbstractC7304o0 p = m13407V().mo6166p();
        if (p == null) {
            m13402a(65);
        }
        return p;
    }

    /* renamed from: X */
    public AbstractC11313e m13405X(int i) {
        AbstractC11313e o = m13375o(C10434k.f22886m.m10802c(C11142f.m10767f(C10434k.m13330d(i))));
        if (o == null) {
            m13402a(18);
        }
        return o;
    }

    /* renamed from: Y */
    public AbstractC11313e m13404Y() {
        return m13373p("Unit");
    }

    /* renamed from: Z */
    public AbstractC7304o0 m13403Z() {
        AbstractC7304o0 p = m13404Y().mo6166p();
        if (p == null) {
            m13402a(64);
        }
        return p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m13392f(boolean z) {
        C12649x xVar = new C12649x(f22828g, this.f22834f, this, null);
        this.f22829a = xVar;
        xVar.m6144S0(AbstractC10412a.f22820a.m13458a().mo13459a(this.f22834f, this.f22829a, mo10865v(), mo10867M(), mo10866g(), z));
        C12649x xVar2 = this.f22829a;
        xVar2.m6138Y0(xVar2);
    }

    /* renamed from: g */
    protected AbstractC12125a mo10866g() {
        AbstractC12125a.C0385a aVar = AbstractC12125a.C0385a.f27210a;
        if (aVar == null) {
            m13402a(3);
        }
        return aVar;
    }

    /* renamed from: h */
    public AbstractC11313e m13389h() {
        return m13373p("Any");
    }

    /* renamed from: i */
    public AbstractC7304o0 m13387i() {
        AbstractC7304o0 p = m13389h().mo6166p();
        if (p == null) {
            m13402a(50);
        }
        return p;
    }

    /* renamed from: j */
    public AbstractC11313e m13385j() {
        return m13373p("Array");
    }

    /* renamed from: k */
    public AbstractC7267g0 m13383k(AbstractC7267g0 g0Var) {
        AbstractC7267g0 A;
        if (g0Var == null) {
            m13402a(67);
        }
        if (!m13397c0(g0Var)) {
            AbstractC7267g0 n = C7322s1.m22933n(g0Var);
            AbstractC7304o0 o0Var = this.f22831c.invoke().f22842c.get(n);
            if (o0Var != null) {
                return o0Var;
            }
            AbstractC11327h0 h = C12661e.m6046h(n);
            if (h != null && (A = m13431A(n, h)) != null) {
                return A;
            }
            throw new IllegalStateException("not array: " + g0Var);
        } else if (g0Var.mo5174L0().size() == 1) {
            AbstractC7267g0 type = g0Var.mo5174L0().get(0).getType();
            if (type == null) {
                m13402a(68);
            }
            return type;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: l */
    public AbstractC7304o0 m13381l(EnumC7338w1 w1Var, AbstractC7267g0 g0Var) {
        if (w1Var == null) {
            m13402a(82);
        }
        if (g0Var == null) {
            m13402a(83);
        }
        AbstractC7304o0 m = m13379m(w1Var, g0Var, AbstractC11672g.f26044g.m9048b());
        if (m == null) {
            m13402a(84);
        }
        return m;
    }

    /* renamed from: m */
    public AbstractC7304o0 m13379m(EnumC7338w1 w1Var, AbstractC7267g0 g0Var, AbstractC11672g gVar) {
        if (w1Var == null) {
            m13402a(78);
        }
        if (g0Var == null) {
            m13402a(79);
        }
        if (gVar == null) {
            m13402a(80);
        }
        AbstractC7304o0 g = C7270h0.m23053g(C7236d1.m23140b(gVar), m13385j(), Collections.singletonList(new C7296m1(w1Var, g0Var)));
        if (g == null) {
            m13402a(81);
        }
        return g;
    }

    /* renamed from: n */
    public AbstractC7304o0 m13377n() {
        AbstractC7304o0 R = m13411R(EnumC10426i.BOOLEAN);
        if (R == null) {
            m13402a(63);
        }
        return R;
    }

    /* renamed from: o */
    public AbstractC11313e m13375o(C11137c cVar) {
        if (cVar == null) {
            m13402a(12);
        }
        AbstractC11313e c = C11371s.m10179c(m13369r(), cVar, EnumC13881d.FROM_BUILTINS);
        if (c == null) {
            m13402a(13);
        }
        return c;
    }

    /* renamed from: r */
    public C12649x m13369r() {
        if (this.f22829a == null) {
            this.f22829a = this.f22830b.invoke();
        }
        C12649x xVar = this.f22829a;
        if (xVar == null) {
            m13402a(7);
        }
        return xVar;
    }

    /* renamed from: s */
    public AbstractC14411h m13367s() {
        AbstractC14411h o = m13369r().mo6135n0(C10434k.f22894u).mo6180o();
        if (o == null) {
            m13402a(11);
        }
        return o;
    }

    /* renamed from: t */
    public AbstractC7304o0 m13365t() {
        AbstractC7304o0 R = m13411R(EnumC10426i.BYTE);
        if (R == null) {
            m13402a(56);
        }
        return R;
    }

    /* renamed from: u */
    public AbstractC7304o0 m13363u() {
        AbstractC7304o0 R = m13411R(EnumC10426i.CHAR);
        if (R == null) {
            m13402a(62);
        }
        return R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public Iterable<AbstractC12126b> mo10865v() {
        List singletonList = Collections.singletonList(new C10597a(this.f22834f, m13369r()));
        if (singletonList == null) {
            m13402a(5);
        }
        return singletonList;
    }

    /* renamed from: w */
    public AbstractC11313e m13360w() {
        AbstractC11313e o = m13375o(C10434k.C10435a.f38795U);
        if (o == null) {
            m13402a(34);
        }
        return o;
    }

    /* renamed from: x */
    public AbstractC11313e m13358x() {
        return m13373p("Comparable");
    }

    /* renamed from: y */
    public AbstractC7304o0 m13356y() {
        AbstractC7304o0 I = m13419I();
        if (I == null) {
            m13402a(52);
        }
        return I;
    }

    /* renamed from: z */
    public AbstractC7304o0 m13354z() {
        AbstractC7304o0 R = m13411R(EnumC10426i.DOUBLE);
        if (R == null) {
            m13402a(61);
        }
        return R;
    }
}
