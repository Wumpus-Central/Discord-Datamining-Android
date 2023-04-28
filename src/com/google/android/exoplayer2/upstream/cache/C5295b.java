package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.cache.AbstractC5293a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p081e9.AbstractC6776j;
import p119g9.C7510a;
import p119g9.C7517c0;
import p119g9.C7557q0;
import p119g9.C7558r;

/* renamed from: com.google.android.exoplayer2.upstream.cache.b */
/* loaded from: classes5.dex */
public final class C5295b implements AbstractC6776j {

    /* renamed from: a */
    private final AbstractC5293a f9795a;

    /* renamed from: b */
    private final long f9796b;

    /* renamed from: c */
    private final int f9797c;

    /* renamed from: d */
    private C5288a f9798d;

    /* renamed from: e */
    private long f9799e;

    /* renamed from: f */
    private File f9800f;

    /* renamed from: g */
    private OutputStream f9801g;

    /* renamed from: h */
    private long f9802h;

    /* renamed from: i */
    private long f9803i;

    /* renamed from: j */
    private C7517c0 f9804j;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.b$a */
    /* loaded from: classes5.dex */
    public static final class C5296a extends AbstractC5293a.C0145a {
        public C5296a(IOException iOException) {
            super(iOException);
        }
    }

    public C5295b(AbstractC5293a aVar, long j) {
        this(aVar, j, 20480);
    }

    /* renamed from: a */
    private void m29576a() {
        OutputStream outputStream = this.f9801g;
        if (outputStream != null) {
            try {
                outputStream.flush();
                C7557q0.m22135o(this.f9801g);
                this.f9801g = null;
                this.f9800f = null;
                this.f9795a.mo29577h((File) C7557q0.m22145j(this.f9800f), this.f9802h);
            } catch (Throwable th2) {
                C7557q0.m22135o(this.f9801g);
                this.f9801g = null;
                this.f9800f = null;
                ((File) C7557q0.m22145j(this.f9800f)).delete();
                throw th2;
            }
        }
    }

    /* renamed from: c */
    private void m29575c(C5288a aVar) {
        long j = aVar.f9753h;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.f9803i, this.f9799e);
        }
        this.f9800f = this.f9795a.mo29584a((String) C7557q0.m22145j(aVar.f9754i), aVar.f9752g + this.f9803i, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f9800f);
        if (this.f9797c > 0) {
            C7517c0 c0Var = this.f9804j;
            if (c0Var == null) {
                this.f9804j = new C7517c0(fileOutputStream, this.f9797c);
            } else {
                c0Var.m22351b(fileOutputStream);
            }
            this.f9801g = this.f9804j;
        } else {
            this.f9801g = fileOutputStream;
        }
        this.f9802h = 0L;
    }

    @Override // p081e9.AbstractC6776j
    /* renamed from: b */
    public void mo24356b(C5288a aVar) {
        long j;
        C7510a.m22367e(aVar.f9754i);
        if (aVar.f9753h != -1 || !aVar.m29626d(2)) {
            this.f9798d = aVar;
            if (aVar.m29626d(4)) {
                j = this.f9796b;
            } else {
                j = Long.MAX_VALUE;
            }
            this.f9799e = j;
            this.f9803i = 0L;
            try {
                m29575c(aVar);
            } catch (IOException e) {
                throw new C5296a(e);
            }
        } else {
            this.f9798d = null;
        }
    }

    @Override // p081e9.AbstractC6776j
    public void close() {
        if (this.f9798d != null) {
            try {
                m29576a();
            } catch (IOException e) {
                throw new C5296a(e);
            }
        }
    }

    @Override // p081e9.AbstractC6776j
    public void write(byte[] bArr, int i, int i2) {
        C5288a aVar = this.f9798d;
        if (aVar != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f9802h == this.f9799e) {
                        m29576a();
                        m29575c(aVar);
                    }
                    int min = (int) Math.min(i2 - i3, this.f9799e - this.f9802h);
                    ((OutputStream) C7557q0.m22145j(this.f9801g)).write(bArr, i + i3, min);
                    i3 += min;
                    long j = min;
                    this.f9802h += j;
                    this.f9803i += j;
                } catch (IOException e) {
                    throw new C5296a(e);
                }
            }
        }
    }

    public C5295b(AbstractC5293a aVar, long j, int i) {
        C7510a.m22365g(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i2 != 0 && j < 2097152) {
            C7558r.m22104h("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f9795a = (AbstractC5293a) C7510a.m22367e(aVar);
        this.f9796b = i2 == 0 ? Long.MAX_VALUE : j;
        this.f9797c = i;
    }
}
