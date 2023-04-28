package p194k8;

import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Arrays;
import p079e7.C6722k;
import p119g9.C7557q0;
import p163j$.util.Spliterator;

/* renamed from: k8.k */
/* loaded from: classes7.dex */
public abstract class AbstractC9836k extends AbstractC9827e {

    /* renamed from: j */
    private byte[] f21925j;

    /* renamed from: k */
    private volatile boolean f21926k;

    public AbstractC9836k(DataSource dataSource, C5288a aVar, int i, C6722k kVar, int i2, Object obj, byte[] bArr) {
        super(dataSource, aVar, i, kVar, i2, obj, -9223372036854775807L, -9223372036854775807L);
        AbstractC9836k kVar2;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = C7557q0.f16373f;
            kVar2 = this;
        } else {
            kVar2 = this;
            bArr2 = bArr;
        }
        kVar2.f21925j = bArr2;
    }

    /* renamed from: i */
    private void m15207i(int i) {
        byte[] bArr = this.f21925j;
        if (bArr.length < i + Spliterator.SUBSIZED) {
            this.f21925j = Arrays.copyOf(bArr, bArr.length + Spliterator.SUBSIZED);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: a */
    public final void mo12497a() {
        try {
            this.f21895i.mo12542b(this.f21888b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f21926k) {
                m15207i(i2);
                i = this.f21895i.read(this.f21925j, i2, Spliterator.SUBSIZED);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f21926k) {
                mo12506g(this.f21925j, i2);
            }
        } finally {
            C7557q0.m22137n(this.f21895i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
    /* renamed from: c */
    public final void mo12496c() {
        this.f21926k = true;
    }

    /* renamed from: g */
    protected abstract void mo12506g(byte[] bArr, int i);

    /* renamed from: h */
    public byte[] m15208h() {
        return this.f21925j;
    }
}
