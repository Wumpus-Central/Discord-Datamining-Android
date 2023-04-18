.class public final synthetic Lk0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lk0/f;


# direct methods
.method public synthetic constructor <init>(Lk0/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/b;->k:Lk0/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lk0/b;->k:Lk0/f;

    invoke-static {v0}, Lk0/f;->d(Lk0/f;)V

    return-void
.end method
