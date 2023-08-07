package com.discord.chat.bridge.botuikit;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BS\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u00062"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "Lcom/discord/chat/bridge/botuikit/SelectItem;", "seen1", "", "label", "", "value", "emoji", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "type", "iconSrc", "iconColor", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;)V", "getEmoji", "()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "getIconColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconSrc", "()Ljava/lang/String;", "getLabel", "getType", "()I", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;)Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SearchableSelectItem extends SelectItem {
    public static final Companion Companion = new Companion(null);
    private final ComponentEmoji emoji;
    private final Integer iconColor;
    private final String iconSrc;
    private final String label;
    private final int type;
    private final String value;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchableSelectItem> serializer() {
            return SearchableSelectItem$$serializer.INSTANCE;
        }
    }

    
    public  SearchableSelectItem(int i10, String str, String str2, ComponentEmoji componentEmoji, int i11, String str3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, serializationConstructorMarker);
        if (11 != (i10 & 11)) {
            n1.b(i10, 11, SearchableSelectItem$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.value = str2;
        if ((i10 & 4) == 0) {
            this.emoji = null;
        } else {
            this.emoji = componentEmoji;
        }
        this.type = i11;
        if ((i10 & 16) == 0) {
            this.iconSrc = null;
        } else {
            this.iconSrc = str3;
        }
        if ((i10 & 32) == 0) {
            this.iconColor = null;
        } else {
            this.iconColor = num;
        }
    }

    public static  SearchableSelectItem copy$default(SearchableSelectItem searchableSelectItem, String str, String str2, ComponentEmoji componentEmoji, int i10, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchableSelectItem.getLabel();
        }
        if ((i11 & 2) != 0) {
            str2 = searchableSelectItem.getValue();
        }
        if ((i11 & 4) != 0) {
            componentEmoji = searchableSelectItem.getEmoji();
        }
        if ((i11 & 8) != 0) {
            i10 = searchableSelectItem.type;
        }
        if ((i11 & 16) != 0) {
            str3 = searchableSelectItem.iconSrc;
        }
        if ((i11 & 32) != 0) {
            num = searchableSelectItem.iconColor;
        }
        return searchableSelectItem.copy(str, str2, componentEmoji, i10, str3, num);
    }

    public static final void write$Self(SearchableSelectItem self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        SelectItem.write$Self(self, output, serialDesc);
        boolean z12 = false;
        output.s(serialDesc, 0, self.getLabel());
        output.s(serialDesc, 1, self.getValue());
        if (!output.w(serialDesc, 2) && self.getEmoji() == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.z(serialDesc, 2, ComponentEmoji$$serializer.INSTANCE, self.getEmoji());
        }
        output.q(serialDesc, 3, self.type);
        if (!output.w(serialDesc, 4) && self.iconSrc == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.z(serialDesc, 4, a2.f29540a, self.iconSrc);
        }
        if (output.w(serialDesc, 5) || self.iconColor != null) {
            z12 = true;
        }
        if (z12) {
            output.z(serialDesc, 5, m0.f29615a, self.iconColor);
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

    public final int component4() {
        return this.type;
    }

    public final String component5() {
        return this.iconSrc;
    }

    public final Integer component6() {
        return this.iconColor;
    }

    public final SearchableSelectItem copy(String label, String value, ComponentEmoji componentEmoji, int i10, String str, Integer num) {
        q.h(label, "label");
        q.h(value, "value");
        return new SearchableSelectItem(label, value, componentEmoji, i10, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchableSelectItem)) {
            return false;
        }
        SearchableSelectItem searchableSelectItem = (SearchableSelectItem) obj;
        return q.c(getLabel(), searchableSelectItem.getLabel()) && q.c(getValue(), searchableSelectItem.getValue()) && q.c(getEmoji(), searchableSelectItem.getEmoji()) && this.type == searchableSelectItem.type && q.c(this.iconSrc, searchableSelectItem.iconSrc) && q.c(this.iconColor, searchableSelectItem.iconColor);
    }

    @Override 
    public ComponentEmoji getEmoji() {
        return this.emoji;
    }

    public final Integer getIconColor() {
        return this.iconColor;
    }

    public final String getIconSrc() {
        return this.iconSrc;
    }

    @Override 
    public String getLabel() {
        return this.label;
    }

    public final int getType() {
        return this.type;
    }

    @Override 
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i10 = 0;
        int hashCode = ((((((getLabel().hashCode() * 31) + getValue().hashCode()) * 31) + (getEmoji() == null ? 0 : getEmoji().hashCode())) * 31) + this.type) * 31;
        String str = this.iconSrc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.iconColor;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String label = getLabel();
        String value = getValue();
        ComponentEmoji emoji = getEmoji();
        int i10 = this.type;
        String str = this.iconSrc;
        Integer num = this.iconColor;
        return "SearchableSelectItem(label=" + label + ", value=" + value + ", emoji=" + emoji + ", type=" + i10 + ", iconSrc=" + str + ", iconColor=" + num + ")";
    }

    public  SearchableSelectItem(String str, String str2, ComponentEmoji componentEmoji, int i10, String str3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : componentEmoji, i10, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : num);
    }

    
    public SearchableSelectItem(String label, String value, ComponentEmoji componentEmoji, int i10, String str, Integer num) {
        super(null);
        q.h(label, "label");
        q.h(value, "value");
        this.label = label;
        this.value = value;
        this.emoji = componentEmoji;
        this.type = i10;
        this.iconSrc = str;
        this.iconColor = num;
    }
}
