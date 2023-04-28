package com.facebook.soloader;

import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.soloader.n */
/* loaded from: classes7.dex */
public final class C5108n {

    /* renamed from: a */
    private static final int f8788a = 3;

    /* renamed from: b */
    private static final int f8789b = 3;

    /* renamed from: d */
    private static volatile boolean f8791d = false;

    /* renamed from: e */
    private static byte[] f8792e = null;

    /* renamed from: f */
    private static List<Integer> f8793f = null;

    /* renamed from: g */
    private static Map<Integer, List<Integer>> f8794g = null;

    /* renamed from: h */
    private static volatile boolean f8795h = false;

    /* renamed from: c */
    private static final int f8790c = 3 + 3;

    /* renamed from: i */
    private static final ReentrantReadWriteLock f8796i = new ReentrantReadWriteLock();

    /* renamed from: a */
    private static String[] m30721a(String str) {
        if (f8791d) {
            return m30714h(str);
        }
        if (!f8795h) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f8796i;
        reentrantReadWriteLock.readLock().lock();
        try {
            String[] h = m30714h(str);
            reentrantReadWriteLock.readLock().unlock();
            return h;
        } catch (Throwable th2) {
            f8796i.readLock().unlock();
            throw th2;
        }
    }

    /* renamed from: b */
    public static String[] m30720b(String str, AbstractC5090f fVar) {
        String[] a = m30721a(str);
        if (a != null) {
            return a;
        }
        return C5105m.m30730a(fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        return null;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String[] m30719c(int r6, int r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r6 = r6 + r7
            int r7 = com.facebook.soloader.C5108n.f8790c
            int r6 = r6 - r7
            r7 = 0
            r1 = r7
            r2 = r1
        L_0x000c:
            byte[] r3 = com.facebook.soloader.C5108n.f8792e
            int r4 = r3.length
            r5 = 0
            if (r6 >= r4) goto L_0x003e
            byte r3 = r3[r6]
            r4 = 10
            if (r3 == r4) goto L_0x003e
            r4 = 32
            if (r3 != r4) goto L_0x002b
            if (r2 == 0) goto L_0x003a
            java.lang.String r1 = m30718d(r1)
            if (r1 != 0) goto L_0x0025
            return r5
        L_0x0025:
            r0.add(r1)
            r1 = r7
            r2 = r1
            goto L_0x003a
        L_0x002b:
            r2 = 48
            if (r3 < r2) goto L_0x003d
            r2 = 57
            if (r3 <= r2) goto L_0x0034
            goto L_0x003d
        L_0x0034:
            int r1 = r1 * 10
            int r3 = r3 + (-48)
            int r1 = r1 + r3
            r2 = 1
        L_0x003a:
            int r6 = r6 + 1
            goto L_0x000c
        L_0x003d:
            return r5
        L_0x003e:
            if (r2 == 0) goto L_0x004a
            java.lang.String r6 = m30718d(r1)
            if (r6 != 0) goto L_0x0047
            return r5
        L_0x0047:
            r0.add(r6)
        L_0x004a:
            int r6 = r0.size()
            if (r6 != 0) goto L_0x0051
            return r5
        L_0x0051:
            int r6 = r0.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C5108n.m30719c(int, int):java.lang.String[]");
    }

    /* renamed from: d */
    private static String m30718d(int i) {
        if (i >= f8793f.size()) {
            return null;
        }
        int intValue = f8793f.get(i).intValue();
        int i2 = intValue;
        while (true) {
            byte[] bArr = f8792e;
            if (i2 >= bArr.length || bArr[i2] <= 32) {
                break;
            }
            i2++;
        }
        int i3 = (i2 - intValue) + f8790c;
        char[] cArr = new char[i3];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i4 = 0; i4 < i3 - f8790c; i4++) {
            cArr[f8788a + i4] = (char) f8792e[intValue + i4];
        }
        cArr[i3 - 3] = '.';
        cArr[i3 - 2] = 's';
        cArr[i3 - 1] = 'o';
        return new String(cArr);
    }

    /* renamed from: e */
    private static int m30717e(String str) {
        List<Integer> list = f8794g.get(Integer.valueOf(m30716f(str)));
        if (list == null) {
            return -1;
        }
        for (Integer num : list) {
            int intValue = num.intValue();
            if (m30715g(str, intValue)) {
                return intValue;
            }
        }
        return -1;
    }

    /* renamed from: f */
    private static int m30716f(String str) {
        int i = 5381;
        for (int i2 = f8788a; i2 < str.length() - f8789b; i2++) {
            i = str.codePointAt(i2) + (i << 5) + i;
        }
        return i;
    }

    /* renamed from: g */
    private static boolean m30715g(String str, int i) {
        int i2;
        int i3 = f8788a;
        while (true) {
            int length = str.length();
            i2 = f8789b;
            if (i3 >= length - i2 || i >= f8792e.length || (str.codePointAt(i3) & 255) != f8792e[i]) {
                break;
            }
            i3++;
            i++;
        }
        if (i3 == str.length() - i2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    static String[] m30714h(String str) {
        int e;
        if (f8791d && str.length() > f8790c && (e = m30717e(str)) != -1) {
            return m30719c(e, str.length());
        }
        return null;
    }
}
