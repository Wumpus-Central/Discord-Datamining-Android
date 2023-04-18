.class public final synthetic Lcom/google/firebase/messaging/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/google/firebase/messaging/o;

.field public final synthetic l:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/o;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/n;->k:Lcom/google/firebase/messaging/o;

    iput-object p2, p0, Lcom/google/firebase/messaging/n;->l:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/n;->k:Lcom/google/firebase/messaging/o;

    iget-object v1, p0, Lcom/google/firebase/messaging/n;->l:Landroid/content/Intent;

    invoke-static {v0, v1}, Lcom/google/firebase/messaging/o;->a(Lcom/google/firebase/messaging/o;Landroid/content/Intent;)V

    return-void
.end method
