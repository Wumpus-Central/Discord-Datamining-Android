.class public final synthetic Lk0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lk0/f;

.field public final synthetic l:Lk0/j;


# direct methods
.method public synthetic constructor <init>(Lk0/f;Lk0/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/c;->k:Lk0/f;

    iput-object p2, p0, Lk0/c;->l:Lk0/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk0/c;->k:Lk0/f;

    iget-object v1, p0, Lk0/c;->l:Lk0/j;

    invoke-static {v0, v1}, Lk0/f;->a(Lk0/f;Lk0/j;)V

    return-void
.end method
