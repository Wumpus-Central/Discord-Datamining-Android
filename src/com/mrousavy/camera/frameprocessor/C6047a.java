package com.mrousavy.camera.frameprocessor;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"Lcom/mrousavy/camera/frameprocessor/a;", "", "Lcom/mrousavy/camera/frameprocessor/c;", "d", "", "e", "", "a", "I", "counter", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "performanceSamples", "f", "()D", "averageExecutionTimeSeconds", "<init>", "()V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.frameprocessor.a */
/* loaded from: classes6.dex */
public final class C6047a {

    /* renamed from: a */
    private int f12309a;

    /* renamed from: b */
    private ArrayList<Double> f12310b = new ArrayList<>();

    @Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.mrousavy.camera.frameprocessor.a$a */
    /* loaded from: classes6.dex */
    static final class C0175a extends AbstractC9973s implements Function0<Unit> {

        /* renamed from: k */
        final /* synthetic */ long f12311k;

        /* renamed from: l */
        final /* synthetic */ C6047a f12312l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0175a(long j, C6047a aVar) {
            super(0);
            this.f12311k = j;
            this.f12312l = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            double currentTimeMillis = (System.currentTimeMillis() - this.f12311k) / 1000.0d;
            int i = this.f12312l.f12309a % 15;
            if (this.f12312l.f12310b.size() > i) {
                this.f12312l.f12310b.set(i, Double.valueOf(currentTimeMillis));
            } else {
                this.f12312l.f12310b.add(Double.valueOf(currentTimeMillis));
            }
            this.f12312l.f12309a++;
        }
    }

    /* renamed from: d */
    public final C6049c m26386d() {
        return new C6049c(new C0175a(System.currentTimeMillis(), this));
    }

    /* renamed from: e */
    public final void m26385e() {
        this.f12309a = 0;
        this.f12310b.clear();
    }

    /* renamed from: f */
    public final double m26384f() {
        double L;
        L = C9914r.m14780L(this.f12310b);
        return L;
    }
}
