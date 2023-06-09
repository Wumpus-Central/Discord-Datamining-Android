package com.discord.chat.reactevents;

import co.discord.media_engine.b;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.chat.bridge.botuikit.ChannelSelectComponent;
import com.discord.chat.bridge.botuikit.ComponentEmoji;
import com.discord.chat.bridge.botuikit.SearchableSelectComponent;
import com.discord.chat.bridge.botuikit.SearchableSelectItem;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.bridge.botuikit.StringSelectComponent;
import com.discord.chat.bridge.botuikit.StringSelectItem;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.ArrayList;
import java.util.List;
import kg.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.n1;

@f
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-B8\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0002\u0010\fB \u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u0015\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0011J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J4\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020$HÖ\u0001J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Lcom/discord/chat/reactevents/TapSelectActionComponent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "Lcom/discord/primitives/MessageId;", "messageFlags", "", "selectionActionComponent", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageFlags", "()J", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSelectionActionComponent", "()Lcom/discord/chat/bridge/botuikit/SelectComponent;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)Lcom/discord/chat/reactevents/TapSelectActionComponent;", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TapSelectActionComponent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final long messageFlags;
    private final String messageId;
    private final SelectComponent selectionActionComponent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/reactevents/TapSelectActionComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapSelectActionComponent;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapSelectActionComponent> serializer() {
            return TapSelectActionComponent$$serializer.INSTANCE;
        }
    }

    private TapSelectActionComponent(int i10, String str, long j10, SelectComponent selectComponent, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            n1.b(i10, 7, TapSelectActionComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.messageFlags = j10;
        this.selectionActionComponent = selectComponent;
    }

    public /* synthetic */ TapSelectActionComponent(int i10, String str, long j10, SelectComponent selectComponent, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, j10, selectComponent, serializationConstructorMarker);
    }

    public /* synthetic */ TapSelectActionComponent(String str, long j10, SelectComponent selectComponent, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, selectComponent);
    }

    /* renamed from: copy-u7_MRrM$default  reason: not valid java name */
    public static /* synthetic */ TapSelectActionComponent m396copyu7_MRrM$default(TapSelectActionComponent tapSelectActionComponent, String str, long j10, SelectComponent selectComponent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tapSelectActionComponent.messageId;
        }
        if ((i10 & 2) != 0) {
            j10 = tapSelectActionComponent.messageFlags;
        }
        if ((i10 & 4) != 0) {
            selectComponent = tapSelectActionComponent.selectionActionComponent;
        }
        return tapSelectActionComponent.m398copyu7_MRrM(str, j10, selectComponent);
    }

    public static final void write$Self(TapSelectActionComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.q(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m572boximpl(self.messageId));
        output.E(serialDesc, 1, self.messageFlags);
        output.q(serialDesc, 2, SelectComponent.Companion.serializer(), self.selectionActionComponent);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m397component13Eiw7ao() {
        return this.messageId;
    }

    public final long component2() {
        return this.messageFlags;
    }

    public final SelectComponent component3() {
        return this.selectionActionComponent;
    }

    /* renamed from: copy-u7_MRrM  reason: not valid java name */
    public final TapSelectActionComponent m398copyu7_MRrM(String messageId, long j10, SelectComponent selectionActionComponent) {
        q.g(messageId, "messageId");
        q.g(selectionActionComponent, "selectionActionComponent");
        return new TapSelectActionComponent(messageId, j10, selectionActionComponent, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapSelectActionComponent)) {
            return false;
        }
        TapSelectActionComponent tapSelectActionComponent = (TapSelectActionComponent) obj;
        return MessageId.m576equalsimpl0(this.messageId, tapSelectActionComponent.messageId) && this.messageFlags == tapSelectActionComponent.messageFlags && q.b(this.selectionActionComponent, tapSelectActionComponent.selectionActionComponent);
    }

    public final long getMessageFlags() {
        return this.messageFlags;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m399getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final SelectComponent getSelectionActionComponent() {
        return this.selectionActionComponent;
    }

    public int hashCode() {
        return (((MessageId.m577hashCodeimpl(this.messageId) * 31) + b.a(this.messageFlags)) * 31) + this.selectionActionComponent.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        List<StringSelectItem> list;
        ReadableNativeArray readableNativeArray;
        ReadableNativeArray readableNativeArray2;
        int t10;
        char c10;
        WritableNativeMap writableNativeMap;
        List<Integer> channelTypes;
        List<SearchableSelectItem> selectedOptions;
        int t11;
        SelectComponent selectComponent = this.selectionActionComponent;
        if (selectComponent instanceof StringSelectComponent) {
            list = ((StringSelectComponent) selectComponent).getOptions();
        } else {
            list = j.i();
        }
        SelectComponent selectComponent2 = this.selectionActionComponent;
        char c11 = 2;
        if (selectComponent2 instanceof StringSelectComponent) {
            List<Integer> selectedOptions2 = ((StringSelectComponent) selectComponent2).getSelectedOptions();
            if (selectedOptions2 != null) {
                readableNativeArray = NativeArrayExtensionsKt.toNativeArray(selectedOptions2);
            }
            readableNativeArray = null;
        } else {
            if ((selectComponent2 instanceof SearchableSelectComponent) && (selectedOptions = ((SearchableSelectComponent) selectComponent2).getSelectedOptions()) != null) {
                t11 = k.t(selectedOptions, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (SearchableSelectItem searchableSelectItem : selectedOptions) {
                    arrayList.add(NativeMapExtensionsKt.nativeMapOf(x.a("value", searchableSelectItem.getValue()), x.a("label", searchableSelectItem.getLabel())));
                }
                readableNativeArray = NativeArrayExtensionsKt.toNativeArray(arrayList);
            }
            readableNativeArray = null;
        }
        SelectComponent selectComponent3 = this.selectionActionComponent;
        if (!(selectComponent3 instanceof ChannelSelectComponent) || (channelTypes = ((ChannelSelectComponent) selectComponent3).getChannelTypes()) == null) {
            readableNativeArray2 = null;
        } else {
            readableNativeArray2 = NativeArrayExtensionsKt.toNativeArray(channelTypes);
        }
        int i10 = 3;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = x.a("messageId", MessageId.m578toStringimpl(this.messageId));
        pairArr[1] = x.a("messageFlags", Double.valueOf(this.messageFlags));
        Pair[] pairArr2 = new Pair[13];
        pairArr2[0] = x.a("selectedOptions", readableNativeArray);
        pairArr2[1] = x.a("customId", this.selectionActionComponent.getCustomId());
        pairArr2[2] = x.a("minValues", Integer.valueOf(this.selectionActionComponent.getMinValues()));
        pairArr2[3] = x.a("maxValues", Integer.valueOf(this.selectionActionComponent.getMaxValues()));
        pairArr2[4] = x.a("disabled", Boolean.valueOf(this.selectionActionComponent.getDisabled()));
        int i11 = 5;
        pairArr2[5] = x.a(ViewProps.ACCESSIBILITY_LABEL, this.selectionActionComponent.getAccessibilityLabel());
        pairArr2[6] = x.a("state", Integer.valueOf(this.selectionActionComponent.getState().getSerialNumber()));
        pairArr2[7] = x.a(ReactTextInputShadowNode.PROP_PLACEHOLDER, this.selectionActionComponent.getPlaceholder());
        pairArr2[8] = x.a("applicationId", this.selectionActionComponent.getApplicationId());
        pairArr2[9] = x.a("type", Integer.valueOf(this.selectionActionComponent.getType()));
        pairArr2[10] = x.a("indices", NativeArrayExtensionsKt.toNativeArray(this.selectionActionComponent.getIndices()));
        t10 = k.t(list, 10);
        ArrayList arrayList2 = new ArrayList(t10);
        for (StringSelectItem stringSelectItem : list) {
            Pair[] pairArr3 = new Pair[i11];
            pairArr3[0] = x.a("label", stringSelectItem.getLabel());
            pairArr3[1] = x.a("value", stringSelectItem.getValue());
            ComponentEmoji emoji = stringSelectItem.getEmoji();
            if (emoji != null) {
                Pair[] pairArr4 = new Pair[i10];
                pairArr4[0] = x.a("id", emoji.getId());
                pairArr4[1] = x.a(ZeroconfModule.KEY_SERVICE_NAME, emoji.getName());
                c10 = 2;
                pairArr4[2] = x.a("src", emoji.getSrc());
                writableNativeMap = NativeMapExtensionsKt.nativeMapOf(pairArr4);
            } else {
                c10 = c11;
                writableNativeMap = null;
            }
            pairArr3[c10] = x.a("emoji", writableNativeMap);
            i10 = 3;
            pairArr3[3] = x.a("description", stringSelectItem.getDescription());
            pairArr3[4] = x.a("default", stringSelectItem.getDefault());
            arrayList2.add(NativeMapExtensionsKt.nativeMapOf(pairArr3));
            c11 = 2;
            i11 = 5;
        }
        pairArr2[11] = x.a("options", NativeArrayExtensionsKt.toNativeArray(arrayList2));
        pairArr2[12] = x.a("channelTypes", readableNativeArray2);
        pairArr[2] = x.a("selectionActionComponent", NativeMapExtensionsKt.nativeMapOf(pairArr2));
        return NativeMapExtensionsKt.nativeMapOf(pairArr);
    }

    public String toString() {
        String str = MessageId.m578toStringimpl(this.messageId);
        long j10 = this.messageFlags;
        SelectComponent selectComponent = this.selectionActionComponent;
        return "TapSelectActionComponent(messageId=" + str + ", messageFlags=" + j10 + ", selectionActionComponent=" + selectComponent + ")";
    }

    private TapSelectActionComponent(String str, long j10, SelectComponent selectComponent) {
        this.messageId = str;
        this.messageFlags = j10;
        this.selectionActionComponent = selectComponent;
    }
}
