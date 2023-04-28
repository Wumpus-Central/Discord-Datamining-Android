package p101fa;

import android.os.IBinder;
import java.lang.reflect.Field;
import p101fa.AbstractC7099a;
import p420x9.C14004p;

/* renamed from: fa.b */
/* loaded from: classes5.dex */
public final class BinderC7100b<T> extends AbstractC7099a.AbstractBinderC0217a {

    /* renamed from: a */
    private final T f15485a;

    private BinderC7100b(T t) {
        this.f15485a = t;
    }

    /* renamed from: c */
    public static <T> T m23401c(AbstractC7099a aVar) {
        if (aVar instanceof BinderC7100b) {
            return ((BinderC7100b) aVar).f15485a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C14004p.m2051j(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            int length = declaredFields.length;
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("Unexpected number of IObjectWrapper declared fields: ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: e */
    public static <T> AbstractC7099a m23400e(T t) {
        return new BinderC7100b(t);
    }
}
