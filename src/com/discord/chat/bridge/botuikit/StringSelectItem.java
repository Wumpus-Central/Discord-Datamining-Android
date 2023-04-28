package com.discord.chat.bridge.botuikit;

import bj.C2500a2;
import bj.C2530h;
import bj.C2560n1;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0011JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006."}, m15073d2 = {"Lcom/discord/chat/bridge/botuikit/StringSelectItem;", "Lcom/discord/chat/bridge/botuikit/SelectItem;", "seen1", "", "label", "", "value", "emoji", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "description", "default", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription", "()Ljava/lang/String;", "getEmoji", "()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "getLabel", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/botuikit/StringSelectItem;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class StringSelectItem extends SelectItem {
    public static final Companion Companion = new Companion(null);

    /* renamed from: default  reason: not valid java name */
    private final Boolean f37651default;
    private final String description;
    private final ComponentEmoji emoji;
    private final String label;
    private final String value;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/botuikit/StringSelectItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/StringSelectItem;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StringSelectItem> serializer() {
            return StringSelectItem$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StringSelectItem(int i, String str, String str2, ComponentEmoji componentEmoji, String str3, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3 != (i & 3)) {
            C2560n1.m33818b(i, 3, StringSelectItem$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.value = str2;
        if ((i & 4) == 0) {
            this.emoji = null;
        } else {
            this.emoji = componentEmoji;
        }
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 16) == 0) {
            this.f37651default = Boolean.FALSE;
        } else {
            this.f37651default = bool;
        }
    }

    public static /* synthetic */ StringSelectItem copy$default(StringSelectItem stringSelectItem, String str, String str2, ComponentEmoji componentEmoji, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringSelectItem.getLabel();
        }
        if ((i & 2) != 0) {
            str2 = stringSelectItem.getValue();
        }
        if ((i & 4) != 0) {
            componentEmoji = stringSelectItem.getEmoji();
        }
        if ((i & 8) != 0) {
            str3 = stringSelectItem.description;
        }
        if ((i & 16) != 0) {
            bool = stringSelectItem.f37651default;
        }
        return stringSelectItem.copy(str, str2, componentEmoji, str3, bool);
    }

    public static final void write$Self(StringSelectItem self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        SelectItem.write$Self(self, output, serialDesc);
        boolean z3 = false;
        output.mo13864z(serialDesc, 0, self.getLabel());
        output.mo13864z(serialDesc, 1, self.getValue());
        if (!output.mo13893A(serialDesc, 2) && self.getEmoji() == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 2, ComponentEmoji$$serializer.INSTANCE, self.getEmoji());
        }
        if (!output.mo13893A(serialDesc, 3) && self.description == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            output.mo13874p(serialDesc, 3, C2500a2.f6719a, self.description);
        }
        if (output.mo13893A(serialDesc, 4) || !C9677q.m14638b(self.f37651default, Boolean.FALSE)) {
            z3 = true;
        }
        if (z3) {
            output.mo13874p(serialDesc, 4, C2530h.f6761a, self.f37651default);
        }
    }

    public final String component1() {
        return getLabel();
    }

    public final String component2() {
        return getValue();
    }

    public final ComponentEmoji component3() {
        return getEmoji();
    }

    public final String component4() {
        return this.description;
    }

    public final Boolean component5() {
        return this.f37651default;
    }

    public final StringSelectItem copy(String label, String value, ComponentEmoji componentEmoji, String str, Boolean bool) {
        C9677q.m14633g(label, "label");
        C9677q.m14633g(value, "value");
        return new StringSelectItem(label, value, componentEmoji, str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringSelectItem)) {
            return false;
        }
        StringSelectItem stringSelectItem = (StringSelectItem) obj;
        return C9677q.m14638b(getLabel(), stringSelectItem.getLabel()) && C9677q.m14638b(getValue(), stringSelectItem.getValue()) && C9677q.m14638b(getEmoji(), stringSelectItem.getEmoji()) && C9677q.m14638b(this.description, stringSelectItem.description) && C9677q.m14638b(this.f37651default, stringSelectItem.f37651default);
    }

    public final Boolean getDefault() {
        return this.f37651default;
    }

    public final String getDescription() {
        return this.description;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectItem
    public ComponentEmoji getEmoji() {
        return this.emoji;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectItem
    public String getLabel() {
        return this.label;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectItem
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((getLabel().hashCode() * 31) + getValue().hashCode()) * 31) + (getEmoji() == null ? 0 : getEmoji().hashCode())) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f37651default;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String label = getLabel();
        String value = getValue();
        ComponentEmoji emoji = getEmoji();
        String str = this.description;
        Boolean bool = this.f37651default;
        return "StringSelectItem(label=" + label + ", value=" + value + ", emoji=" + emoji + ", description=" + str + ", default=" + bool + ")";
    }

    public /* synthetic */ StringSelectItem(String str, String str2, ComponentEmoji componentEmoji, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : componentEmoji, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringSelectItem(String label, String value, ComponentEmoji componentEmoji, String str, Boolean bool) {
        super(null);
        C9677q.m14633g(label, "label");
        C9677q.m14633g(value, "value");
        this.label = label;
        this.value = value;
        this.emoji = componentEmoji;
        this.description = str;
        this.f37651default = bool;
    }
}
