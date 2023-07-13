package com.discord.chat.bridge.codedlinks;

import com.discord.serialization.IntEnum;
import com.discord.serialization.IntEnumSerializer;
import ff.n;
import ff.p;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlinx.serialization.KSerializer;
import pi.f;

@f(with = Serializer.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/InviteType;", "", "Lcom/discord/serialization/IntEnum;", "serialNumber", "", "(Ljava/lang/String;II)V", "getSerialNumber", "()I", "GUILD", "GROUP_DM", "FRIEND", "Companion", "Serializer", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public enum InviteType implements IntEnum {
    GUILD(0),
    GROUP_DM(1),
    FRIEND(2);
    
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final int serialNumber;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/InviteType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final  Lazy get$cachedSerializer$delegate() {
            return InviteType.$cachedSerializer$delegate;
        }

        public final KSerializer<InviteType> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/InviteType$Serializer;", "Lcom/discord/serialization/IntEnumSerializer;", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "()V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Serializer extends IntEnumSerializer<InviteType> {
        public static final Serializer INSTANCE = new Serializer();

        private Serializer() {
            super(f0.b(InviteType.class), null, 2, null);
        }
    }

    static {
        Lazy<KSerializer<Object>> a10;
        a10 = n.a(p.PUBLICATION, InviteType$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = a10;
    }

    InviteType(int i10) {
        this.serialNumber = i10;
    }

    @Override 
    public int getSerialNumber() {
        return this.serialNumber;
    }
}
