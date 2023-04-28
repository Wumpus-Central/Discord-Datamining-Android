package p390w;

import java.util.Set;

/* renamed from: w.r0 */
/* loaded from: classes.dex */
public interface AbstractC13662r0 {

    /* renamed from: w.r0$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC13663a<T> {
        /* renamed from: a */
        public static <T> AbstractC13663a<T> m3102a(String str, Class<?> cls) {
            return m3101b(str, cls, null);
        }

        /* renamed from: b */
        public static <T> AbstractC13663a<T> m3101b(String str, Class<?> cls, Object obj) {
            return new C13578c(str, cls, obj);
        }

        /* renamed from: c */
        public abstract String mo3100c();

        /* renamed from: d */
        public abstract Object mo3099d();

        /* renamed from: e */
        public abstract Class<T> mo3098e();
    }

    /* renamed from: w.r0$b */
    /* loaded from: classes.dex */
    public interface AbstractC13664b {
        /* renamed from: a */
        boolean mo3097a(AbstractC13663a<?> aVar);
    }

    /* renamed from: w.r0$c */
    /* loaded from: classes.dex */
    public enum EnumC13665c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    /* renamed from: A */
    <ValueT> ValueT mo2987A(AbstractC13663a<ValueT> aVar, EnumC13665c cVar);

    /* renamed from: a */
    <ValueT> ValueT mo2977a(AbstractC13663a<ValueT> aVar, ValueT valuet);

    /* renamed from: b */
    <ValueT> ValueT mo2976b(AbstractC13663a<ValueT> aVar);

    /* renamed from: c */
    Set<AbstractC13663a<?>> mo2975c();

    /* renamed from: d */
    EnumC13665c mo2974d(AbstractC13663a<?> aVar);

    /* renamed from: e */
    boolean mo2973e(AbstractC13663a<?> aVar);

    /* renamed from: l */
    void mo2967l(String str, AbstractC13664b bVar);

    /* renamed from: x */
    Set<EnumC13665c> mo2959x(AbstractC13663a<?> aVar);
}
