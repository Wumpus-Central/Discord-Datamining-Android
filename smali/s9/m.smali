.class public final synthetic Ls9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ls9/q;


# direct methods
.method public synthetic constructor <init>(Ls9/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls9/m;->k:Ls9/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ls9/m;->k:Ls9/q;

    invoke-virtual {v0}, Ls9/q;->d()V

    return-void
.end method
