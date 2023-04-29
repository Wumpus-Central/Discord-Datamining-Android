.class public final Lcom/discord/misc/utilities/intent/PendingIntentUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/discord/misc/utilities/intent/PendingIntentUtils;",
        "",
        "()V",
        "immutablePendingIntentFlag",
        "",
        "flags",
        "mutablePendingIntentFlag",
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


# static fields
.field public static final INSTANCE:Lcom/discord/misc/utilities/intent/PendingIntentUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/misc/utilities/intent/PendingIntentUtils;

    invoke-direct {v0}, Lcom/discord/misc/utilities/intent/PendingIntentUtils;-><init>()V

    sput-object v0, Lcom/discord/misc/utilities/intent/PendingIntentUtils;->INSTANCE:Lcom/discord/misc/utilities/intent/PendingIntentUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic immutablePendingIntentFlag$default(Lcom/discord/misc/utilities/intent/PendingIntentUtils;IILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/high16 p1, 0x8000000

    :cond_0
    invoke-virtual {p0, p1}, Lcom/discord/misc/utilities/intent/PendingIntentUtils;->immutablePendingIntentFlag(I)I

    move-result p0

    return p0
.end method

.method public static synthetic mutablePendingIntentFlag$default(Lcom/discord/misc/utilities/intent/PendingIntentUtils;IILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/high16 p1, 0x8000000

    :cond_0
    invoke-virtual {p0, p1}, Lcom/discord/misc/utilities/intent/PendingIntentUtils;->mutablePendingIntentFlag(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final immutablePendingIntentFlag(I)I
    .locals 1

    const/high16 v0, 0x4000000

    or-int/2addr p1, v0

    return p1
.end method

.method public final mutablePendingIntentFlag(I)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/high16 v0, 0x2000000

    or-int/2addr p1, v0

    :cond_0
    return p1
.end method
