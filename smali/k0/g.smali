.class public final synthetic Lk0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lk0/f$d;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(Lk0/f$d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/g;->k:Lk0/f$d;

    iput-boolean p2, p0, Lk0/g;->l:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk0/g;->k:Lk0/f$d;

    iget-boolean v1, p0, Lk0/g;->l:Z

    invoke-static {v0, v1}, Lk0/f$d;->a(Lk0/f$d;Z)V

    return-void
.end method
