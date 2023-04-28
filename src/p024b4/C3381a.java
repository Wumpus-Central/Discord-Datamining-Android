package p024b4;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p394w3.C13747n;

/* renamed from: b4.a */
/* loaded from: classes7.dex */
public class C3381a {

    /* renamed from: h */
    private static C3381a f5397h;

    /* renamed from: i */
    private static final long f5398i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b */
    private volatile File f5400b;

    /* renamed from: d */
    private volatile File f5402d;

    /* renamed from: e */
    private long f5403e;

    /* renamed from: a */
    private volatile StatFs f5399a = null;

    /* renamed from: c */
    private volatile StatFs f5401c = null;

    /* renamed from: g */
    private volatile boolean f5405g = false;

    /* renamed from: f */
    private final Lock f5404f = new ReentrantLock();

    /* renamed from: b4.a$a */
    /* loaded from: classes7.dex */
    public enum EnumC0077a {
        INTERNAL,
        EXTERNAL
    }

    protected C3381a() {
    }

    /* renamed from: a */
    protected static StatFs m34554a(String str) {
        return new StatFs(str);
    }

    /* renamed from: b */
    private void m34553b() {
        if (!this.f5405g) {
            this.f5404f.lock();
            try {
                if (!this.f5405g) {
                    this.f5400b = Environment.getDataDirectory();
                    this.f5402d = Environment.getExternalStorageDirectory();
                    m34548g();
                    this.f5405g = true;
                }
            } finally {
                this.f5404f.unlock();
            }
        }
    }

    /* renamed from: d */
    public static synchronized C3381a m34551d() {
        C3381a aVar;
        synchronized (C3381a.class) {
            if (f5397h == null) {
                f5397h = new C3381a();
            }
            aVar = f5397h;
        }
        return aVar;
    }

    /* renamed from: e */
    private void m34550e() {
        if (this.f5404f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f5403e > f5398i) {
                    m34548g();
                }
            } finally {
                this.f5404f.unlock();
            }
        }
    }

    /* renamed from: g */
    private void m34548g() {
        this.f5399a = m34547h(this.f5399a, this.f5400b);
        this.f5401c = m34547h(this.f5401c, this.f5402d);
        this.f5403e = SystemClock.uptimeMillis();
    }

    /* renamed from: h */
    private StatFs m34547h(StatFs statFs, File file) {
        StatFs statFs2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = m34554a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            statFs2 = statFs;
            return statFs2;
        } catch (IllegalArgumentException unused) {
            return statFs2;
        } catch (Throwable th2) {
            throw C13747n.m2823a(th2);
        }
    }

    @SuppressLint({"DeprecatedMethod"})
    /* renamed from: c */
    public long m34552c(EnumC0077a aVar) {
        StatFs statFs;
        m34553b();
        m34550e();
        if (aVar == EnumC0077a.INTERNAL) {
            statFs = this.f5399a;
        } else {
            statFs = this.f5401c;
        }
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    /* renamed from: f */
    public boolean m34549f(EnumC0077a aVar, long j) {
        m34553b();
        long c = m34552c(aVar);
        if (c <= 0 || c < j) {
            return true;
        }
        return false;
    }
}
