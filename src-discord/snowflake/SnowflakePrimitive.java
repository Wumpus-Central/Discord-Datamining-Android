package com.discord.snowflake;

import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&R\u0016\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/discord/snowflake/SnowflakePrimitive;", "Landroid/os/Parcelable;", "snowflake", "", "Lcom/discord/snowflake/Snowflake;", "getSnowflake", "()J", "isValid", "", "snowflake_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SnowflakePrimitive extends Parcelable {
    long getSnowflake();

    boolean isValid();
}
