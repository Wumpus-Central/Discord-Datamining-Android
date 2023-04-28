package dj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import p449yi.AbstractC14437h;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016JB\u0010\f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032 \u0010\u000b\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\tH&JF\u0010\u0012\u001a\u00020\u0007\"\b\b\u0000\u0010\r*\u00020\u0001\"\b\b\u0001\u0010\u000e*\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&J<\u0010\u0015\u001a\u00020\u0007\"\b\b\u0000\u0010\r*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00130\tH&J>\u0010\u0019\u001a\u00020\u0007\"\b\b\u0000\u0010\r*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00170\tH&¨\u0006\u001a"}, m15073d2 = {"Ldj/e;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "", "c", "Lkotlin/Function1;", "", "provider", "e", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "a", "Lyi/h;", "defaultSerializerProvider", "d", "", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "b", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: dj.e */
/* loaded from: classes8.dex */
public interface AbstractC6516e {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: dj.e$a */
    /* loaded from: classes8.dex */
    public static final class C6517a {

        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "T", "", "Lkotlinx/serialization/KSerializer;", "it", "a", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: dj.e$a$a */
        /* loaded from: classes8.dex */
        static final class C0200a extends AbstractC9973s implements Function1<List<? extends KSerializer<?>>, KSerializer<?>> {

            /* renamed from: k */
            final /* synthetic */ KSerializer<T> f13661k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0200a(KSerializer<T> kSerializer) {
                super(1);
                this.f13661k = kSerializer;
            }

            /* renamed from: a */
            public final KSerializer<?> invoke(List<? extends KSerializer<?>> it) {
                C9971q.m14633g(it, "it");
                return this.f13661k;
            }
        }

        /* renamed from: a */
        public static <T> void m25380a(AbstractC6516e eVar, KClass<T> kClass, KSerializer<T> serializer) {
            C9971q.m14633g(kClass, "kClass");
            C9971q.m14633g(serializer, "serializer");
            eVar.mo25381e(kClass, new C0200a(serializer));
        }
    }

    /* renamed from: a */
    <Base, Sub extends Base> void mo25385a(KClass<Base> kClass, KClass<Sub> kClass2, KSerializer<Sub> kSerializer);

    /* renamed from: b */
    <Base> void mo25384b(KClass<Base> kClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> function1);

    /* renamed from: c */
    <T> void mo25383c(KClass<T> kClass, KSerializer<T> kSerializer);

    /* renamed from: d */
    <Base> void mo25382d(KClass<Base> kClass, Function1<? super Base, ? extends AbstractC14437h<? super Base>> function1);

    /* renamed from: e */
    <T> void mo25381e(KClass<T> kClass, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> function1);
}
