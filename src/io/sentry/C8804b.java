package io.sentry;

/* renamed from: io.sentry.b */
/* loaded from: classes8.dex */
public final class C8804b {

    /* renamed from: a */
    private byte[] f19457a;

    /* renamed from: b */
    private String f19458b;

    /* renamed from: c */
    private final String f19459c;

    /* renamed from: d */
    private final String f19460d;

    /* renamed from: e */
    private final boolean f19461e;

    /* renamed from: f */
    private String f19462f = "event.attachment";

    public C8804b(byte[] bArr, String str, String str2, boolean z) {
        this.f19457a = bArr;
        this.f19459c = str;
        this.f19460d = str2;
        this.f19461e = z;
    }

    /* renamed from: a */
    public static C8804b m18049a(byte[] bArr) {
        return new C8804b(bArr, "screenshot.png", "image/png", false);
    }

    /* renamed from: b */
    public String m18048b() {
        return this.f19462f;
    }

    /* renamed from: c */
    public byte[] m18047c() {
        return this.f19457a;
    }

    /* renamed from: d */
    public String m18046d() {
        return this.f19460d;
    }

    /* renamed from: e */
    public String m18045e() {
        return this.f19459c;
    }

    /* renamed from: f */
    public String m18044f() {
        return this.f19458b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m18043g() {
        return this.f19461e;
    }
}
