package p407wh;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p217lg.EnumC10426i;
import p249nh.C11137c;

/* renamed from: wh.e */
/* loaded from: classes8.dex */
public enum EnumC13886e {
    BOOLEAN(EnumC10426i.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(EnumC10426i.CHAR, "char", "C", "java.lang.Character"),
    BYTE(EnumC10426i.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(EnumC10426i.SHORT, "short", "S", "java.lang.Short"),
    INT(EnumC10426i.INT, "int", "I", "java.lang.Integer"),
    FLOAT(EnumC10426i.FLOAT, "float", "F", "java.lang.Float"),
    LONG(EnumC10426i.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(EnumC10426i.DOUBLE, "double", "D", "java.lang.Double");
    

    /* renamed from: w */
    private static final Set<C11137c> f31307w = new HashSet();

    /* renamed from: x */
    private static final Map<String, EnumC13886e> f31308x = new HashMap();

    /* renamed from: y */
    private static final Map<EnumC10426i, EnumC13886e> f31309y = new EnumMap(EnumC10426i.class);

    /* renamed from: z */
    private static final Map<String, EnumC13886e> f31310z = new HashMap();

    /* renamed from: k */
    private final EnumC10426i f31311k;

    /* renamed from: l */
    private final String f31312l;

    /* renamed from: m */
    private final String f31313m;

    /* renamed from: n */
    private final C11137c f31314n;

    static {
        EnumC13886e[] values;
        for (EnumC13886e eVar : values()) {
            f31307w.add(eVar.m2389g());
            f31308x.put(eVar.m2391e(), eVar);
            f31309y.put(eVar.m2390f(), eVar);
            f31310z.put(eVar.m2392d(), eVar);
        }
    }

    EnumC13886e(EnumC10426i iVar, String str, String str2, String str3) {
        if (iVar == null) {
            m2395a(6);
        }
        if (str == null) {
            m2395a(7);
        }
        if (str2 == null) {
            m2395a(8);
        }
        if (str3 == null) {
            m2395a(9);
        }
        this.f31311k = iVar;
        this.f31312l = str;
        this.f31313m = str2;
        this.f31314n = new C11137c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m2395a(int r7) {
        /*
            r0 = 4
            r1 = 2
            if (r7 == r1) goto L_0x000c
            if (r7 == r0) goto L_0x000c
            switch(r7) {
                case 10: goto L_0x000c;
                case 11: goto L_0x000c;
                case 12: goto L_0x000c;
                case 13: goto L_0x000c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            if (r7 == r1) goto L_0x0017
            if (r7 == r0) goto L_0x0017
            switch(r7) {
                case 10: goto L_0x0017;
                case 11: goto L_0x0017;
                case 12: goto L_0x0017;
                case 13: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            r3 = 3
            goto L_0x0018
        L_0x0017:
            r3 = r1
        L_0x0018:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"
            r5 = 0
            switch(r7) {
                case 1: goto L_0x003c;
                case 2: goto L_0x0039;
                case 3: goto L_0x0034;
                case 4: goto L_0x0039;
                case 5: goto L_0x002f;
                case 6: goto L_0x002a;
                case 7: goto L_0x003c;
                case 8: goto L_0x002f;
                case 9: goto L_0x0025;
                case 10: goto L_0x0039;
                case 11: goto L_0x0039;
                case 12: goto L_0x0039;
                case 13: goto L_0x0039;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.String r6 = "className"
            r3[r5] = r6
            goto L_0x0040
        L_0x0025:
            java.lang.String r6 = "wrapperClassName"
            r3[r5] = r6
            goto L_0x0040
        L_0x002a:
            java.lang.String r6 = "primitiveType"
            r3[r5] = r6
            goto L_0x0040
        L_0x002f:
            java.lang.String r6 = "desc"
            r3[r5] = r6
            goto L_0x0040
        L_0x0034:
            java.lang.String r6 = "type"
            r3[r5] = r6
            goto L_0x0040
        L_0x0039:
            r3[r5] = r4
            goto L_0x0040
        L_0x003c:
            java.lang.String r6 = "name"
            r3[r5] = r6
        L_0x0040:
            java.lang.String r5 = "get"
            r6 = 1
            if (r7 == r1) goto L_0x0061
            if (r7 == r0) goto L_0x0061
            switch(r7) {
                case 10: goto L_0x005c;
                case 11: goto L_0x0057;
                case 12: goto L_0x0052;
                case 13: goto L_0x004d;
                default: goto L_0x004a;
            }
        L_0x004a:
            r3[r6] = r4
            goto L_0x0063
        L_0x004d:
            java.lang.String r4 = "getWrapperFqName"
            r3[r6] = r4
            goto L_0x0063
        L_0x0052:
            java.lang.String r4 = "getDesc"
            r3[r6] = r4
            goto L_0x0063
        L_0x0057:
            java.lang.String r4 = "getJavaKeywordName"
            r3[r6] = r4
            goto L_0x0063
        L_0x005c:
            java.lang.String r4 = "getPrimitiveType"
            r3[r6] = r4
            goto L_0x0063
        L_0x0061:
            r3[r6] = r5
        L_0x0063:
            switch(r7) {
                case 1: goto L_0x0075;
                case 2: goto L_0x0077;
                case 3: goto L_0x0075;
                case 4: goto L_0x0077;
                case 5: goto L_0x0070;
                case 6: goto L_0x006b;
                case 7: goto L_0x006b;
                case 8: goto L_0x006b;
                case 9: goto L_0x006b;
                case 10: goto L_0x0077;
                case 11: goto L_0x0077;
                case 12: goto L_0x0077;
                case 13: goto L_0x0077;
                default: goto L_0x0066;
            }
        L_0x0066:
            java.lang.String r4 = "isWrapperClassName"
            r3[r1] = r4
            goto L_0x0077
        L_0x006b:
            java.lang.String r4 = "<init>"
            r3[r1] = r4
            goto L_0x0077
        L_0x0070:
            java.lang.String r4 = "getByDesc"
            r3[r1] = r4
            goto L_0x0077
        L_0x0075:
            r3[r1] = r5
        L_0x0077:
            java.lang.String r2 = java.lang.String.format(r2, r3)
            if (r7 == r1) goto L_0x0088
            if (r7 == r0) goto L_0x0088
            switch(r7) {
                case 10: goto L_0x0088;
                case 11: goto L_0x0088;
                case 12: goto L_0x0088;
                case 13: goto L_0x0088;
                default: goto L_0x0082;
            }
        L_0x0082:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r2)
            goto L_0x008d
        L_0x0088:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
        L_0x008d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p407wh.EnumC13886e.m2395a(int):void");
    }

    /* renamed from: b */
    public static EnumC13886e m2394b(String str) {
        if (str == null) {
            m2395a(1);
        }
        EnumC13886e eVar = f31308x.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    /* renamed from: c */
    public static EnumC13886e m2393c(EnumC10426i iVar) {
        if (iVar == null) {
            m2395a(3);
        }
        EnumC13886e eVar = f31309y.get(iVar);
        if (eVar == null) {
            m2395a(4);
        }
        return eVar;
    }

    /* renamed from: d */
    public String m2392d() {
        String str = this.f31313m;
        if (str == null) {
            m2395a(12);
        }
        return str;
    }

    /* renamed from: e */
    public String m2391e() {
        String str = this.f31312l;
        if (str == null) {
            m2395a(11);
        }
        return str;
    }

    /* renamed from: f */
    public EnumC10426i m2390f() {
        EnumC10426i iVar = this.f31311k;
        if (iVar == null) {
            m2395a(10);
        }
        return iVar;
    }

    /* renamed from: g */
    public C11137c m2389g() {
        C11137c cVar = this.f31314n;
        if (cVar == null) {
            m2395a(13);
        }
        return cVar;
    }
}
