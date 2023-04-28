package kh;

import java.util.LinkedList;
import java.util.List;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import nf.C11097w;
import p159ih.C8584o;
import p159ih.C8590p;

/* renamed from: kh.d */
/* loaded from: classes8.dex */
public final class C9875d implements AbstractC9874c {

    /* renamed from: a */
    private final C8590p f22029a;

    /* renamed from: b */
    private final C8584o f22030b;

    /* renamed from: kh.d$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C9876a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22031a;

        static {
            int[] iArr = new int[C8584o.C8587c.EnumC0271c.values().length];
            try {
                iArr[C8584o.C8587c.EnumC0271c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C8584o.C8587c.EnumC0271c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C8584o.C8587c.EnumC0271c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22031a = iArr;
        }
    }

    public C9875d(C8590p strings, C8584o qualifiedNames) {
        C9971q.m14633g(strings, "strings");
        C9971q.m14633g(qualifiedNames, "qualifiedNames");
        this.f22029a = strings;
        this.f22030b = qualifiedNames;
    }

    /* renamed from: c */
    private final C11097w<List<String>, List<String>, Boolean> m15133c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C8584o.C8587c w = this.f22030b.m18899w(i);
            String w2 = this.f22029a.m18847w(w.m18885A());
            C8584o.C8587c.EnumC0271c y = w.m18870y();
            C9971q.m14636d(y);
            int i2 = C9876a.f22031a[y.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(w2);
            } else if (i2 == 2) {
                linkedList.addFirst(w2);
            } else if (i2 == 3) {
                linkedList2.addFirst(w2);
                z = true;
            }
            i = w.m18869z();
        }
        return new C11097w<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // kh.AbstractC9874c
    /* renamed from: a */
    public boolean mo12731a(int i) {
        return m15133c(i).m10922f().booleanValue();
    }

    @Override // kh.AbstractC9874c
    /* renamed from: b */
    public String mo12730b(int i) {
        String e0;
        String e02;
        C11097w<List<String>, List<String>, Boolean> c = m15133c(i);
        List<String> a = c.m10927a();
        e0 = C9914r.m14760e0(c.m10926b(), ".", null, null, 0, null, null, 62, null);
        if (a.isEmpty()) {
            return e0;
        }
        StringBuilder sb2 = new StringBuilder();
        e02 = C9914r.m14760e0(a, "/", null, null, 0, null, null, 62, null);
        sb2.append(e02);
        sb2.append('/');
        sb2.append(e0);
        return sb2.toString();
    }

    @Override // kh.AbstractC9874c
    public String getString(int i) {
        String w = this.f22029a.m18847w(i);
        C9971q.m14634f(w, "strings.getString(index)");
        return w;
    }
}
