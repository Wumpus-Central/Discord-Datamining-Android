package org.webrtc;

/* loaded from: classes8.dex */
public interface Predicate<T> {

    /* renamed from: org.webrtc.Predicate$-CC */
    /* loaded from: classes8.dex */
    public final /* synthetic */ class CC<T> {
        /* renamed from: a */
        public static Predicate m9632a(final Predicate predicate, final Predicate predicate2) {
            return new Predicate<T>() { // from class: org.webrtc.Predicate.2
                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate and(Predicate predicate3) {
                    return CC.m9632a(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate negate() {
                    return CC.m9631b(this);
                }

                @Override // org.webrtc.Predicate
                /* renamed from: or */
                public /* synthetic */ Predicate mo9629or(Predicate predicate3) {
                    return CC.m9630c(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public boolean test(T t) {
                    return Predicate.this.test(t) && predicate2.test(t);
                }
            };
        }

        /* renamed from: b */
        public static Predicate m9631b(final Predicate predicate) {
            return new Predicate<T>() { // from class: org.webrtc.Predicate.3
                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return CC.m9632a(this, predicate2);
                }

                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate negate() {
                    return CC.m9631b(this);
                }

                @Override // org.webrtc.Predicate
                /* renamed from: or */
                public /* synthetic */ Predicate mo9629or(Predicate predicate2) {
                    return CC.m9630c(this, predicate2);
                }

                @Override // org.webrtc.Predicate
                public boolean test(T t) {
                    return !Predicate.this.test(t);
                }
            };
        }

        /* renamed from: c */
        public static Predicate m9630c(final Predicate predicate, final Predicate predicate2) {
            return new Predicate<T>() { // from class: org.webrtc.Predicate.1
                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate and(Predicate predicate3) {
                    return CC.m9632a(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate negate() {
                    return CC.m9631b(this);
                }

                @Override // org.webrtc.Predicate
                /* renamed from: or */
                public /* synthetic */ Predicate mo9629or(Predicate predicate3) {
                    return CC.m9630c(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public boolean test(T t) {
                    return Predicate.this.test(t) || predicate2.test(t);
                }
            };
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    /* renamed from: or */
    Predicate<T> mo9629or(Predicate<? super T> predicate);

    boolean test(T t);
}
