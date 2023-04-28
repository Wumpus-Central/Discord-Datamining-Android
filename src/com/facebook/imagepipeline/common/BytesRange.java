package com.facebook.imagepipeline.common;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.regex.Pattern;
import p076e4.C6701b;
import p394w3.C13740j;

/* loaded from: classes7.dex */
public class BytesRange {

    /* renamed from: c */
    private static Pattern f8122c;

    /* renamed from: a */
    public final int f8123a;

    /* renamed from: b */
    public final int f8124b;

    public BytesRange(int i, int i2) {
        this.f8123a = i;
        this.f8124b = i2;
    }

    /* renamed from: b */
    public static BytesRange m31507b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        return new BytesRange(i, ViewDefaults.NUMBER_OF_LINES);
    }

    /* renamed from: c */
    public static BytesRange m31506c(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        if (str == null) {
            return null;
        }
        if (f8122c == null) {
            f8122c = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f8122c.split(str);
            if (split.length == 4) {
                z = true;
            } else {
                z = false;
            }
            C13740j.m2839b(Boolean.valueOf(z));
            C13740j.m2839b(Boolean.valueOf(split[0].equals("bytes")));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            if (parseInt2 > parseInt) {
                z2 = true;
            } else {
                z2 = false;
            }
            C13740j.m2839b(Boolean.valueOf(z2));
            if (parseInt3 > parseInt2) {
                z3 = true;
            } else {
                z3 = false;
            }
            C13740j.m2839b(Boolean.valueOf(z3));
            if (parseInt2 < parseInt3 - 1) {
                return new BytesRange(parseInt, parseInt2);
            }
            return new BytesRange(parseInt, ViewDefaults.NUMBER_OF_LINES);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", str), e);
        }
    }

    /* renamed from: e */
    public static BytesRange m31504e(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        return new BytesRange(0, i);
    }

    /* renamed from: f */
    private static String m31503f(int i) {
        if (i == Integer.MAX_VALUE) {
            return "";
        }
        return Integer.toString(i);
    }

    /* renamed from: a */
    public boolean m31508a(BytesRange bytesRange) {
        return bytesRange != null && this.f8123a <= bytesRange.f8123a && this.f8124b >= bytesRange.f8124b;
    }

    /* renamed from: d */
    public String m31505d() {
        return String.format(null, "bytes=%s-%s", m31503f(this.f8123a), m31503f(this.f8124b));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BytesRange)) {
            return false;
        }
        BytesRange bytesRange = (BytesRange) obj;
        if (this.f8123a == bytesRange.f8123a && this.f8124b == bytesRange.f8124b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6701b.m24618a(this.f8123a, this.f8124b);
    }

    public String toString() {
        return String.format(null, "%s-%s", m31503f(this.f8123a), m31503f(this.f8124b));
    }
}
