.class public final Lcom/discord/misc/utilities/time/TimeElapsed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u001b\u0010\u000b\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\n\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/discord/misc/utilities/time/TimeElapsed;",
        "",
        "startTime",
        "",
        "(J)V",
        "duration",
        "",
        "getDuration",
        "()Ljava/lang/String;",
        "duration$delegate",
        "Lkotlin/Lazy;",
        "durationMillis",
        "getDurationMillis",
        "()J",
        "durationMillis$delegate",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "misc_utilities_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final duration$delegate:Lkotlin/Lazy;

.field private final durationMillis$delegate:Lkotlin/Lazy;

.field private final startTime:J


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Lcom/discord/misc/utilities/time/TimeElapsed;-><init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/discord/misc/utilities/time/TimeElapsed;->startTime:J

    .line 2
    new-instance p1, Lcom/discord/misc/utilities/time/TimeElapsed$durationMillis$2;

    invoke-direct {p1, p0}, Lcom/discord/misc/utilities/time/TimeElapsed$durationMillis$2;-><init>(Lcom/discord/misc/utilities/time/TimeElapsed;)V

    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/discord/misc/utilities/time/TimeElapsed;->durationMillis$delegate:Lkotlin/Lazy;

    .line 3
    new-instance p1, Lcom/discord/misc/utilities/time/TimeElapsed$duration$2;

    invoke-direct {p1, p0}, Lcom/discord/misc/utilities/time/TimeElapsed$duration$2;-><init>(Lcom/discord/misc/utilities/time/TimeElapsed;)V

    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/discord/misc/utilities/time/TimeElapsed;->duration$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/misc/utilities/time/TimeElapsed;-><init>(J)V

    return-void
.end method

.method public static final synthetic access$getStartTime$p(Lcom/discord/misc/utilities/time/TimeElapsed;)J
    .locals 2

    iget-wide v0, p0, Lcom/discord/misc/utilities/time/TimeElapsed;->startTime:J

    return-wide v0
.end method

.method private final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/misc/utilities/time/TimeElapsed;->startTime:J

    return-wide v0
.end method

.method public static synthetic copy$default(Lcom/discord/misc/utilities/time/TimeElapsed;JILjava/lang/Object;)Lcom/discord/misc/utilities/time/TimeElapsed;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p1, p0, Lcom/discord/misc/utilities/time/TimeElapsed;->startTime:J

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/discord/misc/utilities/time/TimeElapsed;->copy(J)Lcom/discord/misc/utilities/time/TimeElapsed;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(J)Lcom/discord/misc/utilities/time/TimeElapsed;
    .locals 1

    new-instance v0, Lcom/discord/misc/utilities/time/TimeElapsed;

    invoke-direct {v0, p1, p2}, Lcom/discord/misc/utilities/time/TimeElapsed;-><init>(J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/misc/utilities/time/TimeElapsed;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/misc/utilities/time/TimeElapsed;

    iget-wide v3, p0, Lcom/discord/misc/utilities/time/TimeElapsed;->startTime:J

    iget-wide v5, p1, Lcom/discord/misc/utilities/time/TimeElapsed;->startTime:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getDuration()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/discord/misc/utilities/time/TimeElapsed;->duration$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-duration>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getDurationMillis()J
    .locals 2

    iget-object v0, p0, Lcom/discord/misc/utilities/time/TimeElapsed;->durationMillis$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/discord/misc/utilities/time/TimeElapsed;->startTime:J

    invoke-static {v0, v1}, Lco/discord/media_engine/a;->a(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-wide v0, p0, Lcom/discord/misc/utilities/time/TimeElapsed;->startTime:J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TimeElapsed(startTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
