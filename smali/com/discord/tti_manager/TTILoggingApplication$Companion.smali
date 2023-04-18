.class public final Lcom/discord/tti_manager/TTILoggingApplication$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/tti_manager/TTILoggingApplication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0012\n\u0002\u0010\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0014\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\u0008\u0015J\u0006\u0010\u0016\u001a\u00020\u0017R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR+\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u000b\u001a\u0004\u0008\r\u0010\u0007\"\u0004\u0008\u000e\u0010\tR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u000b\u001a\u0004\u0008\u0011\u0010\u0007\"\u0004\u0008\u0012\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/discord/tti_manager/TTILoggingApplication$Companion;",
        "",
        "()V",
        "<set-?>",
        "",
        "applicationInitializeTimestamp",
        "getApplicationInitializeTimestamp",
        "()J",
        "setApplicationInitializeTimestamp",
        "(J)V",
        "applicationInitializeTimestamp$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "applicationOpenedTimestampExcludingActivityLaunchGap",
        "getApplicationOpenedTimestampExcludingActivityLaunchGap",
        "setApplicationOpenedTimestampExcludingActivityLaunchGap",
        "applicationOpenedTimestampExcludingActivityLaunchGap$delegate",
        "applicationStartedTimestamp",
        "getApplicationStartedTimestamp",
        "setApplicationStartedTimestamp",
        "applicationStartedTimestamp$delegate",
        "getAppOpenedTimestamp",
        "getAppOpenedTimestamp$tti_manager_release",
        "trackActivityDelegateInitialized",
        "",
        "tti_manager_release"
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
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/w;

    .line 5
    .line 6
    const-string v2, "applicationOpenedTimestampExcludingActivityLaunchGap"

    .line 7
    .line 8
    const-string v3, "getApplicationOpenedTimestampExcludingActivityLaunchGap()J"

    .line 9
    .line 10
    const-class v4, Lcom/discord/tti_manager/TTILoggingApplication$Companion;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/w;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->e(Lkotlin/jvm/internal/v;)Ldg/e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    aput-object v1, v0, v5

    .line 21
    .line 22
    new-instance v1, Lkotlin/jvm/internal/w;

    .line 23
    .line 24
    const-string v2, "applicationStartedTimestamp"

    .line 25
    .line 26
    const-string v3, "getApplicationStartedTimestamp()J"

    .line 27
    .line 28
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/w;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->e(Lkotlin/jvm/internal/v;)Ldg/e;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x1

    .line 36
    aput-object v1, v0, v2

    .line 37
    .line 38
    new-instance v1, Lkotlin/jvm/internal/w;

    .line 39
    .line 40
    const-string v2, "applicationInitializeTimestamp"

    .line 41
    .line 42
    const-string v3, "getApplicationInitializeTimestamp()J"

    .line 43
    .line 44
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/w;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->e(Lkotlin/jvm/internal/v;)Ldg/e;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v2, 0x2

    .line 52
    aput-object v1, v0, v2

    .line 53
    .line 54
    sput-object v0, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 55
    .line 56
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$setApplicationInitializeTimestamp(Lcom/discord/tti_manager/TTILoggingApplication$Companion;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->setApplicationInitializeTimestamp(J)V

    return-void
.end method

.method public static final synthetic access$setApplicationStartedTimestamp(Lcom/discord/tti_manager/TTILoggingApplication$Companion;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->setApplicationStartedTimestamp(J)V

    return-void
.end method

.method private final getApplicationInitializeTimestamp()J
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationInitializeTimestamp$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private final getApplicationOpenedTimestampExcludingActivityLaunchGap()J
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationOpenedTimestampExcludingActivityLaunchGap$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private final getApplicationStartedTimestamp()J
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationStartedTimestamp$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private final setApplicationInitializeTimestamp(J)V
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationInitializeTimestamp$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method private final setApplicationOpenedTimestampExcludingActivityLaunchGap(J)V
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationOpenedTimestampExcludingActivityLaunchGap$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method private final setApplicationStartedTimestamp(J)V
    .locals 3

    invoke-static {}, Lcom/discord/tti_manager/TTILoggingApplication;->access$getApplicationStartedTimestamp$delegate$cp()Lkotlin/properties/ReadWriteProperty;

    move-result-object v0

    sget-object v1, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getAppOpenedTimestamp$tti_manager_release()J
    .locals 2

    invoke-direct {p0}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->getApplicationOpenedTimestampExcludingActivityLaunchGap()J

    move-result-wide v0

    return-wide v0
.end method

.method public final trackActivityDelegateInitialized()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->getApplicationInitializeTimestamp()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-direct {p0}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->getApplicationStartedTimestamp()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    sub-long/2addr v0, v2

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    sub-long/2addr v2, v0

    .line 15
    invoke-direct {p0, v2, v3}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->setApplicationOpenedTimestampExcludingActivityLaunchGap(J)V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method
