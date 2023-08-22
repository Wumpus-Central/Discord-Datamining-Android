package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.discord.chat.bridge.botuikit.ButtonStyle;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.a2;
import wi.m0;
import wi.n1;

@f
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002FGB\u0082\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0017Bp\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0014HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u0019\u0010/\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0088\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020\nHÖ\u0001J!\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EHÇ\u0001R\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "seen1", "", "type", "indices", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "customId", "", "label", "style", "Lcom/discord/chat/bridge/botuikit/ButtonStyle;", "disabled", "", "emoji", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "url", "state", "Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/util/List;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApplicationId-VavddsQ", "()J", "J", "getCustomId", "()Ljava/lang/String;", "getDisabled", "()Z", "getEmoji", "()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "getIndices", "()Ljava/util/List;", "getLabel", "getState", "()Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "getStyle", "()Lcom/discord/chat/bridge/botuikit/ButtonStyle;", "getType", "()I", "getUrl", "component1", "component10", "component2", "component3", "component3-VavddsQ", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-onMGE3A", "(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;)Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ButtonComponent extends Component {
    public static final Companion Companion = new Companion(null);
    private final long applicationId;
    private final String customId;
    private final boolean disabled;
    private final ComponentEmoji emoji;
    private final List<Integer> indices;
    private final String label;
    private final ActionComponentState state;
    private final ButtonStyle style;
    private final int type;
    private final String url;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ButtonComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ButtonComponent> serializer() {
            return ButtonComponent$$serializer.INSTANCE;
        }
    }

    
    private ButtonComponent(int i10, int i11, List<Integer> list, ApplicationId applicationId, String str, String str2, ButtonStyle buttonStyle, boolean z10, ComponentEmoji componentEmoji, String str3, ActionComponentState actionComponentState, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (551 != (i10 & 551)) {
            n1.b(i10, 551, ButtonComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i11;
        this.indices = list;
        this.applicationId = applicationId.m577unboximpl();
        if ((i10 & 8) == 0) {
            this.customId = null;
        } else {
            this.customId = str;
        }
        if ((i10 & 16) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        this.style = buttonStyle;
        if ((i10 & 64) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z10;
        }
        if ((i10 & 128) == 0) {
            this.emoji = null;
        } else {
            this.emoji = componentEmoji;
        }
        if ((i10 & 256) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        this.state = actionComponentState;
    }

    public  ButtonComponent(int i10, int i11, List list, ApplicationId applicationId, String str, String str2, ButtonStyle buttonStyle, boolean z10, ComponentEmoji componentEmoji, String str3, ActionComponentState actionComponentState, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, list, applicationId, str, str2, buttonStyle, z10, componentEmoji, str3, actionComponentState, serializationConstructorMarker);
    }

    public  ButtonComponent(int i10, List list, long j10, String str, String str2, ButtonStyle buttonStyle, boolean z10, ComponentEmoji componentEmoji, String str3, ActionComponentState actionComponentState, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, j10, str, str2, buttonStyle, z10, componentEmoji, str3, actionComponentState);
    }

    public static final void write$Self(ButtonComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z14 = false;
        output.v(serialDesc, 0, self.getType());
        output.o(serialDesc, 1, new wi.f(m0.f29833a), self.getIndices());
        output.o(serialDesc, 2, ApplicationId$$serializer.INSTANCE, ApplicationId.m568boximpl(self.applicationId));
        if (!output.z(serialDesc, 3) && self.customId == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.B(serialDesc, 3, a2.f29758a, self.customId);
        }
        if (!output.z(serialDesc, 4) && self.label == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.B(serialDesc, 4, a2.f29758a, self.label);
        }
        output.o(serialDesc, 5, ButtonStyle.Serializer.INSTANCE, self.style);
        if (!output.z(serialDesc, 6) && !self.disabled) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.w(serialDesc, 6, self.disabled);
        }
        if (!output.z(serialDesc, 7) && self.emoji == null) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            output.B(serialDesc, 7, ComponentEmoji$$serializer.INSTANCE, self.emoji);
        }
        if (output.z(serialDesc, 8) || self.url != null) {
            z14 = true;
        }
        if (z14) {
            output.B(serialDesc, 8, a2.f29758a, self.url);
        }
        output.o(serialDesc, 9, ActionComponentState.Serializer.INSTANCE, self.state);
    }

    public final int component1() {
        return getType();
    }

    public final ActionComponentState component10() {
        return this.state;
    }

    public final List<Integer> component2() {
        return getIndices();
    }

    
    public final long m30component3VavddsQ() {
        return this.applicationId;
    }

    public final String component4() {
        return this.customId;
    }

    public final String component5() {
        return this.label;
    }

    public final ButtonStyle component6() {
        return this.style;
    }

    public final boolean component7() {
        return this.disabled;
    }

    public final ComponentEmoji component8() {
        return this.emoji;
    }

    public final String component9() {
        return this.url;
    }

    
    public final ButtonComponent m31copyonMGE3A(int i10, List<Integer> indices, long j10, String str, String str2, ButtonStyle style, boolean z10, ComponentEmoji componentEmoji, String str3, ActionComponentState state) {
        q.h(indices, "indices");
        q.h(style, "style");
        q.h(state, "state");
        return new ButtonComponent(i10, indices, j10, str, str2, style, z10, componentEmoji, str3, state, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponent)) {
            return false;
        }
        ButtonComponent buttonComponent = (ButtonComponent) obj;
        return getType() == buttonComponent.getType() && q.c(getIndices(), buttonComponent.getIndices()) && ApplicationId.m572equalsimpl0(this.applicationId, buttonComponent.applicationId) && q.c(this.customId, buttonComponent.customId) && q.c(this.label, buttonComponent.label) && this.style == buttonComponent.style && this.disabled == buttonComponent.disabled && q.c(this.emoji, buttonComponent.emoji) && q.c(this.url, buttonComponent.url) && this.state == buttonComponent.state;
    }

    
    public final long m32getApplicationIdVavddsQ() {
        return this.applicationId;
    }

    public final String getCustomId() {
        return this.customId;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final ComponentEmoji getEmoji() {
        return this.emoji;
    }

    @Override 
    public List<Integer> getIndices() {
        return this.indices;
    }

    public final String getLabel() {
        return this.label;
    }

    public final ActionComponentState getState() {
        return this.state;
    }

    public final ButtonStyle getStyle() {
        return this.style;
    }

    @Override 
    public int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int type = ((((getType() * 31) + getIndices().hashCode()) * 31) + ApplicationId.m573hashCodeimpl(this.applicationId)) * 31;
        String str = this.customId;
        int i10 = 0;
        int hashCode = (type + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.style.hashCode()) * 31;
        boolean z10 = this.disabled;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = (hashCode2 + i11) * 31;
        ComponentEmoji componentEmoji = this.emoji;
        int hashCode3 = (i14 + (componentEmoji == null ? 0 : componentEmoji.hashCode())) * 31;
        String str3 = this.url;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((hashCode3 + i10) * 31) + this.state.hashCode();
    }

    public String toString() {
        int type = getType();
        List<Integer> indices = getIndices();
        String str = ApplicationId.m575toStringimpl(this.applicationId);
        String str2 = this.customId;
        String str3 = this.label;
        ButtonStyle buttonStyle = this.style;
        boolean z10 = this.disabled;
        ComponentEmoji componentEmoji = this.emoji;
        String str4 = this.url;
        ActionComponentState actionComponentState = this.state;
        return "ButtonComponent(type=" + type + ", indices=" + indices + ", applicationId=" + str + ", customId=" + str2 + ", label=" + str3 + ", style=" + buttonStyle + ", disabled=" + z10 + ", emoji=" + componentEmoji + ", url=" + str4 + ", state=" + actionComponentState + ")";
    }

    public  ButtonComponent(int i10, List list, long j10, String str, String str2, ButtonStyle buttonStyle, boolean z10, ComponentEmoji componentEmoji, String str3, ActionComponentState actionComponentState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, j10, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : str2, buttonStyle, (i11 & 64) != 0 ? false : z10, (i11 & 128) != 0 ? null : componentEmoji, (i11 & 256) != 0 ? null : str3, actionComponentState, null);
    }

    private ButtonComponent(int i10, List<Integer> list, long j10, String str, String str2, ButtonStyle buttonStyle, boolean z10, ComponentEmoji componentEmoji, String str3, ActionComponentState actionComponentState) {
        super(null);
        this.type = i10;
        this.indices = list;
        this.applicationId = j10;
        this.customId = str;
        this.label = str2;
        this.style = buttonStyle;
        this.disabled = z10;
        this.emoji = componentEmoji;
        this.url = str3;
        this.state = actionComponentState;
    }
}
