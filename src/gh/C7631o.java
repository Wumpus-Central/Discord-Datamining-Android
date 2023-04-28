package gh;

import gh.AbstractC7625m;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;
import p217lg.EnumC10426i;
import p326ri.C12719v;
import p407wh.C13885d;
import p407wh.EnumC13886e;

/* renamed from: gh.o */
/* loaded from: classes8.dex */
final class C7631o implements AbstractC7630n<AbstractC7625m> {

    /* renamed from: a */
    public static final C7631o f16642a = new C7631o();

    /* renamed from: gh.o$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7632a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16643a;

        static {
            int[] iArr = new int[EnumC10426i.values().length];
            try {
                iArr[EnumC10426i.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10426i.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10426i.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC10426i.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC10426i.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC10426i.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC10426i.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC10426i.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f16643a = iArr;
        }
    }

    private C7631o() {
    }

    /* renamed from: g */
    public AbstractC7625m mo21833b(AbstractC7625m possiblyPrimitiveType) {
        C9971q.m14633g(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof AbstractC7625m.C7629d)) {
            return possiblyPrimitiveType;
        }
        AbstractC7625m.C7629d dVar = (AbstractC7625m.C7629d) possiblyPrimitiveType;
        if (dVar.m21835i() == null) {
            return possiblyPrimitiveType;
        }
        String f = C13885d.m2400c(dVar.m21835i().m2389g()).m2397f();
        C9971q.m14634f(f, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return mo21830e(f);
    }

    /* renamed from: h */
    public AbstractC7625m mo21834a(String representation) {
        EnumC13886e eVar;
        AbstractC7625m cVar;
        boolean z;
        C9971q.m14633g(representation, "representation");
        representation.length();
        char charAt = representation.charAt(0);
        EnumC13886e[] values = EnumC13886e.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            eVar = values[i];
            if (eVar.m2392d().charAt(0) == charAt) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (eVar != null) {
            return new AbstractC7625m.C7629d(eVar);
        }
        if (charAt == 'V') {
            return new AbstractC7625m.C7629d(null);
        }
        if (charAt == '[') {
            String substring = representation.substring(1);
            C9971q.m14634f(substring, "this as java.lang.String).substring(startIndex)");
            cVar = new AbstractC7625m.C7626a(mo21834a(substring));
        } else {
            if (charAt == 'L') {
                C12719v.m5703P(representation, ';', false, 2, null);
            }
            String substring2 = representation.substring(1, representation.length() - 1);
            C9971q.m14634f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            cVar = new AbstractC7625m.C7628c(substring2);
        }
        return cVar;
    }

    /* renamed from: i */
    public AbstractC7625m.C7628c mo21830e(String internalName) {
        C9971q.m14633g(internalName, "internalName");
        return new AbstractC7625m.C7628c(internalName);
    }

    /* renamed from: j */
    public AbstractC7625m mo21832c(EnumC10426i primitiveType) {
        C9971q.m14633g(primitiveType, "primitiveType");
        switch (C7632a.f16643a[primitiveType.ordinal()]) {
            case 1:
                return AbstractC7625m.f16630a.m21844a();
            case 2:
                return AbstractC7625m.f16630a.m21842c();
            case 3:
                return AbstractC7625m.f16630a.m21843b();
            case 4:
                return AbstractC7625m.f16630a.m21837h();
            case 5:
                return AbstractC7625m.f16630a.m21839f();
            case 6:
                return AbstractC7625m.f16630a.m21840e();
            case 7:
                return AbstractC7625m.f16630a.m21838g();
            case 8:
                return AbstractC7625m.f16630a.m21841d();
            default:
                throw new C11088q();
        }
    }

    /* renamed from: k */
    public AbstractC7625m mo21829f() {
        return mo21830e("java/lang/Class");
    }

    /* renamed from: l */
    public String mo21831d(AbstractC7625m type) {
        String d;
        C9971q.m14633g(type, "type");
        if (type instanceof AbstractC7625m.C7626a) {
            return '[' + mo21831d(((AbstractC7625m.C7626a) type).m21845i());
        } else if (type instanceof AbstractC7625m.C7629d) {
            EnumC13886e i = ((AbstractC7625m.C7629d) type).m21835i();
            if (i == null || (d = i.m2392d()) == null) {
                return "V";
            }
            return d;
        } else if (type instanceof AbstractC7625m.C7628c) {
            return 'L' + ((AbstractC7625m.C7628c) type).m21836i() + ';';
        } else {
            throw new C11088q();
        }
    }
}
