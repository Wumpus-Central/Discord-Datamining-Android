package p115g5;

import android.net.Uri;
import com.facebook.common.internal.AbstractC4767Fn;

/* renamed from: g5.e */
/* loaded from: classes7.dex */
public abstract class AbstractC7419e {
    /* renamed from: a */
    public static <T> Uri m22713a(T t, T t2, T[] tArr, AbstractC4767Fn<T, Uri> fn) {
        T t3;
        Uri apply;
        Uri apply2;
        if (t != null && (apply2 = fn.apply(t)) != null) {
            return apply2;
        }
        if (tArr != null && tArr.length > 0 && (t3 = tArr[0]) != null && (apply = fn.apply(t3)) != null) {
            return apply;
        }
        if (t2 != null) {
            return fn.apply(t2);
        }
        return null;
    }
}
