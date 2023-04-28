package p145i0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: i0.v */
/* loaded from: classes.dex */
public class C8194v {

    /* renamed from: a */
    public static final C8194v f17721a;

    /* renamed from: b */
    public static final C8194v f17722b;

    /* renamed from: c */
    public static final C8194v f17723c;

    /* renamed from: d */
    public static final C8194v f17724d;

    /* renamed from: e */
    public static final C8194v f17725e;

    /* renamed from: f */
    public static final C8194v f17726f;

    /* renamed from: g */
    static final C8194v f17727g = AbstractC8196b.m20330e(-1, "NONE");

    /* renamed from: h */
    private static final Set<C8194v> f17728h;

    /* renamed from: i */
    private static final List<C8194v> f17729i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.v$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC8196b extends C8194v {
        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC8196b() {
            super();
        }

        /* renamed from: e */
        static AbstractC8196b m20330e(int i, String str) {
            return new C8141i(i, str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract String mo20332c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract int mo20331d();
    }

    static {
        AbstractC8196b e = AbstractC8196b.m20330e(4, "SD");
        f17721a = e;
        AbstractC8196b e2 = AbstractC8196b.m20330e(5, "HD");
        f17722b = e2;
        AbstractC8196b e3 = AbstractC8196b.m20330e(6, "FHD");
        f17723c = e3;
        AbstractC8196b e4 = AbstractC8196b.m20330e(8, "UHD");
        f17724d = e4;
        AbstractC8196b e5 = AbstractC8196b.m20330e(0, "LOWEST");
        f17725e = e5;
        AbstractC8196b e6 = AbstractC8196b.m20330e(1, "HIGHEST");
        f17726f = e6;
        f17728h = new HashSet(Arrays.asList(e5, e6, e, e2, e3, e4));
        f17729i = Arrays.asList(e4, e3, e2, e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20334a(C8194v vVar) {
        return f17728h.contains(vVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static List<C8194v> m20333b() {
        return new ArrayList(f17729i);
    }

    private C8194v() {
    }
}
