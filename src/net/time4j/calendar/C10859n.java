package net.time4j.calendar;

import java.util.Collections;
import java.util.Map;
import net.time4j.base.C10813c;
import p143hj.AbstractC8068k;
import p143hj.AbstractC8070l;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8091z;
import p143hj.EnumC8042a0;

/* renamed from: net.time4j.calendar.n */
/* loaded from: classes8.dex */
final class C10859n<T extends AbstractC8080q<T>> implements AbstractC8091z<T, Integer> {

    /* renamed from: k */
    private final Map<String, ? extends AbstractC8068k<T>> f24063k;

    /* renamed from: l */
    private final AbstractC8079p<Integer> f24064l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10859n(AbstractC8068k<T> kVar, AbstractC8079p<Integer> pVar) {
        this.f24063k = Collections.singletonMap("calendrical", kVar);
        this.f24064l = pVar;
    }

    /* renamed from: a */
    private AbstractC8068k<T> m11987a(T t) {
        if (t instanceof AbstractC8070l) {
            return (AbstractC8068k) this.f24063k.get(((AbstractC8070l) AbstractC8070l.class.cast(t)).mo11570l());
        }
        return (AbstractC8068k) this.f24063k.get("calendrical");
    }

    /* renamed from: q */
    private static Integer m11980q(long j) {
        long j2;
        long f = C10813c.m12197f(EnumC8042a0.MODIFIED_JULIAN_DATE.m20754h(j, EnumC8042a0.UTC), 678881L);
        long b = C10813c.m12201b(f, 146097);
        int d = C10813c.m12199d(f, 146097);
        if (d == 146096) {
            j2 = (b + 1) * 400;
        } else {
            int i = d / 36524;
            int i2 = d % 36524;
            int i3 = i2 / 1461;
            int i4 = i2 % 1461;
            if (i4 == 1460) {
                j2 = (b * 400) + (i * 100) + ((i3 + 1) * 4);
            } else {
                j2 = (b * 400) + (i * 100) + (i3 * 4) + (i4 / 365);
                if (((((i4 % 365) + 31) * 5) / 153) + 2 > 12) {
                    j2++;
                }
            }
        }
        return Integer.valueOf(C10813c.m12196g(j2));
    }

    /* renamed from: e */
    public AbstractC8079p<?> mo11086b(T t) {
        return null;
    }

    /* renamed from: f */
    public AbstractC8079p<?> mo11085c(T t) {
        return null;
    }

    /* renamed from: i */
    public Integer mo11084d(T t) {
        AbstractC8068k<T> a = m11987a(t);
        return m11980q(a.mo11789c((T) a.mo11790b(a.mo11791a()).mo15655B(this.f24064l, 1)));
    }

    /* renamed from: j */
    public Integer mo11078k(T t) {
        AbstractC8068k<T> a = m11987a(t);
        return m11980q(a.mo11789c((T) a.mo11790b(a.mo11788d()).mo15655B(this.f24064l, 1)));
    }

    /* renamed from: o */
    public Integer mo11076n(T t) {
        return m11980q(m11987a(t).mo11789c((T) t.mo15655B(this.f24064l, 1)));
    }

    /* renamed from: p */
    public boolean mo11081h(T t, Integer num) {
        return mo11076n(t).equals(num);
    }

    /* renamed from: r */
    public T mo11077m(T t, Integer num, boolean z) {
        if (mo11081h(t, num)) {
            return t;
        }
        throw new IllegalArgumentException("The related gregorian year is read-only.");
    }
}
