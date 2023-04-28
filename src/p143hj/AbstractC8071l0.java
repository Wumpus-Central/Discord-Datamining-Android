package p143hj;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* renamed from: hj.l0 */
/* loaded from: classes8.dex */
public interface AbstractC8071l0<U> {

    /* renamed from: hj.l0$a */
    /* loaded from: classes8.dex */
    public static final class C8072a<U> implements Serializable {
        private static final long serialVersionUID = 1564804888291509484L;
        private final long amount;
        private final U unit;

        private C8072a(long j, U u) {
            if (u == null) {
                throw new NullPointerException("Missing chronological unit.");
            } else if (j >= 0) {
                this.amount = j;
                this.unit = u;
            } else {
                throw new IllegalArgumentException("Temporal amount must be positive or zero: " + j);
            }
        }

        /* renamed from: c */
        public static <U> C8072a<U> m20673c(long j, U u) {
            return new C8072a<>(j, u);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            if (this.unit == null || this.amount < 0) {
                throw new InvalidObjectException("Inconsistent state.");
            }
        }

        /* renamed from: a */
        public long m20675a() {
            return this.amount;
        }

        /* renamed from: b */
        public U m20674b() {
            return this.unit;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8072a)) {
                return false;
            }
            C8072a aVar = (C8072a) C8072a.class.cast(obj);
            if (this.amount != aVar.amount || !this.unit.equals(aVar.unit)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            long j = this.amount;
            return (this.unit.hashCode() * 29) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(this.amount);
            sb2.append('{');
            sb2.append(this.unit);
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* renamed from: a */
    List<C8072a<U>> mo11418a();
}
