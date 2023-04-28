package qa;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: qa.v */
/* loaded from: classes3.dex */
public abstract class AbstractC12096v<E> extends AbstractC12088r<E> implements Set<E> {
    @NullableDecl

    /* renamed from: l */
    private transient AbstractC12086q<E> f27143l;

    /* renamed from: j */
    private static int m7851j(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* renamed from: p */
    public static <E> qa.AbstractC12096v<E> m7850p(E r13, E r14) {
        /*
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r13
            r13 = 1
            r1[r13] = r14
        L_0x0009:
            if (r0 == 0) goto L_0x0071
            if (r0 == r13) goto L_0x0069
            int r14 = m7851j(r0)
            java.lang.Object[] r6 = new java.lang.Object[r14]
            int r7 = r14 + (-1)
            r3 = r2
            r5 = r3
            r8 = r5
        L_0x0018:
            if (r3 >= r0) goto L_0x0043
            r4 = r1[r3]
            java.lang.Object r4 = qa.C12099x.m7847a(r4, r3)
            int r9 = r4.hashCode()
            int r10 = qa.C12082o.m7863a(r9)
        L_0x0028:
            r11 = r10 & r7
            r12 = r6[r11]
            if (r12 != 0) goto L_0x0037
            int r10 = r8 + 1
            r1[r8] = r4
            r6[r11] = r4
            int r5 = r5 + r9
            r8 = r10
            goto L_0x0040
        L_0x0037:
            boolean r11 = r12.equals(r4)
            if (r11 != 0) goto L_0x0040
            int r10 = r10 + 1
            goto L_0x0028
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x0043:
            r3 = 0
            java.util.Arrays.fill(r1, r8, r0, r3)
            if (r8 != r13) goto L_0x0051
            r13 = r1[r2]
            qa.c0 r14 = new qa.c0
            r14.<init>(r13, r5)
            return r14
        L_0x0051:
            int r0 = m7851j(r8)
            int r14 = r14 / 2
            if (r0 >= r14) goto L_0x005b
            r0 = r8
            goto L_0x0009
        L_0x005b:
            if (r8 >= r13) goto L_0x0061
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r8)
        L_0x0061:
            r4 = r1
            qa.z r13 = new qa.z
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r13
        L_0x0069:
            r13 = r1[r2]
            qa.c0 r14 = new qa.c0
            r14.<init>(r13)
            return r14
        L_0x0071:
            qa.z<java.lang.Object> r13 = qa.C12101z.f27147r
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.AbstractC12096v.m7850p(java.lang.Object, java.lang.Object):qa.v");
    }

    @Override // qa.AbstractC12088r
    /* renamed from: e */
    public final AbstractC12086q<E> mo7852e() {
        AbstractC12086q<E> qVar = this.f27143l;
        if (qVar != null) {
            return qVar;
        }
        AbstractC12086q<E> s = mo7839s();
        this.f27143l = s;
        return s;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12096v) || !mo7840r() || !((AbstractC12096v) obj).mo7840r() || hashCode() == obj.hashCode()) {
            return C12100y.m7846a(this, obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i;
        int i2 = 0;
        for (E e : this) {
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    @Override // qa.AbstractC12088r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return mo7844b();
    }

    /* renamed from: r */
    boolean mo7840r() {
        return false;
    }

    /* renamed from: s */
    AbstractC12086q<E> mo7839s() {
        return AbstractC12086q.m7858r(toArray());
    }
}
