.class public abstract Lcom/discord/tti_manager/TTILoggingApplication;
.super Landroid/app/Application;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/tti_manager/TTILoggingApplication$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008&\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H&J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/discord/tti_manager/TTILoggingApplication;",
        "Landroid/app/Application;",
        "()V",
        "initialize",
        "",
        "onCreate",
        "Companion",
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
.field public static final Companion:Lcom/discord/tti_manager/TTILoggingApplication$Companion;

.field private static final applicationInitializeTimestamp$delegate:Lkotlin/properties/ReadWriteProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/properties/ReadWriteProperty<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private static final applicationOpenedTimestampExcludingActivityLaunchGap$delegate:Lkotlin/properties/ReadWriteProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/properties/ReadWriteProperty<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private static final applicationStartedTimestamp$delegate:Lkotlin/properties/ReadWriteProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/properties/ReadWriteProperty<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/tti_manager/TTILoggingApplication$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/tti_manager/TTILoggingApplication;->Companion:Lcom/discord/tti_manager/TTILoggingApplication$Companion;

    .line 8
    .line 9
    sget-object v0, Lkotlin/properties/a;->a:Lkotlin/properties/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlin/properties/a;->a()Lkotlin/properties/ReadWriteProperty;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sput-object v1, Lcom/discord/tti_manager/TTILoggingApplication;->applicationOpenedTimestampExcludingActivityLaunchGap$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 16
    .line 17
    invoke-virtual {v0}, Lkotlin/properties/a;->a()Lkotlin/properties/ReadWriteProperty;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v1, Lcom/discord/tti_manager/TTILoggingApplication;->applicationStartedTimestamp$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 22
    .line 23
    invoke-virtual {v0}, Lkotlin/properties/a;->a()Lkotlin/properties/ReadWriteProperty;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lcom/discord/tti_manager/TTILoggingApplication;->applicationInitializeTimestamp$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 28
    .line 29
    return-void
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
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/discord/tti_manager/TTILoggingApplication;->Companion:Lcom/discord/tti_manager/TTILoggingApplication$Companion;

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-static {v0, v1, v2}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->access$setApplicationStartedTimestamp(Lcom/discord/tti_manager/TTILoggingApplication$Companion;J)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
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
.end method

.method public static final synthetic access$getApplicationInitializeTimestamp$delegate$cp()Lkotlin/properties/ReadWriteProperty;
    .locals 1

    sget-object v0, Lcom/discord/tti_manager/TTILoggingApplication;->applicationInitializeTimestamp$delegate:Lkotlin/properties/ReadWriteProperty;

    return-object v0
.end method

.method public static final synthetic access$getApplicationOpenedTimestampExcludingActivityLaunchGap$delegate$cp()Lkotlin/properties/ReadWriteProperty;
    .locals 1

    sget-object v0, Lcom/discord/tti_manager/TTILoggingApplication;->applicationOpenedTimestampExcludingActivityLaunchGap$delegate:Lkotlin/properties/ReadWriteProperty;

    return-object v0
.end method

.method public static final synthetic access$getApplicationStartedTimestamp$delegate$cp()Lkotlin/properties/ReadWriteProperty;
    .locals 1

    sget-object v0, Lcom/discord/tti_manager/TTILoggingApplication;->applicationStartedTimestamp$delegate:Lkotlin/properties/ReadWriteProperty;

    return-object v0
.end method


# virtual methods
.method public abstract initialize()V
.end method

.method public onCreate()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/discord/tti_manager/TTILoggingApplication;->initialize()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcom/discord/tti_manager/TTILoggingApplication;->Companion:Lcom/discord/tti_manager/TTILoggingApplication$Companion;

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v0, v1, v2}, Lcom/discord/tti_manager/TTILoggingApplication$Companion;->access$setApplicationInitializeTimestamp(Lcom/discord/tti_manager/TTILoggingApplication$Companion;J)V

    .line 14
    .line 15
    .line 16
    return-void
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
.end method
