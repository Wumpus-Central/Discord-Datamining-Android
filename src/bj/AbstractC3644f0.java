package bj;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m15073d2 = {"Lbj/f0;", "T", "Lkotlinx/serialization/KSerializer;", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "typeParametersSerializers", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.f0 */
/* loaded from: classes8.dex */
public interface AbstractC3644f0<T> extends KSerializer<T> {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: bj.f0$a */
    /* loaded from: classes8.dex */
    public static final class C3645a {
        /* renamed from: a */
        public static <T> KSerializer<?>[] m33897a(AbstractC3644f0<T> f0Var) {
            return C3689p1.f6010a;
        }
    }

    KSerializer<?>[] childSerializers();

    KSerializer<?>[] typeParametersSerializers();
}
