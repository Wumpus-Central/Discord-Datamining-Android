.class public final Lcom/discord/foreground_service/ForegroundServiceManager$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/foreground_service/ForegroundServiceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\u00080\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/discord/foreground_service/ForegroundServiceManager$Companion;",
        "",
        "()V",
        "instance",
        "Lcom/discord/foreground_service/ForegroundServiceManager;",
        "getInstance",
        "()Lcom/discord/foreground_service/ForegroundServiceManager;",
        "tag",
        "",
        "kotlin.jvm.PlatformType",
        "foreground_service_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/foreground_service/ForegroundServiceManager$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance()Lcom/discord/foreground_service/ForegroundServiceManager;
    .locals 1

    invoke-static {}, Lcom/discord/foreground_service/ForegroundServiceManager;->access$getInstance$cp()Lcom/discord/foreground_service/ForegroundServiceManager;

    move-result-object v0

    return-object v0
.end method
