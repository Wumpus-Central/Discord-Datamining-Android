package com.discord.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import qi.f;

@f
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0005J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/discord/primitives/MessageId;", "Landroid/os/Parcelable;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "describeContents", "", "describeContents-impl", "(Ljava/lang/String;)I", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "toString-impl", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "writeToParcel-impl", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "$serializer", "Companion", "primitives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageId implements Parcelable {
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MessageId> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lcom/discord/primitives/MessageId$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/primitives/MessageId;", "primitives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageId> serializer() {
            return MessageId$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<MessageId> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageId createFromParcel(Parcel parcel) {
            return MessageId.m588boximpl(m599createFromParcelMpY7Jxs(parcel));
        }

        /* renamed from: createFromParcel-MpY7Jxs  reason: not valid java name */
        public final String m599createFromParcelMpY7Jxs(Parcel parcel) {
            q.g(parcel, "parcel");
            return MessageId.m589constructorimpl(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageId[] newArray(int i10) {
            return new MessageId[i10];
        }
    }

    private /* synthetic */ MessageId(String str) {
        this.value = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ MessageId m588boximpl(String str) {
        return new MessageId(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m589constructorimpl(String value) {
        q.g(value, "value");
        return value;
    }

    /* renamed from: describeContents-impl  reason: not valid java name */
    public static int m590describeContentsimpl(String str) {
        return 0;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m591equalsimpl(String str, Object obj) {
        return (obj instanceof MessageId) && q.b(str, ((MessageId) obj).m596unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m592equalsimpl0(String str, String str2) {
        return q.b(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m593hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m594toStringimpl(String str) {
        return str;
    }

    /* renamed from: writeToParcel-impl  reason: not valid java name */
    public static void m595writeToParcelimpl(String str, Parcel out, int i10) {
        q.g(out, "out");
        out.writeString(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return m590describeContentsimpl(this.value);
    }

    public boolean equals(Object obj) {
        return m591equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m593hashCodeimpl(this.value);
    }

    public String toString() {
        return m594toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m596unboximpl() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        q.g(out, "out");
        m595writeToParcelimpl(this.value, out, i10);
    }
}
