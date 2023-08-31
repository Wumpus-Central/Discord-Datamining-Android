package com.discord.app_database;

import co.discord.media_engine.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.n1;

@f
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/discord/app_database/GuildVersion;", "", "seen1", "", "id", "", "version", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getVersion", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_database_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class GuildVersion {
    public static final Companion Companion = new Companion(null);

    
    private final String f7192id;
    private final long version;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/app_database/GuildVersion$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/app_database/GuildVersion;", "app_database_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GuildVersion> serializer() {
            return GuildVersion$$serializer.INSTANCE;
        }
    }

    public  GuildVersion(int i10, String str, long j10, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, GuildVersion$$serializer.INSTANCE.getDescriptor());
        }
        this.f7192id = str;
        this.version = j10;
    }

    public static  GuildVersion copy$default(GuildVersion guildVersion, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = guildVersion.f7192id;
        }
        if ((i10 & 2) != 0) {
            j10 = guildVersion.version;
        }
        return guildVersion.copy(str, j10);
    }

    public static final void write$Self(GuildVersion self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.x(serialDesc, 0, self.f7192id);
        output.E(serialDesc, 1, self.version);
    }

    public final String component1() {
        return this.f7192id;
    }

    public final long component2() {
        return this.version;
    }

    public final GuildVersion copy(String id2, long j10) {
        q.h(id2, "id");
        return new GuildVersion(id2, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuildVersion)) {
            return false;
        }
        GuildVersion guildVersion = (GuildVersion) obj;
        return q.c(this.f7192id, guildVersion.f7192id) && this.version == guildVersion.version;
    }

    public final String getId() {
        return this.f7192id;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.f7192id.hashCode() * 31) + b.a(this.version);
    }

    public String toString() {
        String str = this.f7192id;
        long j10 = this.version;
        return "GuildVersion(id=" + str + ", version=" + j10 + ")";
    }

    public GuildVersion(String id2, long j10) {
        q.h(id2, "id");
        this.f7192id = id2;
        this.version = j10;
    }
}
