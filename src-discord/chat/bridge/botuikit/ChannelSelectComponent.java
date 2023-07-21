package com.discord.chat.bridge.botuikit;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.a2;
import si.m0;
import si.n1;

@f
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002ABB\u009b\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017Bw\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0018J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0013HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\u0089\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u00105\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\u0003HÖ\u0001J\t\u00109\u001a\u00020\nHÖ\u0001J!\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@HÇ\u0001R\u0016\u0010\r\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\f\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#¨\u0006C"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ChannelSelectComponent;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent;", "seen1", "", "selectedOptions", "", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "type", "indices", "applicationId", "", "customId", ReactTextInputShadowNode.PROP_PLACEHOLDER, ViewProps.ACCESSIBILITY_LABEL, "minValues", "maxValues", "disabled", "", "state", "Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "channelTypes", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLcom/discord/chat/bridge/botuikit/ActionComponentState;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLcom/discord/chat/bridge/botuikit/ActionComponentState;Ljava/util/List;)V", "getAccessibilityLabel", "()Ljava/lang/String;", "getApplicationId", "getChannelTypes", "()Ljava/util/List;", "getCustomId", "getDisabled", "()Z", "getIndices", "getMaxValues", "()I", "getMinValues", "getPlaceholder", "getState", "()Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "getType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChannelSelectComponent extends SearchableSelectComponent {
    public static final Companion Companion = new Companion(null);
    private final String accessibilityLabel;
    private final String applicationId;
    private final List<Integer> channelTypes;
    private final String customId;
    private final boolean disabled;
    private final List<Integer> indices;
    private final int maxValues;
    private final int minValues;
    private final String placeholder;
    private final ActionComponentState state;
    private final int type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ChannelSelectComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/ChannelSelectComponent;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChannelSelectComponent> serializer() {
            return ChannelSelectComponent$$serializer.INSTANCE;
        }
    }

    
    public  ChannelSelectComponent(int i10, List list, int i11, List list2, String str, String str2, String str3, String str4, int i12, int i13, boolean z10, ActionComponentState actionComponentState, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, list, serializationConstructorMarker);
        if (1438 != (i10 & 1438)) {
            n1.b(i10, 1438, ChannelSelectComponent$$serializer.INSTANCE.getDescriptor());
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
        this.disabled = (i10 & 512) == 0 ? false : z10;
        this.state = actionComponentState;
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.channelTypes = null;
        } else {
            this.channelTypes = list3;
        }
    }

    public static final void write$Self(ChannelSelectComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        SearchableSelectComponent.write$Self((SearchableSelectComponent) self, output, serialDesc);
        boolean z13 = true;
        output.q(serialDesc, 1, self.getType());
        m0 m0Var = m0.f26306a;
        output.n(serialDesc, 2, new si.f(m0Var), self.getIndices());
        output.s(serialDesc, 3, self.getApplicationId());
        output.s(serialDesc, 4, self.getCustomId());
        if (!output.w(serialDesc, 5) && self.getPlaceholder() == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.z(serialDesc, 5, a2.f26231a, self.getPlaceholder());
        }
        if (!output.w(serialDesc, 6) && self.getAccessibilityLabel() == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.z(serialDesc, 6, a2.f26231a, self.getAccessibilityLabel());
        }
        output.q(serialDesc, 7, self.getMinValues());
        output.q(serialDesc, 8, self.getMaxValues());
        if (!output.w(serialDesc, 9) && !self.getDisabled()) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.r(serialDesc, 9, self.getDisabled());
        }
        output.n(serialDesc, 10, ActionComponentState.Serializer.INSTANCE, self.getState());
        if (!output.w(serialDesc, 11) && self.channelTypes == null) {
            z13 = false;
        }
        if (z13) {
            output.z(serialDesc, 11, new si.f(m0Var), self.channelTypes);
        }
    }

    public final int component1() {
        return getType();
    }

    public final ActionComponentState component10() {
        return getState();
    }

    public final List<Integer> component11() {
        return this.channelTypes;
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

    public final ChannelSelectComponent copy(int i10, List<Integer> indices, String applicationId, String customId, String str, String str2, int i11, int i12, boolean z10, ActionComponentState state, List<Integer> list) {
        q.g(indices, "indices");
        q.g(applicationId, "applicationId");
        q.g(customId, "customId");
        q.g(state, "state");
        return new ChannelSelectComponent(i10, indices, applicationId, customId, str, str2, i11, i12, z10, state, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelSelectComponent)) {
            return false;
        }
        ChannelSelectComponent channelSelectComponent = (ChannelSelectComponent) obj;
        return getType() == channelSelectComponent.getType() && q.b(getIndices(), channelSelectComponent.getIndices()) && q.b(getApplicationId(), channelSelectComponent.getApplicationId()) && q.b(getCustomId(), channelSelectComponent.getCustomId()) && q.b(getPlaceholder(), channelSelectComponent.getPlaceholder()) && q.b(getAccessibilityLabel(), channelSelectComponent.getAccessibilityLabel()) && getMinValues() == channelSelectComponent.getMinValues() && getMaxValues() == channelSelectComponent.getMaxValues() && getDisabled() == channelSelectComponent.getDisabled() && getState() == channelSelectComponent.getState() && q.b(this.channelTypes, channelSelectComponent.channelTypes);
    }

    @Override 
    public String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    @Override 
    public String getApplicationId() {
        return this.applicationId;
    }

    public final List<Integer> getChannelTypes() {
        return this.channelTypes;
    }

    @Override 
    public String getCustomId() {
        return this.customId;
    }

    @Override 
    public boolean getDisabled() {
        return this.disabled;
    }

    @Override 
    public List<Integer> getIndices() {
        return this.indices;
    }

    @Override 
    public int getMaxValues() {
        return this.maxValues;
    }

    @Override 
    public int getMinValues() {
        return this.minValues;
    }

    @Override 
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override 
    public ActionComponentState getState() {
        return this.state;
    }

    @Override 
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = 0;
        int type = ((((((((((((((getType() * 31) + getIndices().hashCode()) * 31) + getApplicationId().hashCode()) * 31) + getCustomId().hashCode()) * 31) + (getPlaceholder() == null ? 0 : getPlaceholder().hashCode())) * 31) + (getAccessibilityLabel() == null ? 0 : getAccessibilityLabel().hashCode())) * 31) + getMinValues()) * 31) + getMaxValues()) * 31;
        boolean disabled = getDisabled();
        if (disabled) {
            disabled = true;
        }
        int i11 = disabled ? 1 : 0;
        int i12 = disabled ? 1 : 0;
        int i13 = disabled ? 1 : 0;
        int hashCode = (((type + i11) * 31) + getState().hashCode()) * 31;
        List<Integer> list = this.channelTypes;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode + i10;
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
        List<Integer> list = this.channelTypes;
        return "ChannelSelectComponent(type=" + type + ", indices=" + indices + ", applicationId=" + applicationId + ", customId=" + customId + ", placeholder=" + placeholder + ", accessibilityLabel=" + accessibilityLabel + ", minValues=" + minValues + ", maxValues=" + maxValues + ", disabled=" + disabled + ", state=" + state + ", channelTypes=" + list + ")";
    }

    public  ChannelSelectComponent(int i10, List list, String str, String str2, String str3, String str4, int i11, int i12, boolean z10, ActionComponentState actionComponentState, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, str, str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, i11, i12, (i13 & 256) != 0 ? false : z10, actionComponentState, (i13 & 1024) != 0 ? null : list2);
    }

    public ChannelSelectComponent(int i10, List<Integer> indices, String applicationId, String customId, String str, String str2, int i11, int i12, boolean z10, ActionComponentState state, List<Integer> list) {
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
        this.channelTypes = list;
    }
}
