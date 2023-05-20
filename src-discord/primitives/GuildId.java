package com.discord.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import co.discord.media_engine.a;
import com.discord.snowflake.SnowflakePrimitive;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import uj.f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/discord/primitives/GuildId;", "Lcom/discord/snowflake/SnowflakePrimitive;", "snowflake", "", "Lcom/discord/snowflake/Snowflake;", "constructor-impl", "(J)J", "getSnowflake", "()J", "describeContents", "", "describeContents-impl", "(J)I", "equals", "", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isValid", "isValid-impl", "(J)Z", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "writeToParcel-impl", "(JLandroid/os/Parcel;I)V", "$serializer", "Companion", "primitives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes4.dex */
public final class GuildId implements SnowflakePrimitive {
    private final long snowflake;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GuildId> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lcom/discord/primitives/GuildId$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/primitives/GuildId;", "primitives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GuildId> serializer() {
            return GuildId$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<GuildId> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GuildId createFromParcel(Parcel parcel) {
            return GuildId.m559boximpl(m571createFromParcelhCFrBxw(parcel));
        }

        /* renamed from: createFromParcel-hCFrBxw  reason: not valid java name */
        public final long m571createFromParcelhCFrBxw(Parcel parcel) {
            q.g(parcel, "parcel");
            return GuildId.m560constructorimpl(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GuildId[] newArray(int i10) {
            return new GuildId[i10];
        }
    }

    private /* synthetic */ GuildId(long j10) {
        this.snowflake = j10;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ GuildId m559boximpl(long j10) {
        return new GuildId(j10);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m560constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: describeContents-impl  reason: not valid java name */
    public static int m561describeContentsimpl(long j10) {
        return 0;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m562equalsimpl(long j10, Object obj) {
        return (obj instanceof GuildId) && j10 == ((GuildId) obj).m568unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m563equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m564hashCodeimpl(long j10) {
        return a.a(j10);
    }

    /* renamed from: isValid-impl  reason: not valid java name */
    public static boolean m565isValidimpl(long j10) {
        return j10 > 0;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m566toStringimpl(long j10) {
        return String.valueOf(j10);
    }

    /* renamed from: writeToParcel-impl  reason: not valid java name */
    public static void m567writeToParcelimpl(long j10, Parcel out, int i10) {
        q.g(out, "out");
        out.writeLong(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return m561describeContentsimpl(this.snowflake);
    }

    public boolean equals(Object obj) {
        return m562equalsimpl(this.snowflake, obj);
    }

    @Override // com.discord.snowflake.SnowflakePrimitive
    public long getSnowflake() {
        return this.snowflake;
    }

    public int hashCode() {
        return m564hashCodeimpl(this.snowflake);
    }

    @Override // com.discord.snowflake.SnowflakePrimitive
    public boolean isValid() {
        return m565isValidimpl(this.snowflake);
    }

    public String toString() {
        return m566toStringimpl(this.snowflake);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m568unboximpl() {
        return this.snowflake;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        q.g(out, "out");
        m567writeToParcelimpl(this.snowflake, out, i10);
    }
}
