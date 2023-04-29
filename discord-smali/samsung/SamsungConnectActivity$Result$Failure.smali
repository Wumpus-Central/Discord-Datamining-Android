.class public final Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;
.super Lcom/discord/samsung/SamsungConnectActivity$Result;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/samsung/SamsungConnectActivity$Result;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Failure"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\t\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;",
        "Lcom/discord/samsung/SamsungConnectActivity$Result;",
        "isRetryAllowed",
        "",
        "attemptCount",
        "",
        "(ZI)V",
        "getAttemptCount",
        "()I",
        "()Z",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "samsung_release"
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
.field private final attemptCount:I

.field private final isRetryAllowed:Z


# direct methods
.method public constructor <init>(ZI)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/discord/samsung/SamsungConnectActivity$Result;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-boolean p1, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->isRetryAllowed:Z

    .line 4
    iput p2, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->attemptCount:I

    return-void
.end method

.method public synthetic constructor <init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;-><init>(ZI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;ZIILjava/lang/Object;)Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->isRetryAllowed:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->attemptCount:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->copy(ZI)Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->isRetryAllowed:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->attemptCount:I

    return v0
.end method

.method public final copy(ZI)Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;
    .locals 1

    new-instance v0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;

    invoke-direct {v0, p1, p2}, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;-><init>(ZI)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;

    iget-boolean v1, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->isRetryAllowed:Z

    iget-boolean v3, p1, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->isRetryAllowed:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->attemptCount:I

    iget p1, p1, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->attemptCount:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getAttemptCount()I
    .locals 1

    iget v0, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->attemptCount:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->isRetryAllowed:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->attemptCount:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final isRetryAllowed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->isRetryAllowed:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->isRetryAllowed:Z

    iget v1, p0, Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;->attemptCount:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failure(isRetryAllowed="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", attemptCount="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
