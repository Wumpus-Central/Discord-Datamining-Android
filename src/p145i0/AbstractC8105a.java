package p145i0;

import android.util.Range;
import com.facebook.react.uimanager.ViewDefaults;
import p145i0.C8111c;

/* renamed from: i0.a */
/* loaded from: classes.dex */
public abstract class AbstractC8105a {

    /* renamed from: a */
    public static final Range<Integer> f17532a;

    /* renamed from: b */
    public static final Range<Integer> f17533b;

    /* renamed from: c */
    public static final AbstractC8105a f17534c = m20590a().mo20575c(0).mo20577a();

    /* renamed from: i0.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0254a {
        /* renamed from: a */
        public abstract AbstractC8105a mo20577a();

        /* renamed from: b */
        public abstract AbstractC0254a mo20576b(Range<Integer> range);

        /* renamed from: c */
        public abstract AbstractC0254a mo20575c(int i);

        /* renamed from: d */
        public abstract AbstractC0254a mo20574d(Range<Integer> range);

        /* renamed from: e */
        public abstract AbstractC0254a mo20573e(int i);
    }

    static {
        Integer valueOf = Integer.valueOf((int) ViewDefaults.NUMBER_OF_LINES);
        f17532a = new Range<>(0, valueOf);
        f17533b = new Range<>(0, valueOf);
    }

    /* renamed from: a */
    public static AbstractC0254a m20590a() {
        return new C8111c.C8113b().m20572f(-1).mo20573e(-1).mo20575c(-1).mo20576b(f17532a).mo20574d(f17533b);
    }

    /* renamed from: b */
    public abstract Range<Integer> mo20582b();

    /* renamed from: c */
    public abstract int mo20581c();

    /* renamed from: d */
    public abstract Range<Integer> mo20580d();

    /* renamed from: e */
    public abstract int mo20579e();

    /* renamed from: f */
    public abstract int mo20578f();
}
