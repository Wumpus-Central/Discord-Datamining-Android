package p458z6;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p040c7.AbstractC3770a;
import p279p6.EnumC11574d;
import p458z6.C14548c;

/* renamed from: z6.f */
/* loaded from: classes7.dex */
public abstract class AbstractC14553f {

    /* renamed from: z6.f$a */
    /* loaded from: classes7.dex */
    public static class C14554a {

        /* renamed from: a */
        private AbstractC3770a f32988a;

        /* renamed from: b */
        private Map<EnumC11574d, AbstractC14555b> f32989b = new HashMap();

        /* renamed from: a */
        public C14554a m232a(EnumC11574d dVar, AbstractC14555b bVar) {
            this.f32989b.put(dVar, bVar);
            return this;
        }

        /* renamed from: b */
        public AbstractC14553f m231b() {
            if (this.f32988a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f32989b.keySet().size() >= EnumC11574d.values().length) {
                Map<EnumC11574d, AbstractC14555b> map = this.f32989b;
                this.f32989b = new HashMap();
                return AbstractC14553f.m239d(this.f32988a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        /* renamed from: c */
        public C14554a m230c(AbstractC3770a aVar) {
            this.f32988a = aVar;
            return this;
        }
    }

    /* renamed from: z6.f$b */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC14555b {

        /* renamed from: z6.f$b$a */
        /* loaded from: classes7.dex */
        public static abstract class AbstractC14556a {
            /* renamed from: a */
            public abstract AbstractC14555b mo225a();

            /* renamed from: b */
            public abstract AbstractC14556a mo224b(long j);

            /* renamed from: c */
            public abstract AbstractC14556a mo223c(Set<EnumC14557c> set);

            /* renamed from: d */
            public abstract AbstractC14556a mo222d(long j);
        }

        /* renamed from: a */
        public static AbstractC14556a m229a() {
            return new C14548c.C14550b().mo223c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo228b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<EnumC14557c> mo227c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo226d();
    }

    /* renamed from: z6.f$c */
    /* loaded from: classes7.dex */
    public enum EnumC14557c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m242a(int i, long j) {
        long j2;
        int i2 = i - 1;
        if (j > 1) {
            j2 = j;
        } else {
            j2 = 2;
        }
        return (long) (Math.pow(3.0d, i2) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2)));
    }

    /* renamed from: b */
    public static C14554a m241b() {
        return new C14554a();
    }

    /* renamed from: d */
    static AbstractC14553f m239d(AbstractC3770a aVar, Map<EnumC11574d, AbstractC14555b> map) {
        return new C14547b(aVar, map);
    }

    /* renamed from: f */
    public static AbstractC14553f m237f(AbstractC3770a aVar) {
        return m241b().m232a(EnumC11574d.DEFAULT, AbstractC14555b.m229a().mo224b(30000L).mo222d(86400000L).mo225a()).m232a(EnumC11574d.HIGHEST, AbstractC14555b.m229a().mo224b(1000L).mo222d(86400000L).mo225a()).m232a(EnumC11574d.VERY_LOW, AbstractC14555b.m229a().mo224b(86400000L).mo222d(86400000L).mo223c(m234i(EnumC14557c.NETWORK_UNMETERED, EnumC14557c.DEVICE_IDLE)).mo225a()).m230c(aVar).m231b();
    }

    /* renamed from: i */
    private static <T> Set<T> m234i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: j */
    private void m233j(JobInfo.Builder builder, Set<EnumC14557c> set) {
        if (set.contains(EnumC14557c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC14557c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(EnumC14557c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder m240c(JobInfo.Builder builder, EnumC11574d dVar, long j, int i) {
        builder.setMinimumLatency(m236g(dVar, j, i));
        m233j(builder, mo235h().get(dVar).mo227c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract AbstractC3770a mo238e();

    /* renamed from: g */
    public long m236g(EnumC11574d dVar, long j, int i) {
        long a = j - mo238e().mo33601a();
        AbstractC14555b bVar = mo235h().get(dVar);
        return Math.min(Math.max(m242a(i, bVar.mo228b()), a), bVar.mo226d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<EnumC11574d, AbstractC14555b> mo235h();
}
