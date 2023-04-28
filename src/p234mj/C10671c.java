package p234mj;

import p143hj.AbstractC8079p;
import p161ij.AbstractC8634d;

/* renamed from: mj.c */
/* loaded from: classes8.dex */
public class C10671c extends AbstractC8634d<Integer> {

    /* renamed from: o */
    public static final AbstractC8079p<Integer> f23605o = new C10671c("YEAR_OF_DISPLAY", 0, 1, 9999);
    private static final long serialVersionUID = 1;

    /* renamed from: l */
    private final transient char f23606l;

    /* renamed from: m */
    private final transient Integer f23607m;

    /* renamed from: n */
    private final transient Integer f23608n;

    /* JADX INFO: Access modifiers changed from: protected */
    public C10671c(String str, char c, int i, int i2) {
        super(str);
        this.f23606l = c;
        this.f23607m = Integer.valueOf(i);
        this.f23608n = Integer.valueOf(i2);
    }

    private Object readResolve() {
        return f23605o;
    }

    /* renamed from: A */
    public Integer mo11059f() {
        return this.f23608n;
    }

    /* renamed from: D */
    public Integer mo11062T() {
        return this.f23607m;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: M */
    public boolean mo11063M() {
        return true;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: U */
    public boolean mo11061U() {
        return false;
    }

    @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
    /* renamed from: a */
    public char mo11060a() {
        return this.f23606l;
    }

    @Override // p143hj.AbstractC8079p
    public final Class<Integer> getType() {
        return Integer.class;
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: y */
    protected boolean mo11143y() {
        return true;
    }
}
