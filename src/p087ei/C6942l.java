package p087ei;

/* renamed from: ei.l */
/* loaded from: classes8.dex */
class C6942l<T> {

    /* renamed from: a */
    private final T f15094a;

    /* renamed from: b */
    private final Thread f15095b = Thread.currentThread();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6942l(T t) {
        this.f15094a = t;
    }

    /* renamed from: a */
    public T m23904a() {
        if (m23903b()) {
            return this.f15094a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    /* renamed from: b */
    public boolean m23903b() {
        return this.f15095b == Thread.currentThread();
    }
}
