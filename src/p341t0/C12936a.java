package p341t0;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: t0.a */
/* loaded from: classes.dex */
public class C12936a<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f29015a;

    /* renamed from: b */
    private int f29016b;

    /* renamed from: c */
    private int f29017c;

    /* renamed from: d */
    private int f29018d;

    /* renamed from: e */
    private int f29019e;

    /* renamed from: f */
    private int f29020f;

    /* renamed from: g */
    private int f29021g;

    /* renamed from: h */
    private int f29022h;

    public C12936a(int i) {
        if (i > 0) {
            this.f29017c = i;
            this.f29015a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: e */
    private int m5030e(K k, V v) {
        int f = m5029f(k, v);
        if (f >= 0) {
            return f;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    protected V m5034a(K k) {
        return null;
    }

    /* renamed from: b */
    protected void m5033b(boolean z, K k, V v, V v2) {
    }

    /* renamed from: c */
    public final V m5032c(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                V v = this.f29015a.get(k);
                if (v != null) {
                    this.f29021g++;
                    return v;
                }
                this.f29022h++;
                V a = m5034a(k);
                if (a == null) {
                    return null;
                }
                synchronized (this) {
                    this.f29019e++;
                    put = this.f29015a.put(k, a);
                    if (put != null) {
                        this.f29015a.put(k, put);
                    } else {
                        this.f29016b += m5030e(k, a);
                    }
                }
                if (put != null) {
                    m5033b(false, k, a, put);
                    return put;
                }
                m5028g(this.f29017c);
                return a;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: d */
    public final V m5031d(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f29018d++;
            this.f29016b += m5030e(k, v);
            put = this.f29015a.put(k, v);
            if (put != null) {
                this.f29016b -= m5030e(k, put);
            }
        }
        if (put != null) {
            m5033b(false, k, put, v);
        }
        m5028g(this.f29017c);
        return put;
    }

    /* renamed from: f */
    protected int m5029f(K k, V v) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m5028g(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f29016b     // Catch: all -> 0x0071
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f29015a     // Catch: all -> 0x0071
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0071
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f29016b     // Catch: all -> 0x0071
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f29016b     // Catch: all -> 0x0071
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f29015a     // Catch: all -> 0x0071
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0071
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f29015a     // Catch: all -> 0x0071
            java.util.Set r0 = r0.entrySet()     // Catch: all -> 0x0071
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x0071
            java.lang.Object r0 = r0.next()     // Catch: all -> 0x0071
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: all -> 0x0071
            java.lang.Object r1 = r0.getKey()     // Catch: all -> 0x0071
            java.lang.Object r0 = r0.getValue()     // Catch: all -> 0x0071
            java.util.LinkedHashMap<K, V> r2 = r4.f29015a     // Catch: all -> 0x0071
            r2.remove(r1)     // Catch: all -> 0x0071
            int r2 = r4.f29016b     // Catch: all -> 0x0071
            int r3 = r4.m5030e(r1, r0)     // Catch: all -> 0x0071
            int r2 = r2 - r3
            r4.f29016b = r2     // Catch: all -> 0x0071
            int r2 = r4.f29020f     // Catch: all -> 0x0071
            r3 = 1
            int r2 = r2 + r3
            r4.f29020f = r2     // Catch: all -> 0x0071
            monitor-exit(r4)     // Catch: all -> 0x0071
            r2 = 0
            r4.m5033b(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch: all -> 0x0071
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: all -> 0x0071
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0071
            r0.<init>()     // Catch: all -> 0x0071
            java.lang.Class r1 = r4.getClass()     // Catch: all -> 0x0071
            java.lang.String r1 = r1.getName()     // Catch: all -> 0x0071
            r0.append(r1)     // Catch: all -> 0x0071
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: all -> 0x0071
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x0071
            r5.<init>(r0)     // Catch: all -> 0x0071
            throw r5     // Catch: all -> 0x0071
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x0071
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p341t0.C12936a.m5028g(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f29021g;
        int i3 = this.f29022h + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f29017c), Integer.valueOf(this.f29021g), Integer.valueOf(this.f29022h), Integer.valueOf(i));
    }
}
