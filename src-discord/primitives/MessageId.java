package com.discord.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import pi.f;

@f
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0005J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/discord/primitives/MessageId;", "Landroid/os/Parcelable;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "describeContents", "", "describeContents-impl", "(Ljava/lang/String;)I", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "toString-impl", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "writeToParcel-impl", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "$serializer", "Companion", "primitives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageId implements Parcelable {
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MessageId> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lcom/discord/primitives/MessageId$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/primitives/MessageId;", "primitives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageId> serializer() {
            return MessageId$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public static final class Creator implements Parcelable.Creator<MessageId> {
        @Override 
        public   MessageId createFromParcel(Parcel parcel) {
            return MessageId.m590boximpl(m601createFromParcelMpY7Jxs(parcel));
        }

        
        public final String m601createFromParcelMpY7Jxs(Parcel parcel) {
            q.g(parcel, "parcel");
            return MessageId.m591constructorimpl(parcel.readString());
        }

        
        @Override 
        public final MessageId[] newArray(int i10) {
            return new MessageId[i10];
        }
    }

    private  MessageId(String str) {
        this.value = str;
    }

    
    public static final  MessageId m590boximpl(String str) {
        return new MessageId(str);
    }

    
    public static String m591constructorimpl(String value) {
        q.g(value, "value");
        return value;
    }

    
    public static int m592describeContentsimpl(String str) {
        return 0;
    }

    
    public static boolean m593equalsimpl(String str, Object obj) {
        return (obj instanceof MessageId) && q.b(str, ((MessageId) obj).m598unboximpl());
    }

    
    public static final boolean m594equalsimpl0(String str, String str2) {
        return q.b(str, str2);
    }

    
    public static int m595hashCodeimpl(String str) {
        return str.hashCode();
    }

    
    public static String m596toStringimpl(String str) {
        return str;
    }

    
    public static void m597writeToParcelimpl(String str, Parcel out, int i10) {
        q.g(out, "out");
        out.writeString(str);
    }

    @Override 
    public int describeContents() {
        return m592describeContentsimpl(this.value);
    }

    public boolean equals(Object obj) {
        return m593equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m595hashCodeimpl(this.value);
    }

    public String toString() {
        return m596toStringimpl(this.value);
    }

    
    public final  String m598unboximpl() {
        return this.value;
    }

    @Override 
    public void writeToParcel(Parcel out, int i10) {
        q.g(out, "out");
        m597writeToParcelimpl(this.value, out, i10);
    }
}
