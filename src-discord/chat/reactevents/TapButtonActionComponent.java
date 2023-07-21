package com.discord.chat.reactevents;

import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import ff.x;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.a2;
import si.n1;

@f
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000289B4\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fBL\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010\u001f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\t\u0010!\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0019\u0010#\u001a\u00020\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0015J\t\u0010%\u001a\u00020\u000bHÆ\u0003JJ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u000eHÖ\u0001J\b\u0010.\u001a\u00020/H\u0016J\t\u00100\u001a\u00020\u0007HÖ\u0001J!\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207HÇ\u0001R\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001d\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Lcom/discord/chat/reactevents/TapButtonActionComponent;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "messageFlags", "", "customId", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "indices", "", "(Ljava/lang/String;JLjava/lang/String;J[ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;DLjava/lang/String;Lcom/discord/primitives/ApplicationId;[ILkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;DLjava/lang/String;J[ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApplicationId-VavddsQ", "()J", "J", "getCustomId", "()Ljava/lang/String;", "getIndices", "()[I", "getMessageFlags", "()D", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component4-VavddsQ", "component5", "copy", "copy-NkFJqEg", "(Ljava/lang/String;DLjava/lang/String;J[I)Lcom/discord/chat/reactevents/TapButtonActionComponent;", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class TapButtonActionComponent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final long applicationId;
    private final String customId;
    private final int[] indices;
    private final double messageFlags;
    private final String messageId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/reactevents/TapButtonActionComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapButtonActionComponent;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapButtonActionComponent> serializer() {
            return TapButtonActionComponent$$serializer.INSTANCE;
        }
    }

    private TapButtonActionComponent(int i10, String str, double d10, String str2, ApplicationId applicationId, int[] iArr, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, TapButtonActionComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.messageFlags = d10;
        this.customId = str2;
        this.applicationId = applicationId.m560unboximpl();
        this.indices = iArr;
    }

    public  TapButtonActionComponent(int i10, String str, double d10, String str2, ApplicationId applicationId, int[] iArr, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, d10, str2, applicationId, iArr, serializationConstructorMarker);
    }

    public  TapButtonActionComponent(String str, double d10, String str2, long j10, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d10, str2, j10, iArr);
    }

    public  TapButtonActionComponent(String str, long j10, String str2, long j11, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, str2, j11, iArr);
    }

    
    public static  TapButtonActionComponent m368copyNkFJqEg$default(TapButtonActionComponent tapButtonActionComponent, String str, double d10, String str2, long j10, int[] iArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tapButtonActionComponent.messageId;
        }
        if ((i10 & 2) != 0) {
            d10 = tapButtonActionComponent.messageFlags;
        }
        if ((i10 & 4) != 0) {
            str2 = tapButtonActionComponent.customId;
        }
        if ((i10 & 8) != 0) {
            j10 = tapButtonActionComponent.applicationId;
        }
        if ((i10 & 16) != 0) {
            iArr = tapButtonActionComponent.indices;
        }
        return tapButtonActionComponent.m371copyNkFJqEg(str, d10, str2, j10, iArr);
    }

    public static final void write$Self(TapButtonActionComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.n(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m590boximpl(self.messageId));
        output.B(serialDesc, 1, self.messageFlags);
        output.z(serialDesc, 2, a2.f26231a, self.customId);
        output.n(serialDesc, 3, ApplicationId$$serializer.INSTANCE, ApplicationId.m551boximpl(self.applicationId));
        output.n(serialDesc, 4, kotlinx.serialization.internal.f.f21158c, self.indices);
    }

    
    public final String m369component13Eiw7ao() {
        return this.messageId;
    }

    public final double component2() {
        return this.messageFlags;
    }

    public final String component3() {
        return this.customId;
    }

    
    public final long m370component4VavddsQ() {
        return this.applicationId;
    }

    public final int[] component5() {
        return this.indices;
    }

    
    public final TapButtonActionComponent m371copyNkFJqEg(String messageId, double d10, String str, long j10, int[] indices) {
        q.g(messageId, "messageId");
        q.g(indices, "indices");
        return new TapButtonActionComponent(messageId, d10, str, j10, indices, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapButtonActionComponent)) {
            return false;
        }
        TapButtonActionComponent tapButtonActionComponent = (TapButtonActionComponent) obj;
        return MessageId.m594equalsimpl0(this.messageId, tapButtonActionComponent.messageId) && Double.compare(this.messageFlags, tapButtonActionComponent.messageFlags) == 0 && q.b(this.customId, tapButtonActionComponent.customId) && ApplicationId.m555equalsimpl0(this.applicationId, tapButtonActionComponent.applicationId) && q.b(this.indices, tapButtonActionComponent.indices);
    }

    
    public final long m372getApplicationIdVavddsQ() {
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

    
    public final String m373getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        int i10 = ((MessageId.m595hashCodeimpl(this.messageId) * 31) + Double.doubleToLongBits(this.messageFlags)) * 31;
        String str = this.customId;
        return ((((i10 + (str == null ? 0 : str.hashCode())) * 31) + ApplicationId.m556hashCodeimpl(this.applicationId)) * 31) + Arrays.hashCode(this.indices);
    }

    @Override 
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(x.a("messageId", MessageId.m596toStringimpl(this.messageId)), x.a("messageFlags", Double.valueOf(this.messageFlags)), x.a("customId", this.customId), x.a("applicationId", ApplicationId.m558toStringimpl(this.applicationId)), x.a("indices", NativeArrayExtensionsKt.toNativeArray(this.indices)));
    }

    public String toString() {
        String str = MessageId.m596toStringimpl(this.messageId);
        double d10 = this.messageFlags;
        String str2 = this.customId;
        String str3 = ApplicationId.m558toStringimpl(this.applicationId);
        String arrays = Arrays.toString(this.indices);
        return "TapButtonActionComponent(messageId=" + str + ", messageFlags=" + d10 + ", customId=" + str2 + ", applicationId=" + str3 + ", indices=" + arrays + ")";
    }

    private TapButtonActionComponent(String str, double d10, String str2, long j10, int[] iArr) {
        this.messageId = str;
        this.messageFlags = d10;
        this.customId = str2;
        this.applicationId = j10;
        this.indices = iArr;
    }

    private TapButtonActionComponent(String str, long j10, String str2, long j11, int[] iArr) {
        this(str, j10, str2, j11, iArr, (DefaultConstructorMarker) null);
    }
}
