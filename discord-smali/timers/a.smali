.class public final synthetic Lcom/discord/timers/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/timers/TimersManager;

.field public final synthetic l:I

.field public final synthetic m:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/timers/TimersManager;ILkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/timers/a;->k:Lcom/discord/timers/TimersManager;

    iput p2, p0, Lcom/discord/timers/a;->l:I

    iput-object p3, p0, Lcom/discord/timers/a;->m:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/discord/timers/a;->k:Lcom/discord/timers/TimersManager;

    iget v1, p0, Lcom/discord/timers/a;->l:I

    iget-object v2, p0, Lcom/discord/timers/a;->m:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2}, Lcom/discord/timers/TimersManager;->a(Lcom/discord/timers/TimersManager;ILkotlin/jvm/functions/Function0;)V

    return-void
.end method
