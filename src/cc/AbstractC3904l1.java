package cc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p030bc.AbstractC3465n;
import p030bc.C3457i;

/* renamed from: cc.l1 */
/* loaded from: classes3.dex */
public abstract class AbstractC3904l1<K0, V0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.l1$a */
    /* loaded from: classes3.dex */
    public class C3905a extends AbstractC3909e<Object> {

        /* renamed from: a */
        final /* synthetic */ int f6445a;

        C3905a(int i) {
            this.f6445a = i;
        }

        @Override // cc.AbstractC3904l1.AbstractC3909e
        /* renamed from: c */
        <K, V> Map<K, Collection<V>> mo33355c() {
            return C3942s1.m33306c(this.f6445a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.l1$b */
    /* loaded from: classes3.dex */
    public class C3906b extends AbstractC3909e<K0> {

        /* renamed from: a */
        final /* synthetic */ Comparator f6446a;

        C3906b(Comparator comparator) {
            this.f6446a = comparator;
        }

        @Override // cc.AbstractC3904l1.AbstractC3909e
        /* renamed from: c */
        <K extends K0, V> Map<K, Collection<V>> mo33355c() {
            return new TreeMap(this.f6446a);
        }
    }

    /* renamed from: cc.l1$c */
    /* loaded from: classes3.dex */
    private static final class C3907c<V> implements AbstractC3465n<List<V>>, Serializable {

        /* renamed from: k */
        private final int f6447k;

        C3907c(int i) {
            this.f6447k = C3911m.m33352b(i, "expectedValuesPerKey");
        }

        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f6447k);
        }
    }

    /* renamed from: cc.l1$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC3908d<K0, V0> extends AbstractC3904l1<K0, V0> {
        AbstractC3908d() {
            super(null);
        }

        /* renamed from: e */
        public abstract <K extends K0, V extends V0> AbstractC3843e1<K, V> mo33354e();
    }

    /* renamed from: cc.l1$e */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC3909e<K0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: cc.l1$e$a */
        /* loaded from: classes3.dex */
        public class C3910a extends AbstractC3908d<K0, Object> {

            /* renamed from: a */
            final /* synthetic */ int f6448a;

            C3910a(int i) {
                this.f6448a = i;
            }

            @Override // cc.AbstractC3904l1.AbstractC3908d
            /* renamed from: e */
            public <K extends K0, V> AbstractC3843e1<K, V> mo33354e() {
                return C3914m1.m33346b(AbstractC3909e.this.mo33355c(), new C3907c(this.f6448a));
            }
        }

        AbstractC3909e() {
        }

        /* renamed from: a */
        public AbstractC3908d<K0, Object> m33357a() {
            return m33356b(2);
        }

        /* renamed from: b */
        public AbstractC3908d<K0, Object> m33356b(int i) {
            C3911m.m33352b(i, "expectedValuesPerKey");
            return new C3910a(i);
        }

        /* renamed from: c */
        abstract <K extends K0, V> Map<K, Collection<V>> mo33355c();
    }

    private AbstractC3904l1() {
    }

    /* synthetic */ AbstractC3904l1(C3905a aVar) {
        this();
    }

    /* renamed from: a */
    public static AbstractC3909e<Object> m33362a() {
        return m33361b(8);
    }

    /* renamed from: b */
    public static AbstractC3909e<Object> m33361b(int i) {
        C3911m.m33352b(i, "expectedKeys");
        return new C3905a(i);
    }

    /* renamed from: c */
    public static AbstractC3909e<Comparable> m33360c() {
        return m33359d(AbstractC3937r1.m33314d());
    }

    /* renamed from: d */
    public static <K0> AbstractC3909e<K0> m33359d(Comparator<K0> comparator) {
        C3457i.m34352i(comparator);
        return new C3906b(comparator);
    }
}
