package mh;

import java.util.Arrays;
import kh.AbstractC9869a;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mh.e */
/* loaded from: classes8.dex */
public final class C10612e extends AbstractC9869a {

    /* renamed from: h */
    public static final C10613a f23498h = new C10613a(null);

    /* renamed from: i */
    public static final C10612e f23499i = new C10612e(1, 8, 0);

    /* renamed from: j */
    public static final C10612e f23500j = new C10612e(new int[0]);

    /* renamed from: g */
    private final boolean f23501g;

    /* renamed from: mh.e$a */
    /* loaded from: classes8.dex */
    public static final class C10613a {
        private C10613a() {
        }

        public /* synthetic */ C10613a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10612e(int[] versionArray, boolean z) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        C9971q.m14633g(versionArray, "versionArray");
        this.f23501g = z;
    }

    /* renamed from: h */
    public boolean m12732h() {
        boolean z;
        if (m15154a() == 1 && m15153b() == 0) {
            return false;
        }
        if (this.f23501g) {
            z = m15149f(f23499i);
        } else {
            int a = m15154a();
            C10612e eVar = f23499i;
            if (a != eVar.m15154a() || m15153b() > eVar.m15153b() + 1) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10612e(int... numbers) {
        this(numbers, false);
        C9971q.m14633g(numbers, "numbers");
    }
}
