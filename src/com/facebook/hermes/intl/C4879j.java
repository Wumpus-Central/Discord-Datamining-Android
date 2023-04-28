package com.facebook.hermes.intl;

import java.util.Arrays;
import p129h5.C7840i;
import p129h5.C7848j;

/* renamed from: com.facebook.hermes.intl.j */
/* loaded from: classes7.dex */
public class C4879j {

    /* renamed from: com.facebook.hermes.intl.j$a */
    /* loaded from: classes7.dex */
    public enum EnumC4880a {
        BOOLEAN,
        STRING
    }

    /* renamed from: a */
    public static Object m31567a(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C7840i.m21245n(obj)) {
            return obj4;
        }
        if (C7840i.m21248k(obj)) {
            double f = C7840i.m21253f(obj);
            if (!Double.isNaN(f) && f <= C7840i.m21253f(obj3) && f >= C7840i.m21253f(obj2)) {
                return obj;
            }
            throw new C7848j("Invalid number value !");
        }
        throw new C7848j("Invalid number value !");
    }

    /* renamed from: b */
    public static Object m31566b(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        return m31567a(C7840i.m21258a(obj, str), obj2, obj3, obj4);
    }

    /* renamed from: c */
    public static Object m31565c(Object obj, String str, EnumC4880a aVar, Object obj2, Object obj3) {
        Object a = C7840i.m21258a(obj, str);
        if (C7840i.m21245n(a)) {
            return obj3;
        }
        if (C7840i.m21249j(a)) {
            a = "";
        }
        if (aVar == EnumC4880a.BOOLEAN && !C7840i.m21250i(a)) {
            throw new C7848j("Boolean option expected but not found");
        } else if (aVar == EnumC4880a.STRING && !C7840i.m21246m(a)) {
            throw new C7848j("String option expected but not found");
        } else if (C7840i.m21245n(obj2) || Arrays.asList((Object[]) obj2).contains(a)) {
            return a;
        } else {
            throw new C7848j("String option expected but not found");
        }
    }

    /* renamed from: d */
    public static <T extends Enum<T>> T m31564d(Class<T> cls, Object obj) {
        T[] enumConstants;
        if (C7840i.m21245n(obj)) {
            return (T) Enum.valueOf(cls, "UNDEFINED");
        }
        if (C7840i.m21249j(obj)) {
            return null;
        }
        String h = C7840i.m21251h(obj);
        if (h.equals("2-digit")) {
            return (T) Enum.valueOf(cls, "DIGIT2");
        }
        for (T t : cls.getEnumConstants()) {
            if (t.name().compareToIgnoreCase(h) == 0) {
                return t;
            }
        }
        return null;
    }
}
