package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.l0 */
/* loaded from: classes6.dex */
enum EnumC5970l0 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");
    

    /* renamed from: y */
    private static final Map<String, EnumC5970l0> f11960y = new HashMap();

    /* renamed from: k */
    private final String f11962k;

    static {
        EnumC5970l0[] values;
        for (EnumC5970l0 l0Var : values()) {
            f11960y.put(l0Var.f11962k, l0Var);
        }
    }

    EnumC5970l0(String str) {
        this.f11962k = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static EnumC5970l0 m26722a(String str) {
        return f11960y.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m26721b(String str) {
        return f11960y.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11962k;
    }
}
