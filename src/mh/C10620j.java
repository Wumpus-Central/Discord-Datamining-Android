package mh;

import kotlin.jvm.internal.C9971q;

/* renamed from: mh.j */
/* loaded from: classes8.dex */
public final class C10620j {
    /* renamed from: a */
    public static final byte[] m12715a(String[] strings) {
        C9971q.m14633g(strings, "strings");
        int i = 0;
        for (String str : strings) {
            i += str.length();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (String str2 : strings) {
            int length = str2.length();
            int i3 = 0;
            while (i3 < length) {
                bArr[i2] = (byte) str2.charAt(i3);
                i3++;
                i2++;
            }
        }
        return bArr;
    }
}
