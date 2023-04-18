.class final Lv9/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic k:Lab/l;

.field final synthetic l:Lv9/e0;


# direct methods
.method constructor <init>(Lv9/e0;Lab/l;)V
    .locals 0

    iput-object p1, p0, Lv9/c0;->l:Lv9/e0;

    iput-object p2, p0, Lv9/c0;->k:Lab/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv9/c0;->l:Lv9/e0;

    iget-object v1, p0, Lv9/c0;->k:Lab/l;

    invoke-static {v0, v1}, Lv9/e0;->g0(Lv9/e0;Lab/l;)V

    return-void
.end method
