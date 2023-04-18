.class public final synthetic Lf9/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic k:Lf9/q;


# direct methods
.method public synthetic constructor <init>(Lf9/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/o;->k:Lf9/q;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lf9/o;->k:Lf9/q;

    invoke-static {v0, p1}, Lf9/q;->b(Lf9/q;Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
