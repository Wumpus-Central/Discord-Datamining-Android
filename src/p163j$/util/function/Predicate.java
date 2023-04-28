package p163j$.util.function;

/* renamed from: j$.util.function.Predicate */
/* loaded from: classes2.dex */
public interface Predicate<T> {

    /* renamed from: j$.util.function.Predicate$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<T> {
        public static Predicate $default$negate(Predicate predicate) {
            return new C0487b(2, predicate);
        }
    }

    /* renamed from: j$.util.function.Predicate$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Predicate {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Predicate f20390a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Predicate predicate) {
            this.f20390a = predicate;
        }

        public static /* synthetic */ Predicate convert(java.util.function.Predicate predicate) {
            if (predicate == null) {
                return null;
            }
            return predicate instanceof C9308f0 ? ((C9308f0) predicate).f20410a : new VivifiedWrapper(predicate);
        }

        @Override // p163j$.util.function.Predicate
        public final /* synthetic */ Predicate and(Predicate predicate) {
            return convert(this.f20390a.and(C9308f0.m16526a(predicate)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20390a;
            }
            return this.f20390a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20390a.hashCode();
        }

        @Override // p163j$.util.function.Predicate
        public final /* synthetic */ Predicate negate() {
            return convert(this.f20390a.negate());
        }

        @Override // p163j$.util.function.Predicate
        /* renamed from: or */
        public final /* synthetic */ Predicate mo16468or(Predicate predicate) {
            return convert(this.f20390a.or(C9308f0.m16526a(predicate)));
        }

        @Override // p163j$.util.function.Predicate
        public final /* synthetic */ boolean test(Object obj) {
            return this.f20390a.test(obj);
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    /* renamed from: or */
    Predicate<T> mo16468or(Predicate<? super T> predicate);

    boolean test(T t);
}
