package com.discord.chat.bridge.botuikit;

import androidx.recyclerview.widget.RecyclerView;
import bj.n1;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import j$.util.Spliterator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002EFB\u009b\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0006\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017B\u0087\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0018J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\u0099\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u00107\u001a\u00020\u000f2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0006H\u0016J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\t\u0010=\u001a\u00020\bHÖ\u0001J!\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DHÇ\u0001R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0016\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"¨\u0006G"}, d2 = {"Lcom/discord/chat/bridge/botuikit/StringSelectComponent;", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "seen1", "", "type", "indices", "", "applicationId", "", "customId", ReactTextInputShadowNode.PROP_PLACEHOLDER, ViewProps.ACCESSIBILITY_LABEL, "minValues", "maxValues", "disabled", "", "state", "Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "options", "Lcom/discord/chat/bridge/botuikit/StringSelectItem;", "selectedOptions", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLcom/discord/chat/bridge/botuikit/ActionComponentState;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLcom/discord/chat/bridge/botuikit/ActionComponentState;Ljava/util/List;Ljava/util/List;)V", "getAccessibilityLabel", "()Ljava/lang/String;", "getApplicationId", "getCustomId", "getDisabled", "()Z", "getIndices", "()Ljava/util/List;", "getMaxValues", "()I", "getMinValues", "getOptions", "getPlaceholder", "getSelectedOptions", "getState", "()Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "getType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "getSelectedItems", "Lcom/discord/chat/bridge/botuikit/SelectItem;", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StringSelectComponent extends SelectComponent {
    public static final Companion Companion = new Companion(null);
    private final String accessibilityLabel;
    private final String applicationId;
    private final String customId;
    private final boolean disabled;
    private final List<Integer> indices;
    private final int maxValues;
    private final int minValues;
    private final List<StringSelectItem> options;
    private final String placeholder;
    private final List<Integer> selectedOptions;
    private final ActionComponentState state;
    private final int type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/botuikit/StringSelectComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/StringSelectComponent;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StringSelectComponent> serializer() {
            return StringSelectComponent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StringSelectComponent(int i10, int i11, List list, String str, String str2, String str3, String str4, int i12, int i13, boolean z10, ActionComponentState actionComponentState, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, serializationConstructorMarker);
        if (719 != (i10 & 719)) {
            n1.b(i10, 719, StringSelectComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i11;
        this.indices = list;
        this.applicationId = str;
        this.customId = str2;
        if ((i10 & 16) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str3;
        }
        if ((i10 & 32) == 0) {
            this.accessibilityLabel = null;
        } else {
            this.accessibilityLabel = str4;
        }
        this.minValues = i12;
        this.maxValues = i13;
        this.disabled = (i10 & Spliterator.NONNULL) == 0 ? false : z10;
        this.state = actionComponentState;
        this.options = (i10 & Spliterator.IMMUTABLE) == 0 ? j.i() : list2;
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.selectedOptions = null;
        } else {
            this.selectedOptions = list3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.botuikit.StringSelectComponent r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.botuikit.StringSelectComponent.write$Self(com.discord.chat.bridge.botuikit.StringSelectComponent, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final int component1() {
        return getType();
    }

    public final ActionComponentState component10() {
        return getState();
    }

    public final List<StringSelectItem> component11() {
        return this.options;
    }

    public final List<Integer> component12() {
        return this.selectedOptions;
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

    public final StringSelectComponent copy(int i10, List<Integer> indices, String applicationId, String customId, String str, String str2, int i11, int i12, boolean z10, ActionComponentState state, List<StringSelectItem> options, List<Integer> list) {
        q.g(indices, "indices");
        q.g(applicationId, "applicationId");
        q.g(customId, "customId");
        q.g(state, "state");
        q.g(options, "options");
        return new StringSelectComponent(i10, indices, applicationId, customId, str, str2, i11, i12, z10, state, options, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringSelectComponent)) {
            return false;
        }
        StringSelectComponent stringSelectComponent = (StringSelectComponent) obj;
        return getType() == stringSelectComponent.getType() && q.b(getIndices(), stringSelectComponent.getIndices()) && q.b(getApplicationId(), stringSelectComponent.getApplicationId()) && q.b(getCustomId(), stringSelectComponent.getCustomId()) && q.b(getPlaceholder(), stringSelectComponent.getPlaceholder()) && q.b(getAccessibilityLabel(), stringSelectComponent.getAccessibilityLabel()) && getMinValues() == stringSelectComponent.getMinValues() && getMaxValues() == stringSelectComponent.getMaxValues() && getDisabled() == stringSelectComponent.getDisabled() && getState() == stringSelectComponent.getState() && q.b(this.options, stringSelectComponent.options) && q.b(this.selectedOptions, stringSelectComponent.selectedOptions);
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

    public final List<StringSelectItem> getOptions() {
        return this.options;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public List<SelectItem> getSelectedItems() {
        int t10;
        List<Integer> list = this.selectedOptions;
        if (list == null) {
            List<StringSelectItem> list2 = this.options;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (q.b(((StringSelectItem) obj).getDefault(), Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        t10 = k.t(list, 10);
        ArrayList arrayList2 = new ArrayList(t10);
        for (Number number : list) {
            arrayList2.add(this.options.get(number.intValue()));
        }
        return arrayList2;
    }

    public final List<Integer> getSelectedOptions() {
        return this.selectedOptions;
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
        int type = ((((((((((((((getType() * 31) + getIndices().hashCode()) * 31) + getApplicationId().hashCode()) * 31) + getCustomId().hashCode()) * 31) + (getPlaceholder() == null ? 0 : getPlaceholder().hashCode())) * 31) + (getAccessibilityLabel() == null ? 0 : getAccessibilityLabel().hashCode())) * 31) + getMinValues()) * 31) + getMaxValues()) * 31;
        boolean disabled = getDisabled();
        if (disabled) {
            disabled = true;
        }
        int i11 = disabled ? 1 : 0;
        int i12 = disabled ? 1 : 0;
        int i13 = disabled ? 1 : 0;
        int hashCode = (((((type + i11) * 31) + getState().hashCode()) * 31) + this.options.hashCode()) * 31;
        List<Integer> list = this.selectedOptions;
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
        List<StringSelectItem> list = this.options;
        List<Integer> list2 = this.selectedOptions;
        return "StringSelectComponent(type=" + type + ", indices=" + indices + ", applicationId=" + applicationId + ", customId=" + customId + ", placeholder=" + placeholder + ", accessibilityLabel=" + accessibilityLabel + ", minValues=" + minValues + ", maxValues=" + maxValues + ", disabled=" + disabled + ", state=" + state + ", options=" + list + ", selectedOptions=" + list2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ StringSelectComponent(int r17, java.util.List r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, int r24, boolean r25, com.discord.chat.bridge.botuikit.ActionComponentState r26, java.util.List r27, java.util.List r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r8 = r2
            goto L_0x000b
        L_0x0009:
            r8 = r21
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r9 = r2
            goto L_0x0013
        L_0x0011:
            r9 = r22
        L_0x0013:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x001a
            r1 = 0
            r12 = r1
            goto L_0x001c
        L_0x001a:
            r12 = r25
        L_0x001c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0026
            java.util.List r1 = kotlin.collections.h.i()
            r14 = r1
            goto L_0x0028
        L_0x0026:
            r14 = r27
        L_0x0028:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x002e
            r15 = r2
            goto L_0x0030
        L_0x002e:
            r15 = r28
        L_0x0030:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r10 = r23
            r11 = r24
            r13 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.botuikit.StringSelectComponent.<init>(int, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, com.discord.chat.bridge.botuikit.ActionComponentState, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public StringSelectComponent(int i10, List<Integer> indices, String applicationId, String customId, String str, String str2, int i11, int i12, boolean z10, ActionComponentState state, List<StringSelectItem> options, List<Integer> list) {
        q.g(indices, "indices");
        q.g(applicationId, "applicationId");
        q.g(customId, "customId");
        q.g(state, "state");
        q.g(options, "options");
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
        this.options = options;
        this.selectedOptions = list;
    }
}
