package com.discord.chat.reactevents;

import bj.C2500a2;
import bj.C2560n1;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.C9978f;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nf.C10853x;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000289B4\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fBL\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010\u001f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\t\u0010!\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0019\u0010#\u001a\u00020\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0015J\t\u0010%\u001a\u00020\u000bHÆ\u0003JJ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u000eHÖ\u0001J\b\u0010.\u001a\u00020/H\u0016J\t\u00100\u001a\u00020\u0007HÖ\u0001J!\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207HÇ\u0001R\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001d\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapButtonActionComponent;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "messageFlags", "", "customId", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "indices", "", "(Ljava/lang/String;JLjava/lang/String;J[ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;DLjava/lang/String;Lcom/discord/primitives/ApplicationId;[ILkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;DLjava/lang/String;J[ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApplicationId-VavddsQ", "()J", "J", "getCustomId", "()Ljava/lang/String;", "getIndices", "()[I", "getMessageFlags", "()D", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component4-VavddsQ", "component5", "copy", "copy-NkFJqEg", "(Ljava/lang/String;DLjava/lang/String;J[I)Lcom/discord/chat/reactevents/TapButtonActionComponent;", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TapButtonActionComponent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final long applicationId;
    private final String customId;
    private final int[] indices;
    private final double messageFlags;
    private final String messageId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapButtonActionComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapButtonActionComponent;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapButtonActionComponent> serializer() {
            return TapButtonActionComponent$$serializer.INSTANCE;
        }
    }

    private TapButtonActionComponent(int i, String str, double d, String str2, ApplicationId applicationId, int[] iArr, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            C2560n1.m33818b(i, 31, TapButtonActionComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.messageFlags = d;
        this.customId = str2;
        this.applicationId = applicationId.m42085unboximpl();
        this.indices = iArr;
    }

    public /* synthetic */ TapButtonActionComponent(int i, String str, double d, String str2, ApplicationId applicationId, int[] iArr, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, d, str2, applicationId, iArr, serializationConstructorMarker);
    }

    public /* synthetic */ TapButtonActionComponent(String str, double d, String str2, long j, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, str2, j, iArr);
    }

    public /* synthetic */ TapButtonActionComponent(String str, long j, String str2, long j2, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, j2, iArr);
    }

    /* renamed from: copy-NkFJqEg$default  reason: not valid java name */
    public static /* synthetic */ TapButtonActionComponent m41917copyNkFJqEg$default(TapButtonActionComponent tapButtonActionComponent, String str, double d, String str2, long j, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapButtonActionComponent.messageId;
        }
        if ((i & 2) != 0) {
            d = tapButtonActionComponent.messageFlags;
        }
        if ((i & 4) != 0) {
            str2 = tapButtonActionComponent.customId;
        }
        if ((i & 8) != 0) {
            j = tapButtonActionComponent.applicationId;
        }
        if ((i & 16) != 0) {
            iArr = tapButtonActionComponent.indices;
        }
        return tapButtonActionComponent.m41920copyNkFJqEg(str, d, str2, j, iArr);
    }

    public static final void write$Self(TapButtonActionComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        output.mo13870t(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42115boximpl(self.messageId));
        output.mo13890D(serialDesc, 1, self.messageFlags);
        output.mo13874p(serialDesc, 2, C2500a2.f6719a, self.customId);
        output.mo13870t(serialDesc, 3, ApplicationId$$serializer.INSTANCE, ApplicationId.m42076boximpl(self.applicationId));
        output.mo13870t(serialDesc, 4, C9978f.f26274c, self.indices);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41918component13Eiw7ao() {
        return this.messageId;
    }

    public final double component2() {
        return this.messageFlags;
    }

    public final String component3() {
        return this.customId;
    }

    /* renamed from: component4-VavddsQ  reason: not valid java name */
    public final long m41919component4VavddsQ() {
        return this.applicationId;
    }

    public final int[] component5() {
        return this.indices;
    }

    /* renamed from: copy-NkFJqEg  reason: not valid java name */
    public final TapButtonActionComponent m41920copyNkFJqEg(String messageId, double d, String str, long j, int[] indices) {
        C9677q.m14633g(messageId, "messageId");
        C9677q.m14633g(indices, "indices");
        return new TapButtonActionComponent(messageId, d, str, j, indices, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapButtonActionComponent)) {
            return false;
        }
        TapButtonActionComponent tapButtonActionComponent = (TapButtonActionComponent) obj;
        return MessageId.m42119equalsimpl0(this.messageId, tapButtonActionComponent.messageId) && Double.compare(this.messageFlags, tapButtonActionComponent.messageFlags) == 0 && C9677q.m14638b(this.customId, tapButtonActionComponent.customId) && ApplicationId.m42080equalsimpl0(this.applicationId, tapButtonActionComponent.applicationId) && C9677q.m14638b(this.indices, tapButtonActionComponent.indices);
    }

    /* renamed from: getApplicationId-VavddsQ  reason: not valid java name */
    public final long m41921getApplicationIdVavddsQ() {
        return this.applicationId;
    }

    public final String getCustomId() {
        return this.customId;
    }

    public final int[] getIndices() {
        return this.indices;
    }

    public final double getMessageFlags() {
        return this.messageFlags;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41922getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        int i = ((MessageId.m42120hashCodeimpl(this.messageId) * 31) + Double.doubleToLongBits(this.messageFlags)) * 31;
        String str = this.customId;
        return ((((i + (str == null ? 0 : str.hashCode())) * 31) + ApplicationId.m42081hashCodeimpl(this.applicationId)) * 31) + Arrays.hashCode(this.indices);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C10853x.m10921a("messageId", MessageId.m42121toStringimpl(this.messageId)), C10853x.m10921a("messageFlags", Double.valueOf(this.messageFlags)), C10853x.m10921a("customId", this.customId), C10853x.m10921a("applicationId", ApplicationId.m42083toStringimpl(this.applicationId)), C10853x.m10921a("indices", NativeArrayExtensionsKt.toNativeArray(this.indices)));
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(this.messageId);
        double d = this.messageFlags;
        String str2 = this.customId;
        String str3 = ApplicationId.m42083toStringimpl(this.applicationId);
        String arrays = Arrays.toString(this.indices);
        return "TapButtonActionComponent(messageId=" + str + ", messageFlags=" + d + ", customId=" + str2 + ", applicationId=" + str3 + ", indices=" + arrays + ")";
    }

    private TapButtonActionComponent(String str, double d, String str2, long j, int[] iArr) {
        this.messageId = str;
        this.messageFlags = d;
        this.customId = str2;
        this.applicationId = j;
        this.indices = iArr;
    }

    private TapButtonActionComponent(String str, long j, String str2, long j2, int[] iArr) {
        this(str, j, str2, j2, iArr, (DefaultConstructorMarker) null);
    }
}
