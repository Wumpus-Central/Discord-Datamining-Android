package p284pc;

import java.lang.annotation.Annotation;
import p284pc.AbstractC11612d;

/* renamed from: pc.a */
/* loaded from: classes3.dex */
public final class C11609a {

    /* renamed from: a */
    private int f25875a;

    /* renamed from: b */
    private AbstractC11612d.EnumC11613a f25876b = AbstractC11612d.EnumC11613a.DEFAULT;

    /* renamed from: pc.a$a */
    /* loaded from: classes3.dex */
    private static final class C0369a implements AbstractC11612d {

        /* renamed from: a */
        private final int f25877a;

        /* renamed from: b */
        private final AbstractC11612d.EnumC11613a f25878b;

        C0369a(int i, AbstractC11612d.EnumC11613a aVar) {
            this.f25877a = i;
            this.f25878b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return AbstractC11612d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AbstractC11612d)) {
                return false;
            }
            AbstractC11612d dVar = (AbstractC11612d) obj;
            if (this.f25877a != dVar.tag() || !this.f25878b.equals(dVar.intEncoding())) {
                return false;
            }
            return true;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f25877a) + (this.f25878b.hashCode() ^ 2041407134);
        }

        @Override // p284pc.AbstractC11612d
        public AbstractC11612d.EnumC11613a intEncoding() {
            return this.f25878b;
        }

        @Override // p284pc.AbstractC11612d
        public int tag() {
            return this.f25877a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f25877a + "intEncoding=" + this.f25878b + ')';
        }
    }

    /* renamed from: b */
    public static C11609a m9269b() {
        return new C11609a();
    }

    /* renamed from: a */
    public AbstractC11612d m9270a() {
        return new C0369a(this.f25875a, this.f25876b);
    }

    /* renamed from: c */
    public C11609a m9268c(int i) {
        this.f25875a = i;
        return this;
    }
}
