.class public final synthetic Lw/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lw/j0$b;


# direct methods
.method public synthetic constructor <init>(Lw/j0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/i0;->k:Lw/j0$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lw/i0;->k:Lw/j0$b;

    invoke-interface {v0}, Lw/j0$b;->a()V

    return-void
.end method
