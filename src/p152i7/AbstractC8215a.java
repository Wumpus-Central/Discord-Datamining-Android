package p152i7;

/* renamed from: i7.a */
/* loaded from: classes7.dex */
public abstract class AbstractC8215a {

    /* renamed from: k */
    private int f17773k;

    /* renamed from: e */
    public final void m20304e(int i) {
        this.f17773k = i | this.f17773k;
    }

    /* renamed from: f */
    public void mo1151f() {
        this.f17773k = 0;
    }

    /* renamed from: g */
    public final void m20303g(int i) {
        this.f17773k = (~i) & this.f17773k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean m20302h(int i) {
        return (this.f17773k & i) == i;
    }

    /* renamed from: i */
    public final boolean m20301i() {
        return m20302h(268435456);
    }

    /* renamed from: j */
    public final boolean m20300j() {
        return m20302h(Integer.MIN_VALUE);
    }

    /* renamed from: k */
    public final boolean m20299k() {
        return m20302h(4);
    }

    /* renamed from: l */
    public final boolean m20298l() {
        return m20302h(1);
    }

    /* renamed from: m */
    public final void m20297m(int i) {
        this.f17773k = i;
    }
}
