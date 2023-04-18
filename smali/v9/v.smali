.class public final synthetic Lv9/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lv9/g;

.field public final synthetic l:Landroid/os/IBinder;


# direct methods
.method public synthetic constructor <init>(Lv9/g;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv9/v;->k:Lv9/g;

    iput-object p2, p0, Lv9/v;->l:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv9/v;->k:Lv9/g;

    iget-object v1, p0, Lv9/v;->l:Landroid/os/IBinder;

    invoke-virtual {v0, v1}, Lv9/g;->q(Landroid/os/IBinder;)V

    return-void
.end method
