.class public final synthetic Ls9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ls9/b;

.field public final synthetic l:Landroid/content/Intent;

.field public final synthetic m:Landroid/content/Context;

.field public final synthetic n:Z

.field public final synthetic o:Landroid/content/BroadcastReceiver$PendingResult;


# direct methods
.method public synthetic constructor <init>(Ls9/b;Landroid/content/Intent;Landroid/content/Context;ZLandroid/content/BroadcastReceiver$PendingResult;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls9/i;->k:Ls9/b;

    iput-object p2, p0, Ls9/i;->l:Landroid/content/Intent;

    iput-object p3, p0, Ls9/i;->m:Landroid/content/Context;

    iput-boolean p4, p0, Ls9/i;->n:Z

    iput-object p5, p0, Ls9/i;->o:Landroid/content/BroadcastReceiver$PendingResult;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Ls9/i;->k:Ls9/b;

    iget-object v1, p0, Ls9/i;->l:Landroid/content/Intent;

    iget-object v2, p0, Ls9/i;->m:Landroid/content/Context;

    iget-boolean v3, p0, Ls9/i;->n:Z

    iget-object v4, p0, Ls9/i;->o:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0, v1, v2, v3, v4}, Ls9/b;->d(Landroid/content/Intent;Landroid/content/Context;ZLandroid/content/BroadcastReceiver$PendingResult;)V

    return-void
.end method
