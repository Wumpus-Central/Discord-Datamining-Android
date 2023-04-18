.class public final synthetic Lcom/google/firebase/messaging/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/google/firebase/messaging/s0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/r0;->k:Lcom/google/firebase/messaging/s0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/r0;->k:Lcom/google/firebase/messaging/s0;

    invoke-static {v0}, Lcom/google/firebase/messaging/s0;->a(Lcom/google/firebase/messaging/s0;)V

    return-void
.end method
