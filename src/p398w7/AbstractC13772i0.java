package p398w7;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import p119g9.C7544l0;
import p119g9.C7570y;
import p228m7.AbstractC10516k;

/* renamed from: w7.i0 */
/* loaded from: classes7.dex */
public interface AbstractC13772i0 {

    /* renamed from: w7.i0$a */
    /* loaded from: classes7.dex */
    public static final class C13773a {

        /* renamed from: a */
        public final String f30850a;

        /* renamed from: b */
        public final int f30851b;

        /* renamed from: c */
        public final byte[] f30852c;

        public C13773a(String str, int i, byte[] bArr) {
            this.f30850a = str;
            this.f30851b = i;
            this.f30852c = bArr;
        }
    }

    /* renamed from: w7.i0$b */
    /* loaded from: classes7.dex */
    public static final class C13774b {

        /* renamed from: a */
        public final int f30853a;

        /* renamed from: b */
        public final String f30854b;

        /* renamed from: c */
        public final List<C13773a> f30855c;

        /* renamed from: d */
        public final byte[] f30856d;

        public C13774b(int i, String str, List<C13773a> list, byte[] bArr) {
            List<C13773a> list2;
            this.f30853a = i;
            this.f30854b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f30855c = list2;
            this.f30856d = bArr;
        }
    }

    /* renamed from: w7.i0$c */
    /* loaded from: classes7.dex */
    public interface AbstractC13775c {
        /* renamed from: a */
        SparseArray<AbstractC13772i0> mo2727a();

        /* renamed from: b */
        AbstractC13772i0 mo2726b(int i, C13774b bVar);
    }

    /* renamed from: w7.i0$d */
    /* loaded from: classes7.dex */
    public static final class C13776d {

        /* renamed from: a */
        private final String f30857a;

        /* renamed from: b */
        private final int f30858b;

        /* renamed from: c */
        private final int f30859c;

        /* renamed from: d */
        private int f30860d;

        /* renamed from: e */
        private String f30861e;

        public C13776d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: d */
        private void m2728d() {
            if (this.f30860d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        /* renamed from: a */
        public void m2731a() {
            int i;
            int i2 = this.f30860d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.f30858b;
            } else {
                i = i2 + this.f30859c;
            }
            this.f30860d = i;
            this.f30861e = this.f30857a + this.f30860d;
        }

        /* renamed from: b */
        public String m2730b() {
            m2728d();
            return this.f30861e;
        }

        /* renamed from: c */
        public int m2729c() {
            m2728d();
            return this.f30860d;
        }

        public C13776d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f30857a = str;
            this.f30858b = i2;
            this.f30859c = i3;
            this.f30860d = Integer.MIN_VALUE;
            this.f30861e = "";
        }
    }

    /* renamed from: a */
    void mo2644a(C7544l0 l0Var, AbstractC10516k kVar, C13776d dVar);

    /* renamed from: b */
    void mo2643b(C7570y yVar, int i);

    /* renamed from: c */
    void mo2642c();
}
