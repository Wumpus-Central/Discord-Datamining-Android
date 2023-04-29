.class public final Lcom/discord/samsung/SamsungModule$Companion$RequestCode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/samsung/SamsungModule$Companion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RequestCode"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/discord/samsung/SamsungModule$Companion$RequestCode;",
        "",
        "()V",
        "Auth",
        "",
        "ConnectionDisclaimer",
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


# static fields
.field public static final Auth:I = 0x65

.field public static final ConnectionDisclaimer:I = 0x64

.field public static final INSTANCE:Lcom/discord/samsung/SamsungModule$Companion$RequestCode;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/samsung/SamsungModule$Companion$RequestCode;

    invoke-direct {v0}, Lcom/discord/samsung/SamsungModule$Companion$RequestCode;-><init>()V

    sput-object v0, Lcom/discord/samsung/SamsungModule$Companion$RequestCode;->INSTANCE:Lcom/discord/samsung/SamsungModule$Companion$RequestCode;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
