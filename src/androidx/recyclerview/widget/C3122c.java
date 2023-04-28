package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C3122c {

    /* renamed from: a */
    private static final Comparator<C3125d> f4801a = new C3123a();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    class C3123a implements Comparator<C3125d> {
        C3123a() {
        }

        /* renamed from: b */
        public int compare(C3125d dVar, C3125d dVar2) {
            return dVar.f4804a - dVar2.f4804a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3124b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: classes.dex */
    public static class C0063c {

        /* renamed from: a */
        private final int[] f4802a;

        /* renamed from: b */
        private final int f4803b;

        C0063c(int i) {
            int[] iArr = new int[i];
            this.f4802a = iArr;
            this.f4803b = iArr.length / 2;
        }

        /* renamed from: a */
        int[] m35164a() {
            return this.f4802a;
        }

        /* renamed from: b */
        int m35163b(int i) {
            return this.f4802a[i + this.f4803b];
        }

        /* renamed from: c */
        void m35162c(int i, int i2) {
            this.f4802a[i + this.f4803b] = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$d */
    /* loaded from: classes.dex */
    public static class C3125d {

        /* renamed from: a */
        public final int f4804a;

        /* renamed from: b */
        public final int f4805b;

        /* renamed from: c */
        public final int f4806c;

        C3125d(int i, int i2, int i3) {
            this.f4804a = i;
            this.f4805b = i2;
            this.f4806c = i3;
        }

        /* renamed from: a */
        int m35161a() {
            return this.f4804a + this.f4806c;
        }

        /* renamed from: b */
        int m35160b() {
            return this.f4805b + this.f4806c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    /* loaded from: classes.dex */
    public static class C3126e {

        /* renamed from: a */
        private final List<C3125d> f4807a;

        /* renamed from: b */
        private final int[] f4808b;

        /* renamed from: c */
        private final int[] f4809c;

        /* renamed from: d */
        private final AbstractC3124b f4810d;

        /* renamed from: e */
        private final int f4811e;

        /* renamed from: f */
        private final int f4812f;

        /* renamed from: g */
        private final boolean f4813g;

        C3126e(AbstractC3124b bVar, List<C3125d> list, int[] iArr, int[] iArr2, boolean z) {
            this.f4807a = list;
            this.f4808b = iArr;
            this.f4809c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4810d = bVar;
            this.f4811e = bVar.getOldListSize();
            this.f4812f = bVar.getNewListSize();
            this.f4813g = z;
            m35159a();
            m35155e();
        }

        /* renamed from: a */
        private void m35159a() {
            C3125d dVar;
            if (this.f4807a.isEmpty()) {
                dVar = null;
            } else {
                dVar = this.f4807a.get(0);
            }
            if (!(dVar != null && dVar.f4804a == 0 && dVar.f4805b == 0)) {
                this.f4807a.add(0, new C3125d(0, 0, 0));
            }
            this.f4807a.add(new C3125d(this.f4811e, this.f4812f, 0));
        }

        /* renamed from: d */
        private void m35156d(int i) {
            int i2;
            int size = this.f4807a.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C3125d dVar = this.f4807a.get(i4);
                while (i3 < dVar.f4805b) {
                    if (this.f4809c[i3] != 0 || !this.f4810d.areItemsTheSame(i, i3)) {
                        i3++;
                    } else {
                        if (this.f4810d.areContentsTheSame(i, i3)) {
                            i2 = 8;
                        } else {
                            i2 = 4;
                        }
                        this.f4808b[i] = (i3 << 4) | i2;
                        this.f4809c[i3] = (i << 4) | i2;
                        return;
                    }
                }
                i3 = dVar.m35160b();
            }
        }

        /* renamed from: e */
        private void m35155e() {
            int i;
            for (C3125d dVar : this.f4807a) {
                for (int i2 = 0; i2 < dVar.f4806c; i2++) {
                    int i3 = dVar.f4804a + i2;
                    int i4 = dVar.f4805b + i2;
                    if (this.f4810d.areContentsTheSame(i3, i4)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.f4808b[i3] = (i4 << 4) | i;
                    this.f4809c[i4] = (i3 << 4) | i;
                }
            }
            if (this.f4813g) {
                m35154f();
            }
        }

        /* renamed from: f */
        private void m35154f() {
            int i = 0;
            for (C3125d dVar : this.f4807a) {
                while (i < dVar.f4804a) {
                    if (this.f4808b[i] == 0) {
                        m35156d(i);
                    }
                    i++;
                }
                i = dVar.m35161a();
            }
        }

        /* renamed from: g */
        private static C3127f m35153g(Collection<C3127f> collection, int i, boolean z) {
            C3127f fVar;
            Iterator<C3127f> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = it.next();
                if (fVar.f4814a == i && fVar.f4816c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C3127f next = it.next();
                if (z) {
                    next.f4815b--;
                } else {
                    next.f4815b++;
                }
            }
            return fVar;
        }

        /* renamed from: b */
        public void m35158b(AbstractC3137h hVar) {
            C3121b bVar;
            int i;
            if (hVar instanceof C3121b) {
                bVar = (C3121b) hVar;
            } else {
                bVar = new C3121b(hVar);
            }
            int i2 = this.f4811e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f4811e;
            int i4 = this.f4812f;
            for (int size = this.f4807a.size() - 1; size >= 0; size--) {
                C3125d dVar = this.f4807a.get(size);
                int a = dVar.m35161a();
                int b = dVar.m35160b();
                while (true) {
                    if (i3 > a) {
                        i3--;
                        int i5 = this.f4808b[i3];
                        if ((i5 & 12) != 0) {
                            int i6 = i5 >> 4;
                            C3127f g = m35153g(arrayDeque, i6, false);
                            if (g != null) {
                                int i7 = (i2 - g.f4815b) - 1;
                                bVar.mo35119d(i3, i7);
                                if ((i5 & 4) != 0) {
                                    bVar.mo35120c(i7, 1, this.f4810d.getChangePayload(i3, i6));
                                }
                            } else {
                                arrayDeque.add(new C3127f(i3, (i2 - i3) - 1, true));
                            }
                        } else {
                            bVar.mo35121b(i3, 1);
                            i2--;
                        }
                    }
                }
                while (i4 > b) {
                    i4--;
                    int i8 = this.f4809c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        C3127f g2 = m35153g(arrayDeque, i9, true);
                        if (g2 == null) {
                            arrayDeque.add(new C3127f(i4, i2 - i3, false));
                        } else {
                            bVar.mo35119d((i2 - g2.f4815b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                bVar.mo35120c(i3, 1, this.f4810d.getChangePayload(i9, i4));
                            }
                        }
                    } else {
                        bVar.mo35122a(i3, 1);
                        i2++;
                    }
                }
                int i10 = dVar.f4804a;
                int i11 = dVar.f4805b;
                for (i = 0; i < dVar.f4806c; i++) {
                    if ((this.f4808b[i10] & 15) == 2) {
                        bVar.mo35120c(i10, 1, this.f4810d.getChangePayload(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = dVar.f4804a;
                i4 = dVar.f4805b;
            }
            bVar.m35170e();
        }

        /* renamed from: c */
        public void m35157c(RecyclerView.Adapter adapter) {
            m35158b(new C3120a(adapter));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$f */
    /* loaded from: classes.dex */
    public static class C3127f {

        /* renamed from: a */
        int f4814a;

        /* renamed from: b */
        int f4815b;

        /* renamed from: c */
        boolean f4816c;

        C3127f(int i, int i2, boolean z) {
            this.f4814a = i;
            this.f4815b = i2;
            this.f4816c = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$g */
    /* loaded from: classes.dex */
    public static class C3128g {

        /* renamed from: a */
        int f4817a;

        /* renamed from: b */
        int f4818b;

        /* renamed from: c */
        int f4819c;

        /* renamed from: d */
        int f4820d;

        public C3128g() {
        }

        /* renamed from: a */
        int m35152a() {
            return this.f4820d - this.f4819c;
        }

        /* renamed from: b */
        int m35151b() {
            return this.f4818b - this.f4817a;
        }

        public C3128g(int i, int i2, int i3, int i4) {
            this.f4817a = i;
            this.f4818b = i2;
            this.f4819c = i3;
            this.f4820d = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$h */
    /* loaded from: classes.dex */
    public static class C3129h {

        /* renamed from: a */
        public int f4821a;

        /* renamed from: b */
        public int f4822b;

        /* renamed from: c */
        public int f4823c;

        /* renamed from: d */
        public int f4824d;

        /* renamed from: e */
        public boolean f4825e;

        C3129h() {
        }

        /* renamed from: a */
        int m35150a() {
            return Math.min(this.f4823c - this.f4821a, this.f4824d - this.f4822b);
        }

        /* renamed from: b */
        boolean m35149b() {
            return this.f4824d - this.f4822b != this.f4823c - this.f4821a;
        }

        /* renamed from: c */
        boolean m35148c() {
            return this.f4824d - this.f4822b > this.f4823c - this.f4821a;
        }

        /* renamed from: d */
        C3125d m35147d() {
            if (!m35149b()) {
                int i = this.f4821a;
                return new C3125d(i, this.f4822b, this.f4823c - i);
            } else if (this.f4825e) {
                return new C3125d(this.f4821a, this.f4822b, m35150a());
            } else {
                if (m35148c()) {
                    return new C3125d(this.f4821a, this.f4822b + 1, m35150a());
                }
                return new C3125d(this.f4821a + 1, this.f4822b, m35150a());
            }
        }
    }

    /* renamed from: a */
    private static C3129h m35169a(C3128g gVar, AbstractC3124b bVar, C0063c cVar, C0063c cVar2, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        if ((gVar.m35151b() - gVar.m35152a()) % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int b = gVar.m35151b() - gVar.m35152a();
        int i6 = -i;
        for (int i7 = i6; i7 <= i; i7 += 2) {
            if (i7 == i6 || (i7 != i && cVar2.m35163b(i7 + 1) < cVar2.m35163b(i7 - 1))) {
                i3 = cVar2.m35163b(i7 + 1);
                i2 = i3;
            } else {
                i3 = cVar2.m35163b(i7 - 1);
                i2 = i3 - 1;
            }
            int i8 = gVar.f4820d - ((gVar.f4818b - i2) - i7);
            if (i == 0 || i2 != i3) {
                i4 = i8;
            } else {
                i4 = i8 + 1;
            }
            while (i2 > gVar.f4817a && i8 > gVar.f4819c && bVar.areItemsTheSame(i2 - 1, i8 - 1)) {
                i2--;
                i8--;
            }
            cVar2.m35162c(i7, i2);
            if (z && (i5 = b - i7) >= i6 && i5 <= i && cVar.m35163b(i5) >= i2) {
                C3129h hVar = new C3129h();
                hVar.f4821a = i2;
                hVar.f4822b = i8;
                hVar.f4823c = i3;
                hVar.f4824d = i4;
                hVar.f4825e = true;
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C3126e m35168b(AbstractC3124b bVar, boolean z) {
        C3128g gVar;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C3128g(0, oldListSize, 0, newListSize));
        int i = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        C0063c cVar = new C0063c(i);
        C0063c cVar2 = new C0063c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C3128g gVar2 = (C3128g) arrayList2.remove(arrayList2.size() - 1);
            C3129h d = m35166d(gVar2, bVar, cVar, cVar2);
            if (d != null) {
                if (d.m35150a() > 0) {
                    arrayList.add(d.m35147d());
                }
                if (arrayList3.isEmpty()) {
                    gVar = new C3128g();
                } else {
                    gVar = (C3128g) arrayList3.remove(arrayList3.size() - 1);
                }
                gVar.f4817a = gVar2.f4817a;
                gVar.f4819c = gVar2.f4819c;
                gVar.f4818b = d.f4821a;
                gVar.f4820d = d.f4822b;
                arrayList2.add(gVar);
                gVar2.f4818b = gVar2.f4818b;
                gVar2.f4820d = gVar2.f4820d;
                gVar2.f4817a = d.f4823c;
                gVar2.f4819c = d.f4824d;
                arrayList2.add(gVar2);
            } else {
                arrayList3.add(gVar2);
            }
        }
        Collections.sort(arrayList, f4801a);
        return new C3126e(bVar, arrayList, cVar.m35164a(), cVar2.m35164a(), z);
    }

    /* renamed from: c */
    private static C3129h m35167c(C3128g gVar, AbstractC3124b bVar, C0063c cVar, C0063c cVar2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z = true;
        if (Math.abs(gVar.m35151b() - gVar.m35152a()) % 2 != 1) {
            z = false;
        }
        int b = gVar.m35151b() - gVar.m35152a();
        int i5 = -i;
        for (int i6 = i5; i6 <= i; i6 += 2) {
            if (i6 == i5 || (i6 != i && cVar.m35163b(i6 + 1) > cVar.m35163b(i6 - 1))) {
                i3 = cVar.m35163b(i6 + 1);
                i2 = i3;
            } else {
                i3 = cVar.m35163b(i6 - 1);
                i2 = i3 + 1;
            }
            int i7 = (gVar.f4819c + (i2 - gVar.f4817a)) - i6;
            int i8 = (i == 0 || i2 != i3) ? i7 : i7 - 1;
            while (i2 < gVar.f4818b && i7 < gVar.f4820d && bVar.areItemsTheSame(i2, i7)) {
                i2++;
                i7++;
            }
            cVar.m35162c(i6, i2);
            if (z && (i4 = b - i6) >= i5 + 1 && i4 <= i - 1 && cVar2.m35163b(i4) <= i2) {
                C3129h hVar = new C3129h();
                hVar.f4821a = i3;
                hVar.f4822b = i8;
                hVar.f4823c = i2;
                hVar.f4824d = i7;
                hVar.f4825e = false;
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    private static C3129h m35166d(C3128g gVar, AbstractC3124b bVar, C0063c cVar, C0063c cVar2) {
        if (gVar.m35151b() >= 1 && gVar.m35152a() >= 1) {
            int b = ((gVar.m35151b() + gVar.m35152a()) + 1) / 2;
            cVar.m35162c(1, gVar.f4817a);
            cVar2.m35162c(1, gVar.f4818b);
            for (int i = 0; i < b; i++) {
                C3129h c = m35167c(gVar, bVar, cVar, cVar2, i);
                if (c != null) {
                    return c;
                }
                C3129h a = m35169a(gVar, bVar, cVar, cVar2, i);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
