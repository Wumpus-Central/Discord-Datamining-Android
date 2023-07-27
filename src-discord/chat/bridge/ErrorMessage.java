package com.discord.chat.bridge;

import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.n1;

@f
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B0\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nB\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J*\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lcom/discord/chat/bridge/ErrorMessage;", "Lcom/discord/chat/bridge/MessageBase;", "seen1", "", "id", "Lcom/discord/primitives/MessageId;", "stackTrace", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getStackTrace", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/ErrorMessage;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ErrorMessage extends MessageBase {
    public static final Companion Companion = new Companion(null);

    
    private final String f6877id;
    private final String stackTrace;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/ErrorMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/ErrorMessage;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ErrorMessage> serializer() {
            return ErrorMessage$$serializer.INSTANCE;
        }
    }

    
    private ErrorMessage(int i10, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, serializationConstructorMarker);
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, ErrorMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.f6877id = str;
        this.stackTrace = str2;
    }

    public  ErrorMessage(int i10, String str, String str2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, serializationConstructorMarker);
    }

    public  ErrorMessage(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    
    public static  ErrorMessage m2copyntcYbpo$default(ErrorMessage errorMessage, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = errorMessage.f6877id;
        }
        if ((i10 & 2) != 0) {
            str2 = errorMessage.stackTrace;
        }
        return errorMessage.m4copyntcYbpo(str, str2);
    }

    public static final void write$Self(ErrorMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        MessageBase.write$Self(self, output, serialDesc);
        output.n(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m591boximpl(self.f6877id));
        output.s(serialDesc, 1, self.stackTrace);
    }

    
    public final String m3component13Eiw7ao() {
        return this.f6877id;
    }

    public final String component2() {
        return this.stackTrace;
    }

    
    public final ErrorMessage m4copyntcYbpo(String id2, String stackTrace) {
        q.g(id2, "id");
        q.g(stackTrace, "stackTrace");
        return new ErrorMessage(id2, stackTrace, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorMessage)) {
            return false;
        }
        ErrorMessage errorMessage = (ErrorMessage) obj;
        return MessageId.m595equalsimpl0(this.f6877id, errorMessage.f6877id) && q.b(this.stackTrace, errorMessage.stackTrace);
    }

    
    public final String m5getId3Eiw7ao() {
        return this.f6877id;
    }

    public final String getStackTrace() {
        return this.stackTrace;
    }

    public int hashCode() {
        return (MessageId.m596hashCodeimpl(this.f6877id) * 31) + this.stackTrace.hashCode();
    }

    public String toString() {
        String str = MessageId.m597toStringimpl(this.f6877id);
        String str2 = this.stackTrace;
        return "ErrorMessage(id=" + str + ", stackTrace=" + str2 + ")";
    }

    private ErrorMessage(String str, String str2) {
        super(null);
        this.f6877id = str;
        this.stackTrace = str2;
    }
}
