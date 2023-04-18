.class public final synthetic Lf9/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final synthetic l:I

.field public final synthetic m:Lf9/q$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILf9/q$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/p;->k:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput p2, p0, Lf9/p;->l:I

    iput-object p3, p0, Lf9/p;->m:Lf9/q$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lf9/p;->k:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget v1, p0, Lf9/p;->l:I

    iget-object v2, p0, Lf9/p;->m:Lf9/q$a;

    invoke-static {v0, v1, v2}, Lf9/q;->a(Ljava/util/concurrent/CopyOnWriteArraySet;ILf9/q$a;)V

    return-void
.end method
