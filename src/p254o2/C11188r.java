package p254o2;

import android.graphics.Paint;
import java.util.List;
import p126h2.C7748e0;
import p167j2.AbstractC9465c;
import p167j2.C9484t;
import p238n2.C10693a;
import p238n2.C10694b;
import p238n2.C10696d;
import p275p2.AbstractC11511b;

/* renamed from: o2.r */
/* loaded from: classes.dex */
public class C11188r implements AbstractC11170c {

    /* renamed from: a */
    private final String f24941a;

    /* renamed from: b */
    private final C10694b f24942b;

    /* renamed from: c */
    private final List<C10694b> f24943c;

    /* renamed from: d */
    private final C10693a f24944d;

    /* renamed from: e */
    private final C10696d f24945e;

    /* renamed from: f */
    private final C10694b f24946f;

    /* renamed from: g */
    private final EnumC11190b f24947g;

    /* renamed from: h */
    private final EnumC11191c f24948h;

    /* renamed from: i */
    private final float f24949i;

    /* renamed from: j */
    private final boolean f24950j;

    /* renamed from: o2.r$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11189a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24951a;

        /* renamed from: b */
        static final /* synthetic */ int[] f24952b;

        static {
            int[] iArr = new int[EnumC11191c.values().length];
            f24952b = iArr;
            try {
                iArr[EnumC11191c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24952b[EnumC11191c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24952b[EnumC11191c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC11190b.values().length];
            f24951a = iArr2;
            try {
                iArr2[EnumC11190b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24951a[EnumC11190b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24951a[EnumC11190b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: o2.r$b */
    /* loaded from: classes.dex */
    public enum EnumC11190b {
        BUTT,
        ROUND,
        UNKNOWN;

        /* renamed from: a */
        public Paint.Cap m10530a() {
            int i = C11189a.f24951a[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    /* renamed from: o2.r$c */
    /* loaded from: classes.dex */
    public enum EnumC11191c {
        MITER,
        ROUND,
        BEVEL;

        /* renamed from: a */
        public Paint.Join m10529a() {
            int i = C11189a.f24952b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public C11188r(String str, C10694b bVar, List<C10694b> list, C10693a aVar, C10696d dVar, C10694b bVar2, EnumC11190b bVar3, EnumC11191c cVar, float f, boolean z) {
        this.f24941a = str;
        this.f24942b = bVar;
        this.f24943c = list;
        this.f24944d = aVar;
        this.f24945e = dVar;
        this.f24946f = bVar2;
        this.f24947g = bVar3;
        this.f24948h = cVar;
        this.f24949i = f;
        this.f24950j = z;
    }

    @Override // p254o2.AbstractC11170c
    /* renamed from: a */
    public AbstractC9465c mo10528a(C7748e0 e0Var, AbstractC11511b bVar) {
        return new C9484t(e0Var, bVar, this);
    }

    /* renamed from: b */
    public EnumC11190b m10540b() {
        return this.f24947g;
    }

    /* renamed from: c */
    public C10693a m10539c() {
        return this.f24944d;
    }

    /* renamed from: d */
    public C10694b m10538d() {
        return this.f24942b;
    }

    /* renamed from: e */
    public EnumC11191c m10537e() {
        return this.f24948h;
    }

    /* renamed from: f */
    public List<C10694b> m10536f() {
        return this.f24943c;
    }

    /* renamed from: g */
    public float m10535g() {
        return this.f24949i;
    }

    /* renamed from: h */
    public String m10534h() {
        return this.f24941a;
    }

    /* renamed from: i */
    public C10696d m10533i() {
        return this.f24945e;
    }

    /* renamed from: j */
    public C10694b m10532j() {
        return this.f24946f;
    }

    /* renamed from: k */
    public boolean m10531k() {
        return this.f24950j;
    }
}
