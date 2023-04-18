.class public final synthetic Lcom/google/firebase/messaging/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/a;


# instance fields
.field public final synthetic a:Lcom/google/firebase/messaging/z;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/y;->a:Lcom/google/firebase/messaging/z;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/y;->a:Lcom/google/firebase/messaging/z;

    invoke-static {v0, p1}, Lcom/google/firebase/messaging/z;->a(Lcom/google/firebase/messaging/z;Lcom/google/android/gms/tasks/Task;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
