package p311r2;

import p126h2.C7762i;
import p238n2.C10693a;
import p238n2.C10694b;
import p331s2.AbstractC12777c;

/* renamed from: r2.k */
/* loaded from: classes.dex */
public class C12342k {

    /* renamed from: f */
    private static final AbstractC12777c.C12778a f27718f = AbstractC12777c.C12778a.m5511a("ef");

    /* renamed from: g */
    private static final AbstractC12777c.C12778a f27719g = AbstractC12777c.C12778a.m5511a("nm", "v");

    /* renamed from: a */
    private C10693a f27720a;

    /* renamed from: b */
    private C10694b f27721b;

    /* renamed from: c */
    private C10694b f27722c;

    /* renamed from: d */
    private C10694b f27723d;

    /* renamed from: e */
    private C10694b f27724e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r0.equals("Opacity") == false) goto L_0x0029;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m7111a(p331s2.AbstractC12777c r6, p126h2.C7762i r7) {
        /*
            r5 = this;
            r6.mo5492h()
            java.lang.String r0 = ""
        L_0x0005:
            boolean r1 = r6.mo5488p()
            if (r1 == 0) goto L_0x0090
            s2.c$a r1 = p311r2.C12342k.f27719g
            int r1 = r6.mo5496S(r1)
            if (r1 == 0) goto L_0x008a
            r2 = 1
            if (r1 == r2) goto L_0x001d
            r6.mo5495U()
            r6.mo5494Y()
            goto L_0x0005
        L_0x001d:
            r0.hashCode()
            int r1 = r0.hashCode()
            r3 = 0
            r4 = -1
            switch(r1) {
                case 353103893: goto L_0x0055;
                case 397447147: goto L_0x004c;
                case 1041377119: goto L_0x0041;
                case 1379387491: goto L_0x0036;
                case 1383710113: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r2 = r4
            goto L_0x005f
        L_0x002b:
            java.lang.String r1 = "Softness"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r2 = 4
            goto L_0x005f
        L_0x0036:
            java.lang.String r1 = "Shadow Color"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r2 = 3
            goto L_0x005f
        L_0x0041:
            java.lang.String r1 = "Direction"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            r2 = 2
            goto L_0x005f
        L_0x004c:
            java.lang.String r1 = "Opacity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x005f
            goto L_0x0029
        L_0x0055:
            java.lang.String r1 = "Distance"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x005e
            goto L_0x0029
        L_0x005e:
            r2 = r3
        L_0x005f:
            switch(r2) {
                case 0: goto L_0x0082;
                case 1: goto L_0x007b;
                case 2: goto L_0x0074;
                case 3: goto L_0x006d;
                case 4: goto L_0x0066;
                default: goto L_0x0062;
            }
        L_0x0062:
            r6.mo5494Y()
            goto L_0x0005
        L_0x0066:
            n2.b r1 = p311r2.C12328d.m7136e(r6, r7)
            r5.f27724e = r1
            goto L_0x0005
        L_0x006d:
            n2.a r1 = p311r2.C12328d.m7138c(r6, r7)
            r5.f27720a = r1
            goto L_0x0005
        L_0x0074:
            n2.b r1 = p311r2.C12328d.m7135f(r6, r7, r3)
            r5.f27722c = r1
            goto L_0x0005
        L_0x007b:
            n2.b r1 = p311r2.C12328d.m7135f(r6, r7, r3)
            r5.f27721b = r1
            goto L_0x0005
        L_0x0082:
            n2.b r1 = p311r2.C12328d.m7136e(r6, r7)
            r5.f27723d = r1
            goto L_0x0005
        L_0x008a:
            java.lang.String r0 = r6.mo5509C()
            goto L_0x0005
        L_0x0090:
            r6.mo5489l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p311r2.C12342k.m7111a(s2.c, h2.i):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C12340j m7110b(AbstractC12777c cVar, C7762i iVar) {
        C10694b bVar;
        C10694b bVar2;
        C10694b bVar3;
        C10694b bVar4;
        while (cVar.mo5488p()) {
            if (cVar.mo5496S(f27718f) != 0) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else {
                cVar.mo5493g();
                while (cVar.mo5488p()) {
                    m7111a(cVar, iVar);
                }
                cVar.mo5491i();
            }
        }
        C10693a aVar = this.f27720a;
        if (aVar == null || (bVar = this.f27721b) == null || (bVar2 = this.f27722c) == null || (bVar3 = this.f27723d) == null || (bVar4 = this.f27724e) == null) {
            return null;
        }
        return new C12340j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
