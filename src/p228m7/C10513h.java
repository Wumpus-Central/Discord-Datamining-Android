package p228m7;

import java.io.EOFException;
import p079e7.C6722k;
import p081e9.AbstractC6774h;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;

/* renamed from: m7.h */
/* loaded from: classes7.dex */
public final class C10513h implements AbstractC10500b0 {

    /* renamed from: a */
    private final byte[] f23260a = new byte[4096];

    @Override // p228m7.AbstractC10500b0
    /* renamed from: a */
    public int mo12390a(AbstractC6774h hVar, int i, boolean z, int i2) {
        int read = hVar.read(this.f23260a, 0, Math.min(this.f23260a.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p228m7.AbstractC10500b0
    /* renamed from: b */
    public void mo12389b(C7570y yVar, int i, int i2) {
        yVar.m22016Q(i);
    }

    @Override // p228m7.AbstractC10500b0
    /* renamed from: c */
    public void mo12382c(long j, int i, int i2, int i3, AbstractC10500b0.C10501a aVar) {
    }

    @Override // p228m7.AbstractC10500b0
    /* renamed from: d */
    public void mo12388d(C6722k kVar) {
    }

    @Override // p228m7.AbstractC10500b0
    /* renamed from: e */
    public /* synthetic */ int mo12387e(AbstractC6774h hVar, int i, boolean z) {
        return C10498a0.m13009a(this, hVar, i, z);
    }

    @Override // p228m7.AbstractC10500b0
    /* renamed from: f */
    public /* synthetic */ void mo12386f(C7570y yVar, int i) {
        C10498a0.m13008b(this, yVar, i);
    }
}
