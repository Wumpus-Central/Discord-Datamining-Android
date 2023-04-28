package p348t7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p119g9.C7570y;

/* renamed from: t7.a */
/* loaded from: classes7.dex */
abstract class AbstractC12971a {

    /* renamed from: a */
    public final int f29064a;

    /* renamed from: t7.a$a */
    /* loaded from: classes7.dex */
    static final class C0416a extends AbstractC12971a {

        /* renamed from: b */
        public final long f29065b;

        /* renamed from: c */
        public final List<C12972b> f29066c = new ArrayList();

        /* renamed from: d */
        public final List<C0416a> f29067d = new ArrayList();

        public C0416a(int i, long j) {
            super(i);
            this.f29065b = j;
        }

        /* renamed from: d */
        public void m4924d(C0416a aVar) {
            this.f29067d.add(aVar);
        }

        /* renamed from: e */
        public void m4923e(C12972b bVar) {
            this.f29066c.add(bVar);
        }

        /* renamed from: f */
        public C0416a m4922f(int i) {
            int size = this.f29067d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0416a aVar = this.f29067d.get(i2);
                if (aVar.f29064a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        public C12972b m4921g(int i) {
            int size = this.f29066c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C12972b bVar = this.f29066c.get(i2);
                if (bVar.f29064a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // p348t7.AbstractC12971a
        public String toString() {
            return AbstractC12971a.m4927a(this.f29064a) + " leaves: " + Arrays.toString(this.f29066c.toArray()) + " containers: " + Arrays.toString(this.f29067d.toArray());
        }
    }

    /* renamed from: t7.a$b */
    /* loaded from: classes7.dex */
    static final class C12972b extends AbstractC12971a {

        /* renamed from: b */
        public final C7570y f29068b;

        public C12972b(int i, C7570y yVar) {
            super(i);
            this.f29068b = yVar;
        }
    }

    public AbstractC12971a(int i) {
        this.f29064a = i;
    }

    /* renamed from: a */
    public static String m4927a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* renamed from: b */
    public static int m4926b(int i) {
        return i & 16777215;
    }

    /* renamed from: c */
    public static int m4925c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m4927a(this.f29064a);
    }
}
