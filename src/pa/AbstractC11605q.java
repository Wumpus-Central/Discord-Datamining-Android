package pa;

import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pa.q */
/* loaded from: classes3.dex */
public abstract class AbstractC11605q extends AbstractC11594f<String> {

    /* renamed from: m */
    final CharSequence f25867m;

    /* renamed from: n */
    final AbstractC11599k f25868n;

    /* renamed from: o */
    final boolean f25869o;

    /* renamed from: p */
    int f25870p = 0;

    /* renamed from: q */
    int f25871q = ViewDefaults.NUMBER_OF_LINES;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11605q(C11606r rVar, CharSequence charSequence) {
        AbstractC11599k kVar;
        boolean z;
        kVar = rVar.f25872a;
        this.f25868n = kVar;
        z = rVar.f25873b;
        this.f25869o = z;
        this.f25867m = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        r3 = r5.f25871q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r3 != 1) goto L_0x005e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r1 = r5.f25867m.length();
        r5.f25870p = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r1 <= r0) goto L_0x0061;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r5.f25867m.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r5.f25871q = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return r5.f25867m.subSequence(r0, r1).toString();
     */
    @Override // pa.AbstractC11594f
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* bridge */ /* synthetic */ java.lang.String mo9283b() {
        /*
            r5 = this;
            int r0 = r5.f25870p
        L_0x0002:
            int r1 = r5.f25870p
            r2 = -1
            if (r1 == r2) goto L_0x006c
            int r1 = r5.mo9281e(r1)
            if (r1 != r2) goto L_0x0017
            java.lang.CharSequence r1 = r5.f25867m
            int r1 = r1.length()
            r5.f25870p = r2
            r3 = r2
            goto L_0x001d
        L_0x0017:
            int r3 = r5.mo9282d(r1)
            r5.f25870p = r3
        L_0x001d:
            if (r3 != r0) goto L_0x002e
            int r3 = r3 + 1
            r5.f25870p = r3
            java.lang.CharSequence r1 = r5.f25867m
            int r1 = r1.length()
            if (r3 <= r1) goto L_0x0002
            r5.f25870p = r2
            goto L_0x0002
        L_0x002e:
            if (r0 >= r1) goto L_0x0035
            java.lang.CharSequence r3 = r5.f25867m
            r3.charAt(r0)
        L_0x0035:
            if (r0 >= r1) goto L_0x003e
            java.lang.CharSequence r3 = r5.f25867m
            int r4 = r1 + (-1)
            r3.charAt(r4)
        L_0x003e:
            boolean r3 = r5.f25869o
            if (r3 == 0) goto L_0x0047
            if (r0 != r1) goto L_0x0047
            int r0 = r5.f25870p
            goto L_0x0002
        L_0x0047:
            int r3 = r5.f25871q
            r4 = 1
            if (r3 != r4) goto L_0x005e
            java.lang.CharSequence r1 = r5.f25867m
            int r1 = r1.length()
            r5.f25870p = r2
            if (r1 <= r0) goto L_0x0061
            java.lang.CharSequence r2 = r5.f25867m
            int r3 = r1 + (-1)
            r2.charAt(r3)
            goto L_0x0061
        L_0x005e:
            int r3 = r3 + r2
            r5.f25871q = r3
        L_0x0061:
            java.lang.CharSequence r2 = r5.f25867m
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0070
        L_0x006c:
            r5.m9289c()
            r0 = 0
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.AbstractC11605q.mo9283b():java.lang.Object");
    }

    /* renamed from: d */
    abstract int mo9282d(int i);

    /* renamed from: e */
    abstract int mo9281e(int i);
}
