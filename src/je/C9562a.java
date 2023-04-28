package je;

import java.util.Locale;

/* renamed from: je.a */
/* loaded from: classes6.dex */
public class C9562a extends AbstractC9567d {

    /* renamed from: l */
    private final long f21189l;

    /* renamed from: m */
    private final long f21190m;

    public C9562a(long j, long j2) {
        this(j, j2, new Throwable());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return String.format(Locale.ENGLISH, "Insufficient disk space, estimated file size in bytes %d, available disk space in bytes %d", Long.valueOf(this.f21189l), Long.valueOf(this.f21190m));
    }

    public C9562a(long j, long j2, Throwable th2) {
        super(th2);
        this.f21189l = j;
        this.f21190m = j2;
    }
}
