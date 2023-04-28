package kotlinx.serialization.internal;

import bj.AbstractC3644f0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m15073d2 = {"Lkotlinx/serialization/internal/InlineClassDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "hashCode", "", "other", "", "equals", "m", "Z", "isInline", "()Z", "", "name", "Lbj/f0;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lbj/f0;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {

    /* renamed from: m */
    private final boolean f22514m = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassDescriptor(String name, AbstractC3644f0<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        C9971q.m14633g(name, "name");
        C9971q.m14633g(generatedSerializer, "generatedSerializer");
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof InlineClassDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C9971q.m14638b(mo13676i(), serialDescriptor.mo13676i())) {
                InlineClassDescriptor inlineClassDescriptor = (InlineClassDescriptor) obj;
                if (!inlineClassDescriptor.isInline() || !Arrays.equals(m13837p(), inlineClassDescriptor.m13837p())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && mo13681d() == serialDescriptor.mo13681d()) {
                    int d = mo13681d();
                    for (int i = 0; i < d; i++) {
                        if (C9971q.m14638b(mo13677h(i).mo13676i(), serialDescriptor.mo13677h(i).mo13676i()) && C9971q.m14638b(mo13677h(i).mo13678g(), serialDescriptor.mo13677h(i).mo13678g())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f22514m;
    }
}
