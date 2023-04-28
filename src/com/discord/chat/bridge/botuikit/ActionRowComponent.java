package com.discord.chat.bridge.botuikit;

import bj.C3622a2;
import bj.C3643f;
import bj.C3676m0;
import bj.C3681n1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m15073d2 = {"Lcom/discord/chat/bridge/botuikit/ActionRowComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "seen1", "", "type", "indices", "", "errorText", "", "components", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getComponents", "()Ljava/util/List;", "getErrorText", "()Ljava/lang/String;", "getIndices", "getType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ActionRowComponent extends Component {
    public static final Companion Companion = new Companion(null);
    private final List<Component> components;
    private final String errorText;
    private final List<Integer> indices;
    private final int type;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/botuikit/ActionRowComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActionRowComponent> serializer() {
            return ActionRowComponent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionRowComponent(int i, int i2, List list, String str, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (11 != (i & 11)) {
            C3681n1.m33818b(i, 11, ActionRowComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i2;
        this.indices = list;
        if ((i & 4) == 0) {
            this.errorText = null;
        } else {
            this.errorText = str;
        }
        this.components = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionRowComponent copy$default(ActionRowComponent actionRowComponent, int i, List list, String str, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = actionRowComponent.getType();
        }
        if ((i2 & 2) != 0) {
            list = actionRowComponent.getIndices();
        }
        if ((i2 & 4) != 0) {
            str = actionRowComponent.errorText;
        }
        if ((i2 & 8) != 0) {
            list2 = actionRowComponent.components;
        }
        return actionRowComponent.copy(i, list, str, list2);
    }

    public static final void write$Self(ActionRowComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        boolean z = false;
        output.mo13866x(serialDesc, 0, self.getType());
        output.mo13870t(serialDesc, 1, new C3643f(C3676m0.f5992a), self.getIndices());
        if (output.mo13893A(serialDesc, 2) || self.errorText != null) {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 2, C3622a2.f5917a, self.errorText);
        }
        output.mo13870t(serialDesc, 3, new C3643f(ComponentSerializer.INSTANCE), self.components);
    }

    public final int component1() {
        return getType();
    }

    public final List<Integer> component2() {
        return getIndices();
    }

    public final String component3() {
        return this.errorText;
    }

    public final List<Component> component4() {
        return this.components;
    }

    public final ActionRowComponent copy(int i, List<Integer> indices, String str, List<? extends Component> components) {
        C9971q.m14633g(indices, "indices");
        C9971q.m14633g(components, "components");
        return new ActionRowComponent(i, indices, str, components);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionRowComponent)) {
            return false;
        }
        ActionRowComponent actionRowComponent = (ActionRowComponent) obj;
        return getType() == actionRowComponent.getType() && C9971q.m14638b(getIndices(), actionRowComponent.getIndices()) && C9971q.m14638b(this.errorText, actionRowComponent.errorText) && C9971q.m14638b(this.components, actionRowComponent.components);
    }

    public final List<Component> getComponents() {
        return this.components;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public List<Integer> getIndices() {
        return this.indices;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int type = ((getType() * 31) + getIndices().hashCode()) * 31;
        String str = this.errorText;
        return ((type + (str == null ? 0 : str.hashCode())) * 31) + this.components.hashCode();
    }

    public String toString() {
        int type = getType();
        List<Integer> indices = getIndices();
        String str = this.errorText;
        List<Component> list = this.components;
        return "ActionRowComponent(type=" + type + ", indices=" + indices + ", errorText=" + str + ", components=" + list + ")";
    }

    public /* synthetic */ ActionRowComponent(int i, List list, String str, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i2 & 4) != 0 ? null : str, list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActionRowComponent(int i, List<Integer> indices, String str, List<? extends Component> components) {
        super(null);
        C9971q.m14633g(indices, "indices");
        C9971q.m14633g(components, "components");
        this.type = i;
        this.indices = indices;
        this.errorText = str;
        this.components = components;
    }
}
