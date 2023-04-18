.class public final synthetic Ls9/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/a;


# instance fields
.field public final synthetic a:Ls9/c;

.field public final synthetic b:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Ls9/c;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls9/y;->a:Ls9/c;

    iput-object p2, p0, Ls9/y;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ls9/y;->a:Ls9/c;

    iget-object v1, p0, Ls9/y;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, p1}, Ls9/c;->c(Landroid/os/Bundle;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
