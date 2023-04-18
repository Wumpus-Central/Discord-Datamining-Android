.class public final synthetic Li0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Li0/o0;


# direct methods
.method public synthetic constructor <init>(Li0/o0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/x;->k:Li0/o0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Li0/x;->k:Li0/o0;

    invoke-virtual {v0}, Li0/o0;->D0()V

    return-void
.end method
