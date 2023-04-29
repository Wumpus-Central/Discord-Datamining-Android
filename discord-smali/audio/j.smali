.class public final synthetic Lcom/discord/audio/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/audio/DiscordAudioManager;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/audio/DiscordAudioManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/audio/j;->k:Lcom/discord/audio/DiscordAudioManager;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/j;->k:Lcom/discord/audio/DiscordAudioManager;

    invoke-static {v0}, Lcom/discord/audio/DiscordAudioManager;->b(Lcom/discord/audio/DiscordAudioManager;)V

    return-void
.end method
