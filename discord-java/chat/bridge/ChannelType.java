package com.discord.chat.bridge;

import com.discord.serialization.IntEnum;
import com.discord.serialization.IntEnumSerializer;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlinx.serialization.KSerializer;
import nf.n;
import nf.p;
import yi.f;

@f(with = Serializer.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\u0016\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/bridge/ChannelType;", "", "Lcom/discord/serialization/IntEnum;", "serialNumber", "", "(Ljava/lang/String;II)V", "getSerialNumber", "()I", "DM", "GROUP_DM", "GUILD_TEXT", "GUILD_VOICE", "GUILD_CATEGORY", "GUILD_ANNOUNCEMENT", "GUILD_STORE", "ANNOUNCEMENT_THREAD", "PUBLIC_THREAD", "PRIVATE_THREAD", "GUILD_STAGE_VOICE", "GUILD_DIRECTORY", "GUILD_FORUM", "UNKNOWN", "Companion", "Serializer", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum ChannelType implements IntEnum {
    DM(1),
    GROUP_DM(3),
    GUILD_TEXT(0),
    GUILD_VOICE(2),
    GUILD_CATEGORY(4),
    GUILD_ANNOUNCEMENT(5),
    GUILD_STORE(6),
    ANNOUNCEMENT_THREAD(10),
    PUBLIC_THREAD(11),
    PRIVATE_THREAD(12),
    GUILD_STAGE_VOICE(13),
    GUILD_DIRECTORY(14),
    GUILD_FORUM(15),
    UNKNOWN(10000);
    
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final int serialNumber;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/ChannelType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/ChannelType;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return ChannelType.$cachedSerializer$delegate;
        }

        public final KSerializer<ChannelType> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/chat/bridge/ChannelType$Serializer;", "Lcom/discord/serialization/IntEnumSerializer;", "Lcom/discord/chat/bridge/ChannelType;", "()V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Serializer extends IntEnumSerializer<ChannelType> {
        public static final Serializer INSTANCE = new Serializer();

        private Serializer() {
            super(f0.b(ChannelType.class), null, 2, null);
        }
    }

    static {
        Lazy<KSerializer<Object>> b10;
        b10 = n.b(p.PUBLICATION, ChannelType$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = b10;
    }

    ChannelType(int i10) {
        this.serialNumber = i10;
    }

    @Override // com.discord.serialization.IntEnum
    public int getSerialNumber() {
        return this.serialNumber;
    }
}
