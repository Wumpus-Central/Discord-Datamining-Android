package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.n0 */
/* loaded from: classes6.dex */
enum EnumC5975n0 {
    None(ViewProps.NONE),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");
    

    /* renamed from: q */
    private static final Map<String, EnumC5975n0> f11987q = new HashMap();

    /* renamed from: k */
    private final String f11989k;

    static {
        EnumC5975n0[] values;
        for (EnumC5975n0 n0Var : values()) {
            f11987q.put(n0Var.f11989k, n0Var);
        }
    }

    EnumC5975n0(String str) {
        this.f11989k = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static EnumC5975n0 m26690a(String str) {
        Map<String, EnumC5975n0> map = f11987q;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11989k;
    }
}
