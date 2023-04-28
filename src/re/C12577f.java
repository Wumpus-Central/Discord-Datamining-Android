package re;

import android.media.MediaFormat;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m15073d2 = {"Lre/f;", "", "a", "litr_release"}, m15072k = 1, m15071mv = {1, 4, 2})
/* renamed from: re.f */
/* loaded from: classes6.dex */
public final class C12577f {

    /* renamed from: a */
    public static final C12578a f28278a = new C12578a(null);

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000e"}, m15073d2 = {"Lre/f$a;", "", "Landroid/media/MediaFormat;", "format", "", "defaultValue", "b", "a", "d", "", "key", "c", "<init>", "()V", "litr_release"}, m15072k = 1, m15071mv = {1, 4, 2})
    /* renamed from: re.f$a */
    /* loaded from: classes6.dex */
    public static final class C12578a {
        private C12578a() {
        }

        public /* synthetic */ C12578a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Number m6488a(MediaFormat format, Number defaultValue) {
            C9971q.m14633g(format, "format");
            C9971q.m14633g(defaultValue, "defaultValue");
            Number c = m6486c(format, "channel-count");
            if (c != null) {
                return c;
            }
            return defaultValue;
        }

        /* renamed from: b */
        public final Number m6487b(MediaFormat format, Number defaultValue) {
            C9971q.m14633g(format, "format");
            C9971q.m14633g(defaultValue, "defaultValue");
            Number c = m6486c(format, "frame-rate");
            if (c != null) {
                return c;
            }
            return defaultValue;
        }

        /* renamed from: c */
        public final Number m6486c(MediaFormat format, String key) {
            Object obj;
            Object obj2;
            Number number;
            C9971q.m14633g(format, "format");
            C9971q.m14633g(key, "key");
            Number number2 = null;
            if (!format.containsKey(key)) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                number = format.getNumber(key);
                return number;
            }
            try {
                C11090s.C11091a aVar = C11090s.f24606l;
                obj = C11090s.m10940b(Integer.valueOf(format.getInteger(key)));
            } catch (Throwable th2) {
                C11090s.C11091a aVar2 = C11090s.f24606l;
                obj = C11090s.m10940b(C11093t.m10931a(th2));
            }
            if (C11090s.m10937e(obj) != null) {
                try {
                    obj2 = C11090s.m10940b(Float.valueOf(format.getFloat(key)));
                } catch (Throwable th3) {
                    C11090s.C11091a aVar3 = C11090s.f24606l;
                    obj2 = C11090s.m10940b(C11093t.m10931a(th3));
                }
                obj = obj2;
            }
            if (!C11090s.m10935g(obj)) {
                number2 = obj;
            }
            return number2;
        }

        /* renamed from: d */
        public final Number m6485d(MediaFormat format, Number defaultValue) {
            C9971q.m14633g(format, "format");
            C9971q.m14633g(defaultValue, "defaultValue");
            Number c = m6486c(format, "sample-rate");
            if (c != null) {
                return c;
            }
            return defaultValue;
        }
    }

    /* renamed from: a */
    public static final Number m6490a(MediaFormat mediaFormat, Number number) {
        return f28278a.m6487b(mediaFormat, number);
    }

    /* renamed from: b */
    public static final Number m6489b(MediaFormat mediaFormat, String str) {
        return f28278a.m6486c(mediaFormat, str);
    }
}
