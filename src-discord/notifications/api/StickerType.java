package com.discord.notifications.api;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/discord/notifications/api/StickerType;", "", "Lcom/discord/serialization/IntEnum;", "serialNumber", "", "(Ljava/lang/String;II)V", "getSerialNumber", "()I", "UNKNOWN", "STANDARD", "GUILD", "Companion", "Serializer", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum StickerType implements IntEnum {
    UNKNOWN(-1),
    STANDARD(1),
    GUILD(2);
    
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final int serialNumber;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, d2 = {"Lcom/discord/notifications/api/StickerType$Companion;", "", "()V", "fromInt", "Lcom/discord/notifications/api/StickerType;", "int", "", "serializer", "Lkotlinx/serialization/KSerializer;", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return StickerType.$cachedSerializer$delegate;
        }

        public final StickerType fromInt(int i10) {
            StickerType stickerType;
            boolean z10;
            StickerType[] values = StickerType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    stickerType = null;
                    break;
                }
                stickerType = values[i11];
                if (stickerType.getSerialNumber() == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
                i11++;
            }
            if (stickerType == null) {
                return StickerType.UNKNOWN;
            }
            return stickerType;
        }

        public final KSerializer<StickerType> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/notifications/api/StickerType$Serializer;", "Lcom/discord/serialization/IntEnumSerializer;", "Lcom/discord/notifications/api/StickerType;", "()V", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Serializer extends IntEnumSerializer<StickerType> {
        public static final Serializer INSTANCE = new Serializer();

        private Serializer() {
            super(f0.b(StickerType.class), null, 2, null);
        }
    }

    static {
        Lazy<KSerializer<Object>> b10;
        b10 = n.b(p.PUBLICATION, StickerType$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = b10;
    }

    StickerType(int i10) {
        this.serialNumber = i10;
    }

    @Override // com.discord.serialization.IntEnum
    public int getSerialNumber() {
        return this.serialNumber;
    }
}
