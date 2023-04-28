package p145i0;

import android.util.Range;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.Arrays;
import p145i0.C8157m;

/* renamed from: i0.j1 */
/* loaded from: classes.dex */
public abstract class AbstractC8151j1 {

    /* renamed from: a */
    public static final Range<Integer> f17622a;

    /* renamed from: b */
    public static final Range<Integer> f17623b;

    /* renamed from: c */
    public static final C8198w f17624c;

    /* renamed from: i0.j1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC8152a {
        /* renamed from: a */
        public abstract AbstractC8151j1 mo20504a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC8152a mo20503b(int i);

        /* renamed from: c */
        public abstract AbstractC8152a mo20502c(Range<Integer> range);

        /* renamed from: d */
        public abstract AbstractC8152a mo20501d(Range<Integer> range);

        /* renamed from: e */
        public abstract AbstractC8152a mo20500e(C8198w wVar);
    }

    static {
        Integer valueOf = Integer.valueOf((int) ViewDefaults.NUMBER_OF_LINES);
        f17622a = new Range<>(0, valueOf);
        f17623b = new Range<>(0, valueOf);
        C8194v vVar = C8194v.f17723c;
        f17624c = C8198w.m20324f(Arrays.asList(vVar, C8194v.f17722b, C8194v.f17721a), C8161n.m20499a(vVar));
    }

    /* renamed from: a */
    public static AbstractC8152a m20510a() {
        return new C8157m.C8159b().mo20500e(f17624c).mo20501d(f17622a).mo20502c(f17623b).mo20503b(-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo20509b();

    /* renamed from: c */
    public abstract Range<Integer> mo20508c();

    /* renamed from: d */
    public abstract Range<Integer> mo20507d();

    /* renamed from: e */
    public abstract C8198w mo20506e();

    /* renamed from: f */
    public abstract AbstractC8152a mo20505f();
}
