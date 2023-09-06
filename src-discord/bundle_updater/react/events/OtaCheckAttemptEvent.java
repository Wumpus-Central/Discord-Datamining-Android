package com.discord.bundle_updater.react.events;

import com.discord.bundle_updater.BundleUpdater;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kf.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.c;
import ui.f;
import xi.n1;

@f
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006!"}, d2 = {"Lcom/discord/bundle_updater/react/events/OtaCheckAttemptEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "metrics", "", "Lcom/discord/bundle_updater/BundleUpdater$OtaMetric;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getMetrics", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class OtaCheckAttemptEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final List<BundleUpdater.OtaMetric> metrics;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/bundle_updater/react/events/OtaCheckAttemptEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/bundle_updater/react/events/OtaCheckAttemptEvent;", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OtaCheckAttemptEvent> serializer() {
            return OtaCheckAttemptEvent$$serializer.INSTANCE;
        }
    }

    public  OtaCheckAttemptEvent(int i10, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, OtaCheckAttemptEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.metrics = list;
    }

    
    public static  OtaCheckAttemptEvent copy$default(OtaCheckAttemptEvent otaCheckAttemptEvent, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = otaCheckAttemptEvent.metrics;
        }
        return otaCheckAttemptEvent.copy(list);
    }

    public static final void write$Self(OtaCheckAttemptEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.h(serialDesc, 0, new xi.f(new c(f0.b(BundleUpdater.OtaMetric.class), new Annotation[0])), self.metrics);
    }

    public final List<BundleUpdater.OtaMetric> component1() {
        return this.metrics;
    }

    public final OtaCheckAttemptEvent copy(List<? extends BundleUpdater.OtaMetric> metrics) {
        q.h(metrics, "metrics");
        return new OtaCheckAttemptEvent(metrics);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OtaCheckAttemptEvent) && q.c(this.metrics, ((OtaCheckAttemptEvent) obj).metrics);
    }

    public final List<BundleUpdater.OtaMetric> getMetrics() {
        return this.metrics;
    }

    public int hashCode() {
        return this.metrics.hashCode();
    }

    public String toString() {
        List<BundleUpdater.OtaMetric> list = this.metrics;
        return "OtaCheckAttemptEvent(metrics=" + list + ")";
    }

    
    public OtaCheckAttemptEvent(List<? extends BundleUpdater.OtaMetric> metrics) {
        q.h(metrics, "metrics");
        this.metrics = metrics;
    }

    @Override 
    public WritableNativeMap serialize() {
        int s10;
        Pair[] pairArr = new Pair[1];
        List<BundleUpdater.OtaMetric> list = this.metrics;
        s10 = k.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (BundleUpdater.OtaMetric otaMetric : list) {
            arrayList.add(otaMetric.toNativeMap());
        }
        pairArr[0] = x.a("metrics", NativeArrayExtensionsKt.toNativeArray(arrayList));
        return NativeMapExtensionsKt.nativeMapOf(pairArr);
    }
}
