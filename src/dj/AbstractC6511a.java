package dj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H¦\u0002\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m15073d2 = {"Ldj/a;", "", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "a", "<init>", "()V", "b", "Ldj/a$a;", "Ldj/a$b;", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: dj.a */
/* loaded from: classes8.dex */
public abstract class AbstractC6511a {

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0096\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m15073d2 = {"Ldj/a$a;", "Ldj/a;", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "a", "", "other", "", "equals", "", "hashCode", "Lkotlinx/serialization/KSerializer;", "b", "()Lkotlinx/serialization/KSerializer;", "serializer", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: dj.a$a */
    /* loaded from: classes8.dex */
    public static final class C0199a extends AbstractC6511a {

        /* renamed from: a */
        private final KSerializer<?> f13654a;

        @Override // dj.AbstractC6511a
        /* renamed from: a */
        public KSerializer<?> mo25393a(List<? extends KSerializer<?>> typeArgumentsSerializers) {
            C9971q.m14633g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f13654a;
        }

        /* renamed from: b */
        public final KSerializer<?> m25394b() {
            return this.f13654a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0199a) && C9971q.m14638b(((C0199a) obj).f13654a, this.f13654a);
        }

        public int hashCode() {
            return this.f13654a.hashCode();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0096\u0002R1\u0010\n\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m15073d2 = {"Ldj/a$b;", "Ldj/a;", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "a", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "provider", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: dj.a$b */
    /* loaded from: classes8.dex */
    public static final class C6512b extends AbstractC6511a {

        /* renamed from: a */
        private final Function1<List<? extends KSerializer<?>>, KSerializer<?>> f13655a;

        @Override // dj.AbstractC6511a
        /* renamed from: a */
        public KSerializer<?> mo25393a(List<? extends KSerializer<?>> typeArgumentsSerializers) {
            C9971q.m14633g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f13655a.invoke(typeArgumentsSerializers);
        }

        /* renamed from: b */
        public final Function1<List<? extends KSerializer<?>>, KSerializer<?>> m25392b() {
            return this.f13655a;
        }
    }

    private AbstractC6511a() {
    }

    /* renamed from: a */
    public abstract KSerializer<?> mo25393a(List<? extends KSerializer<?>> list);
}
