package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import j$.util.Spliterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import uj.f;
import xj.a2;
import xj.m0;
import xj.n1;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002>?B\u008b\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016Be\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0017J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0013HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003Jw\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00102\u001a\u00020\u00112\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\nHÖ\u0001J!\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=HÇ\u0001R\u0016\u0010\r\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\f\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!¨\u0006@"}, d2 = {"Lcom/discord/chat/bridge/botuikit/RoleSelectComponent;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent;", "seen1", "", "selectedOptions", "", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "type", "indices", "applicationId", "", "customId", ReactTextInputShadowNode.PROP_PLACEHOLDER, ViewProps.ACCESSIBILITY_LABEL, "minValues", "maxValues", "disabled", "", "state", "Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLcom/discord/chat/bridge/botuikit/ActionComponentState;)V", "getAccessibilityLabel", "()Ljava/lang/String;", "getApplicationId", "getCustomId", "getDisabled", "()Z", "getIndices", "()Ljava/util/List;", "getMaxValues", "()I", "getMinValues", "getPlaceholder", "getState", "()Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "getType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes5.dex */
public final class RoleSelectComponent extends SearchableSelectComponent {
    public static final Companion Companion = new Companion(null);
    private final String accessibilityLabel;
    private final String applicationId;
    private final String customId;
    private final boolean disabled;
    private final List<Integer> indices;
    private final int maxValues;
    private final int minValues;
    private final String placeholder;
    private final ActionComponentState state;
    private final int type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/botuikit/RoleSelectComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/RoleSelectComponent;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RoleSelectComponent> serializer() {
            return RoleSelectComponent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoleSelectComponent(int i10, List list, int i11, List list2, String str, String str2, String str3, String str4, int i12, int i13, boolean z10, ActionComponentState actionComponentState, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, list, serializationConstructorMarker);
        if (1438 != (i10 & 1438)) {
            n1.b(i10, 1438, RoleSelectComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i11;
        this.indices = list2;
        this.applicationId = str;
        this.customId = str2;
        if ((i10 & 32) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str3;
        }
        if ((i10 & 64) == 0) {
            this.accessibilityLabel = null;
        } else {
            this.accessibilityLabel = str4;
        }
        this.minValues = i12;
        this.maxValues = i13;
        if ((i10 & 512) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z10;
        }
        this.state = actionComponentState;
    }

    public static final void write$Self(RoleSelectComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        SearchableSelectComponent.write$Self((SearchableSelectComponent) self, output, serialDesc);
        boolean z12 = true;
        output.w(serialDesc, 1, self.getType());
        output.z(serialDesc, 2, new xj.f(m0.f32384a), self.getIndices());
        output.y(serialDesc, 3, self.getApplicationId());
        output.y(serialDesc, 4, self.getCustomId());
        if (!output.A(serialDesc, 5) && self.getPlaceholder() == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.h(serialDesc, 5, a2.f32309a, self.getPlaceholder());
        }
        if (!output.A(serialDesc, 6) && self.getAccessibilityLabel() == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.h(serialDesc, 6, a2.f32309a, self.getAccessibilityLabel());
        }
        output.w(serialDesc, 7, self.getMinValues());
        output.w(serialDesc, 8, self.getMaxValues());
        if (!output.A(serialDesc, 9) && !self.getDisabled()) {
            z12 = false;
        }
        if (z12) {
            output.x(serialDesc, 9, self.getDisabled());
        }
        output.z(serialDesc, 10, ActionComponentState.Serializer.INSTANCE, self.getState());
    }

    public final int component1() {
        return getType();
    }

    public final ActionComponentState component10() {
        return getState();
    }

    public final List<Integer> component2() {
        return getIndices();
    }

    public final String component3() {
        return getApplicationId();
    }

    public final String component4() {
        return getCustomId();
    }

    public final String component5() {
        return getPlaceholder();
    }

    public final String component6() {
        return getAccessibilityLabel();
    }

    public final int component7() {
        return getMinValues();
    }

    public final int component8() {
        return getMaxValues();
    }

    public final boolean component9() {
        return getDisabled();
    }

    public final RoleSelectComponent copy(int i10, List<Integer> indices, String applicationId, String customId, String str, String str2, int i11, int i12, boolean z10, ActionComponentState state) {
        q.g(indices, "indices");
        q.g(applicationId, "applicationId");
        q.g(customId, "customId");
        q.g(state, "state");
        return new RoleSelectComponent(i10, indices, applicationId, customId, str, str2, i11, i12, z10, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoleSelectComponent)) {
            return false;
        }
        RoleSelectComponent roleSelectComponent = (RoleSelectComponent) obj;
        return getType() == roleSelectComponent.getType() && q.b(getIndices(), roleSelectComponent.getIndices()) && q.b(getApplicationId(), roleSelectComponent.getApplicationId()) && q.b(getCustomId(), roleSelectComponent.getCustomId()) && q.b(getPlaceholder(), roleSelectComponent.getPlaceholder()) && q.b(getAccessibilityLabel(), roleSelectComponent.getAccessibilityLabel()) && getMinValues() == roleSelectComponent.getMinValues() && getMaxValues() == roleSelectComponent.getMaxValues() && getDisabled() == roleSelectComponent.getDisabled() && getState() == roleSelectComponent.getState();
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public String getApplicationId() {
        return this.applicationId;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public String getCustomId() {
        return this.customId;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public boolean getDisabled() {
        return this.disabled;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public List<Integer> getIndices() {
        return this.indices;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public int getMaxValues() {
        return this.maxValues;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public int getMinValues() {
        return this.minValues;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public ActionComponentState getState() {
        return this.state;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = 0;
        int type = ((((((((getType() * 31) + getIndices().hashCode()) * 31) + getApplicationId().hashCode()) * 31) + getCustomId().hashCode()) * 31) + (getPlaceholder() == null ? 0 : getPlaceholder().hashCode())) * 31;
        if (getAccessibilityLabel() != null) {
            i10 = getAccessibilityLabel().hashCode();
        }
        int minValues = (((((type + i10) * 31) + getMinValues()) * 31) + getMaxValues()) * 31;
        boolean disabled = getDisabled();
        if (disabled) {
            disabled = true;
        }
        int i11 = disabled ? 1 : 0;
        int i12 = disabled ? 1 : 0;
        int i13 = disabled ? 1 : 0;
        return ((minValues + i11) * 31) + getState().hashCode();
    }

    public String toString() {
        int type = getType();
        List<Integer> indices = getIndices();
        String applicationId = getApplicationId();
        String customId = getCustomId();
        String placeholder = getPlaceholder();
        String accessibilityLabel = getAccessibilityLabel();
        int minValues = getMinValues();
        int maxValues = getMaxValues();
        boolean disabled = getDisabled();
        ActionComponentState state = getState();
        return "RoleSelectComponent(type=" + type + ", indices=" + indices + ", applicationId=" + applicationId + ", customId=" + customId + ", placeholder=" + placeholder + ", accessibilityLabel=" + accessibilityLabel + ", minValues=" + minValues + ", maxValues=" + maxValues + ", disabled=" + disabled + ", state=" + state + ")";
    }

    public /* synthetic */ RoleSelectComponent(int i10, List list, String str, String str2, String str3, String str4, int i11, int i12, boolean z10, ActionComponentState actionComponentState, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, str, str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, i11, i12, (i13 & Spliterator.NONNULL) != 0 ? false : z10, actionComponentState);
    }

    public RoleSelectComponent(int i10, List<Integer> indices, String applicationId, String customId, String str, String str2, int i11, int i12, boolean z10, ActionComponentState state) {
        q.g(indices, "indices");
        q.g(applicationId, "applicationId");
        q.g(customId, "customId");
        q.g(state, "state");
        this.type = i10;
        this.indices = indices;
        this.applicationId = applicationId;
        this.customId = customId;
        this.placeholder = str;
        this.accessibilityLabel = str2;
        this.minValues = i11;
        this.maxValues = i12;
        this.disabled = z10;
        this.state = state;
    }
}
