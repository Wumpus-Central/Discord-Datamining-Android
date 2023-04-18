.class public final Lcom/discord/chat/presentation/events/ChatEventHandler$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/presentation/events/ChatEventHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic onLinkClicked-u7_MRrM$default(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onLinkClicked-u7_MRrM"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic onTapButtonActionComponent-NkFJqEg$default(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;JLjava/lang/String;J[IILjava/lang/Object;)V
    .locals 10

    if-nez p9, :cond_1

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    move-wide v4, v0

    goto :goto_0

    :cond_0
    move-wide v4, p2

    :goto_0
    move-object v2, p0

    move-object v3, p1

    move-object v6, p4

    move-wide v7, p5

    move-object/from16 v9, p7

    invoke-interface/range {v2 .. v9}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapButtonActionComponent-NkFJqEg(Ljava/lang/String;JLjava/lang/String;J[I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: onTapButtonActionComponent-NkFJqEg"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic onTapSelectActionComponent-u7_MRrM$default(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;ILjava/lang/Object;)V
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapSelectActionComponent-u7_MRrM(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onTapSelectActionComponent-u7_MRrM"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
