package p187k1;

import java.nio.ByteBuffer;

/* renamed from: k1.c */
/* loaded from: classes.dex */
public class C9718c {

    /* renamed from: a */
    protected int f21600a;

    /* renamed from: b */
    protected ByteBuffer f21601b;

    /* renamed from: c */
    private int f21602c;

    /* renamed from: d */
    private int f21603d;

    /* renamed from: e */
    AbstractC9719d f21604e = AbstractC9719d.m15512a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m15517a(int i) {
        return i + this.f21601b.getInt(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m15516b(int i) {
        if (i < this.f21603d) {
            return this.f21601b.getShort(this.f21602c + i);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m15515c(int i, ByteBuffer byteBuffer) {
        this.f21601b = byteBuffer;
        if (byteBuffer != null) {
            this.f21600a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f21602c = i2;
            this.f21603d = this.f21601b.getShort(i2);
            return;
        }
        this.f21600a = 0;
        this.f21602c = 0;
        this.f21603d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public int m15514d(int i) {
        int i2 = i + this.f21600a;
        return i2 + this.f21601b.getInt(i2) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m15513e(int i) {
        int i2 = i + this.f21600a;
        return this.f21601b.getInt(i2 + this.f21601b.getInt(i2));
    }
}
