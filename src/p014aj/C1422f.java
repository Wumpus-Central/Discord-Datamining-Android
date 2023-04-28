package p014aj;

import ag.AbstractC1385a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\"$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003¨\u0006\u000b"}, m15073d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/Iterable;", "getElementDescriptors$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "elementDescriptors", "", "b", "getElementNames$annotations", "elementNames", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: aj.f */
/* loaded from: classes8.dex */
public final class C1422f {

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m15073d2 = {"aj/f$a", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "hasNext", "b", "", "k", "I", "elementsLeft", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: aj.f$a */
    /* loaded from: classes8.dex */
    public static final class C1423a implements Iterator<SerialDescriptor>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private int f472k;

        /* renamed from: l */
        final /* synthetic */ SerialDescriptor f473l;

        C1423a(SerialDescriptor serialDescriptor) {
            this.f473l = serialDescriptor;
            this.f472k = serialDescriptor.mo13681d();
        }

        /* renamed from: b */
        public SerialDescriptor next() {
            SerialDescriptor serialDescriptor = this.f473l;
            int d = serialDescriptor.mo13681d();
            int i = this.f472k;
            this.f472k = i - 1;
            return serialDescriptor.mo13677h(d - i);
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super SerialDescriptor> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f472k > 0;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m15073d2 = {"aj/f$b", "", "", "", "hasNext", "b", "", "k", "I", "elementsLeft", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: aj.f$b */
    /* loaded from: classes8.dex */
    public static final class C1424b implements java.util.Iterator<String>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private int f474k;

        /* renamed from: l */
        final /* synthetic */ SerialDescriptor f475l;

        C1424b(SerialDescriptor serialDescriptor) {
            this.f475l = serialDescriptor;
            this.f474k = serialDescriptor.mo13681d();
        }

        /* renamed from: b */
        public String next() {
            SerialDescriptor serialDescriptor = this.f475l;
            int d = serialDescriptor.mo13681d();
            int i = this.f474k;
            this.f474k = i - 1;
            return serialDescriptor.mo13680e(d - i);
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f474k > 0;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m15073d2 = {"aj/f$c", "", "", "iterator", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: aj.f$c */
    /* loaded from: classes8.dex */
    public static final class C1425c implements Iterable<SerialDescriptor>, AbstractC1385a {

        /* renamed from: k */
        final /* synthetic */ SerialDescriptor f476k;

        public C1425c(SerialDescriptor serialDescriptor) {
            this.f476k = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<SerialDescriptor> iterator() {
            return new C1423a(this.f476k);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m15073d2 = {"aj/f$d", "", "", "iterator", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: aj.f$d */
    /* loaded from: classes8.dex */
    public static final class C1426d implements Iterable<String>, AbstractC1385a {

        /* renamed from: k */
        final /* synthetic */ SerialDescriptor f477k;

        public C1426d(SerialDescriptor serialDescriptor) {
            this.f477k = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<String> iterator() {
            return new C1424b(this.f477k);
        }
    }

    /* renamed from: a */
    public static final Iterable<SerialDescriptor> m41135a(SerialDescriptor serialDescriptor) {
        C9971q.m14633g(serialDescriptor, "<this>");
        return new C1425c(serialDescriptor);
    }

    /* renamed from: b */
    public static final Iterable<String> m41134b(SerialDescriptor serialDescriptor) {
        C9971q.m14633g(serialDescriptor, "<this>");
        return new C1426d(serialDescriptor);
    }
}
