package com.discord.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import co.discord.media_engine.b;
import com.discord.snowflake.SnowflakePrimitive;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import ui.f;

@f
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/discord/primitives/GuildId;", "Lcom/discord/snowflake/SnowflakePrimitive;", "snowflake", "", "Lcom/discord/snowflake/Snowflake;", "constructor-impl", "(J)J", "getSnowflake", "()J", "describeContents", "", "describeContents-impl", "(J)I", "equals", "", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isValid", "isValid-impl", "(J)Z", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "writeToParcel-impl", "(JLandroid/os/Parcel;I)V", "$serializer", "Companion", "primitives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class GuildId implements SnowflakePrimitive {
    private final long snowflake;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GuildId> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lcom/discord/primitives/GuildId$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/primitives/GuildId;", "primitives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GuildId> serializer() {
            return GuildId$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public static final class Creator implements Parcelable.Creator<GuildId> {
        @Override 
        public   GuildId createFromParcel(Parcel parcel) {
            return GuildId.m618boximpl(m630createFromParcelhCFrBxw(parcel));
        }

        
        public final long m630createFromParcelhCFrBxw(Parcel parcel) {
            q.h(parcel, "parcel");
            return GuildId.m619constructorimpl(parcel.readLong());
        }

        
        @Override 
        public final GuildId[] newArray(int i10) {
            return new GuildId[i10];
        }
    }

    private  GuildId(long j10) {
        this.snowflake = j10;
    }

    
    public static final  GuildId m618boximpl(long j10) {
        return new GuildId(j10);
    }

    
    public static long m619constructorimpl(long j10) {
        return j10;
    }

    
    public static int m620describeContentsimpl(long j10) {
        return 0;
    }

    
    public static boolean m621equalsimpl(long j10, Object obj) {
        return (obj instanceof GuildId) && j10 == ((GuildId) obj).m627unboximpl();
    }

    
    public static final boolean m622equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    
    public static int m623hashCodeimpl(long j10) {
        return b.a(j10);
    }

    
    public static boolean m624isValidimpl(long j10) {
        return j10 > 0;
    }

    
    public static String m625toStringimpl(long j10) {
        return String.valueOf(j10);
    }

    
    public static void m626writeToParcelimpl(long j10, Parcel out, int i10) {
        q.h(out, "out");
        out.writeLong(j10);
    }

    @Override 
    public int describeContents() {
        return m620describeContentsimpl(this.snowflake);
    }

    public boolean equals(Object obj) {
        return m621equalsimpl(this.snowflake, obj);
    }

    @Override 
    public long getSnowflake() {
        return this.snowflake;
    }

    public int hashCode() {
        return m623hashCodeimpl(this.snowflake);
    }

    @Override 
    public boolean isValid() {
        return m624isValidimpl(this.snowflake);
    }

    public String toString() {
        return m625toStringimpl(this.snowflake);
    }

    
    public final  long m627unboximpl() {
        return this.snowflake;
    }

    @Override 
    public void writeToParcel(Parcel out, int i10) {
        q.h(out, "out");
        m626writeToParcelimpl(this.snowflake, out, i10);
    }
}
