package p079e7;

/* renamed from: e7.j */
/* loaded from: classes7.dex */
public final class C6721j extends Exception {

    /* renamed from: k */
    public final int f14317k;

    public C6721j(int i) {
        super(m24532a(i));
        this.f14317k = i;
    }

    /* renamed from: a */
    private static String m24532a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
