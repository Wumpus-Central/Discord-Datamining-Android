package net.time4j.calendar;

import net.time4j.EnumC11039x0;
import net.time4j.base.C10813c;
import net.time4j.calendar.service.C10876f;
import p143hj.AbstractC8047c0;
import p143hj.AbstractC8056g;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8085v;
import p143hj.AbstractC8091z;
import p143hj.EnumC8042a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.calendar.r */
/* loaded from: classes8.dex */
public final class C10866r<T extends AbstractC8080q<T> & AbstractC8056g> extends C10876f<T> implements AbstractC10857l<T> {
    private static final long serialVersionUID = 4275169663905222176L;

    /* renamed from: r */
    private final transient AbstractC8079p<Integer> f24122r;

    /* renamed from: s */
    private final transient AbstractC8079p<EnumC11039x0> f24123s;

    /* renamed from: net.time4j.calendar.r$a */
    /* loaded from: classes8.dex */
    private static class C10867a<T extends AbstractC8080q<T> & AbstractC8056g> implements AbstractC8047c0<T> {

        /* renamed from: k */
        private final C10866r<T> f24124k;

        C10867a(C10866r<T> rVar) {
            this.f24124k = rVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)I */
        /* renamed from: i */
        private int m11944i(AbstractC8080q qVar) {
            int s = qVar.mo11370s(((C10866r) this.f24124k).f24122r);
            while (true) {
                int i = s + 7;
                if (i > ((Integer) qVar.mo11380b(((C10866r) this.f24124k).f24122r)).intValue()) {
                    return C10813c.m12202a(s - 1, 7) + 1;
                }
                s = i;
            }
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Lhj/p<*>; */
        /* renamed from: a */
        public AbstractC8079p mo11086b(AbstractC8080q qVar) {
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Lhj/p<*>; */
        /* renamed from: e */
        public AbstractC8079p mo11085c(AbstractC8080q qVar) {
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)I */
        /* renamed from: f */
        public int mo11808l(AbstractC8080q qVar) {
            return C10813c.m12202a(qVar.mo11370s(((C10866r) this.f24124k).f24122r) - 1, 7) + 1;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        /* renamed from: j */
        public Integer mo11084d(AbstractC8080q qVar) {
            return Integer.valueOf(m11944i(qVar));
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        /* renamed from: o */
        public Integer mo11078k(AbstractC8080q qVar) {
            return 1;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        /* renamed from: p */
        public Integer mo11076n(AbstractC8080q qVar) {
            return Integer.valueOf(mo11808l(qVar));
        }

        /* JADX WARN: Incorrect types in method signature: (TT;I)Z */
        /* renamed from: q */
        public boolean m11940q(AbstractC8080q qVar, int i) {
            return i >= 1 && i <= m11944i(qVar);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Integer;)Z */
        /* renamed from: r */
        public boolean mo11081h(AbstractC8080q qVar, Integer num) {
            return num != null && m11940q(qVar, num.intValue());
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;IZ)TT; */
        /* renamed from: s */
        public AbstractC8080q mo11811g(AbstractC8080q qVar, int i, boolean z) {
            if (m11940q(qVar, i)) {
                return qVar.m20660E(this.f24124k.m11948I(i, (EnumC11039x0) qVar.mo11371r(((C10866r) this.f24124k).f24123s)));
            }
            throw new IllegalArgumentException("Invalid value: " + i);
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;Ljava/lang/Integer;Z)TT; */
        /* renamed from: t */
        public AbstractC8080q mo11077m(AbstractC8080q qVar, Integer num, boolean z) {
            if (num != null) {
                return mo11811g(qVar, num.intValue(), z);
            }
            throw new IllegalArgumentException("Missing value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.calendar.r$b */
    /* loaded from: classes8.dex */
    public static class C10868b<T extends AbstractC8080q<T> & AbstractC8056g> implements AbstractC8085v<T> {

        /* renamed from: k */
        private final C10866r<T> f24125k;

        /* renamed from: l */
        private final long f24126l;

        /* renamed from: m */
        private final EnumC11039x0 f24127m;

        C10868b(C10866r<T> rVar, int i, EnumC11039x0 x0Var) {
            if (x0Var != null) {
                this.f24125k = rVar;
                this.f24126l = i;
                this.f24127m = x0Var;
                return;
            }
            throw new NullPointerException("Missing value.");
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;)TT; */
        /* renamed from: a */
        public AbstractC8080q apply(AbstractC8080q qVar) {
            long j;
            int b;
            EnumC11039x0 x0Var = (EnumC11039x0) qVar.mo11371r(((C10866r) this.f24125k).f24123s);
            int s = qVar.mo11370s(((C10866r) this.f24125k).f24122r);
            if (this.f24126l == 2147483647L) {
                int intValue = ((Integer) qVar.mo11380b(((C10866r) this.f24125k).f24122r)).intValue() - s;
                int b2 = x0Var.m11158b() + (intValue % 7);
                if (b2 > 7) {
                    b2 -= 7;
                }
                int b3 = this.f24127m.m11158b() - b2;
                j = intValue + b3;
                if (b3 > 0) {
                    j -= 7;
                }
            } else {
                j = ((this.f24126l - (C10813c.m12202a((s + b) - 1, 7) + 1)) * 7) + (this.f24127m.m11158b() - x0Var.m11158b());
            }
            return qVar.m20661C(EnumC8042a0.UTC, ((AbstractC8056g) qVar).mo12079c() + j);
        }
    }

    /* renamed from: net.time4j.calendar.r$c */
    /* loaded from: classes8.dex */
    private static class C10869c<T extends AbstractC8080q<T>> implements AbstractC8085v<T> {

        /* renamed from: k */
        private final boolean f24128k;

        C10869c(boolean z) {
            this.f24128k = z;
        }

        /* renamed from: a */
        public T apply(T t) {
            long j;
            EnumC8042a0 a0Var = EnumC8042a0.UTC;
            long longValue = ((Long) t.mo11371r(a0Var)).longValue();
            if (this.f24128k) {
                j = longValue - 7;
            } else {
                j = longValue + 7;
            }
            return (T) t.m20661C(a0Var, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10866r(Class<T> cls, AbstractC8079p<Integer> pVar, AbstractC8079p<EnumC11039x0> pVar2) {
        super("WEEKDAY_IN_MONTH", cls, 1, pVar.mo11059f().intValue() / 7, 'F', new C10869c(true), new C10869c(false));
        this.f24122r = pVar;
        this.f24123s = pVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static <T extends AbstractC8080q<T> & AbstractC8056g> AbstractC8091z<T, Integer> m11949H(C10866r<T> rVar) {
        return new C10867a(rVar);
    }

    /* renamed from: I */
    public AbstractC8085v<T> m11948I(int i, EnumC11039x0 x0Var) {
        return new C10868b(this, i, x0Var);
    }
}
