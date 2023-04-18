.class Lx7/f$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx7/f;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx7/f;


# direct methods
.method constructor <init>(Lx7/f;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lx7/f$a;->a:Lx7/f;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lx7/f$a;->a:Lx7/f;

    invoke-static {v0, p1}, Lx7/f;->a(Lx7/f;Landroid/os/Message;)V

    return-void
.end method
