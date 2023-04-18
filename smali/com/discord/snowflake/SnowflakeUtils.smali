.class public final Lcom/discord/snowflake/SnowflakeUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00060\u0004j\u0002`\u00082\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000cJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000cH\u0002J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u0010\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/discord/snowflake/SnowflakeUtils;",
        "",
        "()V",
        "DISCORD_EPOCH",
        "",
        "SNOWFLAKE_TIMESTAMP_SHIFT",
        "",
        "fromTimestamp",
        "Lcom/discord/snowflake/Snowflake;",
        "timestamp",
        "toTimestamp",
        "snowflake",
        "Lcom/discord/snowflake/SnowflakePrimitive;",
        "toTimestampPart",
        "snowflakeId",
        "toSnowflake",
        "",
        "(Ljava/lang/String;)Ljava/lang/Long;",
        "snowflake_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final DISCORD_EPOCH:J = 0x14aa2cab000L

.field public static final INSTANCE:Lcom/discord/snowflake/SnowflakeUtils;

.field private static final SNOWFLAKE_TIMESTAMP_SHIFT:I = 0x16


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/snowflake/SnowflakeUtils;

    invoke-direct {v0}, Lcom/discord/snowflake/SnowflakeUtils;-><init>()V

    sput-object v0, Lcom/discord/snowflake/SnowflakeUtils;->INSTANCE:Lcom/discord/snowflake/SnowflakeUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final toTimestampPart(Lcom/discord/snowflake/SnowflakePrimitive;)J
    .locals 2

    invoke-interface {p1}, Lcom/discord/snowflake/SnowflakePrimitive;->getSnowflake()J

    move-result-wide v0

    const/16 p1, 0x16

    ushr-long/2addr v0, p1

    return-wide v0
.end method


# virtual methods
.method public final fromTimestamp(J)J
    .locals 2

    const-wide v0, 0x14aa2cab000L

    sub-long/2addr p1, v0

    const/16 v0, 0x16

    shl-long/2addr p1, v0

    return-wide p1
.end method

.method public final toSnowflake(Ljava/lang/String;)Ljava/lang/Long;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lpi/l;->o(Ljava/lang/String;)Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    const-wide v3, 0x14aa2cab000L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    if-lez v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-eqz v1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object p1, v0

    .line 33
    :goto_1
    return-object p1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final toTimestamp(Lcom/discord/snowflake/SnowflakePrimitive;)J
    .locals 4

    .line 1
    const-string v0, "snowflake"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/discord/snowflake/SnowflakeUtils;->toTimestampPart(Lcom/discord/snowflake/SnowflakePrimitive;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide v2, 0x14aa2cab000L

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    add-long/2addr v0, v2

    .line 16
    return-wide v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method
