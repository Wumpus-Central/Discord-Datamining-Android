.class public final synthetic Ltc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/google/firebase/installations/c;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/installations/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltc/c;->k:Lcom/google/firebase/installations/c;

    iput-boolean p2, p0, Ltc/c;->l:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltc/c;->k:Lcom/google/firebase/installations/c;

    iget-boolean v1, p0, Ltc/c;->l:Z

    invoke-static {v0, v1}, Lcom/google/firebase/installations/c;->b(Lcom/google/firebase/installations/c;Z)V

    return-void
.end method
