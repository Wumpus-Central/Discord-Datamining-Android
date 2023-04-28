package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Deprecated
/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
public @interface AbstractC3047r {
    Lifecycle.EnumC3010b value();
}
