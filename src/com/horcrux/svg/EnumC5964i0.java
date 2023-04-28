package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.i0 */
/* loaded from: classes6.dex */
enum EnumC5964i0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom(ViewProps.BOTTOM),
    center("center"),
    top(ViewProps.TOP),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");
    

    /* renamed from: B */
    private static final Map<String, EnumC5964i0> f37624B = new HashMap();

    /* renamed from: k */
    private final String f11908k;

    static {
        EnumC5964i0[] values;
        for (EnumC5964i0 i0Var : values()) {
            f37624B.put(i0Var.f11908k, i0Var);
        }
    }

    EnumC5964i0(String str) {
        this.f11908k = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static EnumC5964i0 m26752a(String str) {
        Map<String, EnumC5964i0> map = f37624B;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11908k;
    }
}
