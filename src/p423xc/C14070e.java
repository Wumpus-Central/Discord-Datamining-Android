package p423xc;

import com.google.firebase.installations.C5804i;
import java.util.concurrent.TimeUnit;

/* renamed from: xc.e */
/* loaded from: classes3.dex */
class C14070e {

    /* renamed from: d */
    private static final long f31756d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f31757e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C5804i f31758a = C5804i.m27290c();

    /* renamed from: b */
    private long f31759b;

    /* renamed from: c */
    private int f31760c;

    /* renamed from: a */
    private synchronized long m1781a(int i) {
        if (!m1779c(i)) {
            return f31756d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f31760c) + this.f31758a.m27288e(), f31757e);
    }

    /* renamed from: c */
    private static boolean m1779c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    private static boolean m1778d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: e */
    private synchronized void m1777e() {
        this.f31760c = 0;
    }

    /* renamed from: b */
    public synchronized boolean m1780b() {
        boolean z;
        if (this.f31760c != 0) {
            if (this.f31758a.m27292a() <= this.f31759b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* renamed from: f */
    public synchronized void m1776f(int i) {
        if (m1778d(i)) {
            m1777e();
            return;
        }
        this.f31760c++;
        this.f31759b = this.f31758a.m27292a() + m1781a(i);
    }
}
