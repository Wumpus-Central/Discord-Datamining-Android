package p066dd;

/* renamed from: dd.h */
/* loaded from: classes3.dex */
public abstract class AbstractC6439h {

    /* renamed from: a */
    private final int f13507a;

    /* renamed from: b */
    private final int f13508b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6439h(int i, int i2) {
        this.f13507a = i;
        this.f13508b = i2;
    }

    /* renamed from: a */
    public final int m25559a() {
        return this.f13508b;
    }

    /* renamed from: b */
    public abstract byte[] mo25550b();

    /* renamed from: c */
    public abstract byte[] mo25549c(int i, byte[] bArr);

    /* renamed from: d */
    public final int m25558d() {
        return this.f13507a;
    }

    /* renamed from: e */
    public AbstractC6439h mo25557e() {
        return new C6438g(this);
    }

    /* renamed from: f */
    public boolean mo25556f() {
        return false;
    }

    /* renamed from: g */
    public AbstractC6439h mo25555g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c;
        int i = this.f13507a;
        byte[] bArr = new byte[i];
        StringBuilder sb2 = new StringBuilder(this.f13508b * (i + 1));
        for (int i2 = 0; i2 < this.f13508b; i2++) {
            bArr = mo25549c(i2, bArr);
            for (int i3 = 0; i3 < this.f13507a; i3++) {
                int i4 = bArr[i3] & 255;
                if (i4 < 64) {
                    c = '#';
                } else if (i4 < 128) {
                    c = '+';
                } else if (i4 < 192) {
                    c = '.';
                } else {
                    c = ' ';
                }
                sb2.append(c);
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
