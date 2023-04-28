package com.discord.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import co.discord.media_engine.C2968a;
import com.discord.snowflake.SnowflakePrimitive;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, m15073d2 = {"Lcom/discord/primitives/RoleId;", "Lcom/discord/snowflake/SnowflakePrimitive;", "snowflake", "", "Lcom/discord/snowflake/Snowflake;", "constructor-impl", "(J)J", "getSnowflake", "()J", "describeContents", "", "describeContents-impl", "(J)I", "equals", "", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isValid", "isValid-impl", "(J)Z", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "writeToParcel-impl", "(JLandroid/os/Parcel;I)V", "$serializer", "Companion", "primitives_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
public final class RoleId implements SnowflakePrimitive {
    private final long snowflake;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RoleId> CREATOR = new Creator();

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/primitives/RoleId$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/primitives/RoleId;", "primitives_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RoleId> serializer() {
            return RoleId$$serializer.INSTANCE;
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<RoleId> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RoleId createFromParcel(Parcel parcel) {
            return RoleId.m42127boximpl(m42139createFromParcelK4NZIAs(parcel));
        }

        /* renamed from: createFromParcel-K4NZIAs  reason: not valid java name */
        public final long m42139createFromParcelK4NZIAs(Parcel parcel) {
            C9677q.m14633g(parcel, "parcel");
            return RoleId.m42128constructorimpl(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RoleId[] newArray(int i) {
            return new RoleId[i];
        }
    }

    private /* synthetic */ RoleId(long j) {
        this.snowflake = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ RoleId m42127boximpl(long j) {
        return new RoleId(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m42128constructorimpl(long j) {
        return j;
    }

    /* renamed from: describeContents-impl  reason: not valid java name */
    public static int m42129describeContentsimpl(long j) {
        return 0;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m42130equalsimpl(long j, Object obj) {
        return (obj instanceof RoleId) && j == ((RoleId) obj).m42136unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m42131equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m42132hashCodeimpl(long j) {
        return C2968a.m32873a(j);
    }

    /* renamed from: isValid-impl  reason: not valid java name */
    public static boolean m42133isValidimpl(long j) {
        return j > 0;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m42134toStringimpl(long j) {
        return String.valueOf(j);
    }

    /* renamed from: writeToParcel-impl  reason: not valid java name */
    public static void m42135writeToParcelimpl(long j, Parcel out, int i) {
        C9677q.m14633g(out, "out");
        out.writeLong(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return m42129describeContentsimpl(this.snowflake);
    }

    public boolean equals(Object obj) {
        return m42130equalsimpl(this.snowflake, obj);
    }

    @Override // com.discord.snowflake.SnowflakePrimitive
    public long getSnowflake() {
        return this.snowflake;
    }

    public int hashCode() {
        return m42132hashCodeimpl(this.snowflake);
    }

    @Override // com.discord.snowflake.SnowflakePrimitive
    public boolean isValid() {
        return m42133isValidimpl(this.snowflake);
    }

    public String toString() {
        return m42134toStringimpl(this.snowflake);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m42136unboximpl() {
        return this.snowflake;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        C9677q.m14633g(out, "out");
        m42135writeToParcelimpl(this.snowflake, out, i);
    }
}
