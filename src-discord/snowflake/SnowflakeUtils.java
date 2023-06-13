package com.discord.snowflake;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import oj.t;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00060\u0004j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u0010¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/snowflake/SnowflakeUtils;", "", "()V", "DISCORD_EPOCH", "", "SNOWFLAKE_TIMESTAMP_SHIFT", "", "fromTimestamp", "Lcom/discord/snowflake/Snowflake;", "timestamp", "toTimestamp", "snowflake", "Lcom/discord/snowflake/SnowflakePrimitive;", "toTimestampPart", "snowflakeId", "toSnowflake", "", "(Ljava/lang/String;)Ljava/lang/Long;", "snowflake_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnowflakeUtils {
    private static final long DISCORD_EPOCH = 1420070400000L;
    public static final SnowflakeUtils INSTANCE = new SnowflakeUtils();
    private static final int SNOWFLAKE_TIMESTAMP_SHIFT = 22;

    private SnowflakeUtils() {
    }

    private final long toTimestampPart(SnowflakePrimitive snowflakePrimitive) {
        return snowflakePrimitive.getSnowflake() >>> 22;
    }

    public final long fromTimestamp(long j10) {
        return (j10 - DISCORD_EPOCH) << 22;
    }

    public final Long toSnowflake(String str) {
        Long o10;
        boolean z10;
        q.g(str, "<this>");
        o10 = t.o(str);
        if (o10 != null) {
            if (o10.longValue() > DISCORD_EPOCH) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return o10;
            }
        }
        return null;
    }

    public final long toTimestamp(SnowflakePrimitive snowflake) {
        q.g(snowflake, "snowflake");
        return toTimestampPart(snowflake) + DISCORD_EPOCH;
    }
}
