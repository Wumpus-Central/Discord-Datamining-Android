package net.time4j;

import java.util.Locale;
import net.time4j.base.AbstractC10818g;
import p143hj.AbstractC8075n;
import p161ij.C8629b;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;

/* renamed from: net.time4j.z */
/* loaded from: classes8.dex */
public enum EnumC11044z implements AbstractC8075n<AbstractC10818g> {
    AM,
    PM;

    /* renamed from: c */
    public static EnumC11044z m11140c(int i) {
        if (i < 0 || i > 24) {
            throw new IllegalArgumentException("Hour of day out of range: " + i);
        } else if (i < 12 || i == 24) {
            return AM;
        } else {
            return PM;
        }
    }

    /* renamed from: a */
    public String m11142a(Locale locale) {
        return m11141b(locale, EnumC8671v.WIDE, EnumC8658m.FORMAT);
    }

    /* renamed from: b */
    public String m11141b(Locale locale, EnumC8671v vVar, EnumC8658m mVar) {
        return C8629b.m18468d(locale).m18464h(vVar, mVar).m18409f(this);
    }

    /* renamed from: d */
    public boolean test(AbstractC10818g gVar) {
        int p = gVar.mo11640p();
        if (this == AM) {
            if (p < 12 || p == 24) {
                return true;
            }
        } else if (p >= 12 && p < 24) {
            return true;
        }
        return false;
    }
}
