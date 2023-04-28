package p181jh;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kh.AbstractC9869a;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import p267of.AbstractC11283p;

/* renamed from: jh.a */
/* loaded from: classes8.dex */
public final class C9607a extends AbstractC9869a {

    /* renamed from: g */
    public static final C0292a f21282g = new C0292a(null);

    /* renamed from: h */
    public static final C9607a f21283h = new C9607a(1, 0, 7);

    /* renamed from: i */
    public static final C9607a f21284i = new C9607a(new int[0]);

    /* renamed from: jh.a$a */
    /* loaded from: classes8.dex */
    public static final class C0292a {
        private C0292a() {
        }

        public /* synthetic */ C0292a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9607a m15928a(InputStream stream) {
            int t;
            int[] C0;
            C9971q.m14633g(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt());
            t = C9907k.m14809t(intRange, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                ((AbstractC11283p) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            C0 = C9914r.m14791C0(arrayList);
            return new C9607a(Arrays.copyOf(C0, C0.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9607a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        C9971q.m14633g(numbers, "numbers");
    }

    /* renamed from: h */
    public boolean m15929h() {
        return m15149f(f21283h);
    }
}
