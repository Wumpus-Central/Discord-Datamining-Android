package kotlin.jvm.internal;

import kotlin.Metadata;
import p107fg.AbstractC7150i;
import p107fg.EnumC7154k;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m15073d2 = {"Lkotlin/jvm/internal/m0;", "Lfg/i;", "k", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlin.jvm.internal.m0 */
/* loaded from: classes8.dex */
public final class C9966m0 implements AbstractC7150i {

    /* renamed from: k */
    public static final C9967a f22092k = new C9967a(null);

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m15073d2 = {"Lkotlin/jvm/internal/m0$a;", "", "Lfg/i;", "typeParameter", "", "a", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.jvm.internal.m0$a */
    /* loaded from: classes8.dex */
    public static final class C9967a {

        @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* renamed from: kotlin.jvm.internal.m0$a$a */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C0304a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f22093a;

            static {
                int[] iArr = new int[EnumC7154k.values().length];
                try {
                    iArr[EnumC7154k.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC7154k.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC7154k.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f22093a = iArr;
            }
        }

        private C9967a() {
        }

        public /* synthetic */ C9967a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m14642a(AbstractC7150i typeParameter) {
            C9971q.m14633g(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i = C0304a.f22093a[typeParameter.mo19790m().ordinal()];
            if (i == 2) {
                sb2.append("in ");
            } else if (i == 3) {
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            String sb3 = sb2.toString();
            C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }
}
