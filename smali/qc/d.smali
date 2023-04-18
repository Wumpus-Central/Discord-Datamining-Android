.class public final synthetic Lqc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lqc/g;


# direct methods
.method public synthetic constructor <init>(Lqc/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/d;->a:Lqc/g;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqc/d;->a:Lqc/g;

    invoke-static {v0}, Lqc/g;->e(Lqc/g;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
