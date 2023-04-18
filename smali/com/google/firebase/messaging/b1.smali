.class public final synthetic Lcom/google/firebase/messaging/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/d;


# instance fields
.field public final synthetic a:Lcom/google/firebase/messaging/f1$a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/f1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/b1;->a:Lcom/google/firebase/messaging/f1$a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/b1;->a:Lcom/google/firebase/messaging/f1$a;

    invoke-static {v0, p1}, Lcom/google/firebase/messaging/c1;->a(Lcom/google/firebase/messaging/f1$a;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
