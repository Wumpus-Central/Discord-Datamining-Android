.class public final synthetic Lcom/discord/media/engine/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/native/engine/NativeConnection$OnSpeakingCallback;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/media/engine/j;->a:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final onSpeaking(Ljava/lang/String;I)V
    .locals 1

    iget-object v0, p0, Lcom/discord/media/engine/j;->a:Lkotlin/jvm/functions/Function2;

    invoke-static {v0, p1, p2}, Lcom/discord/media/engine/MediaEngine;->h(Lkotlin/jvm/functions/Function2;Ljava/lang/String;I)V

    return-void
.end method
