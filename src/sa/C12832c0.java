package sa;

/* renamed from: sa.c0 */
/* loaded from: classes3.dex */
final class C12832c0 {

    /* renamed from: a */
    private final Object f28901a;

    /* renamed from: b */
    private final Object f28902b;

    /* renamed from: c */
    private final Object f28903c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12832c0(Object obj, Object obj2, Object obj3) {
        this.f28901a = obj;
        this.f28902b = obj2;
        this.f28903c = obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException m5311a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f28901a + "=" + this.f28902b + " and " + this.f28901a + "=" + this.f28903c);
    }
}
