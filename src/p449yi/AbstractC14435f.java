package p449yi;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Target({ElementType.TYPE, ElementType.TYPE_USE})
@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0016\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002R\u001d\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Lyi/f;", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "with", "()Ljava/lang/Class;", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: yi.f */
/* loaded from: classes8.dex */
public @interface AbstractC14435f {
    Class<? extends KSerializer<?>> with() default KSerializer.class;
}
