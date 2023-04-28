package androidx.activity.result.contract;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    /* renamed from: androidx.activity.result.contract.ActivityResultContract$a */
    /* loaded from: classes.dex */
    public static final class C1497a<T> {
        @SuppressLint({"UnknownNullness"})

        /* renamed from: a */
        private final T f657a;

        public C1497a(@SuppressLint({"UnknownNullness"}) T t) {
            this.f657a = t;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: a */
        public T m40965a() {
            return this.f657a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo33700a(Context context, @SuppressLint({"UnknownNullness"}) I i);

    /* renamed from: b */
    public C1497a<O> mo40964b(Context context, @SuppressLint({"UnknownNullness"}) I i) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: c */
    public abstract O mo33699c(int i, Intent intent);
}
