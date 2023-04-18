.class public final synthetic Lcom/discord/media/engine/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/native/engine/NativeEngine$ConnectToServerCallback;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/media/engine/o;->a:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final onConnectToServer(Lcom/discord/native/engine/ConnectionInfo;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/media/engine/o;->a:Lkotlin/jvm/functions/Function2;

    invoke-static {v0, p1, p2}, Lcom/discord/media/engine/MediaEngine;->g(Lkotlin/jvm/functions/Function2;Lcom/discord/native/engine/ConnectionInfo;Ljava/lang/String;)V

    return-void
.end method
