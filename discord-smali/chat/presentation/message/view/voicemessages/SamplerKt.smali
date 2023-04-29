.class public final Lcom/discord/chat/presentation/message/view/voicemessages/SamplerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "abs",
        "",
        "getAbs",
        "(B)B",
        "chat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getAbs(B)B
    .locals 2

    const/16 v0, -0x80

    if-ne p0, v0, :cond_0

    const/16 p0, 0x7f

    goto :goto_0

    :cond_0
    const/16 v0, -0x7f

    const/4 v1, 0x0

    if-gt v0, p0, :cond_1

    const/4 v0, 0x1

    if-ge p0, v0, :cond_1

    move v1, v0

    :cond_1
    if-eqz v1, :cond_2

    neg-int p0, p0

    int-to-byte p0, p0

    :cond_2
    :goto_0
    return p0
.end method
