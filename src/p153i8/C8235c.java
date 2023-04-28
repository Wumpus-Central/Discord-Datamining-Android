package p153i8;

import p119g9.C7510a;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10521o;
import p228m7.C10533x;
import p336s7.C12809f;

/* renamed from: i8.c */
/* loaded from: classes7.dex */
final class C8235c implements AbstractC8249f0 {

    /* renamed from: a */
    private final AbstractC10521o f17843a;

    /* renamed from: b */
    private AbstractC10514i f17844b;

    /* renamed from: c */
    private AbstractC10515j f17845c;

    public C8235c(AbstractC10521o oVar) {
        this.f17843a = oVar;
    }

    @Override // p153i8.AbstractC8249f0
    /* renamed from: a */
    public void mo20197a(long j, long j2) {
        ((AbstractC10514i) C7510a.m22367e(this.f17844b)).mo2228a(j, j2);
    }

    @Override // p153i8.AbstractC8249f0
    /* renamed from: b */
    public int mo20196b(C10533x xVar) {
        return ((AbstractC10514i) C7510a.m22367e(this.f17844b)).mo2224e((AbstractC10515j) C7510a.m22367e(this.f17845c), xVar);
    }

    @Override // p153i8.AbstractC8249f0
    /* renamed from: c */
    public void mo20195c() {
        AbstractC10514i iVar = this.f17844b;
        if (iVar instanceof C12809f) {
            ((C12809f) iVar).m5436j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r6.getPosition() != r11) goto L_0x0064;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
        if (r6.getPosition() != r11) goto L_0x0064;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        r1 = false;
     */
    @Override // p153i8.AbstractC8249f0
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo20194d(p081e9.AbstractC6774h r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p228m7.AbstractC10516k r15) {
        /*
            r7 = this;
            m7.f r6 = new m7.f
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f17845c = r6
            m7.i r8 = r7.f17844b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            m7.o r8 = r7.f17843a
            m7.i[] r8 = r8.mo2230a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f17844b = r8
            goto L_0x0074
        L_0x0020:
            int r10 = r8.length
            r0 = r13
        L_0x0022:
            if (r0 >= r10) goto L_0x0070
            r1 = r8[r0]
            boolean r2 = r1.mo2225d(r6)     // Catch: all -> 0x0042, EOFException -> 0x0057
            if (r2 == 0) goto L_0x0035
            r7.f17844b = r1     // Catch: all -> 0x0042, EOFException -> 0x0057
            p119g9.C7510a.m22366f(r14)
            r6.mo12936f()
            goto L_0x0070
        L_0x0035:
            m7.i r1 = r7.f17844b
            if (r1 != 0) goto L_0x0066
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0042:
            r8 = move-exception
            m7.i r9 = r7.f17844b
            if (r9 != 0) goto L_0x004f
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0050
        L_0x004f:
            r13 = r14
        L_0x0050:
            p119g9.C7510a.m22366f(r13)
            r6.mo12936f()
            throw r8
        L_0x0057:
            m7.i r1 = r7.f17844b
            if (r1 != 0) goto L_0x0066
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r1 = r13
            goto L_0x0067
        L_0x0066:
            r1 = r14
        L_0x0067:
            p119g9.C7510a.m22366f(r1)
            r6.mo12936f()
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0070:
            m7.i r10 = r7.f17844b
            if (r10 == 0) goto L_0x007a
        L_0x0074:
            m7.i r8 = r7.f17844b
            r8.mo2227b(r15)
            return
        L_0x007a:
            i8.v0 r10 = new i8.v0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = p119g9.C7557q0.m22193L(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = p119g9.C7510a.m22367e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p153i8.C8235c.mo20194d(e9.h, android.net.Uri, java.util.Map, long, long, m7.k):void");
    }

    @Override // p153i8.AbstractC8249f0
    /* renamed from: e */
    public long mo20193e() {
        AbstractC10515j jVar = this.f17845c;
        if (jVar != null) {
            return jVar.getPosition();
        }
        return -1L;
    }

    @Override // p153i8.AbstractC8249f0
    public void release() {
        AbstractC10514i iVar = this.f17844b;
        if (iVar != null) {
            iVar.release();
            this.f17844b = null;
        }
        this.f17845c = null;
    }
}
